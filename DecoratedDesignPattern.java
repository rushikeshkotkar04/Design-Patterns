

interface Coffee {
    String desc();

    int cost();
}

class NormalCoffee implements Coffee {

    @Override
    public String desc() {
        return "Normal Coffee";
    }

    @Override
    public int cost() {
        return 5;
    }
}

class DecorateWithMilk implements Coffee {

    private Coffee coffee;

    public DecorateWithMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String desc() {
        return this.coffee.desc() + "+ milk";
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 1;
    }
}

class DecorateWithXyz implements Coffee {

    private Coffee coffee;

    public DecorateWithXyz(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String desc() {
        return this.coffee.desc() + "+ Xyz";
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 2;
    }
}


public class DecoratedDesignPattern {
    public static void main(String[] args) {
        Coffee coffee = new DecorateWithXyz(new DecorateWithMilk(new NormalCoffee()));
        System.out.println(coffee.cost());
    }
}
