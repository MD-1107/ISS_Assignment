USE ISS_PRACTICE;
GO

CREATE PROCEDURE ALLRECORDS AS 
    SELECT * FROM EMPLOYEES;
GO

CREATE PROCEDURE EMPLOYEEPROJECT @EMPLOYEE_ID INT AS 
    SELECT * FROM EMPLOYEES_PROJECTS WHERE EMPLOYEE_ID=@EMPLOYEE_ID
GO 

CREATE PROCEDURE PROJECTWISE @EMPLOYEE_ID INT, @PROJECT_NAME VARCHAR(50) AS
    SELECT * FROM EMPLOYEES_PROJECTS WHERE EMPLOYEE_ID=@EMPLOYEE_ID AND PROJECT_NAME=@PROJECT_NAME
GO

EXEC ALLRECORDS;

EXEC EMPLOYEEPROJECT @EMPLOYEE_ID=7;

EXEC PROJECTWISE @EMPLOYEE_ID=7, @PROJECT_NAME='BLOOD DONATION MANAGEMENT SYSTEM';