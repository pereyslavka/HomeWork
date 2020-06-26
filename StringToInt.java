public class StringToInt {
    public int convert(String[][] qwerty) {
        int[][] a = new int[4][4];
        int sum = 0;
        if (qwerty.length == 4) {
            for (int i = 0; i <= qwerty.length - 1; i++)
                if (qwerty[i].length != 4) {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println("ошибка размера внутреннего массива №"+(i+1));
                    }
                }
        }
        else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("ошибка размера внешнего массива");
            }
        }
        for (int i = 0; i < qwerty.length ; i++) {
            for (int j = 0; j < qwerty[i].length ; j++) {
                try {
                    a[i][j]=Integer.parseInt(qwerty[i][j]);
                } catch (Exception e){
                    System.out.println("не число в "+i+" "+j);
                }
                sum+=a[i][j];
            }
        }
        return sum;
    }
}
