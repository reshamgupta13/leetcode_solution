# Write your MySQL query statement below
select e.employee_id
from Employees e
left join Salaries s
on e.employee_id=s.employee_id
where salary is Null 
UNION
select s.employee_id
from Salaries s
left join Employees e
on e.employee_id=s.employee_id
where name is Null
order by employee_id
