public class Turtles {
    private position currentPosition = new position(0,0);
    private Direction currentDirection = Direction.EAST;
    private boolean isPenUp;

    public void turnRight() {
        if (currentDirection == Direction.NORTH) face(Direction.EAST);
        else if (currentDirection == Direction.WEST) face(Direction.NORTH);
        else if (currentDirection == Direction.SOUTH) face(Direction.WEST);
        else if (currentDirection == Direction.EAST) face(Direction.SOUTH);

    }
    public void turnleft() {
        if (currentDirection == Direction.WEST) face(Direction.SOUTH);
        else if (currentDirection == Direction.NORTH) face(Direction.WEST);
        else if (currentDirection == Direction.EAST) face(Direction.NORTH);
        else  face(Direction.EAST);

    }
private void face(Direction newDirection){
        currentDirection = newDirection;
    }

    public void penUp() {
        isPenUp = true;
    }
    public boolean isPenUp() {
            return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }
    public position getCurrentPosition(){
        return currentPosition;

    }
    public void move(int noOfSteps){
        if(currentDirection == Direction.EAST){
            int newColumn = currentPosition.getColumn() + noOfSteps;
            currentPosition.setColumn(newColumn);
        }

    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }
}
