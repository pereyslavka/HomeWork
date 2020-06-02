public class Day07 {
    public static void main(String[] args){
        Cat[] cat=new Cat[4];
        Plate plate=new Plate(100);
        for(int i=0;i<cat.length;i++){
            cat[i]=new Cat(i,i*100+100);
            cat[i].getInfo();
            plate.getInfo();
            cat[i].feedCat(plate);
            plate.addFood((i+1)*100+100);
            cat[i].getInfo();
        }
    }
}
