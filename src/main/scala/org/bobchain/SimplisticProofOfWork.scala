package org.bobchain

/**
  * The simplistic proof of work as also used in https://hackernoon.com/learn-blockchains-by-building-one-117428612f46
  *
  * - Find a number p' such that hash(pp') contains 4 leading zeroes
  * - p is the previous proof, p' is the new proof
  */
object SimplisticProofOfWork extends ProofOfWork {

  override def findProof(lastProof: Int): Int = {
    var proof = 0
    while (!isFulfilled(lastProof, proof)) {
      proof += 1
    }
    proof
  }

  override def isFulfilled(lastProof: Int, proof: Int): Boolean = {
    val hash = Blockchains.hashOf("%d%d".format(lastProof, proof))
    hash.startsWith("0000")
  }
}
