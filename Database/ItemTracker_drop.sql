-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-02-24 00:54:19.31

-- foreign keys
ALTER TABLE Devices
    DROP FOREIGN KEY Devices_DeviceType;

ALTER TABLE Loans
    DROP FOREIGN KEY Loans_Devices;

ALTER TABLE Loans
    DROP FOREIGN KEY Loans_Requester;

ALTER TABLE Loans
    DROP FOREIGN KEY Loans_users;

ALTER TABLE Users
    DROP FOREIGN KEY users_user_types;

-- tables
DROP TABLE DeviceTypes;

DROP TABLE Devices;

DROP TABLE Loans;

DROP TABLE Requester;

DROP TABLE UserTypes;

DROP TABLE Users;

-- End of file.

