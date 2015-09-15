package com.example

import org.scalajs.dom
import dom.document

object TutorialApp {
  val ele = document.createElement("p")
  ele.innerHTML = "hello" + World.toString
  document.body.insertBefore(ele, document.getElementsByName("div")(0))
  // println("hello")
}
