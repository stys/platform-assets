package plugins;

import java.util.Random;
import play.Application;
import com.stys.platform.assets.AssetsPlugin;

/**
 * Random subdomain in assets URL
 */
public class SubdomainRandomAssetsPlugin extends AssetsPlugin {

	/**
	 * Configuration key for assets URL format
	 */
	private static final String ASSETS_URL_FORMAT = "platform.assets.url.format";

	/**
	 * Configuration key for assets rotate count
	 */
	private static final String ASSETS_ROTATE_COUNT = "platform.assets.rotate.count";

	/**
	 * Format of the assets url
	 */
	private final String format;

	/**
	 * Subdomain rotate count
	 */
	private final Integer count;

	/**
	 * Random
	 */
	private static final Random rand = new Random();

	/**
	 * Conventional Play plugin constructor
	 * @param application
	 */
	public SubdomainRandomAssetsPlugin(Application application) {

		// Set format
		format = application.configuration().getString(ASSETS_URL_FORMAT);

		// Check that format is set
		if( null == format ) {
			throw new IllegalStateException(String.format("Configuration option %s is not set", ASSETS_URL_FORMAT));
		}

		// Set rotate count
		count = application.configuration().getInt(ASSETS_ROTATE_COUNT);

		// Check that rotate count is set
		if( null == count ) {
			throw new IllegalStateException(String.format("Configuration option $s is not set", ASSETS_ROTATE_COUNT));
		}

	}

	/**
	 * Generate asset link with random subdomain
	 * @param file
	 * @return
	 */
	public String url(String file) {
		
		// Generate random integer in range
		int k = rand.nextInt(count);
		
		// Generate asset url
		return String.format(format, k, file);		
	}
	
}
