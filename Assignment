//Student Database Table creation

create table Students(Stu_id integer, Name varchar(225), Age integer, Mobile_No bigint, Reg_No integer,Year_of_Batch integer);

//Insertion of Student data to the database

insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(01,"Abinaya",20,1234567890,01,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(02,"Deena", 20,3456789120,02,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(03,"Divya", 20,4567832190,03,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(04,"Jermy", 20,1245678993,04,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(05,"Jovan", 20,1234777890,05,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(06,"Vincy", 20,1234657890,06,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(07,"Alwin", 20,1899567890,07,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(08,"Melvin",20,1877567890,08,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(09,"Alwin", 20,1890567890,09,2020);
insert into Students(Stu_id, Name, Age, Mobile_No, Reg_No, Year_of_Batch) values(10,"Elvis", 20,9856787699,10,2020);
select *from Students;

//Teacher Database Table Creation

create table Staff(Staff_id integer,Name varchar(25), Domain varchar(10),Dept varchar(10));

//Insertion of Teachers data to the database

insert into Staff(staff_id,name,domain,dept) values(1,"Aarthi", "IT", "CSE");
insert into Staff(staff_id,name,domain,dept) values(8,"Mathi", "TOC", "CSE");
insert into Staff(staff_id,name,domain,dept) values(7,"Abi", "ML", "CSE");
insert into Staff(staff_id,name,domain,dept) values(16,"Nivya", "MPMC", "ECE");
insert into Staff(staff_id,name,domain,dept) values(11,"Maha", "BEEME", "EEE");
insert into Staff(staff_id,name,domain,dept) values(12,"Jerlin", "IT", "CSE");
insert into Staff(staff_id,name,domain,dept) values(3,"Vinitha", "DBMS", "CSE");
insert into Staff(staff_id,name,domain,dept) values(14,"Divya", "EVS", "ECE");
insert into Staff(staff_id,name,domain,dept) values(15,"Pavi", "EG", "CIVIL");
insert into Staff(staff_id,name,domain,dept) values(16,"Mithra", "DAA", "CSE");

//Query to fetch all students from batch 2020

select * from Students where  Year_of_Batch=2020;

//Query to fetch all teachers from CSE department

select * from Staff where dept="CSE";

//Query to edit atleast 3 records from Students database

update Students set reg_no=05 where Stu_id=09;
update Students set Stu_id_id= where Name = "Alwin";
update Students set age = 19 where reg_no = 06;

//Query to delete 2 records from teachers table

delete from Staff where name = "Maha";
delete from Staff where domain = "BEEME";
