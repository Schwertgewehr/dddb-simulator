package com.dss.dddbs.model.data

trait Data {
  type Percent = Int
  def upperThreshold: Int
  def lowerThreshold: Int
  def increase: Percent
  def decrease: Percent
}
