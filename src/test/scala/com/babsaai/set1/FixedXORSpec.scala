package com.babsaai.set1

import org.scalatest.FlatSpec

class FixedXORSpec extends FlatSpec {
  
  it should "work with the examples" in {
    val a = "1c0111001f010100061a024b53535009181c"
    val b = "686974207468652062756c6c277320657965"
    
    val actual = FixedXOR.xorHexes(a, b)
    val expected = "746865206b696420646f6e277420706c6179"
    
    assert(expected == actual)
  }
  
}