package notebook.model.builders;

/**
 * @author Oleksii Petrokhalko.
 */
public abstract class AbstractCreator {
    protected AddressBuilder getAddressBuilder() {
        return new AddressBuilder();
    }

    protected RecordBuilder getRecordBuilder() {
        return new RecordBuilder();
    }
}
