package ru.geekbrains.HomeWork6.enums;

import org.openqa.selenium.By;
import ru.geekbrains.HomeWork6.base.SubMenuButtons;

public enum ProjectsSubMenuButtons implements SubMenuButtons {
    ALL_PROJECTS("//li[@data-route='crm_project_index']/a"),
    MY_PROJECTS("//li[@data-route='crm_project_my']"),
    CHANGE_REQUEST_BB("//li[@data-route='crm_value_change_request_index']");

    private final By by;

    ProjectsSubMenuButtons(String xpath){
        this.by = By.xpath(xpath);
    }

    public By getBy(){
        return by;
    }
}