Query-1
-- Display the  details of employees who joined before 1996.
--  Note: display empno and hiredate  
-- display details in increasing order of hiredate  
use fs;
-- write your query here


select empno,hiredate from emp where hiredate<'1996' order by hiredate;


Query-2
-- Display the employee name's Whose Annual sal ranging from 22,000 and 45,000.
-- (note: ename should be in ascending order)
-- annual salary column name should be Annual_sal
use fs;

-- write your query here
select ename,(12*sal) as Annual_sal from emp where (12*sal) between 22000 and 45000 order by ename;

Query-3
-- Find out Smith work experience(in terms of number of days) in this company
--  Hint: use hiredate to find out experience and column name should be Work_Experience.
use fs;

-- write your query here
select DATEDIFF(CURDATE(),hiredate) as Work_Experience from emp where ename='SMITH';


Query-4
-- display the department details where at least two emps are working
--    note: display  deptno and number of employees in each department
--     column names should be Department_number, Number_of_Employees
--   display result in higest number of employees in group  to lowest number of employees group
use fs;
-- write your query here


select deptno "Department_number",count(*) "Number_of_Employees" from emp
group by deptno
having count(*)>=2
order by count(*) DESC,deptno;

Query-5
--   display names of top two jobs by employee count
--   Note: Display the output descending order of employee count
--   Note2: columns should be displayed as job, count
use fs;
-- write your sql query here
select job,count(*) count 
from emp 
group by job 
order by count desc 
limit 2;

Query-6
 -- Display the names of employees who are not earning any commision
 -- diplay the names of employees in ascending order
 use fs;
 select ename from emp where comm is null or comm=0.00 order by ename; 

Query-7
-- Display the dept wise total salaries.
-- Note: Column names should be Dept_NUM , TOTAL_SAL
--       display the records in order of total salaries
use fs

select deptno"Dept_NUM",sum(sal)"TOTAL_SAL" from emp group by deptno order by sum(sal);

Query-8
-- Display the names of employee who joined in june in any year
-- column names must be Employee_Name , Joined_Month
-- display the name of employees in ascending order 

use fs;

-- write an sql query

SELECT ename as Employee_Name,EXTRACT(Month from hiredate) as joined_Month FROM emp
WHERE hiredate like "%-06-%" order by ename;
