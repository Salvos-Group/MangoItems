package salvos.mangoitems.blocks.type;

public enum  RockType {

    ANDESITE("andesite"),
    DIORITE("diorite"),
    GRANITE("granite"),
    LIMESTONE("limestone"),
    MARBLE("marble"),
    SCHIST_BLUE("blue_schist"),
    SCHIST_GREEN("green_schist"),
    SHIST_PURPLE("purple_schist"),
    STONE("stone");

    String name;

    RockType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
