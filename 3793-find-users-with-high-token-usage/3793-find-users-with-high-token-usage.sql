# Write your MySQL query statement below
Select user_id, count(prompt) as prompt_count, round(avg(tokens),2)avg_tokens
from prompts
group by user_id 
having count(prompt)>=3 and max(tokens)>AVG(tokens*1.0)
order by avg_tokens DESC, user_id ASC