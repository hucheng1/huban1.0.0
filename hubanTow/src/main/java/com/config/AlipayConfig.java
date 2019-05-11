package com.config;

import com.entity.Order;
import com.service.IAllSerivce;
import com.service.SeriverImpl.AllServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016100100638683";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key ="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCYHYrBMCQYzZLbDfBFhCPkXVzM9JJtSr/nGkMrcNT3nTu2BPTzTIABRR2KRs3tIL+y0A+BvVzqHFVr7VSY4Ygp2ek39gPOdowLodJgaku4el6XXNj10sI6Y6iHzXB3WzQnROdVmfE1jw8VwG9/gn1F5x9LAxCkDcxYuXDBN+pwBpknlpqwCQVOYL62JqHPu4J+IDYf5gHuTyq4NnPnyG/g+m/BWGQpx3L6dtJehMBLsJeEEB9EI4w396OnRNutTgRniNrRv4Qxys8x9Y4ccYnU/aQEsuVDNkg/1E4//77LeK/fEdJXY2C1Uyonoa6LdVSHQxK1hp4KBu7vJfZ1AacjAgMBAAECggEAK/X9r681/2UJ1/zDP5Pcu5avxxu3ZZaAt01DtD47jgQGyafNErM9GyDaVKf5w1n/jLHMiXYscAwYM8S2+ifTriSn3eBfYT+pYYM2xV5y27GhvKS8nu5162H5xqV8p0HYZLDpGjgPGadqeKLQlk0j3xvYU1ljacYDFHEjQPPj8NPFQ3ZgRKM6lVP0cptMvMFwjJEAFszR1de6ogC9IUl33j4ns8PSgceRQVYhXDUe2Wl9kTF69QZ/snjA6zOtN+bKl4PblfLOXt6QurxRrznO30T1Gc0WtH9O8EdXNsLea20lmfrCmhB06xv/L2tOWx/JdxQ5T4Tw2zgQpioXyWLEAQKBgQDIuj+u2VTZMvy+5VBdYyRdoQnQY1iyJeXpZcx30yXbzMf+FB9Lm4zyI4WQo6gqLmPIsckyHN0MAbdZQ28pgffX/Cc0Jvy5odo5XoE53qniWFQqC1W/cO0Pc/VdP4gs8ctVVs+H6zz303SsLSa6yHQGzf4MhfG7MexS4WcZIw+oowKBgQDCAIK3yXbtOKjopCDVGkX5XizFixHfIOUqsvvBxUkxTiC9BJlo7eV4qdwwV+NpUGMmlmKo8WgQ0u1BF2DM/dA4Oob35yx8JQop5MuVxlsrqZe87IVPwTpqYUbqiiTHj3N9XLs6MRG3ZCeOvyMEixKK4xftpMPdKkVgjTHjtPVvgQKBgApyfywHjb38RGFfKA6kQVlKL2uUMCKdjFjYforiB39oKiSUQYi64Nwdcy8zBWakoXbpofIkxHCCiltwAhIj/JVWP2gce1ziCqyfuZQcfbUVKdRCYMUlCIGcZHHlA55rO00GxqhpWvP/InxvoStpkXhlMkrOkeVPVOB/cNFDHOaHAoGAZJidL63Q9DtAIroQqE/iXuc9cgWl87x7+IMs1pJ1XJK1mS3MWsOZDNOPcKXyLwbXEwhCCnZ7TtYA3pK/yCwIj0+R8vQ1df5C4exYwMZFOkPLgdRnYC7DGqxseGu/nJc+/I9cKlWNaToO5Q8pmk5/A/Oz0a9xPLqRlPpCF2AbMIECgYBpcp2DoPGSa+UuUxOWNRxnTOwdkrsTTxfi+Y/irywIxiUQdhHBsdMok37JRw912uQEU0h7MJA2PHcP4ZJ5+sroD7UzR9A2L/hx2crxkGuezNg3o5E1w6CRXf/YlfxepiyTkBqDY0L98yVApt90qYJHzIc+ue04FECXNb5F64/dEg==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqm4Hr8SEiSvWCnB6StzSb9gEvyX/a6MlEqurOOBzY+nLSZ78SVlkzIOnLhNJZ8DTZittQYxIkVp0n17ur3os62ccKK9iUdLzzTMA5XrrQkS2DM5WUlIyBAgBi71kSp1WmpchdU5JX+DDIAOS/SiV2cfTPxXDk7Diu9VJhO7LbYDlasuauKyx0nSix4dHGNVvh1zcTufaoD44/xlxL6RffUitDBuaa48257msrJB2jr9aA/AJsIiSdxzFCDgFJXg4ima4iaGUpJ/R8jbInHjBCwjPWL5BpGA/JZQ4hjVgynvfSTng1V6X+/SmrujmyavL2R+CX/JDY9obL7d+FloROQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/hubanTow/YuanC.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/hubanTow/ss";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

