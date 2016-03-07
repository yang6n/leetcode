CREATE TABLE `Employee` (
  `Id` int(11) NOT NULL,
  `Salary` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Employee VALUES
(1, 100), 
(2, 200), 
(3, 300), 
(4, 500), 
(5, 400)
;

TRUNCATE TABLE Employee;
SELECT * FROM Employee;

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N=N-1;
  RETURN ( SELECT IF(COUNT(*) = 0, NULL, e.Salary) FROM Employee e ORDER BY e.Salary DESC LIMIT N, 1);
END