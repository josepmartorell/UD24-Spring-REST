DROP table IF EXISTS Employee;

create table Employee(
	id int auto_increment,
	name varchar(250),
	surname varchar(250),
	job varchar(250),
    salary float,
	dni integer,
	fecha date
);

insert into employee (name, surname,  job, salary, dni, fecha)values('Dave','Allen','guitarman', 100000.00, 123456789, NOW());
insert into employee (name, surname,  job, salary, dni, fecha)values('Steve','Wozniak','developer', 90000.00, 122222222, NOW());
insert into employee (name, surname,  job, salary, dni, fecha)values('Boris','Johnson','politician', 1000000.00, 123333333, NOW());
insert into employee (name, surname,  job, salary, dni, fecha)values('Evelin','Stuard','politician', 600000.00, 123444444, NOW());
insert into employee (name, surname,  job, salary, dni, fecha)values('Jonatan','Vandenberg','policeman', 35000.00, 123455555, NOW());