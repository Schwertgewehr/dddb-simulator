package com.example

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

object TutorialApp extends JSApp {
  def main(): Unit = {
    val ele = document.createElement("p")
    ele.innerHTML = "hello" + World.toString
    document.body.insertBefore(ele, document.getElementsByName("div")(0))
    // println("hello")
  }
}
