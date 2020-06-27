package com.application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Evan Lokajaya
 */
public class Program {
    public static void main (String[] args) {
        Employee employee = new Employee("Name");
        Manager manager = new Manager("Manager Name", new ArrayList<String>());
        
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(employee);
        list.add(manager);
        
        DetailsPrinter printer = new DetailsPrinter(list);
        printer.printDetails();
    }
}
