package programa010;

import java.net.MalformedURLException;
import java.net.URL;

public class Identar {

	private static String downloadPath = GlobalParameters.DOWNLOAD_DEFAULT_PATH;
	private static String seleniumHub = GlobalParameters.SELENIUM_HUB;

	public static WebDriver getLocalChrome() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("no-sandbox");
		chromeOptions.addArguments("--allow-running-insecure-content");
		chromeOptions.addArguments("--lang=pt-BR");
		chromeOptions.addArguments("download.default_directory", downloadPath);
		return new ChromeDriver(chromeOptions);
	}

	public static WebDriver getRemoteChrome() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("no-sandbox");
		chromeOptions.addArguments("--allow-running-insecure-content");
		chromeOptions.addArguments("--lang=pt-BR");
		chromeOptions.addArguments("download.default_directory", downloadPath);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		URL url = null;
		try {
			url = new URL(seleniumHub);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return new RemoteWebDriver(url, capabilities);
	}

	public static WebDriver getLocalChromeHeadless() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("download.default_directory", downloadPath);
		chromeOptions.addArguments("--headless");

		return new ChromeDriver(chromeOptions);
	}

	public static WebDriver getRemoteChromeHeadless() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("download.default_directory", downloadPath);
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--lang=pt-BR");
		chromeOptions.addArguments("--disable-gpu");
		chromeOptions.addArguments("window-size=1280,800");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		URL url = null;
		try {
			url = new URL(seleniumHub);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return new RemoteWebDriver(url, capabilities);
	}

	public static WebDriver getLocalFirefox() {
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("no-sandbox");
		firefoxOptions.addArguments("--allow-running-insecure-content");
		firefoxOptions.addArguments("--lang=pt-BR");
		firefoxOptions.addArguments("download.default_directory", downloadPath);
		return new FirefoxDriver(firefoxOptions);
	}

	public static WebDriver getRemoteFirefox() {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		URL url = null;
		try {
			url = new URL(seleniumHub);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return new RemoteWebDriver(url, capabilities);
	}

	public static WebDriver getLocalInternetExplorer() {
		return new InternetExplorerDriver();
	}

	public static WebDriver getRemoteInternetExplorer() {
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		URL url = null;
		try {
			url = new URL(seleniumHub);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return new RemoteWebDriver(url, capabilities);
	}

	public static WebDriver getLocalEdgeExplorer() {
		// EdgeOptions edgeOptions = new EdgeOptions();
		// edgeOptions.addArguments("no-sandbox");
		// edgeOptions.addArguments("--allow-running-insecure-content");
		// edgeOptions.addArguments("--lang=pt-BR");
		// edgeOptions.addArguments("download.default_directory", downloadPath);
//        return new EdgeDriver(edgeOptions);
		return new EdgeDriver();
	}

	public static WebDriver getRemoteEdgeExplorer() {
		DesiredCapabilities capabilities = DesiredCapabilities.edge();

		URL url = null;
		try {
			url = new URL(seleniumHub);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return new RemoteWebDriver(url, capabilities);
	}
}
