package salvos.mangoitems.blocks;

import net.minecraft.block.material.Material;
import salvos.mangoitems.blocks.type.OreType;
import salvos.mangoitems.blocks.type.RockType;
import salvos.mangoitems.util.IHasModel;

public class OreBase extends BlockBase implements IHasModel {
    public OreBase(RockType rockType, OreType oreType) {
        super(rockType.getName() + "_" + oreType.getName() + "_ore", Material.ROCK, oreType.getHardness(), oreType.getResistance(), "pickaxe", oreType.getHarvestLevel());
    }
}
