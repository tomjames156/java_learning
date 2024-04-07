public class TreasureHunt{

    static void showMap(char[][] arr){
        // Show the outline for the map 

        for(int x = 0; x < arr.length; x++){
            System.out.println("+---+---+---+---+---+");
            for(int y = 0; y < arr[0].length; y++){

                if(y < 4){
                    if(arr[x][y] == 0){
                        System.out.print("|   ");
                    }else{
                        System.out.print("| " + arr[x][y] + " ");
                    }                
                }else{
                    if(arr[x][y] == 0){
                        System.out.print("|   |");
                    }else{
                        System.out.print("| " + arr[x][y] + " |");
                    }
                    
                }
            }

            System.out.println("");
        }
        System.out.println("+---+---+---+---+---+");
    }

    static void placeItem(char item, char[][] arr){
        // Function that randomly places a given item on the map

        int row;
        int col;

        do{
            row = (int) (Math.random() * arr.length);
            col = (int) (Math.random() * arr[0].length);
        }while(arr[row][col] != 0);

        arr[row][col] = item;
    }

    public static void main(String[] args){
        char[][] map = new char[5][5];

        map[0][0] = 'P'; // place player at starting position
        placeItem('T', map);  // randomly place treasure on the map

        // randomly place 2 enemies on the map
        placeItem('E', map);
        placeItem('E', map);

        // randomly place 3 obstacles on the map
        placeItem('O', map);
        placeItem('O', map);
        placeItem('O', map);
        showMap(map);

        
    }
}