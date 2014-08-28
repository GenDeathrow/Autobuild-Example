package autobuild.core.proxies;

public class ClientProxy extends CommonProxy
{
	@Override
	public boolean isClient()
	{
		return true;
	}
	
	@Override
	public void registerEventHandlers()
	{
		super.registerEventHandlers();
	}
}
