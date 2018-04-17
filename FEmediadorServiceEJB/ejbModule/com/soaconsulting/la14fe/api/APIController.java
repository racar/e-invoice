package com.soaconsulting.la14fe.api;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class APIController {
	
	
	
	public String post(String url, String json, String _media_type) throws IOException {
		System.out.println("Llamando al API rest...");
		MediaType media_type = MediaType.parse(_media_type);
    	OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(media_type, json);
        
        Request request = new Request.Builder()
            .url(url)
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
          return response.body().string();
        }
      }

}
