create database PRJ301_DE180316
go 
use PRJ301_DE180316
create table DE180316
(
	MajorID varchar(10) primary Key,
	MajorName varchar(20),
	LeaderName varchar(50)
)

insert into DE180316(MajorID, MajorName, LeaderName) values
('C001', 'IT', 'Nguyen PHong son'),
('C002', 'Design', 'Doan Duy Binh');

