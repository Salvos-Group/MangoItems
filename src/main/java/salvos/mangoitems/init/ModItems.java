package salvos.mangoitems.init;

import net.minecraft.item.Item;
import salvos.mangoitems.items.ItemCustomFood;
import salvos.mangoitems.items.ItemMangoWrench;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> items = new ArrayList<>();

    //Items
    public static final Item MANGO_WRENCH = new ItemMangoWrench("mangowrench");
    public static final Item MANGO_FRUIT = new ItemCustomFood("mangofruit", 3, 3, false);

}
