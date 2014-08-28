package autobuild.core.proxies;

import autobuild.handlers.UpdateNotification;
import cpw.mods.fml.common.FMLCommonHandler;

public class CommonProxy
{
	public boolean isClient()
	{
		return false;
	}

	public void registerEventHandlers()
	{
		FMLCommonHandler.instance().bus().register(new UpdateNotification());
	}
}
