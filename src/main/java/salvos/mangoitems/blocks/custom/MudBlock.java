package salvos.mangoitems.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.blocks.BlockBase;
import salvos.mangoitems.init.ModBlocks;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;
import salvos.mangoitems.util.Reference;

import javax.annotation.Nullable;

public class MudBlock extends BlockBase implements IHasModel {

    public MudBlock(String name, Material material) {
        super(name, material, 0.6F, 3, "shovel", 0);
        setSoundType(SoundType.GROUND);
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess access, BlockPos pos) {
        return new AxisAlignedBB(0, 0, 0, 1, 0.0625*12.5, 1);
    }

    @Override
    public void registerModels(){
        MangoItems.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
