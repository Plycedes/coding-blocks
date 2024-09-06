class arraySum{
    public static void main(String[] args) {
        int[] arr = {4, 56, 43, 6, 87, 45};
        int sum = 0;
        for(int a: arr){
            sum += a;
        }
        System.out.print(sum);
    }
}