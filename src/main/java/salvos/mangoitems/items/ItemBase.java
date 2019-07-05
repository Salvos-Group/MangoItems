package salvos.mangoitems.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;
import salvos.mangoitems.util.Reference;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_ITEMS);

        ModItems.items.add(this);
    }

    @Override
    public void registerModels() {
        MangoItems.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
