import org.apache.commons.lang3.StringUtils;

public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick() {
        switch (name) {
            case "normal":
                Normal normal = new Normal(quality, daysRemaining);
                normal.tick();
                this.daysRemaining = normal.daysRemaining;
                this.quality = normal.quality;
                return;
            case "Aged Brie":
                Brie brie = new Brie(quality, daysRemaining);
                brie.tick();
                this.daysRemaining = brie.daysRemaining;
                this.quality = brie.quality;
                return;
            case "Sulfuras, Hand of Ragnaros":
                sulfuras_tick();
                return;
            case "Backstage passes to a TAFKAL80ETC concert":
                Backstage backstage = new Backstage(quality, daysRemaining);
                backstage.tick();
                this.daysRemaining = backstage.daysRemaining;
                this.quality = backstage.quality;
                return;
            case "Conjured Item":
                Conjured conjured = new Conjured(quality, daysRemaining);
                conjured.tick();
                this.daysRemaining = conjured.daysRemaining;
                this.quality = conjured.quality;
                return;
        }
        // if (StringUtils.equals(name, "normal")) {
        // normal_tick();
        // return;
        // }
        // if (StringUtils.equals(name, "Aged Brie")) {
        // brie_tick();
        // return;
        // }
        // if (StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")){
        // sulfuras_tick();
        // return;
        // }
        // if (StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")){
        // backstage_tick();
        // return;
        // }
        // if (!StringUtils.equals(name, "Aged Brie")
        // && !StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
        // if (quality > 0) {
        // if (!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        // quality -= 1;
        // }
        // }
        // } else {
        // if (quality < 50) {
        // quality += 1;
        // if (StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
        // if (daysRemaining < 11) {
        // if (quality < 50) {
        // quality += 1;
        // }
        // }
        // if (daysRemaining < 6) {
        // if (quality < 50) {
        // quality += 1;
        // }
        // }
        // }
        // }
        // }
        // if (!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        // daysRemaining -= 1;
        // }
        // if (daysRemaining < 0) {
        // if (!StringUtils.equals(name, "Aged Brie")) {
        // if (!StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
        // if (quality > 0) {
        // if (!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        // quality -= 1;
        // }
        // }
        // } else {
        // quality = quality - quality;
        // }
        // } else {
        // if (quality < 50) {
        // quality += 1;
        // }
        // }
        // }
    }
    public void sulfuras_tick() {

    }
    
    // }
}
