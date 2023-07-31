DROP TABLE users.roles;
DROP TABLE users.users;

CREATE TABLE IF NOT EXISTS users.roles (
id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
role VARCHAR(20)
) engine=InnoDB;

INSERT IGNORE INTO users.roles VALUES (1, 'Administrator');
INSERT IGNORE INTO users.roles VALUES (2, 'Sale User');
INSERT IGNORE INTO users.roles VALUES (3, 'Customer User');
INSERT IGNORE INTO users.roles VALUES (4, 'Secure API User');

CREATE TABLE IF NOT EXISTS users.users (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  surname VARCHAR(40),
  name VARCHAR(20),
  middle_name VARCHAR(40),
  email VARCHAR(50),
  role_id INT
#   FOREIGN KEY (role_id) REFERENCES roles(id)
) engine=InnoDB;

INSERT IGNORE INTO users.users VALUES (1, 'ivanov', 'ivan','ivanovich', 'ivanov@mail.ru', 1);
INSERT IGNORE INTO users.users VALUES (2, 'petrov', 'petr','petrovich', 'petrov@mail.ru', 2);
INSERT IGNORE INTO users.users VALUES (3, 'zhdanovich', 'mikola','mikalaevich', 'zhdan@gmail.ru', 3);
INSERT IGNORE INTO users.users VALUES (4, 'matusevich', 'evgen','genadevich', 'matusevich@gmail.ru', 4);
INSERT IGNORE INTO users.users VALUES (5, 'ivanova', 'olga','olegovna', 'ivanova@gmail.ru', 2);


