package com.basicsstrong.oop;


public class DepartmentDriver {


    public static void main( String[] args )
    {
      DeptOne one = new DeptOne();
      int emp = one.getEmployee();
      System.out.println("Number of employess " + emp);
      one.attendence();

      PublicDemo publicDemo = new PublicDemo();
      PublicDemo.displayValue();
    }
}
