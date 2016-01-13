CREATE SCHEMA IF NOT EXISTS catalogStage;
CREATE USER 'catalog_user'@'localhost' IDENTIFIED BY 'catalog';
CREATE USER 'catalog_user'@'%' IDENTIFIED BY 'catalog';
GRANT ALL PRIVILEGES ON catalogStage.* TO 'catalog_user'@'localhost';
GRANT ALL PRIVILEGES ON catalogStage.* TO 'catalog_user'@'%';
