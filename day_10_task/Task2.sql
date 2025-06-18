create database kgcas;
use kgcas;
create table student(name varchar(32),dept varchar(5),sec char(1), marks int);
select * from student;
insert into student values("pooja","ct","B",78),("yogapriya","ct","B",54),("sabthami","ct","A",80),("Harshini","ct","A",35),("Mithun","ct","B",25);
select * from student;
update student set name="ypd" where name="yogapriya";
select *from student;
select * from student where marks<60;
select name,dept,sec from student;



   
