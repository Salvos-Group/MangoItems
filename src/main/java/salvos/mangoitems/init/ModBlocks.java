package salvos.mangoitems.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import salvos.mangoitems.blocks.BlockBase;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> blocks = new ArrayList<>();

    //BLOCKS
    public static final Block MARBLE_STONE = new BlockBase("marble_stone", Material.ROCK, 2, 30, "pickaxe", 0);
    public static final Block BASALT_STONE = new BlockBase("basalt_stone", Material.ROCK, 2, 30, "pickaxe", 0);
    public static final Block LIMESTONE_STONE = new BlockBase("limestone_stone", Material.ROCK, 2, 30, "pickaxe", 0);

    //ORES - TIER 1
    public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK, 3, 15, "pickaxe", 1);
    public static final Block TIN_ORE = new BlockBase("tin_ore", Material.ROCK, 3, 15, "pickaxe", 1);
    public static final Block ALUMINUM_ORE = new BlockBase("aluminum_ore", Material.ROCK, 3, 15, "pickaxe", 1);

    //ORES - TIER 2
    public static final Block MANGONIUM_ORE = new BlockBase("mangonium_ore", Material.ROCK, 10, 50, "pickaxe", 2);
    public static final Block ZINC_ORE = new BlockBase("zinc_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block SILVER_ORE = new BlockBase("silver_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block LEAD_ORE = new BlockBase("lead_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block TUNGSTEN_ORE = new BlockBase("tungsten_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block CHROMIUM_ORE = new BlockBase("chromium_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block NICKIEL_ORE = new BlockBase("nickiel_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block LITHIUM_ORE = new BlockBase("lithium_ore", Material.ROCK, 3, 15, "pickaxe", 2);


    //ORES - TIER 3
    public static final Block PLATINIUM_ORE = new BlockBase("platinium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block IRIDIUM_ORE = new BlockBase("iridium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block URANIUM_ORE = new BlockBase("uranium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block YELLORIUM_ORE = new BlockBase("yellorium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block BLUTONIUM_ORE = new BlockBase("blutonium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block COBALT_ORE = new BlockBase("cobalt_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block TITANIUM_ORE = new BlockBase("titanium_ore", Material.ROCK, 3, 15, "pickaxe", 3);


}
