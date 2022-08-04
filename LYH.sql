create database LYH;
use LYH;
create table Students(
sid int primary key not null,
sname varchar(10) not null,
sex varchar(1) not null
);
create table Classes(
cid int primary key not null,
cname varchar(20) not null
);
create table Grades(
cid int not null,
sid int not null,
grade int not null,
primary key(cid,sid)
);

insert into students values(20194762,'李宇航','男');
insert into students values(20194763,'周笔畅','女');
insert into students values(20194764,'萧敬腾','男');
insert into students values(20194765,'周杰伦','男');
insert into students values(20194766,'李航','男');
insert into classes values(1111,'计算机');
insert into classes values(2222,'大数据');
insert into classes values(3333,'物理');
insert into classes values(4444,'化学');
insert into classes values(5555,'数学');
insert into classes values(6666,'日语');
insert into classes values(7777,'计算机网络');
insert into classes values(8888,'数据结构');
insert into classes values(9999,'Java');
insert into classes values(1010,'软件工程');
insert into classes values(1001,'计算机原理');
insert into classes values(1002,'程序设计');
insert into classes values(1003,'编译原理');
insert into classes values(1004,'人工智能');
insert into classes values(1005,'概率论');
insert into classes values(1006,'机器学习');
insert into grades values(20194762,1111,98);
insert into grades values(20194762,2222,98);
insert into grades values(20194762,3333,80);
insert into grades values(20194762,4444,77);
insert into grades values(20194762,5555,95);
insert into grades values(20194763,1001,92);
insert into grades values(20194763,1111,94);
insert into grades values(20194763,6666,83);
insert into grades values(20194763,9999,98);
insert into grades values(20194763,1006,98);
insert into grades values(20194764,1004,98);
insert into grades values(20194764,1010,98);
insert into grades values(20194764,2222,98);
insert into grades values(20194764,7777,98);
insert into grades values(20194764,1001,98);
insert into grades values(20194765,1002,98);
insert into grades values(20194765,1003,98);
insert into grades values(20194765,6666,98);
insert into grades values(20194765,8888,98);
insert into grades values(20194765,1005,98);