public class Day02 {
    public static void main(String[] args){
    }
    public static void replacement0to1(){
        int[] a = new int[10];
        for(int i=0; i < a.length; i++){
            a[i] = (int)(Math.random()*2);
            System.out.print(a[i]);}
        System.out.println();
        for(int i=0; i < a.length; i++){
            if (a[i]==0)
                a[i]=1;
            else a[i]=0;
            System.out.print(a[i]);}
        }
    public static void increaseBy3(){
        int[] a=new int[8];
        for(int i=1;i<a.length;i++) {
            a[i]=a[i-1]+3;
        }
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    public static void lessThan6times2(){
        int[] a={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0;i<a.length;i++){
            if(a[i]<6)
                a[i]=a[i]*2;
            System.out.print(a[i]+" ");
        }
    }
    public static void diagonalsAre1(){
        int[][]a=new int[8][8];
        for(int i=0;i<a.length;i++) {
            a[i][i] = 1;
            a[i][a.length-1-i] = 1;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            System.out.print(a[i][j]);
            System.out.println();}
    }
    public static void findMinAndMax(){
        int[]a=new int[5];
        int min=0;
        int max=0;
        for(int i=0;i<a.length;i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i]+" ");
            if (i==0)
                min =a [i];
            else if (a[i]<=min)
                min=a[i];
            if (a[i]>=max)
                max=a[i];
        }
        System.out.println('\n'+"min="+min+"; max="+max);
    }
    public static boolean equalPartsSearch(int[] a){
        int leftSum = 0;
        int rightSum = 0;
        int rightStep = 0;
        int leftStep = 0;
        while(rightStep+leftStep<a.length){
            if(rightStep==0) {
                rightSum = a[a.length - 1];
                leftSum = a[leftStep];
                rightStep++;
                leftStep++;
            }
            else if(leftSum<rightSum){
                leftSum=leftSum+a[leftStep];
                leftStep++;}
            else if(leftSum>=rightSum){
                rightSum=rightSum+a[a.length-1-rightStep];
                rightStep++;}
        }
        if(leftSum==rightSum)
            return(true);
        else return(false);
    }
    public static void arrayShiftByN(int[] a, int n){
        int b;
        if(n<0)
            while(n!=0){
                for(int i=0;i<a.length-1;i++){
                    b=a[i];
                    a[i]=a[i+1];
                    a[i+1]=b;
                }
                n++;
            }
        else while(n!=0) {
            for(int i=0;i<a.length-1;i++){
                b=a[a.length-2-i];
                a[a.length-2-i]=a[a.length-1-i];
                a[a.length-1-i]=b;
            }
            n--;
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}


