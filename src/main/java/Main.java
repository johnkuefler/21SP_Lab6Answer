/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {
    public static void main(String[] args) {
        // create employees per lab specifications and print their info
        Employee susan = new Employee("Susan Meyers",47899,"Accounting","Vice President");
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        // printing info in one line each to receive extra credit, could also call all getters to print that data
        susan.print();
        mark.print();
        joy.print();
    }
}
