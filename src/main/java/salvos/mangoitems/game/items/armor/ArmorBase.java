package salvos.mangoitems.game.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.game.items.ModItems;
import salvos.mangoitems.game.blocks.IHasModel;
import salvos.mangoitems.util.Reference;

public class ArmorBase extends ItemArmor implements IHasModel {

    public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot){
        super(material, renderIndex, slot);

        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.items.add(this);
    }

    @Override
    public void registerModels() {
        MangoItems.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
