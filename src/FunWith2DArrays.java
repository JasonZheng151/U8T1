public class FunWith2DArrays {
    public static int totalElements(int[][] numArray)
    {
        int numRow=numArray.length;
        int numCol= numArray[0].length;
        return numRow*numCol;
    }
    public static void fourCorners(String[][] strArray)
    {
        int numRow=strArray.length;
        int numCol= strArray[0].length;
        System.out.println(strArray[0][0]);
        System.out.println(strArray[0][numCol-1]);
        System.out.println(strArray[numRow-1][0]);
        System.out.println(strArray[numRow-1][numCol-1]);
    }
}
