package com.babsaai.set1

object FixedXOR {

  def xorHexes(a: String, b: String): String = {
    val aa = ConvertHexToBase64.hex2bytes(a)
    val bb = ConvertHexToBase64.hex2bytes(b)
    
    val xored: Array[Byte] = for ((a1, b1) <- (aa zip bb)) yield (a1^b1).toByte 
    
    ConvertHexToBase64.bytes2hex(xored)
  }
}