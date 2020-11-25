package ru.geekbrains.HomeWork6.base;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.HomeWork6.enums.ProjectsSubMenuButtons;
import ru.geekbrains.HomeWork6.pages.ProjectsPage;

public class ProjectsSubMenu extends SubMenu {


    public ProjectsSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ProjectsSubMenuButtons){
            switch ((ProjectsSubMenuButtons) buttons){
                case ALL_PROJECTS:
                    driver.findElement((((ProjectsSubMenuButtons)buttons).getBy())).click();
                    return new ProjectsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else{
            throw new IllegalArgumentException("Not implemented yet");
        }
    }
}
