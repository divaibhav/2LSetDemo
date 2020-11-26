/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Nov-20
 *  Time: 4:14 PM
 */
package question.student;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    private int rollNo;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        //comparing on the basis of rollNo
        return this.getRollNo() - o.getRollNo();
    }

    @Override
    public int compare(Student o1, Student o2) {
        //comparing on the basis of name
        return o1.getName().compareTo(o2.getName());
    }
}
