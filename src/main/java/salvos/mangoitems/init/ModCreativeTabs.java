package salvos.mangoitems.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {

    public static final CreativeTabs CREATIVE_TOOLS = new CreativeTabs("creative_tools") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.MANGO_WRENCH);
        }
    };

    public static final CreativeTabs CREATIVE_ARMOR = new CreativeTabs("creative_armor") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(310));
        }
    };

    public static final CreativeTabs CREATIVE_BLOCKS = new CreativeTabs("creative_blocks") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(1));
        }
    };

    public static final CreativeTabs CREATIVE_ITEMS = new CreativeTabs("creative_items") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemById(339));
        }
    };

    public static final CreativeTabs CREATIVE_FOOD = new CreativeTabs("creative_food") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.MANGO_FRUIT);
        }
    };

}
