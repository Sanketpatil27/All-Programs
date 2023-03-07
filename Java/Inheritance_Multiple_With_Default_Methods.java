interface Camera {
    void takeSnap();
    void recordVideo();

    // interfaces can have default, static and private methods with body
    // that can't force other classes to implement them, but they can

    private void greet() {
        System.out.println("Good Morning...");
    }

    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }

    static void meet() {
        System.out.println("Hello");
    }
}

interface Wifi {

    String[] getNetwork();
    void connectToNetwork(String network);
}

class CellPhone {

    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class NewSmartPhone extends CellPhone implements Camera, Wifi {

    public void takeSnap() {                    // --> All override methods must public
        System.out.println("Taking Snap...");
    }

    public void recordVideo() {
        System.out.println("Recording Video...");
    }

    public String[] getNetwork() {
        System.out.println("Getting List of Networks...");
        String[] networkList = {"cwh", "codeMaster","codeGeek"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

//    public void record4KVideo(){                  // --> Default methods can be override...
//        System.out.println("Recording in 4K overrided...");
//    }
}


public class Inheritance_Multiple_With_Default_Methods {
    public static void main(String[] args) {
        NewSmartPhone s = new NewSmartPhone();
        s.takeSnap();
        s.recordVideo();
       // String[] ar = s.getNetwork();

        for (String items: s.getNetwork()) {
            System.out.println(items);
        }

        s.connectToNetwork("ip:codeMaster");
        s.callNumber(458450);
        s.pickCall();
        s.record4KVideo();
        Camera.meet();           // static method calling of interface
        // s.greet();            // --> cant access private method like this.
    }
}