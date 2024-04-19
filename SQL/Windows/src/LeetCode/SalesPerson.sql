# Write your MySQL query statement below
select
    SalesPerson.name
from
    SalesPerson
where
    name not in (
        select
            SalesPerson.name
        from
            SalesPerson
            join Orders on SalesPerson.sales_id = Orders.sales_id
            join Company on Company.com_id = Orders.com_id
        where
            Company.name = 'RED'
    );