package patterns.creational.builder;


/**
 * @author Oleksii Petrokhalko.
 */
public class Director {
    private RecordBuilder recordBuilder;

    void setBuilder(RecordBuilder recordBuilder) {
        this.recordBuilder = recordBuilder;
    }

    Record buildRecord() {
        recordBuilder.createRecord();
        recordBuilder.buildFirstName();
        recordBuilder.buildLastName();
        recordBuilder.buildNick();
        recordBuilder.buildComment();
        recordBuilder.buildHomePhone();
        return recordBuilder.getRecord();
    }
}
