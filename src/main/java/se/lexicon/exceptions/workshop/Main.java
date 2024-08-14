package se.lexicon.exceptions.workshop;

import java.io.IOException;
import java.util.List;

import se.lexicon.exceptions.workshop.data_access.DuplicateNameException;
import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;

public class Main {

	public static void main(String[] args) {
		
		List <String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

        List <String> lastNames = null;
        try {
            lastNames = CSVReader_Writer.getLastNames();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not read last names", e);
        }

        NameService nameService = new NameService(maleFirstNames, femaleFirstNames,lastNames);

        // Test adding a male first name that already exists.
//        try {
//            nameService.addMaleFirstName("William");
//        } catch (DuplicateNameException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }

        // Test adding a male first name that does not exist.
//        try {
//            nameService.addMaleFirstName("John");
//        } catch (DuplicateNameException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }

        // Test adding a female first name that already exists.
//        try {
//            nameService.addFemaleFirstName("Alice");
//        } catch (DuplicateNameException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }

        // Test adding a female first name that does not exist.
//        try {
//            nameService.addFemaleFirstName("Nourshan");
//        } catch (DuplicateNameException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }
//

//        // Test adding a last name that already exists.
//        try {
//            nameService.addLastName("Andersson");
//        } catch (DuplicateNameException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }

//        // Test adding a last name that does not exist.
//        try {
//            nameService.addLastName("asdf");
//        } catch (DuplicateNameException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }
//

        Person test = nameService.getNewRandomPerson();
        System.out.println(test);

	}

}
