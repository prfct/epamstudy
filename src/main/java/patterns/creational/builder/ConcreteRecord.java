package patterns.creational.builder;

/**
 * @author Oleksii Petrokhalko.
 */
public class ConcreteRecord extends RecordBuilder {

    @Override
    void buildFirstName() {
        record.setFirsName("Vasya");
    }

    @Override
    void buildLastName() {
        record.setLastName("last");
    }

    @Override
    void buildNick() {
        record.setNickName("nick");
    }

    @Override
    void buildComment() {
        record.setComment("comment");
    }

    @Override
    void buildHomePhone() {
        record.setHomePhone("+3809");
    }

}
