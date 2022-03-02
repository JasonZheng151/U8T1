import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        /*String[][] hitlist ={   {"Abby"," Don", "George", "Kim"},
                                {"Brian", "Elenor", "Harry", "Lenny"},
                                {"Cathy", "Fred", "Jill","Matt"}};
        for(String[] hits: hitlist)
        {
            System.out.println(Arrays.toString(hits)); //Normal
        }
        System.out.println("");
        hitlist[1][2]="Paul";
        for(String[] hits: hitlist)
        {
            System.out.println(Arrays.toString(hits));//with Paul
        }
        System.out.println("");
        String temp=hitlist[0][0];
        hitlist[0][0]= hitlist[2][3];
        hitlist[2][3]=temp;
        for(String[] hits: hitlist)
        {
            System.out.println(Arrays.toString(hits)); //Abby and Matt switched
        }
        System.out.println("");
        String[] temp2= hitlist[0];
        hitlist[0]=hitlist[1];
        hitlist[1]=temp2;
        for(String[] hits: hitlist)
        {
            System.out.println(Arrays.toString(hits)); //Line Switch
        }*/
        int[][]arr1= new int[2][3];
        int[][] arr2= new int[3][2];
        arr1[0][0]= 1;
        arr1[0][1]= 2;
        arr1[0][2]= 3;
        arr1[1][0]= 4;
        arr1[1][1]= 5;
        arr1[1][2]= 5;
        for(int[] arrays: arr1)
        {
            System.out.println(Arrays.toString(arrays));
        }
        System.out.println("");
        arr2[0][0]=1;
        arr2[1][0]=2;
        arr2[2][0]=3;
        arr2[0][1]=4;
        arr2[1][1]=5;
        arr2[2][1]=6;
        for(int[] arrays: arr2)
        {
            System.out.println(Arrays.toString(arrays));
        }
    }
}
