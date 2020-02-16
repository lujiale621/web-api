package org.it.web.controller;

import com.alibaba.fastjson.JSON;
import org.it.web.bean.ApiDoc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {
    final String BaseaddrUrl="http://lujiale.wicp.io/";
    final String BasepicUrl="assets/images/elements/";
    final String Nv_Search="            {\"name\":\"书名\",\n" +
            "            \"author\":\"作者\",\n" +
            "            \"url\":\"请求地址\",\n" +
            "            \"cover\":\"图片\",\n" +
            "            \"introduce\":\"简介\",\n" +
            "            \"lastupdatachapter\":\"最新章节\",\n" +
            "            \"updatetime\":\"最后更新时间\",\n" +
            "            \"type\":\"类型\",\n" +
            "            \"status\":\"状态\"}";
    final String Nv_detail="        {\n" +
            "            \"name\":\"书名\",\n" +
            "            \"author\":\"作者\",\n" +
            "            \"url\":\"下一个请求地址\",\n" +
            "            \"cover\":\"封面\",\n" +
            "            \"introduce\":\"简介\",\n" +
            "            \"lastupdatachapter\":\"最新章节\",\n" +
            "            \"updatatime\":\"最后更新时间\",\n" +
            "            \"type\":\"类型\",\n" +
            "            \"status\":\"状态\",\n" +
            "            \"readers\":[\n" +
            "                \"读者数量\"\n" +
            "            ],\n" +
            "            \"recomms\":\"推荐数\",\n" +
            "            \"booksizes\":[\n" +
            "                \"字数\"\n" +
            "            ]\n" +
            "        }";
    final String nv_recom="  {\n" +
            "            \"title\":\"题目\",\n" +
            "            \"covers\":\"封面\",\n" +
            "            \"brief\":\"简介\",\n" +
            "            \"link\":\"下级url\"\n" +
            "        }";
    final String nv_sort="page参数为页数 " +
            "              type:1 玄幻  " +
            "              type:2 武侠  " +
            "              type:3 都市  " +
            "              type:4 历史  " +
            "              type:5 网游  " +
            "              type:6 科幻  " +
            "              type:7 灵异  " +
            "              type:8 其他  " ;

    private List<ApiDoc> NovelApi1List=new ArrayList<ApiDoc>();
    private List<ApiDoc> NovelApi2List=new ArrayList<ApiDoc>();
    private List<ApiDoc> DonmanApi1List=new ArrayList<ApiDoc>();
    private List<ApiDoc> DonmanApi2List=new ArrayList<ApiDoc>();
    private List<ApiDoc> ManhuaApi1List=new ArrayList<ApiDoc>();
    private List<ApiDoc> ManhuaApi2List=new ArrayList<ApiDoc>();
    private List<ApiDoc> MovieApi1List=new ArrayList<ApiDoc>();
    private List<ApiDoc> MovieApi2List=new ArrayList<ApiDoc>();
    public AjaxController() {
      addcontent();
    }

    private void addcontent() {
        /**
         * 小说
         */
        ApiDoc nv1search=new ApiDoc("novel","1","GET",BaseaddrUrl+"novel1/"+"?xsname=","xsname","搜索名称",Nv_Search,"雪中悍刀行",BasepicUrl+"nv_search.png");
        ApiDoc nv1detail=new ApiDoc("novel","2","GET",BaseaddrUrl+"novel1/"+"?xsmore=","xsmore","搜索更多",Nv_detail,"http://www.5wx.org/show/81.html",BasepicUrl+"nv_more.png");
        ApiDoc nv1list=new ApiDoc("novel","3","GET",BaseaddrUrl+"novel1/"+"?xsdetail=","xsdetail","获取地址","","http://www.5wx.org/read/0/81/",BasepicUrl+"nv_slist.png");
        ApiDoc nv1content=new ApiDoc("novel","4","GET",BaseaddrUrl+"novel1/"+"?xscontent=","xscontent","获取内容","","http://www.5wx.org/read/0/81/304.html",BasepicUrl+"nv_content.png");
        ApiDoc nv1_recom=new ApiDoc("novel","5","GET",BaseaddrUrl+"novel1/"+"?xsrecom=","xsrecom","热门推荐",nv_recom,"0",BasepicUrl+"nv_recom.png");
        ApiDoc nv1_poprecom=new ApiDoc("novel","6","GET",BaseaddrUrl+"novel1/"+"?xshot=","xshot","推荐好看的小说","","0",BasepicUrl+"nv_hot.png");
        ApiDoc nv1_readerlove=new ApiDoc("novel","7","GET",BaseaddrUrl+"novel1/"+"?xsreaderrecom=","xsreaderrecom","人气最高的小说","","0",BasepicUrl+"nv_xsreaderrecom.png");
        ApiDoc nv1_bookfriendrecom=new ApiDoc("novel","8","GET",BaseaddrUrl+"novel1/"+"?mostpopularnovel=","mostpopularnovel","书友推荐的小说","","0",BasepicUrl+"nv_mostpopularnovel.png");
        ApiDoc nv1_fenlei=new ApiDoc("novel","9","GET",BaseaddrUrl+"novel1/assort/?","type&page","类型和页数",nv_sort,"type=1&page=1",BasepicUrl+"nv_sort.png");

        NovelApi1List.add(nv1search);
        NovelApi1List.add(nv1detail);
        NovelApi1List.add(nv1list);
        NovelApi1List.add(nv1content);
        NovelApi1List.add(nv1_recom);
        NovelApi1List.add(nv1_poprecom);
        NovelApi1List.add(nv1_readerlove);
        NovelApi1List.add(nv1_bookfriendrecom);
        NovelApi1List.add(nv1_fenlei);
        ApiDoc dm1search=new ApiDoc("donman","1","GET",BaseaddrUrl+"anim1/"+"?amname=","amname","搜索名称","","斗破苍穹",BasepicUrl+"am_search.png");
        ApiDoc dm1detail=new ApiDoc("donman","2","GET",BaseaddrUrl+"anim1/"+"?amdetail=","amdetail","获取详情","","/view/4104.html",BasepicUrl+"am_links.png");
        ApiDoc dm1content=new ApiDoc("donman","3","GET",BaseaddrUrl+"anim1/"+"?amcontent=","amcontent","获取内容","","/player/4104-0-9.html",BasepicUrl+"am_content.png");
        DonmanApi1List.add(dm1search);
        DonmanApi1List.add(dm1detail);
        DonmanApi1List.add(dm1content);
        ApiDoc mh1search=new ApiDoc("manhua","1","GET",BaseaddrUrl+"manhua1/"+"?mhname=","mhname","搜索名称","","系统",BasepicUrl+"mh_name.png");
        ApiDoc mh1detail=new ApiDoc("manhua","2","GET",BaseaddrUrl+"manhua1/"+"?mhdetail=","mhdetail","获取详情","","/imanhua/xitongxianzunzaidushi/",BasepicUrl+"mh_detail.png");
        ApiDoc mh1content=new ApiDoc("manhua","3","GET",BaseaddrUrl+"manhua1/"+"?mhcontent=","mhcontent","获取内容","","/imanhua/manhuadashangpaixingbang/176895.html",BasepicUrl+"mh_pic.png");
        ApiDoc mh1sort=new ApiDoc("manhua","4","GET",BaseaddrUrl+"manhua1/assort?","type&page","类型和页数","","type=/hougong/&page=2",BasepicUrl+"mh_pic.png");
        ManhuaApi1List.add(mh1search);
        ManhuaApi1List.add(mh1detail);
        ManhuaApi1List.add(mh1content);
        ManhuaApi1List.add(mh1sort);
        ApiDoc mh2search=new ApiDoc("manhua","1","GET",BaseaddrUrl+"manhua2/"+"?mhname=","mhname","搜索名称","","系统",BasepicUrl+"mh_name.png");
        ApiDoc mh2detail=new ApiDoc("manhua","2","GET",BaseaddrUrl+"manhua2/"+"?mhdetail=","mhdetail","获取详情","","/jitongbiwozuohuanghou/",BasepicUrl+"mh_detail.png");
        ApiDoc mh2content=new ApiDoc("manhua","3","GET",BaseaddrUrl+"manhua2/"+"?mhcontent=","mhcontent","获取内容","","/jitongbiwozuohuanghou/56.html",BasepicUrl+"mh_pic.png");
        ApiDoc mh2sort=new ApiDoc("manhua","4","GET",BaseaddrUrl+"manhua2/assort?","type&page","类型和页数","","type=f-1--国漫----updatetime--&page=1",BasepicUrl+"mh_pic.png");
        ManhuaApi2List.add(mh2search);
        ManhuaApi2List.add(mh2detail);
        ManhuaApi2List.add(mh2content);
        ManhuaApi2List.add(mh2sort);
        ApiDoc mv1search=new ApiDoc("movie","1","GET",BaseaddrUrl+"movie1/"+"?mvname=","mvname","搜索名称","","疯狂的麦克斯",BasepicUrl+"mv_name.png");
        ApiDoc mv1detail=new ApiDoc("movie","2","GET",BaseaddrUrl+"movie1/"+"?mvdetail=","mvdetail","获取详情","","zdvod-detail-id-70380.html",BasepicUrl+"mv_detail.png");
        ApiDoc mv1content=new ApiDoc("movie","3","GET",BaseaddrUrl+"movie1/"+"?mvcontent=","mvcontent","获取内容","","",BasepicUrl+"");
        MovieApi1List.add(mv1search);
        MovieApi1List.add(mv1detail);
        MovieApi1List.add(mv1content);
    }

    @ResponseBody
    @GetMapping("/novelapi")
    public String novelapiinfo(String interfacenumber, String requestid){
        if (interfacenumber.equals("1")){
            int index = Integer.parseInt(requestid)-1;
            String jsonString = JSON.toJSONString(NovelApi1List.get(index));
            return jsonString;
        }
        if (interfacenumber.equals("2")){
            int index = Integer.parseInt(requestid);
            String jsonString = JSON.toJSONString(NovelApi2List.get(index));
            return jsonString;
        }
        return null;
    }
    @ResponseBody
    @GetMapping("/donmanapi")
    public String donmanapiinfo(String interfacenumber,String requestid){
        if (interfacenumber.equals("1")){
            int index = Integer.parseInt(requestid)-1;
            String jsonString = JSON.toJSONString(DonmanApi1List.get(index));
            return jsonString;
        }
        if (interfacenumber.equals("2")){
            int index = Integer.parseInt(requestid)-1;
            String jsonString = JSON.toJSONString(DonmanApi2List.get(index));
            return jsonString;
        }
        return null;
    }
    @ResponseBody
    @GetMapping("/manhuaapi")
    public String manhuaapiinfo(String interfacenumber,String requestid){
        if (interfacenumber.equals("1")){
            int index = Integer.parseInt(requestid)-1;
            String jsonString = JSON.toJSONString(ManhuaApi1List.get(index));
            return jsonString;
        }
        if (interfacenumber.equals("2")){
            int index = Integer.parseInt(requestid)-1;
            String jsonString = JSON.toJSONString(ManhuaApi2List.get(index));
            return jsonString;
        }
        return null;
    }
    @ResponseBody
    @GetMapping("/movieapi")
    public String movieapiinfo(String interfacenumber,String requestid){
        if (interfacenumber.equals("1")){
            int index = Integer.parseInt(requestid)-1;
            String jsonString = JSON.toJSONString(MovieApi1List.get(index));
            return jsonString;
        }
        if (interfacenumber.equals("2")){
            int index = Integer.parseInt(requestid)-1;
            String jsonString = JSON.toJSONString(MovieApi2List.get(index));
            return jsonString;
        }
        return null;
    }

}
