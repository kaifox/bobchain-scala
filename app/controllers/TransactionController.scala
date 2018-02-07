package controllers

import javax.inject.Inject

import play.api.mvc._

class TransactionController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def newTransaction = Action {
    Ok("We will add a new transaction")
  }
}
