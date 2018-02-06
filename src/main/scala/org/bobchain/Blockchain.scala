package org.bobchain

import java.time.Instant
import javax.sound.midi.Receiver

/**
  * Is responsible for managing the chain.
  *
  * This whole project follows closely the article: https://hackernoon.com/learn-blockchains-by-building-one-117428612f46
  * (a tutorial for python ... we try to do it in scala ;-)
  *
  * NOTE: This class is not threadsafe at all! Just for learning purposes for the moment ;-)
  */
class Blockchain {

  var currentTransactions: Vector[Transaction] = Vector.empty
  var chain: Vector[Block] = Vector.empty

  newBlock(0, "genesis")

  /**
    * Creates a new Block and adds it to the chain
    *
    * @param proof        the proof given by the proof of work algorithm
    * @param previousHash the hash of the previous block
    * @return the new block
    */
  def newBlock(proof: Long, previousHash: String): Block = {
    val block = new Block(index = chain.length + 1, time = Instant.now(), transactions = currentTransactions, proof = proof, previousHash = previousHash)

    /* Resetting the current transactions! */
    this.currentTransactions = Vector.empty

    this.chain = this.chain :+ block
    return block
  }

  /**
    * Creates a new transaction which will go into the next mined block.
    *
    * @param sender   the address who sends the given amount
    * @param receiver the address to which the amount will be sent
    * @param amount   the amount which will be transferred between sender and receiver
    * @return the index of the block that will hold this transaction
    */
  def newTransaction(sender: Address, receiver: Address, amount: Amount): Int = {
    val transaction = new Transaction(sender, receiver, amount)
    this.currentTransactions = currentTransactions :+ transaction
    return lastBlock().index + 1
  }

  /**
    * Returns the last block in the chain
    *
    * @return
    */
  def lastBlock(): Block = {
    this.chain.last
  }


}
