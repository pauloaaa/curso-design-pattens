package com.paulo.designpatterns.http;

import java.util.Map;

public interface HttpAdapter {

    void post(String URL, Map<String, Object> dados);
}
