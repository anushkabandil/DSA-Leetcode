# Write your MySQL query statement below

SELECT a.name 
FROM Employee a
JOIN Employee b 
ON a.id = b.managerId
GROUP BY a.name, a.id
HAVING COUNT(b.id) >= 5;