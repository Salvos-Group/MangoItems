package salvos.mangoitems.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PolishCreamCakeBlock extends BlockBase{
    public PolishCreamCakeBlock(String name, Material material, float hardness, float resistance, String tool, int harvestLevel) {
        super(name, material, hardness, resistance, tool, harvestLevel);
        setSoundType(SoundType.CLOTH);
    }

    public PolishCreamCakeBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.CLOTH);
    }
}
