package notebook.model.entity;

import java.time.LocalDateTime;

/**
 * @author Oleksii Petrokhalko.
 */
public class Record {
    private String firsName;
    private String lastName;
    private String firstLast;
    private String nickName;
    private String comment;
    private Group group;
    private String homePhone;
    private String mobilePhone;
    private String anotherPhone;
    private String email;
    private String skype;
    private Address address;
    private LocalDateTime firstRecord;
    private LocalDateTime lastChange;

    public Record() {
    }

    public Record(String firsName, String lastName, String firstLast, String nickName, String comment, Group group,
           String homePhone, String mobilePhone, String anotherPhone, String email, String skype, Address address, LocalDateTime firstRecord, LocalDateTime lastChange) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.firstLast = firstLast;
        this.nickName = nickName;
        this.comment = comment;
        this.group = group;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.anotherPhone = anotherPhone;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.firstRecord = firstRecord;
        this.lastChange = lastChange;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstLast() {
        return firstLast;
    }

    public void setFirstLast(String firstLast) {
        this.firstLast = firstLast;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAnotherPhone() {
        return anotherPhone;
    }

    public void setAnotherPhone(String anotherPhone) {
        this.anotherPhone = anotherPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDateTime getFirstRecord() {
        return firstRecord;
    }

    public void setFirstRecord(LocalDateTime firstRecord) {
        this.firstRecord = firstRecord;
    }

    public LocalDateTime getLastChange() {
        return lastChange;
    }

    public void setLastChange(LocalDateTime lastChange) {
        this.lastChange = lastChange;
    }

    @Override
    public String toString() {
        return "Record{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstLast='" + firstLast + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", anotherPhone='" + anotherPhone + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", firstRecord=" + firstRecord +
                ", lastChange=" + lastChange +
                '}';
    }
}
