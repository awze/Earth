import org.scalatest._

class EarthSpec extends FunSuite with DiagrammedAssertions {
   test("Hello should start with H") {
    assert("Hello".startsWith("H"))
  }
}
