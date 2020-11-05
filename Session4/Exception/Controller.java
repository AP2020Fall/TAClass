package Exception;

import java.time.LocalTime;

public class Controller {
    public static Controller instance;

    public static Controller getInstance() {
        if(instance == null)
            instance = new Controller();
        return instance;
    }

    public void checkinCar(String plateNum, String plateCode, String entranceTime)throws WrongPlate,ClosedTimeEntrance {
        int hour = Integer.parseInt(entranceTime.split(":")[0]);
        int minute = Integer.parseInt(entranceTime.split(":")[1]);
        LocalTime time = LocalTime.of(hour,minute);
        if(time.isAfter(LocalTime.of(21,0))|| time.isBefore(LocalTime.of(9,0)))
            throw new ClosedTimeEntrance();
        if(Integer.parseInt(plateCode) > 5)
            throw new WrongPlate();
        new Entrance(time,new Car(plateNum,CityCodes.getCodeByNum(Integer.parseInt(plateCode))));
    }

    public void checkoutCar(String plateNum,String plateCode,String price) throws Exception{
        if(Integer.parseInt(plateCode) > 5)
            throw new WrongPlate();
        Entrance carEntrance = null;
        for (Entrance entrance : Entrance.allEntrances) {
            if(entrance.car.plateNum.equals(plateNum)
                    && entrance.car.cityCode.equals(CityCodes.getCodeByNum(Integer.parseInt(plateCode)))){
             carEntrance = entrance;
             break;
            }
        }
        if(carEntrance == null)
            throw new Exception("This car isn't in parking.");
        carEntrance.hasCheckout = true;
        carEntrance.setPrice(Integer.parseInt(price));
    }

    public void showPresentCarsList(){
        int index = 1;
        boolean hasCar = false;
        for (Entrance entrance : Entrance.allEntrances) {
            if(!entrance.hasCheckout){
                System.out.println(index + ".Plate: " + entrance.car.plateNum + " " + entrance.car.cityCode + "   " + "Time: " + entrance.time);
                index ++;
                if(!hasCar)
                    hasCar = true;
            }
        }
        if(!hasCar)
            System.out.println("No car is in the parking.");
    }

    public void showCheckedOutCars(){
        int index = 1;
        int totalSalary = 0;
        boolean hasCar = false;
        for (Entrance entrance : Entrance.allEntrances) {
            if(entrance.hasCheckout){
                System.out.println(index + ".Plate: " + entrance.car.plateNum + " " + entrance.car.cityCode + "   " + "Price: " + entrance.price);
                totalSalary += entrance.price;
                index ++;
                if(!hasCar)
                    hasCar = true;
            }
        }
        if(!hasCar)
            System.out.println("No car has checked out");
        System.out.println("Your total salary is: " + totalSalary);
    }
    public void showMenu(){
        System.out.println("AP99-00 Parking (Open 9:00-22:00)\n1.Checkin a car\n2.Checkout a car\n3.Show present cars" +
                "\n4.Show checkedOut cars");
    }
}

class WrongPlate extends Exception{
    public WrongPlate(){
        super("Your plate code is wrong.");
    }
}
class ClosedTimeEntrance extends Exception{
    public ClosedTimeEntrance(){
        super("The parking is closed.");
    }
}
