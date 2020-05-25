import java.util.Scanner;

public class Day04 {

    static String[][] a;
    static int size;
    static int numberOfCharactersToWin;

    public static void main(String[] args){
        System.out.print("Два игрока?(yes/no): ");
        Scanner b = new Scanner(System.in);
        String q = b.nextLine();
        Scanner p = new Scanner(System.in);
        System.out.print("Количество символов для победы?: ");
        numberOfCharactersToWin = p.nextInt();
        createPlace();
        if(q.equals("yes"))
            while (true){
                inputX();
                output();
                if ((checkWin())){
                    System.out.println("Победили X!");
                    break;}
                if(checkDraw())
                    break;
                input0();
                output();
                if ((checkWin())){
                    System.out.println("Победили 0!");
                    break;}
                if(checkDraw())
                    break;
                }
        else while(true) {
            inputX();
            output();
        if ((checkWin())){
            System.out.println("Победили X!");
            break;}
            if(checkDraw())
                break;
            System.out.println("Ход компьютера: ");
            compTern();
            output();
        if ((checkWin())){
            System.out.println("Победили 0!");
            break;}
            if(checkDraw())
                break;
        }
    }
    public static void inputX(){
        Scanner b = new Scanner(System.in);
        int w=size-1;
        System.out.print("Введите координату X для Х(от 0 до "+ w +"): ");
        int x = b.nextInt();
        System.out.print("Введите координату Y для Х(от 0 до "+ w +"): ");
        int y = b.nextInt();
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                if((i==(size-1-y)*2)&&(j==x*2))
                    a[i][j]=" X ";
    }
    public static void createPlace(){
        Scanner b = new Scanner(System.in);
        System.out.print("Введите размер поля: ");
        size = b.nextInt();
        a = new String[size+size-1][size+size-1];
        for(int i=0;i<size+size-1;i++) {
            for (int j = 0; j < size + size - 1; j++) {
                if ((i % 2 != 0) && (j % 2 != 0))
                    a[i][j]="+";
                else if (j % 2 != 0)
                    a[i][j]="|";
                else if (i % 2 != 0)
                    a[i][j]="---";
                else
                    a[i][j]="   ";
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void output(){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]);
            System.out.println();}
    }
    public static void input0(){
        Scanner b = new Scanner(System.in);
        int w=size-1;
        System.out.print("Введите координату X для 0(от 0 до "+ w +"): ");
        int x = b.nextInt();
        System.out.print("Введите координату Y для 0(от 0 до "+ w +"): ");
        int y = b.nextInt();
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                if((i==(size-1-y)*2)&&(j==x*2))
                    a[i][j]=" 0 ";
    }
    public static void compTern(){
        while (true){
        int x=(int)(Math.random()*size);
        int y=(int)(Math.random()*size);
        if(a[(size-1-x)*2][(size-1-y)*2].equals("   ")){
            a[(size-1-x)*2][(size-1-y)*2]=" 0 ";
            break;}}
    }
    public static boolean checkWin(){
        boolean win = false;
        //Проверка горизонтальной победы
        for(int i=0;i<a.length;i=i+2) {
            int goris = 1;
            for (int j = 0; j < a[i].length - 1; j = j + 2)
                if ((a[i][j].equals(a[i][j + 2])==true) && (a[i][j].equals("   ")==false))
                    goris++;
            if (goris >= numberOfCharactersToWin)
                win = true;
        }
        //Проверка вертикальной победы
        for(int i=0;i<a.length;i=i+2) {
            int fertik = 1;
            for (int j = 0; j < a[i].length - 1; j = j + 2)
                if ((a[j][i].equals(a[j+2][i])==true) && (a[j][i].equals("   ")==false))
                    fertik++;
            if (fertik >= numberOfCharactersToWin)
                win = true;
        }
        //Проверка диагональной победы
        int gor=1;
        int obrGor=1;
        for (int i = 0; i < a.length - 2; i = i + 2)
            if((a[i][i].equals(a[i+2][i+2])==true)&&(a[i][i].equals("   ")==false))
                gor++;
        for (int i = 0; i <=a.length-3 ; i = i + 2)
            if((a[a.length-1-i][i].equals(a[a.length-3-i][i+2])==true)&&(a[a.length-1-i][i].equals("   ")==false))
                obrGor++;
        if((gor>=numberOfCharactersToWin)||(obrGor>=numberOfCharactersToWin))
            win=true;
        return(win);
    }
    public static boolean checkDraw(){
        int q=0;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                if(a[i][j].equals("   ")==true)
                    q++;
                if(q==0){
                    System.out.println("Ничья!");
                    return(true);}
                else return(false);
    }
}
