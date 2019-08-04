package salvos.mangoitems.blocks.furnitures;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.blocks.BlockHorizontalBase;
import salvos.mangoitems.init.ModBlocks;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;
import salvos.mangoitems.util.Reference;

public class FurnitureHorizontalBase extends BlockHorizontalBase {

    public FurnitureHorizontalBase(String name, Material material) {
        super(name, material);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);

        ModBlocks.furnitures.add(this);
    }

    public FurnitureHorizontalBase(String name, Material material, float hardness) {
        super(name, material, hardness);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);

        ModBlocks.furnitures.add(this);
    }

    public FurnitureHorizontalBase(String name, Material material, float hardness, float resistance) {
        super(name, material, hardness, resistance);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);

        ModBlocks.furnitures.add(this);
    }

    public FurnitureHorizontalBase(String name, Material material, float hardness, float resistance, String tool, int harvestLevel) {
        super(name, material, hardness, resistance, tool, harvestLevel);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);

        ModBlocks.furnitures.add(this);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state){
        return  false;
    }

    @Override
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.CUTOUT;
    }
}
