package Enum;

public class Application {
    public static void main(String[] args) {
        Phone myiPhone = new Phone(Color.BLACK,CompanyName.APPLE,999);
        Phone myGalaxy = new Phone(Color.WHITE,CompanyName.SAMSUNG,899);
        Phone myMate = new Phone(Color.YELLOW,CompanyName.HUAWEI,599);

        System.out.println(myGalaxy.toString());
        System.out.println(myiPhone.getCompanyName());
    }
}
