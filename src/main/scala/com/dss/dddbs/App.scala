package com.dss.dddbs

import com.dss.dddbs.model.data.Data
import com.dss.dddbs.view.View

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

object App extends JSApp {
  def main() {
    new View(document).update(Data(
      upperThreshold = 90,
      decrease = 50,
      increase = 50,
      lowerThreshold = 40
    ))
  }
}
