CREATE TABLE `Scores` (
  `Id` int(11) NOT NULL,
  `Score` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Scores VALUES
(1, 3.5),
(2, 3.65),
(3, 4),
(4, 3.85),
(5, 4),
(6, 3.65)
;

SELECT s.Score, t.rank'Rank'
FROM Scores s INNER JOIN (
	SELECT b.Score, @rank := IFNULL (@rank + 1, 1) as rank
	FROM (SELECT DISTINCT a.Score FROM Scores a ORDER BY a.Score DESC) b
) t on s.Score = t.Score
INNER JOIN (SELECT @rank := 0) t2
ORDER BY t.rank
;
