public class TreasureHunt{

    static void showMap(char[][] arr){
        // Show the outline for the map 
        
        for(int x = 0; x < arr.length; x++){
            System.out.println("+---+---+---+---+---+");
            for(int y = 0; y < arr[0].length; y++){
                if(arr[x][y] == 0){
                    arr[x][y] = ' ';
                }

                if(y < 4){
                    System.out.print("| " + arr[x][y] + " ");
                }else{
                    System.out.print("| " + arr[x][y] + " |");
                }
            }

            System.out.println("");
        }
        System.out.println("+---+---+---+---+---+");
    }

    public static void main(String[] args){
        char[][] map = new char[5][5];

        showMap(map);

        map[0][0] = 'P';
        showMap(map);
    }
}