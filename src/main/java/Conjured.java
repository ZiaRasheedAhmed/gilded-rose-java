public class Conjured {
    public int quality;
    public int daysRemaining;

    public Conjured(int quality, int daysRemaining) {
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }
    public void tick(){
        if (quality == 0){
            quality+=4;
        }
        if(daysRemaining == 1){
            quality += 1;
        }
        if(daysRemaining <= 0){
            quality-=2;
        }
        quality -= 2;
        daysRemaining -= 1; 
    }
}
