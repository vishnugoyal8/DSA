public class patterns {

    static void pyramid(int n){
        for(int i =0; i<n; i++){
            for(int j = i; j<n; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollowRectangle(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n;j++){
                if(i==0 || i==n-1 || j==0 ||j ==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollowRectangle(5);
    }
}
