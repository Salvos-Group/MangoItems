package salvos.mangoitems.game.blocks.type;

public enum OreType {
    ALUMINUM("aluminum", 3, 15, 1),
    APATITE("apatite", 3, 15, 1),
    CERTUS_QUARTZ("certus_quartz", 3, 15, 1),
    CHROMIUM("chromium", 3, 15, 1),
    COPPER("copper", 3, 15, 1),
    LEAD("lead", 3, 15, 1),
    LITHIUM("lithium", 3, 15, 1),
    MANGONIUM("mangonium", 3, 15, 1),
    NICKIEL("nickiel", 3, 15, 1),
    PHOSPHORUS("phosphorus", 3, 15, 1),
    SALT("salt", 3, 15, 1),
    SILVER("silver", 3, 15, 1),
    SULFUR("sulfur", 3, 15, 1),
    TIN("tin", 3, 15, 1),
    TUNGSTEN("tungsten", 3, 15, 1),
    URANIUM("uranium", 3, 15, 1),
    ZINC("zinc", 3, 15, 1);

    String name;
    float hardness;
    float resistance;
    int harvestLevel;

    OreType(String name, float hardness, float resistance, int harvestLevel) {
        this.name = name;
        this.hardness = hardness;
        this.resistance = resistance;
        this.harvestLevel = harvestLevel;
    }

    public String getName() {
        return name;
    }

    public float getHardness(){
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }
}
