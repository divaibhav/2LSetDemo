package set;
import java.util.HashSet;
import java.util.Set;

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 4:27 PM
 */
//set operations like union
public class SetDemo2 {
    public static void main(String[] args) {
        Set<Integer> s1  = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        Set<Integer> union = new HashSet<>();
         //initializing s1 and s2 with random values
        for (int i = 0; i <5 ; i++) {
            s1.add((int)(Math.random() * 100));
            s2.add((int)(Math.random() * 100));
        }
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        union.addAll(s1);
        union.addAll(s2);

        System.out.println("union = " + union);
    }
}
