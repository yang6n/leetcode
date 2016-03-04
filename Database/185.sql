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
(5, 'Janet', 69000, 1),
(6, 'Randy', 85000, 1)
;

TRUNCATE TABLE Employee;

INSERT INTO Employee VALUES
(1, 'Joe', 60000, 1),
(4, 'Max', 60000, 1)
;


SELECT d.Name 'Department', t.Name 'Employee', t.Salary
FROM (
	SELECT e.DepartmentId, e.Name, e.Salary, 
		@rank := IF(@current_department = e.DepartmentId, @rank + 1, 1) AS rank,
        @current_department := e.DepartmentId
	FROM Employee e 
	ORDER BY e.DepartmentId, e.Salary DESC    
) t
INNER JOIN Department d on t.DepartmentId = d.Id
INNER JOIN (SELECT @rank := 0, @current_department := 0) v # ONLY because need to clear variables
WHERE t.rank <= 3
;