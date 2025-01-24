
interface SavingStratergy {

    void save();
}

class SavingUsingNoSQL implements SavingStratergy {

    @Override
    public void save() {
        System.out.println("Saving into No-SQL");
    }
}

class SavingUsingSQL implements SavingStratergy {

    @Override
    public void save() {
        System.out.println("Saving into SQL");
    }
}

class DataBaseOpeartions {

    public void saveData(SavingStratergy savingStratergy) {
        savingStratergy.save();
    }
}

public class StratergyDesignPattern {

    public static void main(String[] args) {
        SavingStratergy stratergyForNoSQL = new SavingUsingNoSQL();
        DataBaseOpeartions dataBaseOpeartions = new DataBaseOpeartions();
        dataBaseOpeartions.saveData(stratergyForNoSQL);

    }
}
