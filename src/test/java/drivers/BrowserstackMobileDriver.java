package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackConfig;
import config.EnviromentConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {

    static BrowserstackConfig config = ConfigFactory
            .create(BrowserstackConfig.class, System.getProperties());
    static EnviromentConfig config2 = ConfigFactory
            .create(EnviromentConfig.class, System.getProperties());
    @Override

    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", config.username());
        mutableCapabilities.setCapability("browserstack.key", config.key());

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", config.appinbrowserstack());
        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", config2.DeviceName());
        mutableCapabilities.setCapability("os_version", config2.PlatformVersion());

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", config.projectinbrowserstack());
        mutableCapabilities.setCapability("build", config.buildinbrowserstack());
        mutableCapabilities.setCapability("name", config.nameinbrowserstack());
        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL(config2.HostUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
