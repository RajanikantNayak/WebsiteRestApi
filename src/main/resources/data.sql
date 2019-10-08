DROP TABLE IF EXISTS Website;

CREATE TABLE Website (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  url VARCHAR(250) NOT NULL
);

INSERT INTO Website (name, url) VALUES
('Aliko', 'Dangote.com'),
('Bill', 'Gates.com'),
('Folrunsho', 'Alakija.com');