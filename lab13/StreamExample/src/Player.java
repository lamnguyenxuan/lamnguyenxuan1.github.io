public class Player {
    private String fullName;
    private String position;
    private int number;
    public Player(String fullName, String position, int number) {
        this.fullName = fullName;
        this.position = position;
        this.number = number;
    }
    public Player(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }
    public Player() {
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getString() {
        return position;
    }
    public void setString(String position) {
        this.position = position;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return number + " - " + fullName + " - " + position;
    }
}