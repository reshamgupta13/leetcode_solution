# Write your MySQL query statement below
Select l.book_id, l.title,l.author,l.genre,l.publication_year,b.borrowed as current_borrowers
from library_books l
join (select book_id,count(book_id) as borrowed from borrowing_records where return_date is null
group by book_id)b
on l.book_id=b.book_id
where l.total_copies=b.borrowed
order by current_borrowers desc, l.title asc;
