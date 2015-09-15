package com.dss.dddbs.view

import org.scalajs.dom.Event
import org.scalajs.dom.raw.{HTMLInputElement, HTMLDocument}


class Text(document: HTMLDocument, id: String) {
  val input: HTMLInputElement = document.getElementById(id).asInstanceOf[HTMLInputElement]

  def onchange(f: Event => Unit) {
    input.onchange = f
  }
}
