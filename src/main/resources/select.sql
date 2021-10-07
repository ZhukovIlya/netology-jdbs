select product_name from ORDERS orders
join CUSTOMERS c on c.id = orders.customer_id
where lower(c.name) = lower(:name);