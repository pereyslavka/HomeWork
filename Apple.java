public class Apple extends Fruit {
    public Apple(){
        weight = 1.0f;
    }

    @Override
    public Fruit addfruit() {
        return new Apple();
    }

}
