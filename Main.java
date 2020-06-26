public class Main {
    public static void main(String[] args) {
        //EX01-03
        StringToInt StringToInt=new StringToInt();
        String[][] array= {{"1","2","3","5"},{"1","2","3dffg","4"},{"1","3","4"},{"2","4","3asd","4"}};
        System.out.println(StringToInt.convert(array));
        //EX04
        DayOfWeek dayOfWeek=DayOfWeek.Monday;
        System.out.println(dayOfWeek.getWorkingHours(dayOfWeek));
    }
}