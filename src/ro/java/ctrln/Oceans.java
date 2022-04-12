package ro.java.ctrln;

public enum Oceans { // NU POATE FI FINAL, ABSTRACT SAU DECLARAT IN INTERIORUL CLASELOR INTERIOARE, LOCALE SAU ANONIME
    Arctic(5450),
    Antarctic(7236),
    Atlantic(8486),
    Indian(8047),
    Pacific(11022);

    private final int maximumDepth; // sa transmis final catre propietate si nu mai poate fi schimbata dupa atribuire

    Oceans(int maximumDepth){
        this.maximumDepth = maximumDepth;
    }

    public int getMaximumDepth() {
        return maximumDepth;
    }

    public static void main(String[] args) {
        for (Oceans oceans : Oceans.values()){
            //oceans.maximumDepth = 10000; //valorile adincimi pot fi schimbate si nu este de dorit sa alteram date initiale din greseala,
            // ca buna practica se recomanda sa facem maximumDepth final
            System.out.println("Adancimea maxima a oceanului " + oceans.name() + " este: "+ oceans.maximumDepth);
            System.out.println("Adancimea maxima a oceanului " + oceans.name() + " este: "+ oceans.getMaximumDepth());// aceasta este metoda recomandata
                                                                                          // ca buna practica pt DNUMS care au si proprietati

        }
    }
}
