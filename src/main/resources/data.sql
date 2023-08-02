insert into user(firstname,lastname,email,password)values('Jack','Jack', 'jack@miu.edu','$2a$10$ZujBoa3pBC0cmhFkqakeF');
insert into user(firstname,lastname,email,password)values('John', 'John', 'john@miu.edu','$2a$10$ZujBoa3pBC0cmhFkqakeF');

insert into role(role)VALUES ('ADMIN');
insert into role(role)VALUES ('USER');

insert into user_roles(user_id, roles_id)VALUES (1, 1);
insert into user_roles(user_id, roles_id)VALUES (2, 2);

insert into user_profile(user_id,bio,picture,professionalachievement)
values(1,'my bio bio','my_image.gif','Software Engineer Developer');


insert into user_profile(user_id,bio,picture,professionalachievement)
values(2,'My history','film_image.gif','participation in Hollywood moves');

insert into student(user_id,graduationyear,industry,graduationlevel,city,state,stress,zipcode,phone)
values(2,2023,'Google','Master Degree','San Diego', 'California', '1000 4th st',234234, 937647868);

insert into course(name)values ('FPP');
insert into course(name)values ('MPP');
insert into course(name)values ('WAP');
insert into course(name)values ('MWA');
insert into course(name)values ('EA');

insert into student_curse_taken(course_taken_id, student_id)
values(1,1);

insert into student_curse_taken(course_taken_id, student_id)
values(2,1);

insert into student_curse_taken(course_taken_id, student_id)
values(3,1);

insert into student_curse_taken(course_taken_id, student_id)
values(4,1);


insert into faculty(user_id,city,state,stress,zipcode,phone)
values(1,'Fairfield', 'Iowa', '1000 4th st',52557, 75498726);

INSERT INTO jobopportunity (title, description, company, placement, salary, employment_type, skills_required, contact_email, contact_phone, posting_date)
VALUES ('Software Engineer', 'We are looking for a skilled Software Engineer...', 'ABC Tech', 0, 80000.00, 'Full-time', 'Java, Spring, Hibernate', 'hr@abc-tech.com', '+123456789', '2023-07-30');

INSERT INTO jobopportunity (title, description, company, placement, salary, employment_type, skills_required, contact_email, contact_phone, posting_date)
VALUES ('Frontend Developer', 'Join our team as a Frontend Developer...', 'XYZ Web Solutions', 0, 60000.00, 'Part-time', 'HTML, CSS, JavaScript', 'careers@xyzwebsolutions.com', '+987654321', '2023-08-15');

INSERT INTO jobopportunity (title, description, company, placement, salary, employment_type, skills_required, contact_email, contact_phone, posting_date)
VALUES ('Data Analyst', 'Seeking a Data Analyst to analyze...', 'Data Insights Corp', 1, 75000.00, 'Full-time', 'SQL, Python, Data Visualization', 'jobs@datainsights.com', '+919876543210', '2023-08-01');

INSERT INTO jobopportunity (title, description, company, placement, salary, employment_type, skills_required, contact_email, contact_phone, posting_date)
VALUES ( 'UI/UX Designer', 'We are hiring a UI/UX Designer...', 'Creative Studio', 0, 70000.00, 'Contract', 'UI/UX Design, Adobe XD', 'designers@creativestudio.com', '+1122334455', '2023-09-05');

INSERT INTO events(type, title, description, date, location, attendances_number)
VALUES ('NETWORKING', 'Alumni Networking Event', 'A networking event for alumni to connect and network.', '2023-08-15', 'Alumni Center', 50);

INSERT INTO events(type, title, description, date, location, attendances_number)
VALUES ('REUNION', 'Class of 2000 Reunion', 'A reunion event for the graduating class of 2000.', '2023-09-20', 'Grand Hotel', 100);

INSERT INTO events(type, title, description, date, location, attendances_number)
VALUES ('WORKSHOPS', 'Career Development Workshop', 'A workshop to help alumni with career development and job search strategies.', '2023-10-15', 'Conference Center', 80);

INSERT INTO attendance_event(event_id, name, phone, dob, attendance_confirmation)
VALUES (1,'John Doe', '123-456-7890', '1990-05-15', 'YES');

INSERT INTO attendance_event(event_id, name, phone, dob, attendance_confirmation)
VALUES (2,'Jane Smith', '987-654-3210', '1988-09-25', 'YES');

INSERT INTO attendance_event(event_id,name, phone, dob, attendance_confirmation)
VALUES (3, 'Michael Johnson', '555-555-5555', '1995-11-10', 'NO');









