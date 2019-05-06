package com.huaban.service.impl;

import com.huaban.service.IScheduledService;
import org.springframework.scheduling.annotation.Scheduled;

public class ScheduledServier implements IScheduledService {

    /**
     * cornexpression表达式详解：
     　　完整字段：[秒] [分] [小时] [日] [月] [周] [年]
     　　字段　　　　　　允许值　　　　　　　　　　　　允许特殊字符
     　　秒　　　　　　　0-59　　　　　　　　　　　　　　, - * /
     　　分　　　　　　　0-59　　　　　　　　　　　　　　, - * /
     　　小时　　　　　　0-23　　　　　　　　　　　　　　, - * /
     　　日　　　　　　　1-31　　　　　　　　　　　　　　, - * ? / L W C
     　　月　　　　　　　1-12或JAN-DEC　　　　　　　　  , - * /
     　　周　　　　　　　1-7或SUN-SAT　　　　　　　　　 , - *  ? / L C #
     　　年　　　　　　　留空或1970-2099　　　　　　　 　, - * /

     注：
     　　*表示所有值，在分钟里表示每一分钟触发。在小时，日期，月份等里面表示每一小时，每一日，每一月。
     　　？表示不指定值。表示不关心当前位置设置的值。 比如不关心是周几，则周的位置填写？。　　主要是由于日期跟周是有重复的所以两者必须有一者设置为？
     　　- 表示区间。小时设置为10-12表示10,11,12点均会触发。
     　　，表示多个值。 小时设置成10,12表示10点和12点会触发。
     　　/ 表示递增触发。 5/15表示从第5秒开始，每隔15秒触发。
     　　L 表示最后的意思。 日上表示最后一天。星期上表示星期六或7。 L前加数据，表示该数据的最后一个。
     　　　　 星期上设置6L表示最后一个星期五。  6表示星期五
     　　W表示离指定日期最近的工作日触发。15W离该月15号最近的工作日触发。
     　　#表示每月的第几个周几。 6#3表示该月的第三个周五。
     */

    @Override
    @Scheduled(cron = "* 0/10 * * * ?")
    public void EsAndMySqlSynchronize() {

    }



}
