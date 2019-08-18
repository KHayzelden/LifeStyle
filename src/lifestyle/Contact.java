
package lifestyle;

import java.io.Serializable;
import java.util.Date;

public class Contact implements Comparable<Contact>, Serializable
{
    static int id = 1;
    
    String title, firstName, lastName, phone, address1, address2, city, county, postCode;
    Date birthday;
    
    String imagePath;
    
    boolean hasBirthday, hasImage;
    
    int contactID;

    public Contact (String firstName)
    {
        this.firstName = firstName;
        
        contactID = id;
        id++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isHasBirthday() {
        return hasBirthday;
    }

    public void setHasBirthday(boolean hasBirthday) {
        this.hasBirthday = hasBirthday;
    }

    public int getContactID() {
        return contactID;
    }   

    public boolean getHasImage() {
        return hasImage;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    //the contact class implements comparable for this code to be able to organize
    //the list alphabetically when an array of contact objects is sorted
    @Override
    public int compareTo(Contact other) 
    {
        return firstName.compareTo(other.firstName);
    }
}
