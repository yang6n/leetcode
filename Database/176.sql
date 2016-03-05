CREATE TABLE `Employee` (
  `Id` int(11) NOT NULL,
  `Salary` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Employee VALUES
(1, 100),
(2, 200),
(3, 300)
;

DELETE FROM Employee;

INSERT INTO Employee VALUES
(1, 100),
(2, 100)
;

SET sql_mode = '';

SELECT 
	IF(count(*) = 0, null, t.Salary) as 'SecondHighestSalary'
FROM (
	SELECT e.Salary, @rank := IFNULL(@rank + 1, 1) as rank
	From Employee e
    GROUP BY e.Salary
	Order by e.Salary
) t INNER JOIN (SELECT @rank := 0) a
WHERE t.rank = 2
;

