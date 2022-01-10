package com.fazz.array;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 16:21
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ArrayTestDemo02 {
    public static void main(String[] args) {
        //1.创建一个二维数组11*11， 0：没有棋子，1：黑棋，2：白棋
        int[][] a = new int[11][11];
        a[1][2] = 1;
        a[2][3] = 1;
        //输出原始数组
        System.out.println("输出原始数组");
        for (int[] ints : a) {
            for (int anInt : ints){
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

        //转换为稀疏数组保存
        //获取有效值个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (a[i][j] !=  0){
                    sum ++;
                }
            }
        }
        System.out.println("有效值的个数："+sum);

        //2.创建一个稀疏数组的数组
        int[][] a2 = new int[sum+1][3];
        a2[0][0]=11;
        a2[0][1]=11;
        a2[0][2]=sum;

        //3.遍历二维数组，将非零的值,存到稀疏数组中
        int count = 0;
        for (int i = 0;i < a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                if (a[i][j]!=0){
                    count++;
                    a2[count][0]=i;
                    a2[count][1]=j;
                    a2[count][2]=a[i][j];
                }
            }
        }

        //4.输出稀疏数组
        System.out.println("稀疏数组");
        for (int i = 0;i<a2.length;i++){
            System.out.println(a2[i][0]+"\t"
                            +a2[i][1]+"\t"
                            +a2[i][2]+"\t");
         }

        System.out.println("==============");
        System.out.println("还原数组");
        //1.读取稀疏数组
        int[][] c = new int[a2[0][0]][a2[0][1]];

        //2.给其中的元素还原他的值
        for (int i = 1;i <a2.length;i++){
            c[a2[i][0]][a2[i][1]] = a2[i][2];
        }
        //3.打印
        for (int[] ints : c) {
            for (int anInt : ints){
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
