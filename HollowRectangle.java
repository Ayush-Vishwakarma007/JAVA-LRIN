public class HollowRectangle {
    public static void main(String[] args) {
        int row = 10;
        int col = 15;

        for (int r=1; r<=row; r++){
            for (int c=1; c<=col; c++){
                if (c==1 || r==1 || c==col || r==row ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
