package com.africastalking.examples.token

import com.africastalking.examples.TApiExamples
import com.africastalking.token.TokenService

import scala.concurrent.ExecutionContext.Implicits.global

object TokenServiceExample extends TApiExamples {

  def main(args: Array[String]): Unit = {
    createCheckoutToken()
  }

  private def generateAuthToken() {
    TokenService
      .generateAuthToken
      .onComplete(processResult)
  }

  private def createCheckoutToken() {
    TokenService
      .createCheckoutToken("+2348120157832")
      .onComplete(processResult)
  }
}
