package org.bobchain

import com.roundeights.hasher.Digest
import org.scalatest.FunSuite

/**
  * This is not really a test, but just trying to implement the example given also on the hackernoon website
  * to get my mind around proof of work.
  */
class ProofOfWorkPrincipleTest extends FunSuite {

  val x: Int = 5

  test("evaluate simplistic proof of work") {
    /*
     Lets assume we have a number x. Now we want to find a number y, for which the sha256 hash ends in 0 (last hex digit)
     */
    var y: Int = 0

    while (!fulfillsProof(y)) {
      y += 1
    }
    println("proof: %d; hash of product x*y: %s; fulfills proof: %s".format(y, hashOf(x * y), fulfillsProof(y)))

  }

  private def fulfillsProof(y: Int): Boolean = {
    val hash = hashOf(x * y)
    hash.endsWith("0")
  }

  private def hashOf(product: Int): String = {
    Blockchains.hashOf(product.toString)
  }
}
