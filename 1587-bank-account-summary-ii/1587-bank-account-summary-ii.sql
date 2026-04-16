SELECT 
    u.name,
    SUM(COALESCE(t.amount, 0)) AS balance
FROM Users u
LEFT JOIN Transactions t
    ON u.account = t.account
GROUP BY u.name
having sum(amount)>10000
ORDER BY u.name ASC;