import java.util.Scanner;
public class Day03 {
    public static void main(String[] args) {
        guessTheNumber();
        guessTheWord();

    }
    public static void guessTheNumber(){
        Scanner a = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9");
        int randomNumber = (int)(Math.random()*10);
        int life = 3;
        while (life > 0) {
            int inputNumber = a.nextInt();
            if (inputNumber == randomNumber){
                System.out.println("Вы выиграли");
                break;
            }
            else if (inputNumber > randomNumber){
                System.out.println("Ваше число больше");
                life--;
            }
            else if (inputNumber < randomNumber){
                System.out.println("Ваше число меньше");
                life--;
            }
        }
        if (life == 0)
            System.out.println("Вы проиграли");
        System.out.print("Сыграть еще раз?(yes/no): ");
        Scanner b = new Scanner(System.in);
        String restart = b.nextLine();
        if (restart.equals("yes"))
            guessTheNumber();
    }
    public static void guessTheWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int randomWord = (int)(Math.random()*25);
        Scanner a = new Scanner(System.in);
        for(int i=0;i<words.length;i++) {
            switch (i) {
                case 7:
                    System.out.println(words[i] + " ");
                    break;
                case 16:
                    System.out.println(words[i] + " ");
                    break;
                default:
                    System.out.print(words[i] + " ");
                    break;
            }
        }
        System.out.print('\n'+"Угадайте загаданное слово: ");
        while (true) {
            String input = a.nextLine();
            if (input.equals(words[randomWord])){
                System.out.println("Вы угадали");
                break;}
            else if(true){
                for(int i=0;i<words[randomWord].length();i++){
                    if (input.length()-1>=i)
                        if (input.charAt(i)==words[randomWord].charAt(i))
                            System.out.print(input.charAt(i));
                        else System.out.print("*");
                }
                System.out.print("*******"+'\n');
                }
        }
    }
}

