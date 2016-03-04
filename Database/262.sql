CREATE TABLE `Users` (
  `Users_Id` int(11) NOT NULL,
  `Banned` enum('Yes','No') DEFAULT NULL,
  `Role` enum('client','driver') DEFAULT NULL,
  PRIMARY KEY (`Users_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Users VALUES
(1, 'No', 'client'),
(2, 'Yes', 'client'),
(3, 'No', 'client'),
(4, 'No', 'client'),
(10, 'No', 'driver'),
(11, 'No', 'driver'),
(12, 'No', 'driver'),
(13, 'No', 'driver')
;

CREATE TABLE `Trips` (
  `Id` int(11) NOT NULL,
  `Client_Id` int(11) NOT NULL,
  `Driver_Id` int(11) DEFAULT NULL,
  `City_Id` int(11) DEFAULT NULL,
  `Status` enum('completed','cancelled_by_driver','cancelled_by_client') DEFAULT NULL,
  `Request_at` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Trips VALUES
(1,1,10,1,'completed','2013-10-01'),
(2,2,11,1,'cancelled_by_driver','2013-10-01'),
(3,3,12,6,'completed','2013-10-01'),
(4,4,13,6,'cancelled_by_client','2013-10-01'),
(5,1,10,1,'completed','2013-10-02'),
(6,2,11,6,'completed','2013-10-02'),
(7,3,12,6,'completed','2013-10-02'),
(8,2,13,12,'completed','2013-10-03'),
(9,3,10,12,'completed','2013-10-03'),
(10,4,13,12,'cancelled_by_driver','2013-10-03')
;


SELECT t.request_at, 
	CAST(
		COUNT(CASE WHEN t.status = 'cancelled_by_client' OR t.status = 'cancelled_by_driver' THEN 1 END) / COUNT(*)
        as DECIMAL(4,2)
	) 
    as 'Cancellation'
FROM Trips t INNER JOIN Users u on t.client_id = u.Users_id and u.Banned = 'No' and u.Role = 'client'
WHERE 
	t.request_at BETWEEN '2013-10-01' and '2013-10-03'
GROUP BY t.request_at
;