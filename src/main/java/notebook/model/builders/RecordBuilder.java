package notebook.model.builders;

import notebook.model.entity.Address;
import notebook.model.entity.Group;
import notebook.model.entity.Record;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Oleksii Petrokhalko.
 */
public class RecordBuilder implements Builder<Record> {
    private Record record;

    public RecordBuilder() {
        record = new Record();
    }

    public RecordBuilder withFirstName(String firstName) {
        record.setFirsName(firstName);
        return this;
    }

    public RecordBuilder withLastName(String lastName) {
        record.setLastName(lastName);
        return this;
    }

    public RecordBuilder withNick(String nick) {
        record.setNickName(nick);
        return this;
    }

    public RecordBuilder withComment(String comment) {
        record.setComment(comment);
        return this;
    }

    public RecordBuilder withGroup(String type) {
        record.setGroup(Group.valueOf(type));
        return this;
    }

    public RecordBuilder withHomePhone(String homePhone) {
        record.setHomePhone(homePhone);
        return this;
    }

    public RecordBuilder withMobile(String mobile) {
        record.setMobilePhone(mobile);
        return this;
    }

    public RecordBuilder withAnotherPhone(String anotherPhone) {
        record.setAnotherPhone(anotherPhone);
        return this;
    }

    public RecordBuilder withEmail(String email) {
        record.setEmail(email);
        return this;
    }

    public RecordBuilder withSkype(String skype) {
        record.setSkype(skype);
        return this;
    }

    public RecordBuilder withAddress(Address address) {
        record.setAddress(address);
        return this;
    }

    public RecordBuilder withFirstRecord(String firstRecord) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(firstRecord, formatter);
        record.setFirstRecord(dateTime);
        return this;
    }

    public RecordBuilder withLastChange(String lastChange) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(lastChange, formatter);
        record.setLastChange(dateTime);
        return this;
    }

    @Override
    public Record build() {
        return record;
    }
}
