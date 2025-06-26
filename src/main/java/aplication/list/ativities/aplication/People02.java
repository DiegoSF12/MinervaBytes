package aplication.list.ativities.aplication;

import aplication.list.ativities.entities.Person;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class People02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Diego",21,1.81));


    }
}
