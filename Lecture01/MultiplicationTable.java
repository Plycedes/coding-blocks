class MultiplicationTable{
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] table = new int[10];

        for(int i = 0; i < 10; i++){
            table[i] = (i+1) * n;
        }

        int m = Integer.parseInt(System.console().readLine());

        int l = 0;
        int r = 9;

        while(l <= r){
            int mid = (l + r)/2;

            if(table[mid] == m){
                System.out.println(mid);
                return;
            }
            else if(table[mid] < m){
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        System.out.print(-1);
    }
}