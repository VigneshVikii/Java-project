create database BCSM;
use  BCSM;
create table Emp1(
 Id int primary key ,
Name varchar(255),
Qualification varchar(255),
DOJ date,
Domain varchar(255),
package varchar(255)) ;

alter table Emp1 add(Blood_group varchar(255),Branch varchar(255));
select *from Emp1;
insert into Emp1 values(001,"HariHaran","EEE",'2012-04-23',"ASS Manager",500000,"o+","Dubai");
insert into Emp1 values(102,"Venkat","B.pharm",'2012-04-23',"TL",600000,"o+","Chennai");
insert into Emp1 values(131,"Arnald","MSC",'2023-03-12',"Java",300000,"o-","Chennai");
insert into Emp1 values(045,"Jegan","Bsc",'2023-03-3',"Admin",2.50000,"ab+","Coimbatore");
insert into Emp1 values(123,"lavanya","Bca",'2023-03-23',"Python",200000,"o+","Trichy");
insert into Emp1 values(090,"Raja Shankari","Bca",'2021-08-13',"HR",400000,"o+","Chennai");
insert into Emp1 values(093,"Vershini","B.Tech",'2023-02-23',"Full Stack",300000,"o+","Mysore");
insert into Emp1 values(023,"SathyaNarayanan","Bca",'2020-04-7',"Accounts",300000,"o+","Chennai");
insert into Emp1 values(046,"Vignesh","Bca",'2023-04-23',"Java",300000,"o+","Chennai");
