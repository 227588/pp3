public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense d1 = new DrivingLicense();
        d1.setName("jan");
        d1.setSurname("Kowalski");
        d1.setCity("Kraków");
        d1.setDrivingLicenseCategory("B");
        d1.setDrivingLicenseNumber(41521213);
        d1.setPostalCode("34-600");
        d1.setYearOfIssue(2010);
        d1.setYearOfIssue(1410);

        d1.display();
        System.out.println(d1);
    }
}
