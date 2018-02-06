package org.bobchain

import java.time.Instant

import org.scalatest.FunSuite

class JsonUtilsTest extends FunSuite {

  test("json should not be null") {
    val block = new Block(index = 1, previousHash = "any", proof = 1, time = Instant.ofEpochSecond(0), transactions = Vector.empty)
    val json = JsonUtils.toJson(block)
    println("json string of block: " + json)
    assert(json != null)
  }
}
