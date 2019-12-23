package salvos.mangoitems.game.blocks.ores;

import net.minecraft.block.material.Material;
import salvos.mangoitems.game.blocks.base.BlockBase;
import salvos.mangoitems.game.blocks.type.OreType;
import salvos.mangoitems.game.blocks.type.RockType;
import salvos.mangoitems.game.blocks.IHasModel;

public class OreBase extends BlockBase implements IHasModel {
    public OreBase(RockType rockType, OreType oreType) {
        super(rockType.getName() + "_" + oreType.getName() + "_ore", Material.ROCK, oreType.getHardness(), oreType.getResistance(), "pickaxe", oreType.getHarvestLevel());
    }
}
