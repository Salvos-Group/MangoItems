package salvos.mangoitems.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import salvos.mangoitems.blocks.BlockBase;
import salvos.mangoitems.blocks.MudBlock;
import salvos.mangoitems.blocks.PolishCreamCakeBlock;
import salvos.mangoitems.blocks.furnitures.ChairWithBenis;
import salvos.mangoitems.blocks.furnitures.FurnitureHorizontal;
import salvos.mangoitems.blocks.furnitures.TapBase;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> blocks = new ArrayList<>();
    public static final List<Block> furnitures = new ArrayList<>();

    //BLOCKS
    public static final Block MARBLE_STONE = new BlockBase("marble_stone", Material.ROCK, 2, 30, "pickaxe", 0);
    public static final Block BASALT_STONE = new BlockBase("basalt_stone", Material.ROCK, 2, 30, "pickaxe", 0);
    public static final Block LIMESTONE_STONE = new BlockBase("limestone_stone", Material.ROCK, 2, 30, "pickaxe", 0);
    public static final Block CHALK_STONE = new BlockBase("chalk_stone", Material.ROCK, 1, 15, "pickaxe", 0);
    public static final Block MUD_BLOCK = new MudBlock("mud_block", Material.CLAY, 0.6F, 3, "shovel", 0);

    //SPECIAL BLOCKS
    public static final Block POLISH_CREAM_CAKE_BLOCK = new PolishCreamCakeBlock("polish_cream_cake_block", Material.CAKE, 0.5F, 0, "any", 0);

    //FURNITURES
    public static final Block KITCHEN_STRAIGHT_SPRUCE = new FurnitureHorizontal("kitchen_straight_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_STRAIGHT_SINK_EMPTY_SPRUCE = new FurnitureHorizontal("kitchen_straight_sink_empty_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_STRAIGHT_SINK_FULL_SPRUCE = new FurnitureHorizontal("kitchen_straight_sink_full_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_TURN_SPRUCE = new FurnitureHorizontal("kitchen_turn_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_TURN_INVERTED_SPRUCE = new FurnitureHorizontal("kitchen_turn_inverted_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_CROSS_T_SPRUCE = new FurnitureHorizontal("kitchen_cross_t_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block KITCHEN_CROSS_X_SPRUCE =new FurnitureHorizontal("kitchen_cross_x_spruce", Material.WOOD, 2, 15, "axe", 0);
    public static final Block TAP_QUARTZ = new TapBase("tap_quartz", Material.WOOD);
    public static final Block CHAIR_WITH_BENIS = new ChairWithBenis("chair_with_benis", Material.WOOD);

    public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK, 3, 15, "pickaxe", 1);
    public static final Block TIN_ORE = new BlockBase("tin_ore", Material.ROCK, 3, 15, "pickaxe", 1);
    public static final Block ALUMINUM_ORE = new BlockBase("aluminum_ore", Material.ROCK, 3, 15, "pickaxe", 1);

    public static final Block MANGONIUM_ORE = new BlockBase("mangonium_ore", Material.ROCK, 10, 50, "pickaxe", 2);
    public static final Block ZINC_ORE = new BlockBase("zinc_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block SILVER_ORE = new BlockBase("silver_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block LEAD_ORE = new BlockBase("lead_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block TUNGSTEN_ORE = new BlockBase("tungsten_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block CHROMIUM_ORE = new BlockBase("chromium_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block NICKIEL_ORE = new BlockBase("nickiel_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block LITHIUM_ORE = new BlockBase("lithium_ore", Material.ROCK, 3, 15, "pickaxe", 2);

    public static final Block PLATINIUM_ORE = new BlockBase("platinium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block IRIDIUM_ORE = new BlockBase("iridium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block URANIUM_ORE = new BlockBase("uranium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block YELLORIUM_ORE = new BlockBase("yellorium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block BLUTONIUM_ORE = new BlockBase("blutonium_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block COBALT_ORE = new BlockBase("cobalt_ore", Material.ROCK, 3, 15, "pickaxe", 3);
    public static final Block TITANIUM_ORE = new BlockBase("titanium_ore", Material.ROCK, 3, 15, "pickaxe", 3);

    public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block TOPAZ_ORE = new BlockBase("topaz_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block PERIDOT_ORE = new BlockBase("peridot_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block SAPPHIRE_ORE = new BlockBase("sapphire_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block MALACHITE_ORE = new BlockBase("malachite_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block TANZANITE_ORE = new BlockBase("tanzanite_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block AMETHYST_ORE = new BlockBase("amethyst_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block KYANITE_ORE = new BlockBase("kyanite_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block AQUAMARINE_ORE = new BlockBase("aquamarine_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block AMBER_ORE = new BlockBase("amber_ore", Material.ROCK, 3, 15, "pickaxe", 2);
    public static final Block APATITE_ORE = new BlockBase("apatite_ore", Material.ROCK, 3, 15, "pickaxe", 2);

}
