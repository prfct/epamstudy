package notebook.model.builders;

import notebook.model.Address;

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
