

class House {
    private boolean hasRooms;
    private boolean hasSwimmingPool;
    private boolean hasGym;

    private House(HouseBuilder houseBuilder) {

        this.hasRooms = houseBuilder.hasRooms;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
        this.hasGym = houseBuilder.hasGym;
        System.out.println(this.hasRooms + " " + this.hasSwimmingPool + " " + this.hasGym);
    }

    static class HouseBuilder {
        private boolean hasRooms;
        private boolean hasSwimmingPool;
        private boolean hasGym;

        public HouseBuilder setHasRooms() {
            this.hasRooms = true;
            return this;
        }

        public HouseBuilder setHasSwimmingPool() {
            this.hasSwimmingPool = true;
            return this;
        }

        public HouseBuilder setHasGym() {
            this.hasGym = true;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}

public class BuilderDesignPattern {

    public static void main(String[] args) {
        House.HouseBuilder houseBuilder = new House.HouseBuilder();
        houseBuilder.setHasGym();
        houseBuilder.setHasRooms();
        houseBuilder.build();
    }
}
