package bg.tu_varna.sit;

public class Hall{
        private int hallNumber;
        private int numRows;
        private int numSeatsPerRow;
        private boolean[][] seats;

        public Hall(int hallNumber, int numRows, int numSeatsPerRow){
            this.hallNumber = hallNumber;
            this.numRows = numRows;
            this.numSeatsPerRow = numSeatsPerRow;
            this.seats = new boolean[numRows][numSeatsPerRow];
        }
    }