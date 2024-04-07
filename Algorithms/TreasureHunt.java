import java.util.Scanner;

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

    static String promptUser(){
        // Ask user to move and return user input

        Scanner userMove = new Scanner(System.in);
        System.out.print("\nMove (UP, DOWN, LEFT, RIGHT): \n");

        String move = userMove.nextLine();

        return move;
    }

    // static void checkEncounters(char[][] arr, String move){
        

    //     map[row][col] = 'P';
    //     showMap(map);
    // }



    public static void main(String[] args){
        char[][] map = new char[5][5];
        int row = 0;
        int col = 0;
        String move;
        int immunity = 0;
        char[] helpfulItems = {'E', 'I'};
        int foundTreasure = 0;

        map[row][col] = 'P'; // place player at starting position
        placeItem('T', map);  // randomly place treasure on the map

        // randomly place 2 enemies on the map
        placeItem('E', map);
        placeItem('E', map);

        // randomly place 3 obstacles on the map
        placeItem('O', map);
        placeItem('O', map);
        placeItem('O', map);

        // randomly place a hidden item on the map
        placeItem('H', map);
        showMap(map);
        
        int newRow = row;
        int newCol = col;

        while(foundTreasure != 1){

            move = promptUser();

            if(move.equals("RIGHT")){
                newCol = col + 1;
            }else if(move.equals("LEFT")){
                newCol = col - 1;
            }else if(move.equals("UP")){
                newRow = row - 1;
            }else if(move.equals("DOWN")){
                newRow = row + 1;
            }else if(move.equals("Q")){
                break;
            }else{
                System.out.println("Invalid Move");
            }

            try{
                map[newRow][newCol] = 'P';
                map[row][col] = 0;
                row = newRow;
                col = newCol;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("You're at an edge");
            }
            
            showMap(map);
        }
    }
}