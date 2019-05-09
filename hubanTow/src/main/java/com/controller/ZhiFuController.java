package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.Good;
import com.entity.Order;
import com.service.IAllSerivce;
import com.service.SeriverImpl.AllServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


@Controller
public class ZhiFuController {


    @RequestMapping(value = "/zu")
    public String selectGood(Integer num, Integer price, String title, String context, Integer sheId, Integer fuId
    , HttpServletRequest request, HttpServletResponse response) {
        System.out.println("-----------支付-------------------");
               //生成订单
             SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
             String newDate=sdf.format(new Date());
             String result="";
             String hao="";//最终订单号
             Random random=new Random();
             for (int i = 0; i <3 ; i++) {
               result+=random.nextInt(10);
           }
             hao=newDate+result;
          request.getSession().setAttribute("WIDout_trade_no",hao);//商户订单
          request.getSession().setAttribute("WIDtotal_amount",price);//金额
          request.getSession().setAttribute("WIDsubject",title);//商户订单名称
          request.getSession().setAttribute("WIDbody",context);//描述
          return "redirect:/index2.jsp";
    }

    @RequestMapping(value = "/ss")
    public String insert(HttpServletRequest request){
        IAllSerivce is=new AllServiceImpl();
        Order order=new Order();
        order.setForMoney(Integer.parseInt(request.getSession().getAttribute("WIDtotal_amount").toString()));
        order.setForSid(1);
        order.setForState(1);
        order.setForId(request.getSession().getAttribute("WIDout_trade_no").toString());
        System.out.println(order);
        int num=is.insertOrder(order);
        System.out.println(num+"--------------");
        if(num>0){
            return  "redirect:/designMain.html";//成功
        }
        return  "redirect:/designer.html";//失败
    }
}
