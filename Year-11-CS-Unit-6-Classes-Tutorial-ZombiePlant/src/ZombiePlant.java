public class ZombiePlant {
    private int maxPotency;
    private int treatmentsNeeded;

    public ZombiePlant(int maxPotency, int treatmentsNeeded) {
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        return treatmentsNeeded > 0;
    }

    public void treat(int potency) {
        if (potency <= maxPotency)
            treatmentsNeeded--;
        else
            treatmentsNeeded++;
    }
}
