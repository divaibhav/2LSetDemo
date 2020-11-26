/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Nov-20
 *  Time: 4:14 PM
 */
package question;

import question.student.Student;

import java.util.*;

/**
 * Question: Create a list of Student object, add 5 elements in the list.
 * Sort it on the basis of first on rollNo,
 * then sort the list by Name;
 * Student class contains two fields rollNo & Name;
 * hint: Comparable<T></> and Comparator<T> with lambda expression
 */


public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student>  list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student s = new Student();
            s.setName(sc.nextLine());
            s.setRollNo(sc.nextInt());
            sc.nextLine();
            list.add(s);
        }
        System.out.println(list);
        //sort by rollNo
        Collections.sort(list);
        System.out.println("sorted by rollNo" + list);

        //sort by name
        //lambda expression for comparator
        Comparator<Student> studentComparator = (o1, o2) -> {
            //sort on the basis of name
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list, studentComparator);
        System.out.println(list);
    }
}
