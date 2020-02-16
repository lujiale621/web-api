package org.it.web.bean;

import java.io.Serializable;

public class ApiDoc implements Serializable {
    String apitype;
    String requestid;
    String api_reqtype;
    String api_url;
    String api_request_arg;
    String api_request_des;
    String api_respond;
    String descripelink;
    String imgsrc;
    public ApiDoc(String apitype, String requestid, String api_reqtype, String api_url, String api_request_arg, String api_request_des, String api_respond, String descripelink, String imgsrc) {
        this.apitype = apitype;
        this.requestid = requestid;
        this.api_reqtype = api_reqtype;
        this.api_url = api_url;
        this.api_request_arg = api_request_arg;
        this.api_request_des = api_request_des;
        this.api_respond = api_respond;
        this.descripelink = descripelink;
        this.imgsrc = imgsrc;
    }

    public String getApi_request_des() {
        return api_request_des;
    }

    public void setApi_request_des(String api_request_des) {
        this.api_request_des = api_request_des;
    }

    public String getApitype() {
        return apitype;
    }

    public void setApitype(String apitype) {
        this.apitype = apitype;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getApi_reqtype() {
        return api_reqtype;
    }

    public void setApi_reqtype(String api_reqtype) {
        this.api_reqtype = api_reqtype;
    }

    public String getApi_url() {
        return api_url;
    }

    public void setApi_url(String api_url) {
        this.api_url = api_url;
    }

    public String getApi_request_arg() {
        return api_request_arg;
    }

    public void setApi_request_arg(String api_request_arg) {
        this.api_request_arg = api_request_arg;
    }

    public String getApi_respond() {
        return api_respond;
    }

    public void setApi_respond(String api_respond) {
        this.api_respond = api_respond;
    }

    public String getDescripelink() {
        return descripelink;
    }

    public void setDescripelink(String descripelink) {
        this.descripelink = descripelink;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }
}
