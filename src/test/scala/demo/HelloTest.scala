package demo

import org.scalatest.FunSuite

/**
 * Created by samirmarin on 15-06-10.
 */
class HelloTest extends FunSuite {
  test("sayHello method works correctly"){
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }

}
