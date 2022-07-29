SELECT COUNT(order_id) AS [EmptyLine]
FROM Orders
WHERE promocode_id IS NULL

SELECT COUNT(order_id) AS [AllLines]
FROM Orders

EmptyLine/AllLines

SELECT EmptyLine, AllLines
EmptyLine / AllLines as result
FROM Orders