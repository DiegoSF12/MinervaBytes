package ativities;

public class Student {
    private String name;
    private int age;
    private double firstTrimester, secondTrimester, thirdTrimester;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstTrimester(double firstTrimester) {
        this.firstTrimester = firstTrimester;
    }

    public void setSecondTrimester(double secondTrimester) {
        this.secondTrimester = secondTrimester;
    }

    public void setThirdTrimester(double thirdTrimester) {
        this.thirdTrimester = thirdTrimester;
    }

    public String toString() {
        return String.format("Name: %s\nAge: %d\nFirst Trimester: %.2f\nSecond Trimester: %.2f\nThird Trimester: %.2f", name, age, firstTrimester, secondTrimester, thirdTrimester);
    }

    public double mediaFinal() {
        return firstTrimester + secondTrimester + thirdTrimester;
    }

    public void finalGrade() {
        double note = this.mediaFinal();
        if (note >= 60) {
            System.out.printf("FINAL GRADE: %.2f\n", note);
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE: %.2f\n", note);
            double missing = 60 - note;
            System.out.printf("MISSING %.2f POINTS",missing);
        }
    }

}
