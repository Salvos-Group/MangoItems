package salvos.mangoitems.game.init;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import salvos.mangoitems.game.blocks.ModBlocks;
import salvos.mangoitems.game.items.ModItems;

import java.util.Comparator;

public class ModCreativeTabs {

    public static Comparator<ItemStack> tabSorter;

    public static final CreativeTabs CREATIVE_ITEMS = new CreativeTabs("mangoitems.creative_items") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.MANGONIUM_INGOT);
        }

        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> items) {
            super.displayAllRelevantItems(items);
            items.sort(tabSorter);
        }
    };

    public static final CreativeTabs CREATIVE_FOOD = new CreativeTabs("mangoitems.creative_food") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.FRUIT_MANGO);
        }

        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> items) {
            super.displayAllRelevantItems(items);
            items.sort(tabSorter);
        }
    };

    public static final CreativeTabs CREATIVE_TOOLS = new CreativeTabs("mangoitems.creative_tools") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.MANGO_WRENCH);
        }

        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> items) {
            super.displayAllRelevantItems(items);
            items.sort(tabSorter);
        }
    };

    public static final CreativeTabs CREATIVE_BLOCKS = new CreativeTabs("mangoitems.creative_blocks") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemFromBlock(ModBlocks.MARBLE_STONE));
        }

        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> items) {
            super.displayAllRelevantItems(items);
            items.sort(tabSorter);
        }
    };

    public static final CreativeTabs CREATIVE_FURNITURE = new CreativeTabs("mangoitems.creative_furniture") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.KITCHEN_STRAIGHT_SPRUCE);
        }

        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> items) {
            super.displayAllRelevantItems(items);
            items.sort(tabSorter);
        }
    };


}
