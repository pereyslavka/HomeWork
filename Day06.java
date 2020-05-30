public class Day06 {
   public static void main(String[] args){
       Animal[] zoo = new Animal[4];
       zoo[0] = new Dog("dog1" , 150, 2.0f, 300);
       zoo[1] = new Cat("cat1", 100, 3.0f);
       zoo[2] = new Dog("dog2");
       zoo[3] = new Dog("dog3");
       for(int i = 0;i<zoo.length;i++){
           zoo[i].getInfo();
           zoo[i].swim(600);
           zoo[i].run(500);
           zoo[i].jump(1.2f);
       }
   }
}
