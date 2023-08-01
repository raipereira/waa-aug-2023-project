insert into user(firstname,lastname,email,password)values('Jack','Jack', 'jack@miu.edu','$2a$10$ZujBoa3pBC0cmhFkqakeF');
insert into user(firstname,lastname,email,password)values('John', 'John', 'john@miu.edu','$2a$10$ZujBoa3pBC0cmhFkqakeF');

insert into role(role)VALUES ('ADMIN');
insert into role(role)VALUES ('USER');

insert into user_roles(user_id, roles_id)VALUES (1, 1);
insert into user_roles(user_id, roles_id)VALUES (2, 2);

# insert into user_profile(city,state,stress,zipcode,bio,grade_level,phone,picture,professionalachievement,user_id)
# values(?,?,?,?,?,?,?,?,?,?)






