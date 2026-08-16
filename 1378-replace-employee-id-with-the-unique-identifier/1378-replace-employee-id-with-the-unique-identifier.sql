# Write your MySQL query statement below
select eu.unique_id, em.name
from Employees em
left Join EmployeeUNI eu
On em.id=eu.id
