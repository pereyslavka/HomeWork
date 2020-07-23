import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> box;

    public Box(T fruit){
        new ArrayList<T>(Arrays.asList(fruit));
    }
    public void addFruit(T fruit){
        box.add(fruit);
    }
    public void info(){
        System.out.println(box.size());
    }
    public float getWeight(){
        return box.get(0).getWeight()*box.size();
    }
    public boolean compare(Box anotherBox){
        return Math.abs(this.getWeight()-anotherBox.getWeight())<0.0001;
    }
    public void transfer(Box<? super T> anotherBox){
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }
}
