public class Cat extends Animal {
    public Cat(String name, int maxRun, float maxJump) {
        super(name, maxRun, maxJump);
    }
    private Cat(String name){
        super(name);
        super.maxRun=200+200*(int)(Math.random()*2);
        super.maxJump=1.5f;
    }
    public void swim(int distance){
        System.out.println(super.name + " не умеет плавать");
    }
}
