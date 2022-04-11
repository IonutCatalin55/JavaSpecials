package ro.java.ctrln;

public class OuterClassWithLocalClass {

    private final static int SIZE = 5;
    private String[] messageList = {"Message1", "Message2", "Message3", "Message4", "Message5"};

    public void showMessages() {
        class LocalClass {
            private int nextIndex = 0;

            public boolean hasNext() {
                //return (this.nextIndex <= SIZE - 1); cod original
                return (this.nextIndex <= messageList.length - 1); //Refactorizare Nu mai suntem conditionati de SIZE codul este mult mai dinamic
                                                                    // si se adapteaza lungimi vectorului
            }

            public String next() {
                return messageList[this.nextIndex++];
            }
        }
        LocalClass localClass = new LocalClass();
        while (localClass.hasNext()) {
            System.out.println("Mesajul este: " + localClass.next());
        }

    }

    public static void main(String[] args) {
        OuterClassWithLocalClass outerClassWithLocalClass = new OuterClassWithLocalClass();
        outerClassWithLocalClass.showMessages();
    }
}
