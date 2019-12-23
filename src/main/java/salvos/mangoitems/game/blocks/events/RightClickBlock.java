package salvos.mangoitems.game.blocks.events;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import salvos.mangoitems.game.blocks.ModBlocks;
import salvos.mangoitems.game.blocks.base.BlockHorizontalBase;
import salvos.mangoitems.game.blocks.furnitures.FurnitureHorizontalBase;
import salvos.mangoitems.game.items.ModItems;

public class RightClickBlock {

    @SubscribeEvent
    public static void rightClickInteract(PlayerInteractEvent.RightClickBlock event){
        if(event.getHand().equals(EnumHand.OFF_HAND)) return;
        if(event.getEntityPlayer().getHeldItemMainhand().getItem() == ModItems.MANGO_WRENCH) {
            IBlockState state = event.getWorld().getBlockState(event.getPos());
            if(state.getBlock() instanceof BlockHorizontal) {
                BlockHorizontalBase block = (BlockHorizontalBase) state.getBlock();
                if (ModBlocks.furnitures.contains(block) && block instanceof FurnitureHorizontalBase) {
                    if (block.getMetaFromState(state) == 0) {
                        block.rotateBlock(event.getWorld(), event.getPos(), EnumFacing.WEST);
                    } else if (block.getMetaFromState(state) == 1) {
                        block.rotateBlock(event.getWorld(), event.getPos(), EnumFacing.NORTH);
                    } else if (block.getMetaFromState(state) == 2) {
                        block.rotateBlock(event.getWorld(), event.getPos(), EnumFacing.EAST);
                    } else if (block.getMetaFromState(state) == 3) {
                        block.rotateBlock(event.getWorld(), event.getPos(), EnumFacing.SOUTH);
                    }
                }
            }
        }
    }

}
