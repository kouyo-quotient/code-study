public class Arreglos2D {

    public static void main(String[] args) {
        String[][] abc = {
                {"a","b","c"},
                {"d","f","g"},
                {"h","i","j"}
        };

        for(int i=0;i<abc.length;i++){
            System.out.println();
            for(int j=0;j<abc[i].length;j++){
                System.out.print(abc[i][j]);
            }
        }
    }
}
