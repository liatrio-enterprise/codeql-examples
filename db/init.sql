CREATE TABLE IF NOT EXISTS Student(
       student_id INT PRIMARY KEY AUTO_INCREMENT, 
       student_name VARCHAR(60), 
       student_age INT
);

INSERT INTO Student(
       student_name, 
       student_age) 
VALUES(
       "Calvin Wai", 
        21
);

INSERT INTO Student(
       student_name, 
       student_age) 
VALUES(
       "Chris Warren", 
        23
);