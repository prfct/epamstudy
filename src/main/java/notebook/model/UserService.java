package notebook.model;

import notebook.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Oleksii Petrokhalko.
 */
public class UserService {

    public Record createRecord(String firstName, String lastName, String nick, String comment, String group, String homePhone,
                               String mobilePhone, String anotherPhone, String email, String skype, String postCode,
                               String city, String street, String houseNumber, String flatNumber, String firstRecord,
                               String lastChange) {

        return new Record(firstName, lastName, createFirstLastName(firstName, lastName), nick, comment,
                Group.valueOf(group), homePhone, mobilePhone, anotherPhone, email, skype,
                new Address(postCode, city, street, houseNumber, flatNumber), createDate(firstRecord),
                createDate(lastChange));
    }

    private String createFirstLastName(String first, String last) {
        return last + Constants.SPACE + first.substring(Constants.ZERO, Constants.ONE) + Constants.DOT;
    }

    private LocalDateTime createDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(date, formatter);
    }


}
