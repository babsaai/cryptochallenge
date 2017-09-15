package com.babsaai.set1

import org.scalatest.FlatSpec

class SingleByteXORCipherSpec extends FlatSpec {
  
  it should "work with the example" in {
    val a = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736"
    
    val decrypted = SingleByteXORCipher.decrypt(a)
    
    println(decrypted)
  }
  
}