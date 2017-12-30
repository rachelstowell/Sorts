public class QuickSort {

    private int count = 0;

    public void QuickSort(int[] x, int l, int r) {

        if(l < r) {
            int splitpt = split(x, l, r);
            QuickSort(x, l, splitpt-1);
            QuickSort(x, splitpt+1, r);
        }



    }

    public int split(int[] x, int l, int r) {
        int pivot = x[l];
        int splitpt = l;

        for(int i=l+1; i<=r; i++) {
            count++;
            if (x[i] < pivot) {
                splitpt++;

                int temp1 = x[i];
                x[i] = x[splitpt];
                x[splitpt] = temp1;

            }
        }

        int temp2 = x[l];
        x[l] = x[splitpt];
        x[splitpt] = temp2;

        return splitpt;

    }

    public int getCount(){
        return count;
    }
}
