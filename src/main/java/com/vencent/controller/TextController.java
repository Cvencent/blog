package com.vencent.controller;

import com.vencent.pojo.*;
import com.vencent.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/text")
public class TextController {


    @Autowired
    TextService textService;
    @Autowired
    WhisperService whisperService;
    @Autowired
    ReplyService replyService;
    @Autowired
    LeacotsService leacotsService;
    @Autowired
    AlbumService albumService;

/*
文章显示
 */
@RequestMapping(value = "/context" ,method = RequestMethod.POST)
    public @ResponseBody  List<Text> context(@RequestBody(required = false) String body, HttpSession session){
        String[] s =   body.split("=");
        List<Text> list = textService.selectByType(s[1], (Integer) session.getAttribute("UserId"));
        return list;
    }


/*
跳转到文章细节，内容未做
 */
    @RequestMapping("/details")
    public String details(){

    return "details";
    }

    /*
    微语显示
     */
    @RequestMapping(value = "/whisper",method = RequestMethod.POST)
    public @ResponseBody  List<Whisper> whisper(HttpSession session){
        System.out.println(session.getAttribute("UserId"));
       List<Whisper> list = whisperService.findById((int) session.getAttribute("UserId"));

       return list;
    }

    /*
    留言显示
     */
    @RequestMapping(value = "/lls")
    public @ResponseBody List<Leacots> lls(HttpSession session){
    List<Leacots> list= leacotsService.selectByUser((int)session.getAttribute("UserId"));
    return list;
    }
/*
相册显示
 */
    @RequestMapping(value = "/albums",method = RequestMethod.POST)
    public @ResponseBody  List<Album> albums(HttpSession session){
          List<Album> list = albumService.albums((int)session.getAttribute("UserId"));
          return list;
    }
}
