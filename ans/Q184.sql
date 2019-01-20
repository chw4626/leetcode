# Write your MySQL query statement below
select D.Name as Department,  A.Name as Employee, A.Salary as Salary from Department D, Employee A
where D.Id = A.DepartmentId
and (DepartmentId,Salary) in (select DepartmentId, max(Salary) as max from Employee group by DepartmentId)