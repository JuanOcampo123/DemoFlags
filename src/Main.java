import java.awt.*;

public class Main {

    public static final int COLOR_YELLOW = new Color(250, 201, 20).getRGB();
    public static final int COLOR_BLUE = new Color(17, 13, 99).getRGB();
    public static final int COLOR_RED = new Color(196, 0, 15).getRGB();
    public static final int COLOR_BLACK = new Color(5, 5, 5).getRGB();
    public static final int COLOR_WHITE = new Color(255, 255, 255).getRGB();
    public static final int COLOR_GREEN = new Color(35, 138, 51).getRGB();



    public static int [][] createCOLFlag(int height, int width){
        int [][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int)(height*0.50);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_YELLOW;
            }
        }

        rowIni = (int)(height*0.50);
        rowEnd = (int)(height*0.75);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = (int)(height*0.75);
        rowEnd = (int)(height);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int [][] createVENFlag(int height, int width){
        int [][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int)(height*0.34);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_YELLOW;
            }
        }

        rowIni = (int)(height*0.34);
        rowEnd = (int)(height*0.67);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = (int)(height*0.67);
        rowEnd = (int)(height);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }



        return flag;
    }

    public static int [][] createPOLFlag(int height, int width){
        int [][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int)(height);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.50);
        rowEnd = (int)(height);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] createPANFlag(int height, int width) {
        int[][] flag = new int[height][width];

        int rowIni = 0;
        int rowEnd = (int)(height*0.50);
        int cellIni = 0;
        int cellEnd = (int)(width*0.50);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = cellIni; cell < cellEnd ; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }


        rowIni = 0;
        rowEnd = (int)(height*0.50);
        cellIni = (int)(width*0.50);
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = cellIni; cell < cellEnd ; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = (int)(height*0.50);
        rowEnd = (int)(height);
        cellIni = 0;
        cellEnd = (int)(width*0.50);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = cellIni; cell < cellEnd ; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }


        rowIni = (int)(height*0.50);
        rowEnd = (int)(height);
        cellIni = (int)(width*0.50);
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = cellIni; cell < cellEnd ; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        return flag;
    }

    public static int[][] createCHLFlag(int height, int width) {
        int[][] flag = new int[height][width];

        int rowIni = 0;
        int rowEnd = (int)(height*0.50);
        int cellIni = 0;
        int cellEnd = (int)(width*0.33);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = cellIni; cell < cellEnd ; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }


        rowIni = 0;
        rowEnd = (int)(height*0.50);
        cellIni = (int)(width*0.33);
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = cellIni; cell < cellEnd ; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.50);
        rowEnd = (int)(height);
        cellIni = 0;
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = cellIni; cell < cellEnd ; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] createCZEFlag(int height, int width) {
        int[][] flag = new int[height][width];

        int rowIni = 0;
        int rowEnd = (int) (height);
        int cellIni = 0;
        int cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height * 0.50);
        cellIni = 0;
        cellEnd = (int) (width*0.50);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < row + 1; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height*0.50);
        cellIni = 0;
        cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < row; cell++) {
                flag[cell][row] = COLOR_WHITE;
            }
        }

        rowIni = 0;
        rowEnd = (int)(height*0.50);
        cellIni = (int)(width*0.30);
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = cellIni; cell < cellEnd ; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height);
        cellIni = 0;
        cellEnd = (int)(width*0.30);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
            cellEnd--;
        }

        return flag;
    }

    public static int[][] createDNKFlag(int height, int width){

        int[][] flag = new int[height][width];

        int rowIni = 0;
        int rowEnd = (int) (height * 0.42);
        int cellIni = 0;
        int cellEnd = (int) (width*0.25);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int)(height);
        cellIni = (int)(width*0.25);
        cellEnd = (int)(width*0.35);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.42);
        rowEnd = (int)(height*0.60);
        cellIni = 0;
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int) (height * 0.60);
        rowEnd = (int) (height);
        cellIni = 0;
        cellEnd = (int) (width*0.25);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height*0.42);
        cellIni = (int) (width*0.35);
        cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = (int) (height * 0.60);
        rowEnd = (int) (height);
        cellIni = (int) (width*0.35);
        cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] createFINFlag(int height, int width){

        int[][] flag = new int[height][width];

        int rowIni = 0;
        int rowEnd = (int) (height * 0.34);
        int cellIni = 0;
        int cellEnd = (int) (width*0.20);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = 0;
        rowEnd = (int)(height);
        cellIni = (int)(width*0.20);
        cellEnd = (int)(width*0.40);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = (int)(height*0.34);
        rowEnd = (int)(height*0.67);
        cellIni = 0;
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = (int) (height * 0.68);
        rowEnd = (int) (height);
        cellIni = 0;
        cellEnd = (int) (width*0.20);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height*0.35);
        cellIni = (int) (width*0.40);
        cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int) (height * 0.68);
        rowEnd = (int) (height);
        cellIni = (int)(width*0.40);
        cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        return flag;
    }

    public static int[][] createNORFlag(int height, int width){

        int[][] flag = new int[height][width];

        int rowIni = 0;
        int rowEnd = (int) (height);
        int cellIni = 0;
        int cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = (int)(height*0.34);
        rowEnd = (int)(height*0.68);
        cellIni = 0;
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = 0;
        rowEnd = (int)(height);
        cellIni = (int)(width*0.20);
        cellEnd = (int)(width*0.40);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = 0;
        rowEnd = (int)(height);
        cellIni = (int)(width*0.25);
        cellEnd = (int)(width*0.35);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = (int)(height*0.45);
        rowEnd = (int)(height*0.60);
        cellIni = 0;
        cellEnd = (int)(width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] createCHEFlag(int height, int width){

        int[][] flag = new int[height][width];

        int rowIni = 0;
        int rowEnd = (int) (height);
        int cellIni = 0;
        int cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = (int)(height*0.34);
        rowEnd = (int)(height*0.68);
        cellIni = (int)(width*0.25);
        cellEnd = (int)(width*0.75);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.09);
        rowEnd = (int)(height*0.93);
        cellIni = (int)(width*0.40);
        cellEnd = (int)(width*0.60);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        return flag;
    }

    public static int[][] createKWTFlag(int height, int width) {
        int[][] flag = new int[height][width];

        int rowIni = 0;
        int rowEnd = (int) (height);
        int cellIni = 0;
        int cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_GREEN;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height * 0.35);
        cellIni = 0;
        cellEnd = (int) (width*0.25);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < row + 1; cell++) {
                flag[row][cell] = COLOR_BLACK;
            }
        }

        rowIni = (int) (height * 0.34);
        rowEnd = (int) (height * 0.67);
        cellIni = 0;
        cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int) (height * 0.67);
        rowEnd = (int) (height);
        cellIni = 0;
        cellEnd = (int) (width);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = (int) (height * 0.34);
        rowEnd = (int) (height * 0.67);
        cellIni = 0;
        cellEnd = (int) (width*0.25);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLACK;
            }
        }

        rowIni = (int) (height * 0.68);
        rowEnd = (int) (height);
        cellIni = 0;
        cellEnd = (int)(width*0.25);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd-1; cell++) {
                flag[row][cell] = COLOR_BLACK;
            }
            cellEnd--;
        }

        return flag;
    }

    public static int[][] createZAFFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int cellInt = 0;
        int cellEnd = 0;

        rowInt = 0;
        rowEnd = (int) (height * 0.35);
        cellInt = 0;
        cellEnd = width;

        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = rowEnd;
        rowEnd = (int) (height * 0.7);
        cellInt = 0;
        cellEnd = width;

        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowInt = rowEnd;
        rowEnd = height;
        cellInt = 0;
        cellEnd = width;

        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowInt = 0;
        rowEnd = (int) (height * 0.5);
        cellInt = 0;
        cellEnd = 1;

        for (int row = rowInt; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
                flag[height - 1 - row][cell] = COLOR_WHITE;
            }
        }

        rowInt = 0;
        rowEnd = (int) (height * 0.5);
        cellInt = 0;
        cellEnd = 0;

        for (int row = rowInt; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_GREEN;
                flag[height - 1 - row][cell] = COLOR_GREEN;
            }
        }

        rowInt = (int) (height * 0.5) - 1;
        rowEnd = rowInt + 2;
        cellInt = 0;
        cellEnd = width;

        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_GREEN;
            }
        }

        rowInt = 2;
        rowEnd = (int) (height * 0.5);
        cellInt = 0;
        cellEnd = 0;

        for (int row = rowInt; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_YELLOW;
                flag[height - 1 - row][cell] = COLOR_YELLOW;
            }
        }

        rowInt = 3;
        rowEnd = (int) (height * 0.5);
        cellInt = 0;
        cellEnd = 0;

        for (int row = rowInt; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLACK;
                flag[height - 1 - row][cell] = COLOR_BLACK;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int [][] flag = {};

        flag = createKWTFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);

    }



}