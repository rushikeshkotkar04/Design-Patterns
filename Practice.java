import org.w3c.dom.css.Rect;

import java.util.*;
import java.util.stream.Collectors;

class Boutique {
    public String dressType;
    public String acce;
    public String inners;

    public void get() {
        System.out.println("Amisha wears" + dressType + "With " + acce + "And doesnt like to wear " + inners);
    }
}

public class Practice {


    public static void main(String[] args) {
        Integer numb = 12;
        Boutique bou = new Boutique();
        bou.dressType = "Top-Skirt";
        bou.acce = "earRings";
        bou.inners = "Bras";

        bou.get();
        Boutique bou1 = new Boutique();
        bou1.dressType = "Anarkali";
        bou1.acce = "Anklets";
        bou1.inners = "Panties";
        System.out.println(numb);

    }
}
