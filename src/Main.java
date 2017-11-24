public class Main {

    public static void main(String [] args){
        for(Colors color : Colors.values()){
            System.out.println(color.ordinal() + ": " + color);
        }
        System.out.println(Colors.valueOf("WHITE"));
        System.out.println(Colors.valueOf("wHITE"));
    }
}
