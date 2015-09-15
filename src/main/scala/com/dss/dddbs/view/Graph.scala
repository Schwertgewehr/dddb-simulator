package com.dss.dddbs.view

import org.scalajs.dom.raw.{HTMLCanvasElement, HTMLDocument}

class Graph(document: HTMLDocument) {

  val canvas: HTMLCanvasElement = initCanvas

  private def initCanvas = {
    val canvas = document.createElement("canvas").asInstanceOf[HTMLCanvasElement]
    canvas.setAttribute("width", "640")
    canvas.setAttribute("height", "480")
    canvas
  }

  def build(): Graph = {
    document.body.insertBefore(canvas, document.getElementsByName("script")(0))
    this
  }


  def drawLine(from: (Int, Int), to: (Int, Int)) {
    val context = canvas.getContext("2d")
    context.beginPath()
    context.moveTo(from._1, from._2)
    context.lineTo(to._1, to._2)
    context.closePath()
    context.stroke()
  }
}
