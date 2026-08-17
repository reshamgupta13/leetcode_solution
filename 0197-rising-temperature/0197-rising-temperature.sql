# Write your MySQL query statement below
select w1.id
from Weather w cross join Weather w1
where datediff(w1.recordDate, w.recordDate)=1
and w.temperature<w1.temperature
