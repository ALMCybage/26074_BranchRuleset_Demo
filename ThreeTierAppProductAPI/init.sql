ALTER USER 'productuser'@'%' IDENTIFIED BY 'productpass';
GRANT ALL PRIVILEGES ON productdb.* TO 'productuser'@'%';
FLUSH PRIVILEGES;
