CREATE TABLE `Logs` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Num` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

Insert Into Logs(Num)
Values (1),(1),(1),(2),(1),(2),(2),(3);

TRUNCATE TABLE Logs;

Insert Into Logs(Num) Values 
(1),
(2),
(1),
(1)
;


SELECT * FROM Logs;

SELECT Num 'ConsecutiveNums'
From Logs
Group By Num
Having Count(*) >= 3
;