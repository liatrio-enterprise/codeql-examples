CREATE TABLE IF NOT EXISTS Students(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(60),
  age INT
);

INSERT INTO Students(name, age)
VALUES
  ("Calvin Wai", 21),
  ("Chris Warren", 23);
