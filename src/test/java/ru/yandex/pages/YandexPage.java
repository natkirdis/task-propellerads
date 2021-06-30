package ru.yandex.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexPage {
  SelenideElement searchBar = $("#text");
  SelenideElement submitButton = $("div.search2__button>button");

  @Step("Open yandex.ru")
  public void openPage() {
    open("https://yandex.ru");
  }

  @Step("Search for text {text}")
  public void searchFor(String text) {
    searchBar.val(text);
    submitButton.click();
  }
}



