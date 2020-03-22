package seedu.eylah.expensesplitter.model.util;

import java.math.BigDecimal;

import seedu.eylah.expensesplitter.model.PersonAmountBook;
import seedu.eylah.expensesplitter.model.ReadOnlyPersonAmountBook;
import seedu.eylah.expensesplitter.model.person.Amount;
import seedu.eylah.expensesplitter.model.person.Name;
import seedu.eylah.expensesplitter.model.person.Person;

/**
 * Contains utility methods for populating {@code PersonAmount} with sample data.
 */
public class SamplePersonAmountDataUtil {

    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Willy"), new Amount(new BigDecimal("3.30"))),
            new Person(new Name("Shi"), new Amount(new BigDecimal("34.30"))),
        };
    }

    public static ReadOnlyPersonAmountBook getSamplePersonAmountBook() {
        PersonAmountBook sampleAb = new PersonAmountBook();
        for (seedu.eylah.expensesplitter.model.person.Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

}
