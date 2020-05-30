public abstract class Animal {
    protected String name;
    protected int maxRun;
    protected float maxJump;
    public Animal(String name, int maxRun, float maxJump){
        this.name=name;
        this.maxRun=maxRun;
        this.maxJump=maxJump;
    }
    public Animal(String name){
        this.name=name;
    }
     void getInfo(){
         System.out.println(this.name + " maxRun="+this.maxRun+" maxJump="+this.maxJump);
     }
    abstract void swim(int distance);
    void run(int distance){
        if(distance<=maxRun)
            System.out.println(name + " пробежал "+distance);
        else System.out.println(name +" не пробежал " +distance);
    }
    void jump(float distance){
        if(distance<=maxJump)
            System.out.println(name + " прыгнул на "+distance);
        else System.out.println(name +" не допрыгнул до " +distance);
    }


}
