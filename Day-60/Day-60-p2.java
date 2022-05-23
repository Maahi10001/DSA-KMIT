/*
create a Employee Class and Department Class with the following 
instance variables.

Employee-
Eno-int
Ename-string
Esal-int
Department.Dno-int
Comm-int
YOE-int



Department
Dno-int
Dname-string
loc-string

create necessary setters/getters

Write a Main Class to read a set of n Employee records 
and Department records

You are now supposed to do the following 

1) Print the Number of Employees having 10+ above YOE
2) Print the Number of Employees working for a given department location







*/
import java.util.*;

class Department {
    int deptno;
    String dname,dloc;
    Department(int deptno,String dname,String dloc) {
    
        this.deptno=deptno;
        this.dname=dname;
        this.dloc=dloc;
    }
    // public void set(int deptno,String dname,String dloc){
    //     this.deptno=deptno;
    //     this.dname=dname;
    //     this.dloc=dloc;
    //}
    public int getdeptno(){
        return deptno;
    }
    public String getdloc(){
        return dloc;
    }
}

class Employee {
    int eno,esal,comm,YOE,deptno;
    String ename;
    static ArrayList<Department>dept;
    Employee(int eno,String ename,int esal,int deptno,int comm,int YOE) {
        this.eno=eno;
        this.esal=esal;
        this.comm=comm;
        this.YOE=YOE;
        this.deptno=deptno;
        this.ename=ename;
        }
    
    public int getdeptno(){
        return deptno;
    }
    public int getyoe(){
        return YOE;
    }
}

class program2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in); 
        int d_n=sc.nextInt();
        Department  d;
        List<Department>ls=new ArrayList<>();
        for(int i=0;i<d_n;i++){
             d=new Department(sc.nextInt(),sc.next(),sc.next());
            ls.add(d);
        }
       // Employee.ls=ls;
        int e_n=sc.nextInt();
        Employee e;
        List<Employee>ls_e=new ArrayList<>();
        for(int i=0;i<e_n;i++){
             e=new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            ls_e.add(e);
        }
        String location=sc.next();
        int deptnowithloc=0;
        int emp_count=0;
        int num_of_emp=0;
        for(Department x:ls){
            if(x.getdloc().equals(location)){
                deptnowithloc=x.getdeptno();
            }
        }
        for(Employee y:ls_e){
            if(y.getyoe()>10){
                emp_count++;
            }
            if(y.getdeptno()==deptnowithloc){
                num_of_emp++;
            }
        }
        System.out.println(emp_count);
        System.out.println(num_of_emp);
    }
}