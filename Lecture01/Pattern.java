class Pattern{
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        for(int i = n; i > -1; i--){
            for(int j = 0; j < n; j++){
                if(j < i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.err.println("");
        }
    }
}