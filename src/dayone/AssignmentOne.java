package dayone;

public class AssignmentOne {
    public static void main(String[] args) {
        AssignmentOne one = new AssignmentOne();
        one.oneOnOne();
        System.out.println(".............");
        one.oneOnTwo();
        System.out.println(".............");
        one.oneOnThree(4);
        System.out.println(".............");
        one.oneOnFour(4);
    }

    public void oneOnOne(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void oneOnTwo(){
        for(int i = 3; i >= 0; i--){
            for(int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void oneOnThree(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2*n+1; j++){
                if(j < n-i || j > n+i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public void oneOnFour(int n){
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < 2*n+1; j++){
                if(j < n-i || j > n+i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
