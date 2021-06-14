package entity.ex2part2;

public class Battery {
    private int energy;

    public Battery(){
        energy = 100;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int value) {
        this.energy = value;
    }

    public void decreaseEnergy(){
        energy--;
    }
}
