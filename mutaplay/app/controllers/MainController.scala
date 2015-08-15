package controllers

import play.api.mvc.{Action, Controller}


//////////////////////////////////////////////////////////////
// Copyright (c) 2014 Ben Jackman
// All Rights Reserved
// please contact ben@jackman.biz
// for licensing inquiries
// Created by bjackman @ 6/6/14 12:31 AM
//////////////////////////////////////////////////////////////


object MainController extends Controller {
  def tal = Action {Ok(views.html.apps.tal(false))}
  def lab = Action {Ok(views.html.apps.lab())}
}