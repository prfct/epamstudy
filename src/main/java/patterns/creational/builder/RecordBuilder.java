package patterns.creational.builder;


/**
 * @author Oleksii Petrokhalko.
 */
public abstract class RecordBuilder {
    Record record;

    abstract void buildFirstName();

    abstract void buildLastName();

    abstract void buildNick();

    abstract void buildComment();

    abstract void buildHomePhone();

    void createRecord() {
        record = new Record();
    }

    Record getRecord() {
        return record;
    }
}
