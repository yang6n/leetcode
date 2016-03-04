CREATE TABLE `Weather` (
  `Id` int(11) NOT NULL,
  `Date` date DEFAULT NULL,
  `Temperature` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Weather VALUES
(1, '2015-01-01', 10),
(2, '2015-01-02', 25),
(3, '2015-01-03', 20),
(4, '2015-01-04', 40)
;

TRUNCATE TABLE Weather;

INSERT INTO Weather VALUES
(1, '2000-12-16', 3),
(2, '2000-12-15', -1)
;


SELECT a.Id
FROM Weather a INNER JOIN Weather b ON a.Date = DATE_ADD(b.Date, INTERVAL 1 DAY)
AND a.Temperature > b.Temperature
;
