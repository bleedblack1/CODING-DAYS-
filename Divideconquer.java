public class Divideconquer {
    
    public static void mergeSort(int arr[] , int si , int ei ){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2; // or = (si+ei)/2
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    //merge method to merge the sorted parts
    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;//index for first sorted part
        int j = mid + 1;//index for second sorted part
        int k = 0;//index for temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //for leftover elements of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array 
        for (int l = 0; l < temp.length; l++) {
            arr[si + l] = temp[l];

        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);

        // Printing the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
