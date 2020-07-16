USE simpledb;

SET FOREIGN_KEY_CHECKS=0;

TRUNCATE TABLE  employee;
TRUNCATE TABLE  project_task;
TRUNCATE TABLE  task;
TRUNCATE TABLE  department_project;
TRUNCATE TABLE  project;
TRUNCATE TABLE  department;

SET FOREIGN_KEY_CHECKS=1;

INSERT INTO department(number, phone_number)
VALUES(1, '11-22-33');
INSERT INTO department(number, phone_number)
VALUES(2, '44-55-66');
INSERT INTO department(number, phone_number)
VALUES(3, '77-88-99');
INSERT INTO department(number, phone_number)
VALUES(4, '10-11-12');
INSERT INTO department(number, phone_number)
VALUES(5, '13-14-15');
INSERT INTO department(number, phone_number)
VALUES(6, '16-17-18');
INSERT INTO department(number, phone_number)
VALUES(7, '19-20-21');
INSERT INTO department(number, phone_number)
VALUES(8, '22-23-24');
INSERT INTO department(number, phone_number)
VALUES(9, '25-26-27');
INSERT INTO department(number, phone_number)
VALUES(10, '28-29-30');

INSERT INTO project(number, name)
VALUES(1, 'Магазин');
INSERT INTO project(number, name)
VALUES(2, 'Космос');
INSERT INTO project(number, name)
VALUES(3, 'Газета');
INSERT INTO project(number, name)
VALUES(4, 'Медицина');
INSERT INTO project(number, name)
VALUES(5, 'Тест');
INSERT INTO project(number, name)
VALUES(6, 'Математика');
INSERT INTO project(number, name)
VALUES(7, 'Климат');
INSERT INTO project(number, name)
VALUES(8, 'Хозяйство');
INSERT INTO project(number, name)
VALUES(9, 'Физика');
INSERT INTO project(number, name)
VALUES(10, 'Инвестиции');

INSERT INTO department_project(department_id, project_id)
VALUES(1, 5);
INSERT INTO department_project(department_id, project_id)
VALUES(3, 3);
INSERT INTO department_project(department_id, project_id)
VALUES(3, 8);
INSERT INTO department_project(department_id, project_id)
VALUES(4, 2);
INSERT INTO department_project(department_id, project_id)
VALUES(4, 7);
INSERT INTO department_project(department_id, project_id)
VALUES(5, 1);
INSERT INTO department_project(department_id, project_id)
VALUES(5, 6);
INSERT INTO department_project(department_id, project_id)
VALUES(6, 5);
INSERT INTO department_project(department_id, project_id)
VALUES(7, 9);
INSERT INTO department_project(department_id, project_id)
VALUES(7, 4);
INSERT INTO department_project(department_id, project_id)
VALUES(9, 7);
INSERT INTO department_project(department_id, project_id)
VALUES(9, 2);
INSERT INTO department_project(department_id, project_id)
VALUES(10, 1);

INSERT INTO task(number)
VALUES(1);
INSERT INTO task(number)
VALUES(2);
INSERT INTO task(number)
VALUES(3);

INSERT INTO project_task(project_id, task_id)
VALUES(1, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(2, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(2, 2);
INSERT INTO project_task(project_id, task_id)
VALUES(3, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(3, 2);
INSERT INTO project_task(project_id, task_id)
VALUES(3, 3);
INSERT INTO project_task(project_id, task_id)
VALUES(4, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(4, 2);
INSERT INTO project_task(project_id, task_id)
VALUES(5, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(5, 3);
INSERT INTO project_task(project_id, task_id)
VALUES(6, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(6, 2);
INSERT INTO project_task(project_id, task_id)
VALUES(7, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(7, 2);
INSERT INTO project_task(project_id, task_id)
VALUES(7, 3);
INSERT INTO project_task(project_id, task_id)
VALUES(8, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(8, 2);
INSERT INTO project_task(project_id, task_id)
VALUES(9, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(10, 1);
INSERT INTO project_task(project_id, task_id)
VALUES(10, 2);

INSERT INTO employee(number, surname, department_id)
VALUES(1, 'Иванов', 1);
INSERT INTO employee(number, surname, department_id)
VALUES(2, 'Петров', 2);
INSERT INTO employee(number, surname, department_id)
VALUES(3, 'Сидоров', 3);
INSERT INTO employee(number, surname, department_id)
VALUES(4, 'Самсонов', 4);
INSERT INTO employee(number, surname, department_id)
VALUES(5, 'Николаев', 5);
INSERT INTO employee(number, surname, department_id)
VALUES(6, 'Дмитриев', 6);
INSERT INTO employee(number, surname, department_id)
VALUES(7, 'Герасимов', 7);
INSERT INTO employee(number, surname, department_id)
VALUES(8, 'Алаев', 8);
INSERT INTO employee(number, surname, department_id)
VALUES(9, 'Борисов', 9);
INSERT INTO employee(number, surname, department_id)
VALUES(10, 'Кораев', 10);