
//given a route countains 4 directions (E,W,N,S). Find the shortest path to reach destination

public class shortestPath {
    public static void main(String args[]){
        String str = "WNEENESENNN";
        int height=0;
        int width=0;

        for(int i=0;i<str.length();i++){
            switch (str.charAt(i)) {
                case 'N':height++;
                            break;
                case 'S':height--;
                            break;   
                case 'E':width++;
                            break; 
                case 'W':width--;
                            break;              
                default:
                      System.out.println(" wrong value");
                    break;
            }
        }

        double value=Math.pow(height, 2)+Math.pow(width, 2);
        double path=Math.sqrt(value);
        System.out.println(value);

    }
}
