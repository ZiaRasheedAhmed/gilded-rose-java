public class Normal {
    public int quality;
    public int daysRemaining;

    public Normal(int quality, int daysRemaining) {
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }
    public void tick(){
        daysRemaining -= 1;
        if (quality == 0) return;
        quality -= 1;
        if (daysRemaining <= 0) {
            quality -= 1;
        }
    }
}
