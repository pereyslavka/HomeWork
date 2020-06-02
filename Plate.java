public class Plate {
    private int food;
    Plate(int food){
        this.food=food;
    }
    void getInfo(){
        System.out.println("food on plate:"+this.food);
    }
    boolean eat(int appetite){
        if(appetite<=this.food) {
            this.food = this.food - appetite;
            return (true);
        }
        else return (false);
    }
    void addFood(int addFood){
        this.food+=addFood;
    }
}
