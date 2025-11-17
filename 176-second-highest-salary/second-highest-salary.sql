# Write your MySQL query statement below
#SELECT max(salary) FROM employee
#WHERE salary<(select max(salary)from employee);

SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);