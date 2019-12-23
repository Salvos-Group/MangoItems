package salvos.mangoitems.game.entities.rendering;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import salvos.mangoitems.game.entities.entity.EntityGorof;
import salvos.mangoitems.game.entities.rendering.entities.RenderGorof;

public class RenderHandler {

    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityGorof.class, new IRenderFactory<EntityGorof>()
        {
            @Override
            public Render<? super EntityGorof> createRenderFor(RenderManager manager)
            {
                return new RenderGorof(manager);
            }
        });
    }


}
