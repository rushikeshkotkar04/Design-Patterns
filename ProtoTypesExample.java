
interface ProtoType {

    ProtoType clone();
}

class Robot implements ProtoType {
    private String name;
    private int ID;

    public Robot(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public ProtoType clone() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

public class ProtoTypesExample {

    public static void main(String[] args) {
        ProtoType robot1 = new Robot("Tiger", 1);
        ProtoType clone = robot1.clone();
    }
}
