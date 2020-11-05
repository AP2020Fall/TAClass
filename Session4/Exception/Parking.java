package Exception;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Controller controller = Controller.getInstance();
        Scanner scanner = new Scanner(System.in);
        String input;
        controller.showMenu();
        while(!(input = scanner.nextLine()).equalsIgnoreCase("end")){
            if(input.equals("1")){
                System.out.println("Enter car's plate (plate num. + city code):");
                String plateNum = scanner.nextLine();
                String num = plateNum.split(" ")[0];
                String cityCode = plateNum.split(" ")[1];
                System.out.println("Enter entrance time (hh:mm):");
                String entranceTime = scanner.nextLine();
                try {
                    controller.checkinCar(num,cityCode,entranceTime);
                    System.out.println("Car " + num + " " + CityCodes.getCodeByNum(Integer.parseInt(cityCode)) + " has checked in." );
                } catch (WrongPlate|ClosedTimeEntrance e) {
                    System.err.println(e.getMessage());
                }
            }else if(input.equals("2")){
                System.out.println("Enter plate: ");
                String plate = scanner.nextLine();
                String plateNum = plate.split(" ")[0];
                String plateCode = plate.split(" ")[1];
                System.out.println("Enter price: ");
                String price = scanner.nextLine();
                try {
                    controller.checkoutCar(plateNum,plateCode,price);
                    System.out.println("Car " + plateNum + " " + CityCodes.getCodeByNum(Integer.parseInt(plateCode)) + " has checked out.");
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }else if(input.equals("3")){
                controller.showPresentCarsList();
            }else if(input.equals("4")){
                controller.showCheckedOutCars();
            }else{
                System.out.println("Your input is invalid");
            }
        }
    }
}
