public class obj_array {
    public static void main(String[] args) {
        

        food food1 = new food("Pizza");
        food food2 = new food("Burger");
        food food3 = new food("Seekh kebab");

        food[] refrigerator = {food1, food2, food3};


        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }
}
