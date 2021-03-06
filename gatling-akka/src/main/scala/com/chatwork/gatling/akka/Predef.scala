package com.chatwork.gatling.akka

import com.chatwork.gatling.akka.check.AkkaCheckSupport
import com.chatwork.gatling.akka.config.AkkaProtocol
import com.chatwork.gatling.akka.request.AkkaRequestBuilder
import io.gatling.core.config.GatlingConfiguration
import io.gatling.core.session.Expression

object Predef extends AkkaCheckSupport {
  def akkaActor(implicit configuration: GatlingConfiguration) = AkkaProtocol()

  def akkaActor(requestName: Expression[String]): AkkaRequestBuilder = new AkkaRequestBuilder(requestName)

}
