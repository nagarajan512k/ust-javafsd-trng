create database ORG;
show databases;
use org;
create table worker(
worker_id int not null primary key,
first_name varchar(20),
last_name varchar(20),
salary int,
joining_date varchar(50),
department varchar(20));
show tables;
desc worker;
insert into worker values
(001,"Monika","Arora",100000,'2014-02-20 09:00:00',"HR"),
(002,"Niharika","Verma",80000,'2014-06-11 09:00:00',"Admin"),
(003,"Vishal","Singhal",300000,'2014-02-20 09:00:00',"HR"),
(004,"Amitabh","Singh",500000,'2014-02-20 09:00:00',"Admin"),
(005,"Vivek","Bhati",500000,'2014-06-11 09:00:00',"Admin"),
(006,"Vipul","Diwan",200000,'2014-06-11 09:00:00',"Account"),
(007,"Satish","Kumar",75000,'2014-01-20 09:00:00',"Account"),
(008,"Geetika","Chauhan",90000,'2014-04-11 09:00:00',"Admin");
select * from worker;

/*Write an sql query to fetch first_name from worker table using the alias name as worker_name*/
select first_name as WORKER_NAME from worker;
/*Write an sql query to fetch first_name from worker table in upper case*/
select upper(first_name) from worker;
/*Write an sql query to fetch unique values of department from worker table*/
select distinct(department) from worker;
/*Write an sql  query to print the first three characters of first_name from worker table*/
select substring(first_name,1,3) from worker;
/*Write an sql query to find the position of the alphabet ('a') in the first name column 'amitabh' from worker table*/
select instr(first_name,binary'a') from worker where first_name='Amitabh';
/*Write an sql query to print the first_name from worker table after removing white spaces from the right side*/
select rtrim(first_name) from worker;
/*Write an sql query to print the department from worker table after removing white spaces from the left side*/
select ltrim(department) from worker;


create table bonus(
worker_ref_id int not null,
bonus_date varchar(50),
bonus_amount int);
alter table bonus drop primary key;
desc bonus;
insert into bonus values
(1,'2016-02-20 00:00:00',5000),
(2,'2016-06-11 00:00:00',3000),
(3,'2016-02-20 00:00:00',4000),
(1,'2016-02-20 00:00:00',4500),
(2,'2016-02-20 00:00:00',3500);
select * from bonus;

create table title(worker_ref_id int not null primary key,worker_title varchar(20), affected_from varchar(20));
desc title;
insert into title values
(1,"Manager",'2016-02-20 00:00:00'),
(2,"Executive",'2016-06-11 00:00:00'),
(8,"Executive",'2016-06-11 00:00:00'),
(5,"Manager",'2016-06-11 00:00:00'),
(4,"Asst.Manager",'2016-06-11 00:00:00'),
(7,"Executive",'2016-06-11 00:00:00'),
(6,"Lead",'2016-06-11 00:00:00'),
(3,"Lead",'2016-06-11 00:00:00');
select * from title;











