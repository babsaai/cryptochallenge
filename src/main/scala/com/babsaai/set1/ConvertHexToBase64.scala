package com.babsaai.set1

import java.nio.charset.StandardCharsets

object ConvertHexToBase64 extends App {

  def hex2bytes(hex: String): Array[Byte] = {
    hex.replaceAll("[^0-9A-Fa-f]", "").sliding(2, 2).toArray.map(Integer.parseInt(_, 16).toByte)
  }
  
  def byteToBase64(bytes: Array[Byte]): String = {
    java.util.Base64.getEncoder.encodeToString(bytes)
  }

  override def main(args: Array[String]): Unit = {
    println(byteToBase64(hex2bytes(args.apply(0))))
  }

}