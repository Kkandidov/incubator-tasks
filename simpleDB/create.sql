-- CREATE SCHEMA simpledb DEFAULT CHARACTER SET utf8;

USE simpledb;

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS employee			CASCADE;
DROP TABLE IF EXISTS project_task		CASCADE;
DROP TABLE IF EXISTS task				CASCADE;
DROP TABLE IF EXISTS department_project CASCADE;
DROP TABLE IF EXISTS project 			CASCADE;
DROP TABLE IF EXISTS department 		CASCADE;

CREATE TABLE department(
	id				BIGINT		NOT NULL	AUTO_INCREMENT,
    number			INT 		NOT NULL,
    phone_number	VARCHAR(50)	NOT NULL,
    
    CONSTRAINT pk_department_id		PRIMARY KEY (id)
)ENGINE = InnoDB;

CREATE TABLE project(
	id				BIGINT		NOT NULL	AUTO_INCREMENT,
    number			INT 		NOT NULL,
    name			VARCHAR(50)	NOT NULL,
    
    CONSTRAINT	pk_project_id		PRIMARY KEY (id)
)ENGINE = InnoDB;

CREATE TABLE department_project(
    department_id	BIGINT				NOT NULL,
    project_id		BIGINT				NOT NULL,

    CONSTRAINT	fk_department_id	FOREIGN KEY (department_id)	REFERENCES	department	(id)	ON DELETE CASCADE,
    CONSTRAINT	fk_project_id		FOREIGN KEY (project_id)	REFERENCES	project		(id)	ON DELETE CASCADE
)ENGINE = InnoDB;

CREATE TABLE task(
	id				BIGINT		NOT NULL	AUTO_INCREMENT,
    number			INT 		NOT NULL,
    
    CONSTRAINT	pk_task_id	PRIMARY KEY (id)
)ENGINE = InnoDB;

CREATE TABLE project_task(
    project_id		BIGINT				NOT NULL,
    task_id			BIGINT				NOT NULL,

    CONSTRAINT	fk_pr_id			FOREIGN KEY (project_id)	REFERENCES	project		(id)	ON DELETE CASCADE,
    CONSTRAINT	fk_task_id			FOREIGN KEY (task_id)		REFERENCES	task		(id)	ON DELETE CASCADE
)ENGINE = InnoDB;

CREATE TABLE employee(
	id				BIGINT		NOT NULL	AUTO_INCREMENT,
    number			INT 		NOT NULL,
    surname			VARCHAR(50)	NOT NULL,
    department_id	BIGINT		NOT NULL,
    
    CONSTRAINT	pk_employee_id		PRIMARY KEY (id),
	CONSTRAINT 	fk_departm_id		FOREIGN KEY (department_id)	REFERENCES	department	(id)	ON DELETE CASCADE
)ENGINE = InnoDB;

SET FOREIGN_KEY_CHECKS=1;