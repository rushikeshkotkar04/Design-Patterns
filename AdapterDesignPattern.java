
interface IntToString {
    String convertToString();
}

class IntData {

    private int intData;

    public IntData(int intData) {
        this.intData = intData;
    }

    public int getIntData() {
        return this.intData;
    }
}

class AdapterIntToString implements IntToString {

    private IntData intData;

    public AdapterIntToString(IntData intData) {
        this.intData = intData;
    }

    @Override
    public String convertToString() {
        int intData = this.intData.getIntData();
        String stringData = Integer.toString(intData);
        return stringData;
    }
}


public class AdapterDesignPattern {
    public static void main(String[] args) {
        IntData intData = new IntData(10);
        AdapterIntToString adapterIntToString = new AdapterIntToString(intData);
        String jsonData = adapterIntToString.convertToString();
        System.out.println(jsonData);

    }
}
