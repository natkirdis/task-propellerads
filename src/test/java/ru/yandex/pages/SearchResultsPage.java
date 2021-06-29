package ru.yandex.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

  ElementsCollection results = $$("li.serp-item");
  ElementsCollection urls = $$("div.Path b");

  public void haveUrl(String url) {
    urls.filter(exactText(url)).shouldHave(sizeGreaterThan(1));
  }

  public void sizeIsAtLeast(int expectedSize) {
    results.shouldHave(sizeGreaterThan(expectedSize));
  }
}
