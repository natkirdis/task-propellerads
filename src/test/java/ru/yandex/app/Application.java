package ru.yandex.app;

import ru.yandex.pages.YandexPage;
import ru.yandex.pages.SearchResultsPage;

public class Application {

  private final YandexPage yandexPage;
  private final SearchResultsPage searchResultPage;

  public Application() {
    yandexPage = new YandexPage();
    searchResultPage = new SearchResultsPage();
  }

  public YandexPage yandex() {
    return yandexPage;
  }
  public SearchResultsPage results() {
    return searchResultPage;
  }
}