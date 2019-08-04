package salvos.mangoitems.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import salvos.mangoitems.blocks.BlockBase;
import salvos.mangoitems.blocks.OreBase;
import salvos.mangoitems.blocks.custom.MudBlock;
import salvos.mangoitems.blocks.custom.PolishCreamCakeBlock;
import salvos.mangoitems.blocks.furnitures.ChairWithBenis;
import salvos.mangoitems.blocks.furnitures.FurnitureHorizontalBase;
import salvos.mangoitems.blocks.furnitures.TapBase;
import salvos.mangoitems.blocks.type.OreType;
import salvos.mangoitems.blocks.type.RockType;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> blocks = new ArrayList<>();
    public static final List<Block> furnitures = new ArrayList<>();

    //BLOCKS
    public static final Block MUD_BLOCK = new MudBlock("mud_block", Material.CLAY);

    public static final Block MARBLE_STONE = new BlockBase("marble_stone", Material.ROCK, 2, 30, "pickaxe", 0);
    public static final Block BASALT_STONE = new BlockBase("basalt_stone", Material.ROCK, 2.3F, 34.5F, "pickaxe", 0);
    public static final Block LIMESTONE_STONE = new BlockBase("limestone_stone", Material.ROCK, 2, 30, "pickaxe", 0);
    public static final Block CHALK_STONE = new BlockBase("chalk_stone", Material.ROCK, 1, 15, "pickaxe", 0);
    public static final Block CHLORITE_STONE = new BlockBase("chlorite_stone", Material.ROCK, 2.3F, 34.5F, "pickaxe", 0);
    public static final Block SALTPETER_STONE = new BlockBase("saltpeter_stone", Material.ROCK, 1, 15, "pickaxe", 0);
    public static final Block METEORITE_STONE = new BlockBase("meteorite_stone", Material.ROCK, 57.5F, 6900, "pickaxe", 3);
    public static final Block SCHIST_BLUE = new BlockBase("blue_schist", Material.ROCK, 1.8F, 27, "pickaxe", 0);
    public static final Block SCHIST_GREEN = new BlockBase("green_schist", Material.ROCK, 1.8F, 27, "pickaxe", 0);
    public static final Block SCHIST_PURPLE = new BlockBase("purple_schist", Material.ROCK, 1.8F, 27, "pickaxe", 0);

    //SPECIAL BLOCKS
    public static final Block POLISH_CREAM_CAKE_BLOCK = new PolishCreamCakeBlock("polish_cream_cake_block");

    //FURNITURES
    public static final Block KITCHEN_STRAIGHT_SPRUCE = new FurnitureHorizontalBase("kitchen_straight_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_STRAIGHT_SINK_EMPTY_SPRUCE = new FurnitureHorizontalBase("kitchen_straight_sink_empty_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_STRAIGHT_SINK_FULL_SPRUCE = new FurnitureHorizontalBase("kitchen_straight_sink_full_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_TURN_SPRUCE = new FurnitureHorizontalBase("kitchen_turn_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_TURN_INVERTED_SPRUCE = new FurnitureHorizontalBase("kitchen_turn_inverted_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_CROSS_T_SPRUCE = new FurnitureHorizontalBase("kitchen_cross_t_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_CROSS_X_SPRUCE =new FurnitureHorizontalBase("kitchen_cross_x_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block TAP_QUARTZ = new TapBase("tap_quartz", Material.WOOD, 2, 15);
    public static final Block CHAIR_WITH_BENIS = new ChairWithBenis("chair_with_beniz", Material.WOOD);

}
