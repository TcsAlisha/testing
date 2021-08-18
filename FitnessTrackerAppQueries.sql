drop table if exists USER;
drop table if exists APPOINTMENT;
drop table if exists PHYSIOTHERAPIST;
drop table if exists PACKAGE;
drop table if exists TRAINER;

create table USER(
User_ID int not null,
UserName varchar(10),
MobileNumber int,
DOB date,
Email varchar(10),
Address varchar(10),
PRIMARY KEY(User_ID)
);

create table PHYSIOTHERAPIST(
Physiotherapist_ID int PRIMARY KEY,
PhysiotherapistName varchar(10)
);

create table TRAINER(
Trainer_ID int primary key,
TrainerName varchar(10),
TrainerAge int,
TrainerGender varchar(10),
TrainerAddress varchar(10)
);
create table PACKAGE (
    Package_ID int primary key,
    PackageName varchar(10),
    PackagePrice int
);

create table APPOINTMENT(
Appointment_ID int PRIMARY KEY,
User_ID int,
Package_ID int,
DateOfAppointment date,
Trainer_ID int NOT NULL,
PhysiotherapyRequirement boolean,
Physiotherapist_ID int not null,
FOREIGN KEY(User_ID) REFERENCES USER(User_ID),
FOREIGN KEY(Trainer_ID) REFERENCES TRAINER(Trainer_ID),
FOREIGN KEY(Package_ID) REFERENCES PACKAGE(Package_ID),
FOREIGN KEY(Physiotherapist_ID) REFERENCES PHYSIOTHERAPIST(Physiotherapist_ID)
);