package search;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of people:");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter all people:");
        List<String> listOfPersons = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            listOfPersons.add(scanner.nextLine());
        }
        Person[] people = new Person[listOfPersons.size()];
        for (int i = 0; i < number; i++) {
            people[i] = new Person(listOfPersons.get(i).split(" "));
        }
        System.out.println("\nEnter the number of search queries:");
        number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter data to search people:");
            String key = scanner.nextLine();
            Set<Person> foundPeople = find(key, people);
            if (foundPeople.size() != 0) {
                System.out.println("\nFound people:");
                for (Person person : foundPeople) {
                    System.out.println(person.toString());
                }
            } else
                System.out.println("No matching people found.");
        }

    }

    public static Set<Person> find(String key, Person[] people) {
        Set<Person> foundPeople = new LinkedHashSet<>();
        for (Person person : people) {
            if (person.getName() != null) {
                if (person.getName().toLowerCase().contains(key.toLowerCase())) {
                    foundPeople.add(person);
                }
            }
            if (person.getSurname() != null) {
                if (person.getSurname().toLowerCase().contains(key.toLowerCase())) {
                    foundPeople.add(person);
                }
            }
            if (person.getEmail() != null) {
                if (person.getEmail().toLowerCase().contains(key.toLowerCase())) {
                    foundPeople.add(person);
                }
            }

        }
        return foundPeople;
    }
}
