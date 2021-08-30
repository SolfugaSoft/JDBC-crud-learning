CREATE table CARS (
car_id integer not null auto_increment primary KEY,
make varchar (255) not null,
model varchar (255) not null,
status varchar (30) not null
);

CREATE table USERS (
user_id integer not null auto_increment primary Key,
first_name varchar (255) not null,
last_name varchar (255) not null,
phone_number varchar (222) not null,
user_email varchar (255) not null,
 unique key (user_email)

);



CREATE table AUTHORITIES (
authority_id varchar (20) not null,
role varchar(20)

);