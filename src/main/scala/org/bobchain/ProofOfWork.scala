package org.bobchain

/**
  * Represents a proof of work, that depends on the proof of work of the previous block.
  */
trait ProofOfWork {

  def findProof(lastProof : Int): Int

  def isFulfilled(lastProof: Int, proof: Int): Boolean

}
