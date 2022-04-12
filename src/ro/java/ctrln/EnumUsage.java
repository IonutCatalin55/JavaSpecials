package ro.java.ctrln;

public class EnumUsage {
    public static void main(String[] args) {

        Weekday weekday =  Weekday.SUNDAY; // ASA SE INITIALIZEAZA O VARIABILA DE TIP ENUM !! FARA NEW ,DIRECT CONSTANTELE ENUMULUI

        switch (weekday) {
            case MONDAY:
                System.out.println("luni");
                break;
            case TUESDAY:
                System.out.println("marti");
                break;
            case THURSDAY:
                System.out.println("miercuri");
                break;
            case WENDSDAY:
                System.out.println("joi");
                break;
            case FRIDAY:
                System.out.println("vineri");
                break;
            case SATURDAY:
                System.out.println("sambata");
                break;
            case SUNDAY:
                System.out.println("duminica");
                System.out.println(weekday.SUNDAY); //afiseaza SUNDAY Java face convertire automata la String
                break;
            default:
                System.out.println("zi necunoscuta");
        }
    }
}
