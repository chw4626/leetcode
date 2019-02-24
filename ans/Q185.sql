# Write your MySQL query statement below
select dep.Name as Department, emp.Name as Employee, emp.Salary from Department dep, Employee emp
where dep.Id = emp.DepartmentId and 
(select count(distinct Salary) from Employee where DepartmentId = dep.Id and Salary > emp.Salary) < 3