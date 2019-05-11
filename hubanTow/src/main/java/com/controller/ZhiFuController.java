package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.Order;
import com.service.IAllSerivce;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IAllSerivce is;
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
        System.out.println("进入订单添加结算------------");
        Order order=new Order();
        order.setForMoney(Integer.parseInt(request.getSession().getAttribute("WIDtotal_amount").toString()));
        //获取登陆用户id
        Order os = (Order) request.getSession().getAttribute("user");
        order.setUid(os.getUid());
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


    @RequestMapping(value = "/shuju")
    @ResponseBody
    public Object insert(Integer fsId) {
        System.out.println("进入查询具体详情信息-------------------");
        Object json = JSON.toJSON(is.selectServiceMpper(fsId));
        System.out.println("数据" + json);
        return json;
    }
}
