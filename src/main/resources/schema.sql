create table CUSTOMERS
(
    id           int primary key auto_increment,
    name         varchar(255),
    surname      varchar(255),
    age          int check ( age > 0 ),
    phone_number varchar(255)
);
insert into CUSTOMERS(name, age)
values
    ('Alexey', 20),
    ('Pit',18),
    ('Max', 40);

create table ORDERS
(
    id           int primary key auto_increment,
    date         varchar(255),
    customer_id  int,
    product_name varchar(255),
    amount       int,
    foreign key (customer_id) references CUSTOMERS (id)
);
insert into ORDERS (customer_id, product_name)
values (4, 'board'),
       (1, 'tea'),
       (1, 'mouse')