Select a.Name 'Employee'
From Employee a Inner Join Employee b on a.ManagerId = b.Id
Where a.Salary > b.Salary
;
