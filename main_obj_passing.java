public class main_obj_passing {

    public static void main(String[] args) {
        
        cars car1 = new cars("BMW");
        cars car2 = new cars("tesla");
        Garage garage = new Garage();

        garage.park(car1);
        garage.park(car2);

    }
}
