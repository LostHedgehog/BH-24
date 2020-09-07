package BY.BELHARD.BH24.HW.HW04.TASK5;

/*5. Создать класс Игрок. Игрок имеет координаты x и y. Игрок должен уметь (через методы):
        а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые,
        переданные ему),
        б) вывести на консоль значение текущего положения,

        5*. игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.

*/


public class Solution5Player {

    private int xPos = 0;
    private int yPos = 0;

    public Solution5Player(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public static void main(String[] args) {

        Solution5Player player = new Solution5Player(2, -2);

        player.setXPos(5);
        player.setYPos(0);
        System.out.println("Новые коородинаты X: " + player.getXPos());
        System.out.println("Новые коородинаты Y: " + player.getYPos());



    }


    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }}

