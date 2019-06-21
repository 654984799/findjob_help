package com.sun.bigdata.sparkmall.common.util

import java.text.SimpleDateFormat
import java.util.Date

/**
  * title: DateUtil 
  * projectName sparkmall 
  * description: 
  * author Sun-Smile 
  * create 2019-06-21 19:01 
  */
object DateUtil {
  /**
    * 将指定的时间戳转换为时间字符串
    * @param ts
    * @param f
    * @return
    */
  def formatTime( ts:Long, f:String ): String = {
    formatDate(new Date(ts), f)
  }

  def formatDate(d : Date, f:String): String = {
    val sdf = new SimpleDateFormat(f)
    sdf.format(d)
  }
}