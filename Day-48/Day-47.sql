select year(hiredate) "Year",count(*) "Number_of_Employees" 
from emp group by year(hiredate) HAVING COUNT(*)>1 order by year(hiredate) asc;

/*case = 1
output =
Employee_Number Employee_Name   Employee_Sal    Department_name                                                         
7566    JONES   2975.00 Research                                                                                        
7788    SCOTT   3000.00 Research                                                                                        
7902    FORD    3000.00 Research                                                                                        
7782    CLARK   2450.00 Accounting*/


select e.empno "Employee_Number",e.ename "Employee_Name",e.sal "Employee_Sal", d.dname "Department_name"
from emp e,dept d where e.deptno=d.deptno and e.comm is NULL and e.job in ("MANAGER","ANALYST")
and d.location in("New York","Dallas")order by d.location;