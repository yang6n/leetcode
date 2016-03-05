Select p.FirstName, p.LastName, a.City, a.State
From Person p Left Join Address a on p.PersonId = a.PersonId
;
