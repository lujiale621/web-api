package org.it.web.controller;

import org.it.web.util.requestpython.AnimImpl;
import org.it.web.util.requestpython.ManhuaImpl;
import org.it.web.util.requestpython.MovieImpl;
import org.it.web.util.requestpython.NovelImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PreDestroy;

@Controller
public class LueController {
    private Process process;
    private NovelImpl novelImpl1=new NovelImpl(40001,1);
    private NovelImpl novelImpl2=new NovelImpl(40001,2);
    private NovelImpl novelImpl3=new NovelImpl(40001,3);
    private AnimImpl animImpl1=new AnimImpl(40001,1);
    private AnimImpl animImpl2=new AnimImpl(40001,2);
    private AnimImpl animImpl3=new AnimImpl(40001,3);
    private ManhuaImpl manhua1=new ManhuaImpl(40001,1);
    private ManhuaImpl manhua2=new ManhuaImpl(40001,2);
    private ManhuaImpl manhua3=new ManhuaImpl(40001,3);
    private MovieImpl movie1 = new MovieImpl(40001,1);
    private MovieImpl movie2 = new MovieImpl(40001,2);
    private MovieImpl movie3 = new MovieImpl(40001,3);


    @ResponseBody
    @GetMapping(value = "/novel1")
    public String novel1(String xsname, String xsmore, String xsdetail, String xscontent, String xsrecom, String xshot, String xsreaderrecom,String mostpopularnovel) {
        if (xsname != null) return novelImpl1.getbooklist(xsname);
        if (xsmore != null) return novelImpl1.getbookmorelist(xsmore);
        if (xsdetail != null) return novelImpl1.getbookdetail(xsdetail);
        if (xscontent != null) return novelImpl1.getbookcontent(xscontent);
        if (xsrecom != null) return novelImpl1.poprecommendation(xsrecom);
        if (xshot != null) return novelImpl1.recommendgoodnovels(xshot);
        if(xsreaderrecom!=null) return novelImpl1.bookfriendrecommed(xsreaderrecom);
        if(mostpopularnovel!=null) return novelImpl1.mostpopularnovel(mostpopularnovel);
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/novel1/assort")
    public String nover1_assort(String type, String page){
        if (type==null||page==null){return "参数不能为空";}
        else {return novelImpl1.getsort("list/"+type+"_"+page+".html");}
    }
    @ResponseBody
    @GetMapping(value = "/manhua1/assort")
    public String manhua1_assort(String type, String page){
        if (type==null||page==null){return "参数不能为空";}
        else {return manhua1.getManhuasortlinklist(type+page+".html");}
    }
    @ResponseBody
    @GetMapping(value = "/manhua2/assort")
    public String manhua2_assort(String type, String page){
        if (type==null||page==null){return "参数不能为空";}
        else {return manhua2.getManhuasortlinklist(type+page+".html");}
    }
    @ResponseBody
    @GetMapping(value = "/novel2")
    public String novel2(String xsname, String xsmore, String xsdetail, String xscontent) {
        if (xsname != null) {
            return novelImpl2.getbooklist(xsname);
        }
        if (xsmore != null) {
            return novelImpl2.getbookmorelist(xsmore);
        }
        if (xsdetail != null) {
            return novelImpl2.getbookdetail(xsdetail);
        }
        if (xscontent != null) {
            return novelImpl2.getbookcontent(xscontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/novel3")
    public String novel3(String xsname, String xsmore, String xsdetail, String xscontent) {
        if (xsname != null) {
            return novelImpl3.getbooklist(xsname);
        }
        if (xsmore != null) {
            return novelImpl3.getbookmorelist(xsmore);
        }
        if (xsdetail != null) {
            return novelImpl3.getbookdetail(xsdetail);
        }
        if (xscontent != null) {
            return novelImpl3.getbookcontent(xscontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/anim1")
    public String anim1(String amname,String amdetail,String amcontent) {
        if (amname != null) {
            return animImpl1.getanimlist(amname);
        }
        if (amdetail != null) {
            return animImpl1.getanimdetail(amdetail);
        }
        if (amcontent != null) {
            return animImpl1.getanimcontentlist(amcontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/anim2")
    public String anim2(String amname,String amdetail,String amcontent) {
        if (amname != null) {
            return animImpl2.getanimlist(amname);
        }
        if (amdetail != null) {
            return animImpl2.getanimdetail(amdetail);
        }
        if (amcontent != null) {
            return animImpl2.getanimcontentlist(amcontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/anim3")
    public String anim3(String amname,String amdetail,String amcontent) {
        if (amname != null) {
            return animImpl3.getanimlist(amname);
        }
        if (amdetail != null) {
            return animImpl1.getanimdetail(amdetail);
        }
        if (amcontent != null) {
            return animImpl3.getanimcontentlist(amcontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/manhua1")
    public String manhua1(String mhname,String mhdetail ,String mhcontent) {
        if (mhname != null) {
            return manhua1.getManhualist(mhname);
        }
        if (mhdetail != null) {
            return manhua1.getManhualinklist(mhdetail);
        }
        if (mhcontent != null) {
            return manhua1.getManhuacontlinklist(mhcontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/manhua2")
    public String manhua2(String mhname,String mhdetail ,String mhcontent) {
        if (mhname != null) {
            return manhua2.getManhualist(mhname);
        }
        if (mhdetail != null) {
            return manhua2.getManhualinklist(mhdetail);
        }
        if (mhcontent != null) {
            return manhua2.getManhuacontlinklist(mhcontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/manhua3")
    public String manhua3(String mhname,String mhdetail ,String mhcontent) {
        if (mhname != null) {
            return manhua3.getManhualist(mhname);
        }
        if (mhdetail != null) {
            return manhua3.getManhualinklist(mhdetail);
        }
        if (mhcontent != null) {
            return manhua3.getManhuacontlinklist(mhcontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/movie1")
    public String movie1(String mvname,String mvdetail,String mvcontent) {
        if (mvname != null) {
            return movie1.getMovielist(mvname);
        }
        if (mvdetail != null) {
            return movie1.getMovieDetaillist(mvdetail);
        }
        if (mvcontent != null) {
            return movie1.getMoviecontlinklist(mvcontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/movie2")
    public String movie2(String mvname,String mvdetail,String mvcontent) {
        if (mvname != null) {
            return movie2.getMovielist(mvname);
        }
        if (mvdetail != null) {
            return movie2.getMovieDetaillist(mvdetail);
        }
        if (mvcontent != null) {
            return movie2.getMoviecontlinklist(mvcontent);
        }
        return "null";
    }
    @ResponseBody
    @GetMapping(value = "/movie3")
    public String movie3(String mvname,String mvdetail,String mvcontent) {
        if (mvname != null) {
            return movie3.getMovielist(mvname);
        }
        if (mvdetail != null) {
            return movie3.getMovieDetaillist(mvdetail);
        }
        if (mvcontent != null) {
            return movie3.getMoviecontlinklist(mvcontent);
        }
        return "null";
    }
        @PreDestroy
        public void destory(){
            System.out.println("destory...");
        }
}
