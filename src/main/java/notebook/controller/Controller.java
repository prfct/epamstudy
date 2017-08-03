package notebook.controller;

import notebook.Constants;
import notebook.view.View;
import notebook.model.entity.Record;
import notebook.model.UserService;
import notebook.parsers.*;


/**
 * @author Oleksii Petrokhalko.
 */
public class Controller {
    private View view;
    private UserService userService = new UserService();

    public Controller(View view) {
        this.view = view;
    }

    public void process() {
        InputAndCheckData inputAndCheckData = new InputAndCheckData();
        String firstName = inputAndCheckData.checkInputData(Constants.FIRST_NAME, new NameParser(), view);
        String lastName = inputAndCheckData.checkInputData(Constants.LAST_NAME, new NameParser(), view);
        String nick = inputAndCheckData.checkInputData(Constants.NICK_NAME, new NickParser(), view);
        String comment = inputAndCheckData.checkInputData(Constants.COMMENTARY, new AnyParser(), view);
        String group = inputAndCheckData.checkInputData(Constants.GROUP, new GroupParser(), view);
        String homePhone = inputAndCheckData.checkInputData(Constants.HOME_NUMBER, new PhoneParser(), view);
        String mobilePhone = inputAndCheckData.checkInputData(Constants.MOBILE_NUMBER, new PhoneParser(), view);
        String anotherPhone = inputAndCheckData.checkInputData(Constants.ANOTHER_NUMBER, new PhoneParser(), view);
        String email = inputAndCheckData.checkInputData(Constants.EMAIL, new EmailParser(), view);
        String skype = inputAndCheckData.checkInputData(Constants.SKYPE, new AnyParser(), view);
        String postCode = inputAndCheckData.checkInputData(Constants.INDEX, new PostCodeParser(), view);
        String city = inputAndCheckData.checkInputData(Constants.CITY, new CityStreetParser(), view);
        String street = inputAndCheckData.checkInputData(Constants.STREET, new CityStreetParser(), view);
        String houseNumber = inputAndCheckData.checkInputData(Constants.HOUSE, new HouseFlatPattern(), view);
        String flatNumber = inputAndCheckData.checkInputData(Constants.FLAT_NUMBER, new HouseFlatPattern(), view);
        String firstRecord = inputAndCheckData.checkInputData(Constants.DATE, new DateParser(), view);
        String lastChange = inputAndCheckData.checkInputData(Constants.LAST_MODIFIED, new DateParser(), view);
        Record record = userService.createRecord(firstName, lastName, nick, comment, group, homePhone, mobilePhone,
                anotherPhone, email, skype, postCode, city, street, houseNumber, flatNumber, firstRecord, lastChange);
        if (record != null) {
            view.printMessage(record.toString());
        } else {
            throw new RuntimeException(Constants.ERR_MSG);
        }

    }

}
