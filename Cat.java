public class Cat {
    private boolean hungry;
    private int appetite;
    private int name;

    Cat(int name, int appetite){
        this.name=name;
        this.hungry=true;
        this.appetite=appetite;
    }
    void getInfo(){
        System.out.println("name:Cat"+this.name+" hungry:"+this.hungry+" appetite:"+this.appetite);
    }
    void feedCat(Plate plate){
        if(plate.eat(appetite))
            this.hungry=false;
    }
}
