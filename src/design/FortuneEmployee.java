package design;

import databases.ConnectToSqlDB;

import java.util.*;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args) throws Exception {




        EmployeeInfo e1 = new EmployeeInfo("Titanic sort",110,"QA",75000,'M');

        EmployeeInfo e2 = new EmployeeInfo("Hasan Sajib",111, "Design", 65000, 'F');

        EmployeeInfo e3 = new EmployeeInfo("sakibul hasan",112, "Dev",90000, 'M');

        EmployeeInfo e4 = new EmployeeInfo("iftekar ahamed",113,"QA",80000,'F');

        EmployeeInfo e5 = new EmployeeInfo("Sujaiya Roy",115, "Dev",550000, 'M');



        EmployeeInfo.setCompanyName("Department of Buildings");

        System.out.println("Company Name: " + EmployeeInfo.getCompanyName());

        e1.companyAddress();

        e1.assignDepartment();

        e1.benefitLayout();

        System.out.println("Employee Name: " + e1.getName());

        System.out.println("Employee ID: " + e1.getEmployeeId());

        System.out.println("Department Name: " +e1.getDeptName());

        System.out.println("Gender: " +e1.getGender());

        System.out.println("Annual Salary: " +e1.getSalary());

        double calculateBonus=EmployeeInfo.calculateEmployeeBonus(5,60000);

        System.out.println("Employee's Bonus: " +calculateBonus);

        e1.farewell();

        System.out.println("Employee Pension: " + EmployeeInfo.calculateEmployeePension());



        Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();

        List<Object> emp1 = new ArrayList<Object>();

        emp1.add(e1.employeeName());

        emp1.add(e1.employeeId());

        emp1.add(e1.calculateSalary());

        List<Object> emp2 = new ArrayList<Object>();

        emp2.add(e2.employeeName());

        emp2.add(e2.employeeId());

        emp2.add(e2.calculateSalary());

        employeeInfo.put(1, emp1);

        employeeInfo.put(2, emp2);

        List empInfo = new ArrayList();

        empInfo = emp2;

        ConnectToSqlDB connect = new ConnectToSqlDB();

        ConnectToSqlDB.connectToSqlDatabase();

        connect.insertDataFromArrayListToSqlTable(empInfo, "Employee_Records","Emp_Info");

        List<String> stringList = new ArrayList<String>();

        List<Object> objectList = Arrays.asList(stringList.toArray());

        connect.readDataBase("Employee_Records","Emp_Info");

    }



}
