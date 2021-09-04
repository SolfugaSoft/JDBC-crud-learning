CREATE table CARS (
car_id integer not null auto_increment primary KEY,
make varchar (100) not null,
model varchar (100) not null,
status varchar (100) not null
);

CREATE table CARS_CATEGORY(
car_category_id integer not null auto_increment primary key,
category_name varchar (30)

);

CREATE table USERS (
user_id integer not null auto_increment primary key,
first_name varchar (100) not null,
last_name varchar (100) not null,
phone_number varchar (100) not null,
user_email varchar (100) not null,
 unique key (user_email)

);

CREATE table AUTHORITIES (
authority_id int not null primary key ,
role varchar(100)
);



CREATE TABLE USER_AUTHORITIES (
user_authorities_id int not null primary key ,
authority_id int,
user_id int,
constraint FK_authorities_id foreign key (authority_id) references AUTHORITIES (authority_id) on delete cascade on update cascade,
constraint FK_user_id foreign key (user_id) references USERS (user_id) on delete cascade on update cascade
);