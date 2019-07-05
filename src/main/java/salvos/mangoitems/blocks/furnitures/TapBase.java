package salvos.mangoitems.blocks.furnitures;

import net.minecraft.block.material.Material;

public class TapBase extends FurnitureHorizontal{

    public TapBase(String name, Material material, float hardness, float resistance, String tool, int harvestLevel) {
        super(name, material, hardness, resistance, tool, harvestLevel);
    }

    public TapBase(String name, Material material) {
        super(name, material);
    }
}
