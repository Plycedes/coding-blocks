class Pattern10{
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int length = n;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < length; j++){
                if(j <= i || j >= length){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            length -= 2;
            System.out.println("");
        }
    }
}