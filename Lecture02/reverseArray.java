class reverseArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        reverse(arr, 2, 5);
        sumA(arr, 1, 4);
        printRev(arr, 0, 5);
    }
    public static void reverse(int[] arr, int i, int j){
        int l = i, r = j;

        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println("");
    }
    public static void sumA(int[] arr, int i, int j){
        int sum = 0;
        for(int k = i; k <= j; k++){
            sum += arr[k];
        }
        System.out.println(sum);
    }
    public static void printRev(int[] arr, int i, int j){
        while(j >= i){
            System.out.print(arr[j] + " ");
            j--;
        }
        System.out.println("");
    }    
}