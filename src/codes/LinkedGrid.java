package codes;

public class LinkedGrid {

    Node start;
    int size;

    public LinkedGrid(int size) {
        Node temp;
        for (int i = 0; i < size; i++) { //loop through rows
            for (int j = 0; j < size; j++) { //loop through columns
                if (i == 0) { //first row
                    if (j == 0) { //first column, equivalent of first element
                        start = new Node();
                    }
                }
            }
        }
    }

}
