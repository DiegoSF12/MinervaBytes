package ativities;

import java.util.Locale;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st01 = new Student();
        Locale.setDefault(Locale.US);

        System.out.print("Name: ");
        st01.setName(sc.nextLine());
        System.out.print("Age: ");
        st01.setAge(sc.nextInt());
        System.out.print("First Trimester: ");
        st01.setFirstTrimester(sc.nextDouble());
        System.out.print("Second Trimester: ");
        st01.setSecondTrimester(sc.nextDouble());
        System.out.print("Third Trimester: ");
        st01.setThirdTrimester(sc.nextDouble());
        st01.finalGrade();

    }
}
