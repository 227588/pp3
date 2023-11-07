import java.time.Year;

public class DrivingLicense{
    private String name;
    private String surname;
    private String postalCode;
    private String city;
    private int drivingLicenseNumber;
    private int yearOfIssue;
    private String drivingLicenseCategory;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name.toUpperCase().substring(0,1) + name.toLowerCase().substring(1, name.length());
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }
    public void setDrivingLicenseNumber(int drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        if(yearOfIssue>=1980 && yearOfIssue<=Year.now().getValue())
            this.yearOfIssue = yearOfIssue;
    }
    public String getDrivingLicenseCategory() {
        return drivingLicenseCategory;
    }
    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }
    public void display() {
        System.out.printf("\nDrivingLicense \nname = " + getName() + ", \nsurname = " + getSurname() + ", \npostalCode = " + getPostalCode() + ", \ncity = " + getCity()
                + ", \ndrivingLicenseNumber = " + getDrivingLicenseNumber() + ", \nyearOfIssue = " + getYearOfIssue()
                + ", \ndrivingLicenseCategory = " + getDrivingLicenseCategory() + "\n");
    }  
    public String toString() {
        return "\nDrivingLicense \nname = " + getName() + ", \nsurname = " + getSurname() + ", \npostalCode = " + getPostalCode() + ", \ncity = " + getCity()
                + ", \ndrivingLicenseNumber = " + getDrivingLicenseNumber() + ", \nyearOfIssue = " + getYearOfIssue()
                + ", \ndrivingLicenseCategory = " + getDrivingLicenseCategory() + "\n";
    }  
}
