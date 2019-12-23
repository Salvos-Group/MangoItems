package salvos.mangoitems.game.blocks.custom;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import salvos.mangoitems.game.blocks.base.BlockBase;

public class PolishCreamCakeBlock extends BlockBase {
    public PolishCreamCakeBlock(String name) {
        super(name,Material.CAKE, 0.5F);
        setSoundType(SoundType.CLOTH);
    }
}
