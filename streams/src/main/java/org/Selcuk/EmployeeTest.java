package org.Selcuk;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        //print all emails- one employee has one email-  one to one mapping
        System.out.println("***********************************");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //print all phone numbers using map
        System.out.println("***********************************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        //print all phone numbers using flatmap way 1
        System.out.println("***********************************");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
        //print all phone numbers using flatmap way 2
        System.out.println("***********************************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
