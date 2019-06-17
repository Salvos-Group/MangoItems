package salvos.mangoitems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.init.ModBlocks;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material, float hardness, float resistance, String tool, int harvestLevel) {
        super(material);

        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_BLOCKS);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, harvestLevel);

        ModBlocks.blocks.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels(){
        MangoItems.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
