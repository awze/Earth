package planet

import scala.concurrent._, duration._
import core.Weather

object Earth extends App {
  val w = Await.result(Weather.weather, 10.seconds)
  println(s"Hellow! The weather in New York is $w.")
  Weather.http.close()
}
