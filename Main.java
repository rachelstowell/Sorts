public class Main {

    public static void main(String[] args){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-10s%-18s%-24s%-24s%-24s\n", "n", "av", "av/n", "av/n^2)", "av/nlogn");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 1000; i <= 10000; i+=100){
            double av1 = getav(i);
            System.out.printf("%-10s%-18.4f%-24.4f%-24.4f%-24.4f\n", i, av1, av1/i, av1/(i*i), av1/(i*(Math.log(i))));
       }


    }

    public static double getav(int i){

            int counter=1;
            int[] x = new int[i];
            for (int j=0; j<x.length; j++){
                x[j] = j+1;
            }

            int total=0;
            while(counter<=30){
                int[] perm=permutation(x);
                
               //CHOOSE SORTING ALGORITHM HERE 
                
//                QuickSort QS1 = new QuickSort();
//                QS1.QuickSort(perm, 0, i-1);
//                total += QS1.getCount();
//                counter++;
//
//                RevisedBubbleSort RBS1 = new RevisedBubbleSort();
//                RBS1.bsort(perm, i-1);
//                total += RBS1.getCount();
//                counter++;
//
//
//                  BST B1 = new BST();
//                  for(int m=0; m<perm.length; m++){
//                      B1.insert(perm[m]);
//                  }
//                  total += B1.getCount();
//                  counter++;
//

            }

            double av = total/30.0;
            return av;

        }


    public static int[] permutation(int[] b) { //where b is an array of numbers in order from 1 to n
        int n = b.length-1;
        for(int k=n; k>=2; k--){
            int j = 1 + (int)(Math.random()*(k));
            int temp=b[j];
            b[j]=b[k];
            b[k]=temp;
        }

        return b;


    }

}

