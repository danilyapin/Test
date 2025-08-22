import java.util.Scanner;

public class UB {
    public static void main(String[] args) {

        String name = "";
        String name1 = "Daniel";
        int age = 18;
        int age1 = 15;

        register(name1, age);
        register(name1, age1);


      /*  int age = 20;

        if(age > 18){
            System.out.println("Volljährig");
        } else {
            System.out.println("Minderjährig");
        }

        boolean isRaining = false;

        if (isRaining){
            System.out.println("Nimm einen Regenschirm");
        } else if (!isRaining) {
            System.out.println("Kein Regenschirm nötig");
        }

        String city = "Hannover";

        if ("Belin".equals(city)){
            System.out.println("Hauptstadt");
        } else {
            System.out.println("Keine Hauptstadt");
        }*/

        //Level 2

        /*int score = 40;
        boolean hasTicket = true;

        if (score > 50 && hasTicket) {
            System.out.println("Eintritt erlaubt!");
        } else {
            System.out.println("Eintritt verweigert!");
        }

        int temperature = 15;

        if (temperature >= 30) {
            System.out.println("Heiß");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else if (temperature >= 10) {
            System.out.println("Kühl");
        } else {
            System.out.println("Kalt");
        }


        int number = 11;

        String parity = (number % 2 == 0) ? "Gerade" : "Ungerade";
        System.out.println(parity);*/

        //Level 3

/*        Scanner sc = new Scanner(System.in);
        System.out.println("Wie ist dein Name?");
        String name = sc.nextLine();

        if (name.equals("")){
            System.out.println("Ungültiger Name");
        } else {
            System.out.println("Hallo, " + name);
        }*/


/*        double x = 0.1 + 0.2;
        double epsilon = 1e-15;

        if (Math.abs(x - 0.3) < epsilon){
            System.out.println("Fast 0.3");
        } else {
            System.out.println("Nicht gleich 0.3");
        }*/

    }


    public static void register(String username, int age){

        if (username == null || username.isEmpty()){
            System.out.println("Ungültiger Name");
            return;
        } else if (age < 18){
            System.out.println("Du bist minderjährig");
            return;
        } else {
            System.out.println("Registrierung erfolgreich");
        }
    }
}
