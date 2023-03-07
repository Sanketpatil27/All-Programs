import java.util.*;

public enum EnumWeekDay {
    mon, tue, wed, thur, fri, sat, sun
}

class EnumCLass {

    public static void main(String[] args) {

        EnumWeekDay w;
        w = EnumWeekDay.tue;
        w = EnumWeekDay.thur;

        System.out.println(w);
    }

}
