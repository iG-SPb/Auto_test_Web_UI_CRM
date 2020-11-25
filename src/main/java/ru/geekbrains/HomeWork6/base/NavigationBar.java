package ru.geekbrains.HomeWork6.base;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import ru.geekbrains.HomeWork6.enums.NavigationBarTabs;

public class NavigationBar extends BasePage{
    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public SubMenu moveCursorToNavigationTab(NavigationBarTabs tab){
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(tab.getBy()))
                .build()
                .perform();

        switch (tab){
            case COUNTER_PARTIES:
                return new CounterpartiesSubMenu(driver);
            case PROJECTS:
                return new ProjectsSubMenu(driver);
            default:
                throw new IllegalArgumentException
                        ("Another tabs currently not implemented");
        }
    }

    public NavigationBar checkTabVisibility(NavigationBarTabs tab) {
        Assertions.assertTrue(driver.findElement(tab.getBy()).isDisplayed());
        return this;
    }
}
