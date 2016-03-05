DROP TABLE Person;

CREATE TABLE `Person` (
  `Id` int(11) NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

TRUNCATE TABLE Employee;

INSERT INTO Person VALUES
(1, 'john@example.com'),
(2, 'bob@example.com'),
(3, 'john@example.com')
;

SELECT * FROM Person;

SET SQL_SAFE_UPDATES = 0;

DELETE a.* FROM Person a INNER JOIN (
	SELECT p.Id, p.Email, 
		@rank := IF(@current_email = p.Email, @rank + 1, 1) as rank,    
		@current_email := p.Email
	FROM Person p INNER JOIN (SELECT @rank := 0) a
	Order By p.Email, p.Id
) b ON a.Id = b.Id 
WHERE b.rank != 1
;
