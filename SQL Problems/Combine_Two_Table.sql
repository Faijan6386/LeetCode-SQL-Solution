SELECT p.firstName, p.lastName, a.city, a.state 
from Person AS p 
LEFT JOIN Address AS a 
ON p.personID = a.personID;