package com.rosenhristov.tasks.httpconnection;

import lombok.Data;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NTCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Data
public class HttpConnector {

    private static HttpClient httpClient = new HttpClient();
    private static  String username = "rhristov";
    private static String password = "./Po:7845";



    public static void main(String[] args) throws IOException {
//        HttpConnector connector = HttpConnector.create();

        String urlString = "https://newpm.dataart.com:8443/BaseService.svc/web/TimeByDate?startDate=2021-10-01&endDate=2021-10-31&staffId=87717";

        DefaultHttpClient client = new DefaultHttpClient();
        client.getCredentialsProvider().setCredentials(new org.apache.http.auth.AuthScope(
                org.apache.http.auth.AuthScope.ANY_HOST, org.apache.http.auth.AuthScope.ANY_PORT),
                new org.apache.http.auth.NTCredentials(username, password, "https://newpm.dataart.com:8443", "universe"));


        HttpGet get = new HttpGet(urlString);
        CloseableHttpResponse resp =  client.execute(get);
        int responseCode = resp.getStatusLine().getStatusCode();
        String body = new String(resp.getEntity().getContent().readAllBytes());
        System.out.println("Response code: " + responseCode);
        System.out.println(body);


//        HttpResponse response;
//        try {
//            response = connector.request(urlString);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(response);

    }



    public static HttpConnector create() {
        HttpConnector connector = new HttpConnector();
        Credentials credentials = new NTCredentials(username, password, "https://newpm.dataart.com:8443", "universe");
        httpClient.getState().setCredentials(AuthScope.ANY, credentials);
        return connector;
    }

    private HttpResponse request(String urlString) throws IOException {
        HttpMethod getMethod = new GetMethod(urlString);
        int responseCode = httpClient.executeMethod(getMethod);
        return new HttpResponse(87717, responseCode, getResponseBodyAsString(getMethod.getResponseBody()));
    }

    private String getResponseBodyAsString(byte[] responseBody) {
        return new String(responseBody, StandardCharsets.UTF_8);
    }

}
