package com.proudsoft.newssources;

import com.proudsoft.newssources.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
