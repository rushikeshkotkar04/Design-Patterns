import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface Template {

    void onTheGas();

    void addIngre();

    void make();

    default void prepare() {
        onTheGas();
        addIngre();
        make();
    }
}


class TeaMaker implements Template {


    @Override
    public void onTheGas() {
        System.out.println("Turned on gas");
    }

    @Override
    public void addIngre() {
        System.out.println("Adding sugar + tea + water + milk");

    }

    @Override
    public void make() {
        System.out.println("Teach go Ready");
    }
}

public class TemplateDesignPattern {


    public static void main(String[] args) {

        Template teaMaker = new TeaMaker();
        teaMaker.prepare();

    }
}





