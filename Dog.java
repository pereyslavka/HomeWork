public class Dog extends Animal {
    private int maxSwim;


    public Dog(String name, int maxRun, float maxJump, int maxSwim){
        super(name, maxRun, maxJump);
        this.maxSwim=maxSwim;
    }
    public Dog(String name){
        super(name);
        super.maxRun=400+200*(int)(Math.random()*2);
        super.maxJump=1.0f;
        this.maxSwim=500+500*(int)(Math.random()*2);
    }
    @Override
    public void swim(int distance){
        if(distance<=maxSwim)
            System.out.println(super.name + " проплыл " + distance);
        else System.out.println(super.name + " не проплыл " + distance);
    }
    public void getInfo(){
        System.out.println(super.name + " maxRun="+super.maxRun+" maxJump="+super.maxJump+" maxSwim="+this.maxSwim);
    }
}
