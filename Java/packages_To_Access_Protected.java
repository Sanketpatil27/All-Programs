import Folder.folder1.folder2.*;

class C1 extends Packages {
    void Packages() {
        System.out.println(proInt);
        //System.out.println(defInt);
    }
}

public class packages_To_Access_Protected {
    public static void main(String[] args) {
        
        System.out.println("I am main method");
        C1 c = new C1();
        //c.display();
    }
}