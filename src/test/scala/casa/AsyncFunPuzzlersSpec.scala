package casa

import org.scalatest.AsyncFunSpec
import org.scalatest.Matchers._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Millis, Seconds, Span}

import scala.concurrent.Future

class AsyncFunPuzzlersSpec extends AsyncFunSpec with ScalaFutures {
  describe("Detects the test method returns Future[Assertion] and waits for it, ensuring it is a successful future. " +
    "Unfortunately it can only do it if that's the last thing we do") {
    it("1") {
      Future.successful(3).map{_ shouldBe 4}
      Future.successful(3).map{_ shouldBe 3}
    }

    it("2") {
      Future.successful(3).map{_ shouldBe 4}
      3 shouldBe 3
    }
  }

  describe("I don't know how to make it fail after a while, instead of waiting forever"){
/*
    // Too slow
    it("1"){
      Future[Int]{
        Thread.sleep(1000 * 1000)
        3
      }.map(_ shouldBe 4)
    }
*/

/*
    // Fails, as expected
    it("PatienceConfig is taken into account by whenReady"){
      implicit val patienceConfig: PatienceConfig = PatienceConfig(
        timeout = scaled(Span(5, Seconds)),
        interval = scaled(Span(100, Millis))
      )

      whenReady(Future[Int]{
        Thread.sleep(1000 * 1000)
        3
      }){_ shouldBe 3}
    }
*/

/*
    // Too slow
    it("Unfortunately, PatienceConfig doesn't seem to be taken into account when waiting for the returned Future[Assertion]"){
      implicit val patienceConfig: PatienceConfig = PatienceConfig(
        timeout = scaled(Span(5, Seconds)),
        interval = scaled(Span(100, Millis))
      )

      Future[Int]{
        Thread.sleep(1000 * 1000)
        3
      }.map(_ shouldBe 4)
    }
*/
  }
}
