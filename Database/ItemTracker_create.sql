-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-02-24 00:28:27.235

-- tables
-- Table: DeviceTypes
CREATE TABLE DeviceTypes (
    id int NOT NULL,
    type varchar(32) NOT NULL,
    CONSTRAINT DeviceTypes_pk PRIMARY KEY (id)
);

-- Table: Devices
CREATE TABLE Devices (
    id int NOT NULL,
    name varchar(32) NOT NULL,
    type int NOT NULL,
    serial_number varchar(120) NULL,
    CONSTRAINT Devices_pk PRIMARY KEY (id)
);

-- Table: Loans
CREATE TABLE Loans (
    id int NOT NULL,
    user_id int NOT NULL,
    device_id int NOT NULL,
    collection_date date NOT NULL,
    expected_return_date date NOT NULL,
    loaned_by int NOT NULL,
    actual_return_date date NULL,
    received_by int NULL,
    CONSTRAINT Loans_pk PRIMARY KEY (id)
);

-- Table: UserTypes
CREATE TABLE UserTypes (
    id int NOT NULL,
    type varchar(16) NOT NULL,
    CONSTRAINT UserTypes_pk PRIMARY KEY (id)
);

-- Table: Users
CREATE TABLE Users (
    id int NOT NULL,
    name varchar(32) NOT NULL,
    user_type int NOT NULL,
    email varchar(64) NULL CHECK ([*@*]),
    phone_number varchar(16) NULL CHECK ([+]?[0-9]{11,16}),
    CONSTRAINT Users_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: Devices_DeviceType (table: Devices)
ALTER TABLE Devices ADD CONSTRAINT Devices_DeviceType FOREIGN KEY Devices_DeviceType (type)
    REFERENCES DeviceTypes (id);

-- Reference: Loans_Devices (table: Loans)
ALTER TABLE Loans ADD CONSTRAINT Loans_Devices FOREIGN KEY Loans_Devices (device_id)
    REFERENCES Devices (id);

-- Reference: Loans_users (table: Loans)
ALTER TABLE Loans ADD CONSTRAINT Loans_users FOREIGN KEY Loans_users (user_id,loaned_by,received_by)
    REFERENCES Users (id,id,id);

-- Reference: users_user_types (table: Users)
ALTER TABLE Users ADD CONSTRAINT users_user_types FOREIGN KEY users_user_types (user_type)
    REFERENCES UserTypes (id);

-- End of file.

