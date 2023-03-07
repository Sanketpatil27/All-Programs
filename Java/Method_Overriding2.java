class SBI {
     public void interest() {
        System.out.println("Interest of SBI = 7.567%");
    }

    public void bank() {
        System.out.println("High interest bank SBI");
    }
}

class HDFC extends SBI {
    @Override
    public void interest() {
        System.out.println("Interest of HDFC = 8.5%");
    }
}

class BOI extends HDFC {
    @Override
    public void interest() {
        System.out.println("Interest of BOI = 7%");
    }
}

public class Method_Overriding2 {
    public static void main(String[] args) {

        BOI b = new BOI();
        b.interest();

        HDFC h = new HDFC();
        h.interest();

        HDFC d = new BOI();        // with dynamic method dispatch
        System.out.print("With Dynamic method Dispatch:  ");
        d.interest();

        SBI s = new SBI();
        s.interest();

        SBI dy = new BOI();        // with dynamic method dispatch
        System.out.print("With Dynamic method Dispatch:  ");
        dy.interest();

        System.out.print("Multilevel Property:  ");
        b.bank();
    }
}
