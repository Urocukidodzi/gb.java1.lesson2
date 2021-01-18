


public class Main {

    public static void main(String[] args) {

        // Task1
        int[] array1 = new int[]{1,0,1,0,0,1,1,1,0,1,0,1,1,0};

        for (int i=0; i<array1.length;i++){
            if (array1[i]==0) {
            array1[i]=1;
            } else {
                array1[i]=0;
            }
        }

        //Task2
        int[] array2 = new int[8];

        for (int i = 0, j = 0; i<array2.length;i++, j+=3){
            array2[i]=j;
            //System.out.println(j);
        }

        //Task3
        int[] array3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<array3.length;i++){
            if (array3[i]<6){
                //System.out.print(arrai3[i]);
                array3[i]=array3[i]*2;
                //System.out.println(" = "+ arrai3[i]);
            }
        }

        //Task4
        int[] [] array4 = new int[10][10];
        for(int i = 0, j=array4.length-1; i<array4.length; i++, j--){
            array4[i][i] = 1;
            array4[i][j] = 1;
        }
        //task4 visualisation
        for (int i =0; i<array4.length;i++){
            for (int j = 0; j<array4[i].length;j++) {
                System.out.print(" "+array4[i][j]+" " );
            }
            System.out.println();
        }

        //task5
        int[] array5 = new int[]{5,5,3,4,8,152,2,0,815,54,7,784,2,4,12,6,-2,-52,121,-127,144,23};
        int t5min = array5[0];
        int t5max = array5[0];
        for (int i = 0; i < array5.length; i++){
            if(array5[i] > t5max){
            t5max = array5[i];
            }
            if(array5[i] < t5min){
                t5min = array5[i];
            }
        }
        System.out.println(t5max+" "+t5min);

        //task6
        int[] array6 = new int[]{2,3,1,4,2,5,1,2};
        int[] array6_2 = new int[]{5,2,1,100};

        System.out.println(task6(array6));
        System.out.println(task6(array6_2));

        //task7
        int[] array7 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] array7_2 = new int[]{1,2,3,4,5,6,7,8,9};

        task7(array7, -2);
        task7(array7_2, 3);
//        System.out.println(array7);
//        System.out.println(array7_2);
        for (int i:array7) {
            System.out.print(" "+i);
        }
        System.out.println();

    }

    public static void task7 (int[] array, int number){

        int temp =0;
        if (number == 0){
            return;
        } else if (number>0){

            while(number !=0) {
                temp=array[array.length-1];
                for (int i = 0; i < array.length-1; i++) {
                    array[array.length-(1+i)] = array[array.length-(2+i)];
                }
                array[0]=temp;
                number--;
            }
        } else if (number<0){
            while(number !=0) {
                temp=array[0];
                for (int i = 0; i < array.length-1; i++) {
                    array[0+(i)] = array[0+(1+i)];
                }
                array[array.length-1]=temp;

                number++;
            }
        }

        // visualisation
        for (int i:array) {
            System.out.print(" "+i);
        }
        System.out.println();
    }

    public static boolean task6(int[] array){
        int leftSum=0;
        int rightSum=0;

        for (int i=1; i<array.length-1; i++ ){
            for (int j= 0 ; j < i ; j++){
                leftSum+=array[j];
            }
            for (int k = array.length-1 ; k >= i; k--){
                rightSum+=array[k];
            }
            if (leftSum==rightSum){return true;}

        }
        return false;

    }
}
