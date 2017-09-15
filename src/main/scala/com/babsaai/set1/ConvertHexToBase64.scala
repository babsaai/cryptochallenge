package com.babsaai.set1

import java.nio.charset.StandardCharsets

object ConvertHexToBase64 {

  def hex2bytes(hex: String): Array[Byte] = {
    hex.replaceAll("[^0-9A-Fa-f]", "").sliding(2, 2).toArray.map(Integer.parseInt(_, 16).toByte)
  }
  
  def bytes2hex(bytes: Array[Byte]) = {
    bytes.map("%02X" format _).mkString.toLowerCase()
  }
  
  def byteToBase64(bytes: Array[Byte]): String = {
    java.util.Base64.getEncoder.encodeToString(bytes)
  }

  def convert(a: String): String = {
    byteToBase64(hex2bytes(a))
  }
  
}