package example

import org.scalatest.flatspec.AnyFlatSpec

class AdderSpec extends AnyFlatSpec {
  "Calling native methods in tests" should "work" in {
    assert(new Adder(12).plus(34) == 46)
  }
}
