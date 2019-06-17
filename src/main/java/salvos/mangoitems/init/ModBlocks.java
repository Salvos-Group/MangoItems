package salvos.mangoitems.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import salvos.mangoitems.blocks.BlockBase;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> blocks = new ArrayList<>();

    public static final Block MARBLE_STONE = new BlockBase("marble_stone", Material.ROCK, 2, 30, "pickaxe", 0);
    public static final Block BASALT_STONE = new BlockBase("basalt_stone", Material.ROCK, 2, 30, "pickaxe", 0);

}
