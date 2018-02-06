package org.bobchain

object Blockchains {

  /**
    * Cretates a SHA-256 hash string for the given block.
    *
    * NOTE: This is by far not a good hashing method and potentially, ... but for the moment we do not care ;-
    *
    * @param block the block for which to create the hash
    * @return the hash string for the block
    */
  def hash(block: Block): String = {
    /*
        XXX This for sure is brittle ... especially as we pass in all raw objects and no care is
        taken about the order of the fields ...
        So this might break easily and not provide reproducible hashes ;-) ... to be revisited
    */
    val blockString = JsonUtils.toJson(block)

    import com.roundeights.hasher.Implicits._
    blockString.sha256
  }

}
