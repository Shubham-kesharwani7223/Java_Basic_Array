import java.util.*;

public class marks {
    public static void main(String args[]) {
        // Zero indexed language for the Array
        // 1st type
        int marks[] = new int[3];
        marks[0] = 99; // phy
        marks[1] = 95; // CS
        marks[2] = 79; // maths
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // Using loop
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }

}
