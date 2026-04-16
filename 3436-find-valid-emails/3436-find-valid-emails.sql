# Write your MySQL query statement below
select user_id, email
from Users
where email REGEXP '^[A-Z a-z 0-9 _]+@[A-Z a-z]+\\.com$'
order by (user_id) asc;