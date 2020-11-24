/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 4:36 PM
 */
package set;

import databean.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        Student s1 = new Student();
        s1.setName("Ramesh");
        s1.setRollNo(11);
        Student s2 = new Student();
        s2.setName("Vikas");
        s2.setRollNo(54);
        Student s3 = new Student();
        s3.setRollNo(11);
        s3.setName("Ramesh");

        //adding student objects in set
        System.out.println(studentSet.add(s1));
        System.out.println(studentSet.add(s2));
        System.out.println(studentSet.add(s3));

        System.out.println(studentSet);
    }
}
