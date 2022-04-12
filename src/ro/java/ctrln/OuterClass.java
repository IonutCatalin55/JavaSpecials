package ro.java.ctrln;

public class  OuterClass {
    enum  Weekday {Monday};
    private final static int SIZE = 5;
    private String[] messageList = {"Message1", "Message2", "Message3", "Message4", "Message5"};

    private class InnerClass {
        private int nextIndex = 0;

        //enum  Weekday {Monday};   NU PUTEM DECLARA ENUMS IN INTERIORUL CLASELOR INTERIOARE

        public boolean hasNext() {
            //return (this.nextIndex <= SIZE - 1);cod original
            return (this.nextIndex <= messageList.length - 1);//Refactorizare Nu mai suntem conditionati de SIZE codul este mult mai dinamic
                                                              // si se adapteaza lungimi vectorului
        }

        public String next() {
//            String returnedMesage = messageList[this.nextIndex]; o varianta
//            this.nextIndex++;
//            return returnedMesage;
            return messageList[this.nextIndex++]; //a doua varianta mai scurta
        }
    }

    public void showMessages() {
        InnerClass innerClass = this.new InnerClass(); // punem This pentru a sti sigur ca ne referim la o clasa interioara
        while (innerClass.hasNext()) {                       // dar functionaza si fara THIS
            System.out.println("Mesajul este: " + innerClass.next());
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.showMessages();
        //InnerClass innerClass = new InnerClass(); // NU PUTEM FOLOSI O CLASA NON-STATICA INTR UN CONTEXT STATIC
    }
    Weekday weekday = Weekday.Monday;
}
