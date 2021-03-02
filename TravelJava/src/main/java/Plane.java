public class Plane {

    private final PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    //enum PlaneType stores capacity and total weight
    public int getCapacity() {
        return this.planeType.getCapacity();
    }

    public int getWeight() {
        return this.planeType.getWeight();
    }
}
