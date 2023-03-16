import java.util.Vector;

public class VeterinaryDoctor extends Person {

  private int yearsOfExperience;

  private String medicalCV;

    /**
   * 
   * @element-type Pet
   */
  public Vector  myPet;
    /**
   * 
   * @element-type VeterinaryTechnician
   */
  public Vector  myVeterinaryTechnician;

  public int getYearsOfExperience() {
  return 0;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
  }

  public String getMedicalCV() {
  return null;
  }

  public void setMedicalCV(String medicalCV) {
  }

  public void giveReceipt(Pet pet) {
  }

  public void givePassport(Pet pet) {
  }

}