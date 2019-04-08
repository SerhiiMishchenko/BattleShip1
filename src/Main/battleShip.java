package Main;

import java.util.Scanner;

public class battleShip {
    public static int [][] Pole() {



    int [][]arr =  new int[10][10];
    arr[0][0] = 0; arr[0][1] = 0; arr[0][2] = 0; arr[0][3] = 0; arr[0][4] = 0; arr[0][5] = 0; arr[0][6] = 0; arr[0][7] = 0; arr[0][8] = 1; arr[0][9] = 0;
    arr[1][0] = 0; arr[1][1] = 0; arr[1][2] = 0; arr[1][3] = 0; arr[1][4] = 0; arr[1][5] = 0; arr[1][6] = 0; arr[1][7] = 0; arr[1][8] = 1; arr[1][9] = 0;
    arr[2][0] = 0; arr[2][1] = 1; arr[2][2] = 1; arr[2][3] = 0; arr[2][4] = 0; arr[2][5] = 0; arr[2][6] = 0; arr[2][7] = 0; arr[2][8] = 0; arr[2][9] = 0;
    arr[3][0] = 0; arr[3][1] = 0; arr[3][2] = 0; arr[3][3] = 0; arr[3][4] = 0; arr[3][5] = 0; arr[3][6] = 0; arr[3][7] = 0; arr[3][8] = 0; arr[3][9] = 0;
    arr[4][0] = 0; arr[4][1] = 0; arr[4][2] = 0; arr[4][3] = 0; arr[4][4] = 1; arr[4][5] = 1; arr[4][6] = 0; arr[4][7] = 0; arr[4][8] = 0; arr[4][9] = 0;
    arr[5][0] = 0; arr[5][1] = 0; arr[5][2] = 1; arr[5][3] = 0; arr[5][4] = 0; arr[5][5] = 0; arr[5][6] = 0; arr[5][7] = 0; arr[5][8] = 0; arr[5][9] = 0;
    arr[6][0] = 0; arr[6][1] = 0; arr[6][2] = 1; arr[6][3] = 0; arr[6][4] = 0; arr[6][5] = 0; arr[6][6] = 0; arr[6][7] = 0; arr[6][8] = 0; arr[6][9] = 0;
    arr[7][0] = 0; arr[7][1] = 0; arr[7][2] = 0; arr[7][3] = 0; arr[7][4] = 0; arr[7][5] = 0; arr[7][6] = 0; arr[7][7] = 1; arr[7][8] = 1; arr[7][9] = 0;
    arr[8][0] = 0; arr[8][1] = 0; arr[8][2] = 0; arr[8][3] = 0; arr[8][4] = 0; arr[8][5] = 0; arr[8][6] = 0; arr[8][7] = 0; arr[8][8] = 0; arr[8][9] = 0;
    arr[9][0] = 0; arr[9][1] = 0; arr[9][2] = 0; arr[9][3] = 0; arr[9][4] = 0; arr[9][5] = 0; arr[9][6] = 0; arr[9][7] = 0; arr[9][8] = 0; arr[9][9] = 0;
        System.out.print(" " + " ");
        for (int i=0; i<10; i++){
        System.out.print(i + " ");
    }
        System.out.println();

    int a = 0;
        for (int i=0;i<arr.length; i++){
        System.out.print(a++ + " ");
        for (int j=0; j<arr.length; j++){

            System.out.print("~" + " ");
        }
        System.out.println();
    }
        return arr;
}

    public static boolean shot(int arr[][]){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть координату x: ");
        int x = sc.nextInt();
        System.out.println("Введіть координату y: ");
        int y = sc.nextInt();
        System.out.print(" " + " ");
        for (int i=0; i<10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int k = 0;
        int j = 0;
        if(arr[x][y]== 1){
            arr[x][y]=2;
            j++;
            if (j == 2){
            }
        }
        else if(arr[x][y] == 0){
            arr[x][y] = 3;
        }
        for (int i=0;i<arr.length; i++){
            System.out.print(k++ + " ");
            for (int l=0; l<arr.length; l++){
                if (arr[i][l]==2) {
                    System.out.print("1 ");
                }
                else if(arr[i][l] == 0 || arr[i][l] == 1)
                {
                    System.out.print("~" + " ");
                }
                else {
                    System.out.print("x" + " ");
                }
            }
            System.out.println();
        }
        count++;
        if (arr[x][y]==2)
            return true;
        else
            return false;

    }

    public static int shipcount(int arr[][])
    {
        int count=0;
        for (int i=0;i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Player1 Name: ");
        String player1 = sc1.next();
        System.out.println("Player2 Name: ");
        String player2 = sc1.next();
        int p1score=0,p2score=0,z=1;
        boolean result;
        int[][] p = Pole();
        while (shipcount(p)>0) {
            result = shot(p);
            if (result && z == 1) {
                p1score++;
            } else if (!result && z == 1) {
                z = 2;
                continue;
            }

            if (result && z == 2) {
                p2score++;
            } else if (!result && z == 2) {
                z = 1;
            }
        }
        System.out.println(player1 + " " + p1score);
        System.out.println(player2 + " " + p2score);

    }
}


