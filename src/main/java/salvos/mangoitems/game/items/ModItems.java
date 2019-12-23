package salvos.mangoitems.game.items;

import net.minecraft.item.Item;
import salvos.mangoitems.game.items.base.FoodBase;
import salvos.mangoitems.game.items.base.ItemBase;
import salvos.mangoitems.game.items.custom.ItemMangoWrench;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> items = new ArrayList<>();

    //Items
    public static final Item FRUIT_MANGO = new FoodBase("fruit_mango", 3, 3, false);
    public static final Item VEGETABLE_CUCURBIT = new FoodBase("vegetable_cucurbit", 4, 4, false);

    //INGOTS
    public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot");
    public static final Item CHROMIUM_INGOT = new ItemBase("chromium_ingot");
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
    public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
    public static final Item LITHIUM_INGOT = new ItemBase("lithium_ingot");
    public static final Item MANGONIUM_INGOT = new ItemBase("mangonium_ingot");
    public static final Item NICKIEL_INGOT = new ItemBase("nickiel_ingot");
    public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
    public static final Item TIN_INGOT = new ItemBase("tin_ingot");
    public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot");
    public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
    public static final Item URANIUM_INGOT = new ItemBase("uranium_ingot");
    public static final Item ZINC_INGOT = new ItemBase("zinc_ingot");

    //NUGGETS
    public static final Item ALUMINUM_NUGGET = new ItemBase("aluminum_nugget");
    public static final Item CHROMIUM_NUGGET = new ItemBase("chromium_nugget");
    public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
    public static final Item LEAD_NUGGET = new ItemBase("lead_nugget");
    public static final Item LITHIUM_NUGGET = new ItemBase("lithium_nugget");
    public static final Item MANGONIUM_NUGGET = new ItemBase("mangonium_nugget");
    public static final Item NICKIEL_NUGGET= new ItemBase("nickiel_nugget");
    public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
    public static final Item TIN_NUGGET = new ItemBase("tin_nugget");
    public static final Item TITANIUM_NUGGET= new ItemBase("titanium_nugget");
    public static final Item TUNGSTEN_NUGGET = new ItemBase("tungsten_nugget");
    public static final Item URANIUM_NUGGET = new ItemBase("uranium_nugget");
    public static final Item ZINC_NUGGET = new ItemBase("zinc_nugget");


    //GEMS
    public static final Item AMBER_GEM = new ItemBase("amber_gem");
    public static final Item AMETHYST_GEM = new ItemBase("amethyst_gem");
    public static final Item AQUAMARINE_GEM = new ItemBase("aquamarine_gem");
    public static final Item GALAXITE_GEM = new ItemBase("galaxite_gem");
    public static final Item KYANITE_GEM = new ItemBase("kyanite_gem");
    public static final Item PERIDOT_GEM = new ItemBase("peridot_gem");
    public static final Item RUBY_GEM = new ItemBase("ruby_gem");
    public static final Item SAPPHIRE_GEM = new ItemBase("sapphire_gem");
    public static final Item TANZANITE_GEM = new ItemBase("tanzanite_gem");
    public static final Item TOPAZ_GEM = new ItemBase("topaz_gem");
    public static final Item VULCANITE_GEM = new ItemBase("vulcanite_gem");

    //SHARDS
    public static final Item AMBER_SHARD = new ItemBase("amber_shard");
    public static final Item AMETHYST_SHARD = new ItemBase("amethyst_shard");
    public static final Item AQUAMARINE_SHARD = new ItemBase("aquamarine_shard");
    public static final Item GALAXITE_SHARD = new ItemBase("galaxite_shard");
    public static final Item KYANITE_SHARD = new ItemBase("kyanite_shard");
    public static final Item PERIDOT_SHARD = new ItemBase("peridot_shard");
    public static final Item RUBY_SHARD = new ItemBase("ruby_shard");
    public static final Item SAPPHIRE_SHARD = new ItemBase("sapphire_shard");
    public static final Item TANZANITE_SHARD = new ItemBase("tanzanite_shard");
    public static final Item TOPAZ_SHARD = new ItemBase("topaz_shard");
    public static final Item VULCANITE_SHARD = new ItemBase("vulcanite_shard");

    //DUSTS
    public static final Item PHOUSPHORUS_DUST = new ItemBase("phosphorus_dust");
    public static final Item SALT_DUST = new ItemBase("salt_dust");
    public static final Item SULFUR_DUST = new ItemBase("sulfur_dust");

    //SMALL DUSTS
    public static final Item PHOUSPHORUS_SMALL_DUST = new ItemBase("phosphorus_small_dust");
    public static final Item SALT_SMALL_DUST = new ItemBase("salt_small_dust");
    public static final Item SULFUR_SMALL_DUST = new ItemBase("sulfur_small_dust");

    //OTHER MATERIALS
    public static final Item APATITE_MATERIAL = new ItemBase("apatite_material");

    //ROCKS
    public static final Item STONE_ROCK = new ItemBase("stone_rock");
    public static final Item ANDESITE_ROCK = new ItemBase("andesite_rock");
    public static final Item DIORITE_ROCK = new ItemBase("diorite_rock");
    public static final Item GRANITE_ROCK = new ItemBase("granite_rock");
    public static final Item NETHERRACK_ROCK = new ItemBase("netherrack_rock");
    public static final Item ENDSTONE_ROCK = new ItemBase("endstone_rock");
    public static final Item MARBLE_ROCK = new ItemBase("marble_rock");
    public static final Item BASALT_ROCK = new ItemBase("basalt_rock");
    public static final Item LIMESTONE_ROCK = new ItemBase("limestone_rock");
    public static final Item CHALK_ROCK = new ItemBase("chalk_rock");
    public static final Item CHLORITE_ROCK = new ItemBase("chlorite_rock");
    public static final Item SALTPETER_ROCK = new ItemBase("saltpeter_rock");
    public static final Item METEORITE_ROCK = new ItemBase("meteorite_rock");
    public static final Item SCHSIT_BLUE_ROCK = new ItemBase("blue_schist_rock");
    public static final Item SCHIST_GREEN_ROCK = new ItemBase("green_schist_rock");
    public static final Item SCHIST_PURPLE_ROCK = new ItemBase("purple_schist_rock");

    //TOOLS
    public static final Item MANGO_WRENCH = new ItemMangoWrench("mangowrench");


}
