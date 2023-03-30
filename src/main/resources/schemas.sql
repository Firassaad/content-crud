CREATE TABLE IF NOT EXISTS Content ( id SERIAL PRIMARY KEY,title varchar(255) NOT NULL, description text, status VARCHAR(20) NOT NULL,type VARCHAR(50) NOT NULL,dateCreated TIMESTAMP ,dateUpdate TIMESTAMP,   url VARCHAR(255));

Insert into Content (title , description , status , type , dateCreated , dateUpdate)values ('title here','description' ,'IDEA','VIDEO','2023-03-19T18:17:56.1173434','2023-03-19T18:17:56.1203424');
