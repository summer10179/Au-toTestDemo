package com.shaxi.Utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class HttpUtils{

public HttpResponse postWithCookies(String url, String json, String Cookie) throws IOException {
    HttpPost httpPost = new HttpPost(url);
    HttpClient httpClient=new DefaultHttpClient();
    httpPost.addHeader("Content-type", "application/json");
    httpPost.addHeader("Content-type", Cookie);

    StringEntity postingString = new StringEntity(json);
    httpPost.setEntity(postingString);

    HttpResponse httpResponse = httpClient.execute(httpPost);
    HttpEntity entity;

    return httpResponse;
}
}