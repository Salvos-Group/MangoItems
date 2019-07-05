package salvos.mangoitems.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import salvos.mangoitems.items.ItemBase;
import salvos.mangoitems.items.ItemCustomFood;
import salvos.mangoitems.items.ItemMangoWrench;
import salvos.mangoitems.items.armor.ArmorBase;
import salvos.mangoitems.items.tools.*;
import salvos.mangoitems.util.Reference;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> items = new ArrayList<>();

    //TOOL MATERIAL
    public static ToolMaterial MATERIAL_SWORD_MANGONIUM = EnumHelper.addToolMaterial("material_sword_mangonium", 3, 2500, 10, 6, 15);
    public static ToolMaterial MATERIAL_PICKAXE_MANGONIUM = EnumHelper.addToolMaterial("material_pickaxe_mangonium", 3, 2500, 10, 4, 15);
    public static ToolMaterial MATERIAL_AXE_MANGONIUM = EnumHelper.addToolMaterial("material_axe_mangonium", 3, 2500, 10, 7, 15);
    public static ToolMaterial MATERIAL_SHOVEL_MANGONIUM = EnumHelper.addToolMaterial("material_shovel_mangonium", 3, 2500, 10, 3, 15);
    public static ToolMaterial MATERIAL_HOE_MANGONIUM = EnumHelper.addToolMaterial("material_hoe_mangonium", 3, 2500, 10, 0, 15);

    //ARMOR MATERIAL
    public static ItemArmor.ArmorMaterial MATERIAL_ARMOR_MANGONIUM = EnumHelper.addArmorMaterial("armor_material_mangonium", Reference.MOD_ID + ":mangonium", 1500, new int[] {4, 9, 7, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2);

    //Items
    public static final Item MANGO_FRUIT = new ItemCustomFood("mangofruit", 3, 3, false);

    //INGOTS
    public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot");
    public static final Item BLUTONIUM_INGOT = new ItemBase("blutonium_ingot");
    public static final Item CHROMIUM_INGOT = new ItemBase("chromium_ingot");
    public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
    public static final Item IRIDIUM_INGOT = new ItemBase("iridium_ingot");
    public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
    public static final Item LITHIUM_INGOT = new ItemBase("lithium_ingot");
    public static final Item MANGONIUM_INGOT = new ItemBase("mangonium_ingot");
    public static final Item NICKIEL_INGOT = new ItemBase("nickiel_ingot");
    public static final Item PLATINIUM_INGOT = new ItemBase("platinium_ingot");
    public static final Item YELLORIUM_INGOT = new ItemBase("yellorium_ingot");
    public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
    public static final Item TIN_INGOT = new ItemBase("tin_ingot");
    public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot");
    public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
    public static final Item URANIUM_INGOT = new ItemBase("uranium_ingot");
    public static final Item ZINC_INGOT = new ItemBase("zinc_ingot");

    //GEMS
    public static final Item RUBY_GEM = new ItemBase("ruby_gem");
    public static final Item TOPAZ_GEM = new ItemBase("topaz_gem");
    public static final Item PERIDOT_GEM = new ItemBase("peridot_gem");
    public static final Item SAPPHIRE_GEM = new ItemBase("sapphire_gem");
    public static final Item MALACHITE_GEM = new ItemBase("malachite_gem");
    public static final Item TANZANITE_GEM = new ItemBase("tanzanite_gem");
    public static final Item AMETHYST_GEM = new ItemBase("amethyst_gem");
    public static final Item AMBER_GEM = new ItemBase("amber_gem");
    public static final Item KYANITE_GEM = new ItemBase("kyanite_gem");
    public static final Item AQUAMARINE_GEM = new ItemBase("aquamarine_gem");
    public static final Item APATITE_GEM = new ItemBase("apatite_gem");

    //SHARDS
    public static final Item RUBY_SHARD = new ItemBase("ruby_shard");
    public static final Item TOPAZ_SHARD = new ItemBase("topaz_shard");
    public static final Item PERIDOT_SHARD = new ItemBase("peridot_shard");
    public static final Item SAPPHIRE_SHARD = new ItemBase("sapphire_shard");
    public static final Item MALACHITE_SHARD = new ItemBase("malachite_shard");
    public static final Item TANZANITE_SHARD = new ItemBase("tanzanite_shard");
    public static final Item AMETHYST_SHARD = new ItemBase("amethyst_shard");
    public static final Item AMBER_SHARD = new ItemBase("amber_shard");
    public static final Item KYANITE_SHARD = new ItemBase("kyanite_shard");
    public static final Item AQUAMARINE_SHARD = new ItemBase("aquamarine_shard");
    public static final Item APATITE_SHARD = new ItemBase("apatite_shard");

    //NUGGETS
    public static final Item ALUMINUM_NUGGET = new ItemBase("aluminum_nugget");
    public static final Item BLUTONIUM_NUGGET = new ItemBase("blutonium_nugget");
    public static final Item CHROMIUM_NUGGET = new ItemBase("chromium_nugget");
    public static final Item COBALT_NUGGET = new ItemBase("cobalt_nugget");
    public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
    public static final Item IRIDIUM_NUGGET = new ItemBase("iridium_nugget");
    public static final Item LEAD_NUGGET = new ItemBase("lead_nugget");
    public static final Item LITHIUM_NUGGET = new ItemBase("lithium_nugget");
    public static final Item MANGONIUM_NUGGET = new ItemBase("mangonium_nugget");
    public static final Item NICKIEL_NUGGET= new ItemBase("nickiel_nugget");
    public static final Item PLATINIUM_NUGGET = new ItemBase("platinium_nugget");
    public static final Item YELLORIUM_NUGGET = new ItemBase("yellorium_nugget");
    public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
    public static final Item TIN_NUGGET = new ItemBase("tin_nugget");
    public static final Item TITANIUM_NUGGET= new ItemBase("titanium_nugget");
    public static final Item TUNGSTEN_NUGGET = new ItemBase("tungsten_nugget");
    public static final Item URANIUM_NUGGET = new ItemBase("uranium_nugget");
    public static final Item ZINC_NUGGET = new ItemBase("zinc_nugget");

    //ORE ROCKS
    public static final Item COPPER_ORE_ROCK = new ItemBase("copper_ore_rock");
    public static final Item TIN_ORE_ROCK = new ItemBase("tin_ore_rock");
    public static final Item SILVER_ORE_ROCK = new ItemBase("silver_ore_rock");
    public static final Item ALUMINUM_ORE_ROCK = new ItemBase("aluminum_ore_rock");
    public static final Item LEAD_ORE_ROCK = new ItemBase("lead_ore_rock");
    public static final Item ZINC_ORE_ROCK = new ItemBase("zinc_ore_rock");
    public static final Item TUNGSTEN_ORE_ROCK = new ItemBase("tungsten_ore_rock");
    public static final Item CHROMIUM_ORE_ROCK = new ItemBase("chromium_ore_rock");
    public static final Item NICKIEL_ORE_ROCK = new ItemBase("nickiel_ore_rock");
    public static final Item LITHIUM_ORE_ROCK = new ItemBase("lithium_ore_rock");
    public static final Item PLATINIUM_ORE_ROCK = new ItemBase("platinium_ore_rock");
    public static final Item IRIDIUM_ORE_ROCK = new ItemBase("iridium_ore_rock");
    public static final Item URANIUM_ORE_ROCK = new ItemBase("uranium_ore_rock");
    public static final Item YELLORIUM_ORE_ROCK = new ItemBase("yellorium_ore_rock");
    public static final Item BLUTONIUM_ORE_ROCK = new ItemBase("blutonium_ore_rock");
    public static final Item MANGONIUM_ORE_ROCK = new ItemBase("mangonium_ore_rock");
    public static final Item COBALT_ORE_ROCK = new ItemBase("cobalt_ore_rock");
    public static final Item TITANIUM_ORE_ROCK = new ItemBase("titanium_ore_rock");

    //ROCKS and BALLS
    public static final Item STONE_ROCK = new ItemBase("stone_rock");
    public static final Item MARBLE_ROCK = new ItemBase("marble_rock");
    public static final Item BASALT_ROCK = new ItemBase("basalt_rock");
    public static final Item LIMESTONE_ROCK = new ItemBase("limestone_rock");
    public static final Item ENDSTONE_ROCK = new ItemBase("endstone_rock");
    public static final Item NETHERRACK_ROCK = new ItemBase("netherrack_rock");
    public static final Item DIRT_BALL = new ItemBase("dirt_ball");
    public static final Item SAND_BALL = new ItemBase("sand_ball");

    //TOOLS
    public static final Item MANGO_WRENCH = new ItemMangoWrench("mangowrench");

    public static final Item MANGONIUM_SWORD = new SwordBase("mangonium_sword", MATERIAL_SWORD_MANGONIUM);
    public static final Item MANGONIUM_PICKAXE = new PickaxeBase("mangonium_pickaxe", MATERIAL_PICKAXE_MANGONIUM);
    public static final Item MANGONIUM_AXE = new AxeBase("mangonium_axe", MATERIAL_AXE_MANGONIUM);
    public static final Item MANGONIUM_SHOVEL = new ShovelBase("mangonium_shovel", MATERIAL_SHOVEL_MANGONIUM);
    public static final Item MANGONIUM_HOE = new HoeBase("mangonium_hoe", MATERIAL_HOE_MANGONIUM);

    //ARMOR
    public static final Item MANGONIUM_HELMET = new ArmorBase("mangonium_helmet", MATERIAL_ARMOR_MANGONIUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item MANGONIUM_CHESTPLATE = new ArmorBase("mangonium_chestplate", MATERIAL_ARMOR_MANGONIUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item MANGONIUM_LEGGINGS = new ArmorBase("mangonium_leggings", MATERIAL_ARMOR_MANGONIUM, 2, EntityEquipmentSlot.LEGS);
    public static final Item MANGONIUM_BOOTS = new ArmorBase("mangonium_boots", MATERIAL_ARMOR_MANGONIUM, 1, EntityEquipmentSlot.FEET);


}
