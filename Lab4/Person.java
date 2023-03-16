import java.util.Vector;

public abstract class Person {

  private String name;

  private String surname;

  private String emailAddress;

  private String phoneNumber;

    public Vector  myVeterinaryClinic;
    /**
   * 
   * @element-type Address
   */
  public Vector  myAddress;

  public boolean login(String name, String password) {
  return false;
  }

  public boolean logout() {
  return false;
  }

  public void setName(String name) {
  }

  public String getName() {
  return null;
  }

  public void setSurname(String surname) {
  }

  public String getSurname() {
  return null;
  }

  public void setPhoneNumber(String phoneNumber) {
  }

  public String getPhoneNumber() {
  return null;
  }

}