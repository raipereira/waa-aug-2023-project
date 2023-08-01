insert into user(firstname,lastname,email,password)values('Jack','Jack', 'jack@miu.edu','123');
insert into user(firstname,lastname,email,password)values('John', 'John', 'john@miu.edu','123');

insert into role (role)VALUES ('ADMIN');
insert into role (role)VALUES ('CLIENT');

insert into user_roles(user_id, roles_id)VALUES (1, 1);
insert into user_roles(user_id, roles_id)VALUES (2, 2);