

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (1,'rent',800,3,'Apartment', 0, 'Fairfield');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (2,'rent',1000,4,'Apartment', 0, 'Fairfield');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (3,'sale',150000,3,'Apartment', 0, 'Fairfield');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (4,'sale',200000,4,'home', 0, 'Burlington');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (5,'sale',250000,3,'home', 6, 'Burlington');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (6,'rent',800,3,'Apartment', 0, 'Fairfield');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (7,'rent',900,3,'home', 0, 'Burlington');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (8,'rent',600,2,'Apartment', 0, 'Fairfield');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (9,'sale',180000,3,'home', 0, 'des moine');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (10,'sale',240000,4,'home', 0, 'des moine');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (11,'sale',250000,5,'home', 0, 'des moine');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (12,'rent',1500,3,'Apartment', 0, 'des moine');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (13,'rent',1000,3,'Apartment', 0, 'des moine');

Insert INTO Property(id, property_type, price, number_of_rooms, home_type, view_count, location)
VALUES (14,'sale',170000,3,'home', 0, 'des moine');


--             USERS TABLE
--
INSERT INTO Users(id,email, is_active,name,password)
values(1,'jhon@gmail.com',true, 'Jhon', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO Users(id,email, is_active,name,password)
values(2,'mike@gmail.com',true, 'Mike', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO Users(id,email, is_active,name,password)
values(3,'math@gmail.com',false, 'Math', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO Users(id,email, is_active,name,password)
values(4,'josh@gmail.com',true, 'Josh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO Users(id,email, is_active,name,password)
values(5,'washington@gmail.com',false, 'Washington', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO Users(id,email, is_active,name,password)
values(6,'denzel@gmail.com',true, 'Denziel', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');



--              ACTIVITY TABLE

INSERT INTO Activity(id, activity_type, date, status,property_id,users_id)
values(1,'rent',null,'applied',1, 1);
INSERT INTO Activity(id, activity_type, date, status,property_id,users_id)
values(5,'rent','01,02,2023','applied',1, 1);
INSERT INTO Activity(id, Activity_type, date, status, property_id,users_id)
values(2,'rent','01,02,2023','applied',2,3 );
INSERT INTO Activity(id, Activity_type, date, status, property_id,users_id)
values(3,'rent','02,02,2023','accepted',6,1 );
INSERT INTO Activity(id, Activity_type, date, status, property_id,users_id)
values(4,'rent','02,02,2023','applied',1,2 );
INSERT INTO Activity(id, Activity_type, date, status, property_id,users_id)
values(7,'rent','03,12,2023','applied',8,3 );
INSERT INTO Activity(id, Activity_type, date, status, property_id,users_id)
values(8,'rent','04,02,2023','applied',6,1 );
INSERT INTO Activity(id, Activity_type, date, status, property_id,users_id)
values(10,'sale','04,02,2023','accepted',12,2 );
INSERT INTO Activity(id, Activity_type, date, status, property_id,users_id)
values(11,'sale','04,02,2023','accepted',12,3 );
INSERT INTO Activity(id, Activity_type, date, status, property_id,users_id)
values(12,'sale','04,02,2023','applied',14,1 );

--
-- --                 ROLE TABLE
--
-- INSERT INTO Role(id, role)
-- values(1,'customer');
-- INSERT INTO Role(id, role)
-- values(2,'customer');
-- INSERT INTO Role(id, role)
-- values(3,'customer');
--
-- INSERT INTO Role(id, role)
-- values(4,'Admin');
-- INSERT INTO Role(id, role)
-- values(5,'Admin');
-- INSERT INTO Role(id, role)
--
--
-- values(6,'owner');
-- INSERT INTO Role(id, role)
-- values(7,'owner');
-- INSERT INTO Role(id, role)
-- values(8,'owner');
-- INSERT INTO Role(id, role)
-- values(9,'owner');
--
--
-- -

--             USERS_PROPERTIES - we