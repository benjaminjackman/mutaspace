package controllers

import play.api.mvc.{Action, Controller}


//////////////////////////////////////////////////////////////
// Copyright (c) 2014 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
// Created by bjackman @ 6/6/14 12:31 AM
//////////////////////////////////////////////////////////////


object MainController extends Controller {

  def mainPage() = Action {Ok(views.html.mainPage("DOGE EDITION!"))}
  def tal() = Action {Ok(views.html.apps.tal())}

}