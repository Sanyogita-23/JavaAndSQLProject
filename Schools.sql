mysql> create database Schools;
Query OK, 1 row affected (0.01 sec)

mysql> use Schools;
Database changed
mysql> create table student ( id int primary key auto_increment, name varchar(30),age int);
Query OK, 0 rows affected (0.03 sec)

mysql> select * from student;
+----+------+------+
| id | name | age  |
+----+------+------+
|  1 | John |   15 |
+----+------+------+
1 row in set (0.00 sec)

mysql> select * from student;
+----+-----------+------+
| id | name      | age  |
+----+-----------+------+
|  1 | John      |   15 |
|  2 | Alice     |   16 |
|  3 | Alexander |   18 |
|  4 | Lily      |   16 |
+----+-----------+------+
4 rows in set (0.00 sec)

mysql>