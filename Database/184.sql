CREATE TABLE `Department` (
  `Id` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `Employee` (
  `Id` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL,
  `DepartmentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO Department VALUES
(1, 'IT'),
(2, 'Sales')
;

INSERT INTO Employee VALUES
(1, 'Joe', 70000, 1),
(2, 'Henry', 80000, 2),
(3, 'Sam', 60000, 2),
(4, 'Max', 90000, 1),
(5, 'Adam', 60000, 2),
(6, 'James', 90000, 1)
;

TRUNCATE TABLE Employee;
TRUNCATE TABLE Department;


INSERT INTO Department VALUES
(1, 'Sales')
;

INSERT INTO Employee VALUES
(1, 'Joe', 0, 1)
;

SELECT * FROM Employee;
SELECT * FROM Department;

SELECT DISTINCT e.DepartmentId, e.Salary,    
@rank := IF(@current_department = e.DepartmentId, @rank + 1, 1) AS rank,
@current_department := e.DepartmentId
FROM (SELECT DISTINCT e.DepartmentId, e.Salary FROM Employee e ORDER BY e.DepartmentId, e.Salary DESC) e
ORDER BY e.DepartmentId, e.Salary DESC
;

SELECT @rank := 0, @current_department := 0;


SELECT d.Name 'Department', e.Name 'Employee', a.Salary
FROM Department d
INNER JOIN Employee e ON e.DepartmentId = d.Id
INNER JOIN
(
	SELECT DISTINCT e.DepartmentId, e.Salary,    
	@rank := IF(@current_department = e.DepartmentId, @rank + 1, 1) AS rank,
	@current_department := e.DepartmentId
	FROM (SELECT DISTINCT e.DepartmentId, e.Salary FROM Employee e ORDER BY e.DepartmentId, e.Salary DESC) e
	ORDER BY e.DepartmentId, e.Salary DESC
) a USING(DepartmentId, Salary)
INNER JOIN (SELECT @rank := 0, @current_department := 0) v # ONLY because need to clear variables
WHERE a.rank = 1
ORDER BY d.Id
;
