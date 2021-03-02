public enum PlaneType {
    BEAMUSUPSCOTTY149(50, 2000),
    FREELIKEABIRD23(10, 5000),
    FLOATLIKEACLOUD747(100, 500),
    LIGHTENINGSPEEDA320(5, 1000),
    OPENCHANNELDFREE(200, 5000),
    INVISIBLEJET(2, 50),
    TARDISESCAPE101(150, 600);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
