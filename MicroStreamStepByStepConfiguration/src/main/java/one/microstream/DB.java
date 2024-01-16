package one.microstream;

import org.eclipse.store.storage.embedded.configuration.types.EmbeddedStorageConfiguration;
import org.eclipse.store.storage.embedded.types.EmbeddedStorageManager;

public class DB
{
	public static EmbeddedStorageManager	storageManager;
	public final static DataRoot			root	= new DataRoot();
	
	static
	{
		storageManager = EmbeddedStorageConfiguration.Builder()
			.setStorageDirectory("data")
			.createEmbeddedStorageFoundation()
			.createEmbeddedStorageManager(root).start();
	}
}
