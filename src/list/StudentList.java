/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 4:45 PM
 */
package list;

import databean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("Ramesh");
        s1.setRollNo(11);
        Student s2 = new Student();
        s2.setName("Vikas");
        s2.setRollNo(54);
        Student s3 = new Student();
        s3.setRollNo(11);
        s3.setName("Ramesh");
        System.out.println(studentList.add(s1));
        System.out.println(studentList.add(s2));
        System.out.println(studentList.add(s3));

        System.out.println(studentList);

        //we want arrange data or object in spectific manner that is on the basis of name
        //or roll no
        Collections.sort(studentList);
        System.out.println("sorted");
        System.out.println(studentList);
        //lambda expression
        Comparator<Student> compareByName = (o1, o2) ->{
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(studentList,compareByName);
        System.out.println("sorted by name");
        System.out.println(studentList);
    }
}
