package codes;

public class Node {

    boolean occupied;
    Node up, down, left, right;

    public Node() {
        up = null;
        down = null;
        left = null;
        right = null;
        occupied = false;
    }

    public Node(Node up, Node down, Node left, Node right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Node getUp() {
        return up;
    }

    public void setUp(Node up) {
        this.up = up;
    }

    public Node getDown() {
        return down;
    }

    public void setDown(Node down) {
        this.down = down;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * pos0 corresponds to currNode.getUp().getUp().getLeft()
     */
    public Node getPos0() {
        Node temp = null;
        try {
            temp = this.up.getUp().getLeft();
        } catch (NullPointerException e) {

        }
        return temp;
    }

    /**
     * pos1 corresponds to currNode.getUp().getUp().getRight()
     */
    public Node getPos1() {
        Node temp = null;
        try {
            temp = this.up.getUp().getRight();
        } catch (NullPointerException e) {

        }
        return temp;
    }

    /**
     * pos2 corresponds to currNode.getRight().getRight().getUp()
     */
    public Node getPos2() {
        Node temp = null;
        try {
            temp = this.right.getRight().getUp();
        } catch (NullPointerException e) {

        }
        return temp;
    }

    /**
     * pos3 corresponds to currNode.getRight().getRight().getDown()
     */
    public Node getPos3() {
        Node temp = null;
        try {
            temp = this.right.getRight().getDown();
        } catch (NullPointerException e) {

        }
        return temp;
    }

    /**
     * pos4 corresponds to currNode.getDown().getDown().getRight()
     */
    public Node getPos4() {
        Node temp = null;
        try {
            temp = this.down.getDown().getRight();
        } catch (NullPointerException e) {

        }
        return temp;
    }

    /**
     * pos5 corresponds to currNode.getDown().getDown().getLeft()
     */
    public Node getPos5() {
        Node temp = null;
        try {
            temp = this.down.getDown().getLeft();
        } catch (NullPointerException e) {

        }
        return temp;
    }

    /**
     * pos6 corresponds to currNode.getLeft().getLeft().getDown()
     */
    public Node getPos6() {
        Node temp = null;
        try {
            temp = this.left.getLeft().getDown();
        } catch (NullPointerException e) {

        }
        return temp;
    }

    /**
     * pos7 corresponds to currNode.getLeft().getLeft().getUp()
     */
    public Node getPos7() {
        Node temp = null;
        try {
            temp = this.left.getLeft().getUp();
        } catch (NullPointerException e) {

        }
        return temp;
    }

}
