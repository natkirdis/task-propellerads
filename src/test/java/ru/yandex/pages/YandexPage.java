package ru.yandex.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexPage {
  SelenideElement searchBar = $("#text");
  SelenideElement submitButton = $("div.search2__button>button");

  public void openPage() {
    open("https://yandex.ru");
  }

  public void searchFor(String text) {
    searchBar.val(text);
    submitButton.click();
  }
}



