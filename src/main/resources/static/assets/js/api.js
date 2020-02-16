var apitype;
var requestid;
var api_reqtype;
var api_url;
var api_request_arg;
var api_respond;
var descripelink;
var imgsrc;
var ifid;
var mobile_flag;

$(document).ready(function() {
    mobile_flag=isMobile()
    if(!mobile_flag){fix()}
    clickeven()
    ifid = $("#interfaceid").val().toString();  //获取选中的option的文本值
    $("#interfaceid").change(function () {
        ifid=$("#interfaceid option:selected").val().toString()
        if(ifid==="2"){
            $("#tip").text("线路二只实现了漫画接口,您已切换为线路二")
        }else {
            $("#tip").text("您已切换为线路一")
        }
    })
})

    function fix() {
        $(window).scroll(function () {
            if ($(window).scrollTop() > 200) {
                $("#pos").addClass('fix')
                var wid = $(".left-menu").width()
                $(".box").width(wid)
            } else {
                $("#pos").removeClass('fix')
            }
        })
    }

    function loaddata(object) {
        requestid = object.requestid;
        api_reqtype = object.api_reqtype;
        api_url = object.api_url;
        api_request_arg = object.api_request_arg;
        api_respond = object.api_respond;
        descripelink = object.descripelink;
        imgsrc = object.imgsrc;
        api_request_des = object.api_request_des;
        if (api_url === "list") {
            api_url = ""
        }

    }

    function render() {
        $(".api-name").text()
        $("#reqarg").text(api_request_arg)
        $("#argtype").text()
        $("#apiLink").text(api_url)
        $("#argdes").text(api_request_des)
        $("#descurl").text(api_url)
        $("#desarg").text(descripelink)
        $(".showpicture").attr("src", imgsrc);
        $("#resp_des").text(api_respond)
        $("#apitype").text(apitype)
    }

    function call(data, status) {
        if (status === "success") {
            var obj = JSON.parse(data);
            loaddata(obj)
            render()
        }
    }



    function clickeven() {
        $("button").click(function () {
            var id = $(this).attr('id')
            apitype = $(this).text()
            if (id === "novel") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "1"}, call);
            }
            if (id === "nv_search") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "1"}, call);
            }
            if (id === "nv_detail") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "2"}, call);
            }
            if (id === "nv_link") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "3"}, call);
            }
            if (id === "nv_content") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "4"}, call);
            }
            if (id === "nv_recom") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "5"}, call);
            }
            if (id === "nv_poprecom") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "6"}, call);
            }
            if (id === "nv_readerlove") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "7"}, call);
            }
            if (id === "nv_bookfriendrecom") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "8"}, call);
            }
            if (id === "nv_fenlei") {
                $.get("/novelapi", {interfacenumber: ifid, requestid: "9"}, call);
            }
            if (id === "donman") {
                $.get("/donmanapi", {interfacenumber: ifid, requestid: "1"}, call);
            }
            if (id === "dm_search") {
                $.get("/donmanapi", {interfacenumber: ifid, requestid: "1"}, call);
            }
            if (id === "dm_detail") {
                $.get("/donmanapi", {interfacenumber: ifid, requestid: "2"}, call);
            }
            if (id === "dm_zhiyuan") {
                $.get("/donmanapi", {interfacenumber: ifid, requestid: "3"}, call);
            }
            if (id === "manhua") {
                $.get("/manhuaapi", {interfacenumber: ifid, requestid: "1"}, call);
            }
            if (id === "mh_search") {
                $.get("/manhuaapi", {interfacenumber: ifid, requestid: "1"}, call);
            }
            if (id === "mh_detail") {
                $.get("/manhuaapi", {interfacenumber: ifid, requestid: "2"}, call);
            }
            if (id === "mh_zhiyuan") {
                $.get("/manhuaapi", {interfacenumber: ifid, requestid: "3"}, call);
            }
            if (id === "mh_sort") {
                $.get("/manhuaapi", {interfacenumber: ifid, requestid: "4"}, call);
            }
            if (id === "movie") {
                $.get("/movieapi", {interfacenumber: ifid, requestid: "1"}, call);
            }
            if (id === "mv_search") {
                $.get("/movieapi", {interfacenumber: ifid, requestid: "1"}, call);
            }
            if (id === "mv_detail") {
                $.get("/movieapi", {interfacenumber: ifid, requestid: "2"}, call);
            }
        })}
function isMobile() {
    var userAgentInfo = navigator.userAgent;

    var mobileAgents = [ "Android", "iPhone", "SymbianOS", "Windows Phone", "iPad","iPod"];

    var mobile_flag = false;

    //根据userAgent判断是否是手机
    for (var v = 0; v < mobileAgents.length; v++) {
        if (userAgentInfo.indexOf(mobileAgents[v]) > 0) {
            mobile_flag = true;
            break;
        }
    }
    var screen_width = window.screen.width;
    var screen_height = window.screen.height;

    //根据屏幕分辨率判断是否是手机
    if(screen_width < 500 && screen_height < 800){
        mobile_flag = true;
    }

    return mobile_flag;
}