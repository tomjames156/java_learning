import java.util.Scanner;

public class TreasureHunt{

    static void showMap(char[][] arr){
        // Show the outline for the map with the elements in it

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
        System.out.print("\nMove (UP, DOWN, LEFT, RIGHT) or 'Q' to Quit: \n");

        String move = userMove.nextLine();

        return move;
    }

    static void findEnemies(char map[][], int userRow, int userCol){
        // gives the player hints on the location of enemies

        for(int row = 0; row < map.length; row++){
            for(int col = 0; col < map[0].length; col++){
                if(map[row][col] == 'E'){
                    System.out.print("\nYou have an enemy");
                    if(row > userRow){
                        System.out.print(" below you");
                    }else if(row < userRow){
                        System.out.print(" above you");
                    }

                    if(col > userCol){
                        System.out.print(" to your right");
                    }else if(col < userCol){
                        System.out.print(" to your left");
                    }

                    System.out.print("\n");
                }
            }
        }
    }

    public static void main(String[] args){
        char[][] map = new char[5][5];
        char[] elementsAround = new char[4];
        int row = 0;
        int col = 0;
        int newRow = row;
        int newCol = col;
        String move;
        boolean quitGame = false;
        int lives = 1;

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
        System.out.println("\nLIVES: " + lives + "\n");
        showMap(map);
        

        while(true){
            char replacedItem = ' ';
            move = promptUser();

            switch(move){
                case "RIGHT":
                    newCol++;
                    break;
                case "LEFT":
                    newCol--;
                    break;
                case "UP":
                    newRow--;
                    break;
                case "DOWN":
                    newRow++;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

            try{
                replacedItem = map[newRow][newCol];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("You're at an edge");
                showMap(map);
                newRow = row;
                newCol = col;
                map[newRow][newCol] = 'P';
                continue;
            }

            if(replacedItem == 'O'){
                System.out.println("There's an obstacle there");
                newRow = row;
                newCol = col;
                continue;
            }else if(replacedItem == 'H'){
                // randomly give the user a helpful item either enemy location or an extra life
                int helpfulItem = (int) (Math.random() * 2);
                
                // Enemy Location
                if(helpfulItem == 1){
                    findEnemies(map, newRow, newCol);
                }else if(helpfulItem == 0){ // Extra life
                    System.out.println("You got an extra life");
                    lives++;
                    System.out.println("You have " + lives + " live(s) now");
                }
            }else if(replacedItem == 'T'){
                System.out.println("Congratulations you found the treasure");
                quitGame = true;
            }else if(replacedItem == 'E'){
                System.out.println("\nDANGER: Enemy encountered\n");
                // randomly decide who won the fight
                int fightOutcome = (int) (Math.random() * 2);

                if(fightOutcome == 0){
                    System.out.println("You lost the fight");
                    lives--; // update lives based on the outcome of the fight
                    System.out.println("You have " + lives + " live(s) left");

                    if(lives <= 0){
                        System.out.println("\nGAME OVER\n");
                        quitGame = true;
                    }
                }else{
                    System.out.println("You won the fight");
                }
                
            }

            map[row][col] = 0;
            map[newRow][newCol] = 'P';
            row = newRow;
            col = newCol;
            showMap(map);
            
            if(quitGame){
                break;
            }
        }
    }
}