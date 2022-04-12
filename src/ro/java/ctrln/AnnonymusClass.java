package ro.java.ctrln;

public class AnnonymusClass {
    enum Weekday {Monday} // IN CLASA ANNONYMUS POATE FI FOLOSITA ==> DAR MAI JOS UNDE SE CREAZA O CLASA ANONIMA STARSHIP, NU !!

    public static void main(String[] args) {

        Starship starship = new Starship() { // "se instantiaza o interfata( cea ce este inposibil)Ele se implementeaza in def clasei"
            // defapt aici se defineste o clasa anonima
            // dar dupa isi incheie executia metoda main, CLASA ANONIMA NU MAI EXISTA SI NU MAI POTE FI REFOLOSITA
            // enum  Weekday {Monday}; ENUMS NU POATE FI DECLARATA INTR O CLASA ANONIMA

            @Override
            public void Warp() {
                System.out.println("Annonymus Class Warp"); //se pot implementa normal toate metodele
            }

            @Override
            public void setStarshipDestination(String destination) {
                System.out.println("Flying to " + destination);
            }

            @Override
            public double computeWartSpeed(int warpFactor, int ligthYearsToDestination) {
                return warpFactor * ligthYearsToDestination;
            }
        };
        starship.Warp();
        starship.setStarshipDestination("Mars");
        System.out.println("Warp speed is " + starship.computeWartSpeed(5, 300));
        System.out.println("Starship instance of Object " + (starship instanceof Object)); //atentie la parantezele rotunde pentru a spune compilatorului
        System.out.println("Starship instance of Starship " + (starship instanceof Starship));  // cum trebuie sa evalueze expresia

    }
}
