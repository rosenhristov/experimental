package com.rosenhristov.tasks.httpconnection;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.lang3.StringUtils;

public class HttpResponse {

    private int staffId;
    private int responseCode;
    private String responseBody;

    public HttpResponse() {
    }

    HttpResponse(int staffId, int responseCode, String responseBody) {
        this.staffId = staffId;
        this.responseBody = responseBody;
        this.responseCode = responseCode;
    }

    public boolean isValid() {
        return this.responseCode == HttpStatus.SC_OK && StringUtils.isNotBlank(this.responseBody);
    }

    @Override
    public String toString() {
        return String.format("%s : %s : %s", staffId, responseCode, responseBody);
    }

}
