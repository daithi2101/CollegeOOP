package sudoku;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*
 *  Created by David on 07/10/2016.
 */
public class Sudoku {
    static List<List<Integer>> grid = new ArrayList<>();

    static int getTopBoxInColumn(int box) {
        return box % 9;
    }

    static int getLeftBoxInRow(int box) {
        return (box / 9) * 9;
    }

    static int getTileCol(int box) {
        return (box % 9) / 3;
    }

    static int getTileRow(int box) {
        return box / 27;
    }

    static List<Integer> getAllInSameTile(int box) {
        List<Integer> otherBoxes = new ArrayList<>();
        int topLeftBox = (getTileRow(box) * 27) + (getTileCol(box) * 3);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                otherBoxes.add(topLeftBox + (row * 9 + col));
            }
        }
        return otherBoxes;
    }

    static List<Integer> getAllInSameRow(int box) {
        List<Integer> otherBoxes = new ArrayList<>();
        int leftmost = getLeftBoxInRow(box);
        for (int col = 0; col < 9; col++) {
            otherBoxes.add(leftmost + col);
        }
        return otherBoxes;
    }

    static List<Integer> getAllInSameColumn(int box) {
        List<Integer> otherBoxes = new ArrayList<>();
        int top = getTopBoxInColumn(box);
        for (int row = 0; row < 9; row++) {
            otherBoxes.add(top + (row * 9));
        }
        return otherBoxes;
    }

    static Set<Integer> getAllSearchBoxes(int box) {
        List<Integer> listAllBoxes = getAllInSameTile(box);
        listAllBoxes.addAll(getAllInSameColumn(box));
        listAllBoxes.addAll(getAllInSameRow(box));

        Set<Integer> allBoxes = new HashSet(listAllBoxes);
        allBoxes.remove(box);

        return allBoxes;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the name of the puzzle file? ");
        String puzzleFile = scanner.next();

        Path filePath = Paths.get(puzzleFile);


        try {
            scanner = new Scanner(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNext()) {
                String line = scanner.next();
                for (int i = 0; i < line.length(); i++) {
                    int num = Character.getNumericValue(line.charAt(i));
                    if (num == 0) {
                        grid.add(new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
                    } else {
                        grid.add(new LinkedList<Integer>(Arrays.asList(num)));
                    }
                }
            } else {
                scanner.next();
            }
        }
        scanner.close();

        boolean solved = false;
        while (!solved) {
            solved = true;
            for (int current_box = 0; current_box < 81; current_box++) {

                if (grid.get(current_box).size() > 1) {
                    solved = false;
                    Set<Integer> boxesToSearch = getAllSearchBoxes(current_box);
                    for (Integer boxToSearch : boxesToSearch) {
                        if( grid.get(boxToSearch).size() == 1) {
                            if(grid.get(current_box).contains(grid.get(boxToSearch).get(0))){
                                grid.get(current_box).remove(grid.get(boxToSearch).get(0));
                            }

                        }
                    }
                }
            }
        }

        for (int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                System.out.print(grid.get((row * 9) + col).get(0));
            }
            System.out.println();
        }
    }
}

