USE simpledb;

-- 1  Написать процедуру: которая удаляет сотрудника 
-- (т.е. принимает параметр Имя_Сотридника) и все дочерние записи связанные с ней)
DELIMITER // 
CREATE PROCEDURE deleteEmployee (IN employeeId INT) 
BEGIN 
    DELETE FROM employee WHERE employee.id = employeeId; 
END// 

-- CALL OF THE PROCEDURE
CALL deleteEmployee (1); //
DELIMITER ;

-- a) вывести фамилии людей, которые на проекте
SELECT surname 
FROM employee
JOIN department_project USING (department_id)
GROUP BY id;

-- б) вывести фамилии людей, которые на проекте и без проекта
SELECT DISTINCT surname 
FROM employee
LEFT JOIN department_project USING (department_id)
WHERE project_id IS NULL;

-- в) вывести фамилии людей, у кого больше одного проекта
SELECT surname 
FROM employee
JOIN (	SELECT 	department_id, 
		COUNT(department_id) AS count_project
		FROM department_project
		GROUP BY department_id) AS prepared
USING (department_id)
WHERE count_project > 1;

-- г) вывести кол-во всех людей
SELECT COUNT(id) AS count_people 
FROM 
employee;

-- д) вывести фамилии людей и их кол-во проектов
SELECT 	surname,
		count_project
FROM employee
JOIN (	SELECT 	department_id, 
		COUNT(department_id) AS count_project
		FROM department_project
		GROUP BY department_id) AS prepared
USING(department_id);

-- е) вывести фамилии людей название проекта и кол-во задач на нем, у кого больше одной задачи на проекте
SELECT 	surname,
		project_id,
        count_tasks
FROM employee
JOIN department_project USING (department_id)
JOIN (	SELECT 	project_id,
		name,
        count_tasks
		FROM project
		JOIN (	SELECT 	project_id, 
				COUNT(project_id) AS count_tasks
				FROM project_task
				GROUP BY project_id) AS prepared
		ON id = project_id
		WHERE count_tasks > 1) AS outer_table
USING (project_id);

-- ж) вывести из всех людей, отсортированных в алфавитном порядке,  двух последних
SELECT surname
FROM employee
ORDER BY surname DESC
LIMIT 2;