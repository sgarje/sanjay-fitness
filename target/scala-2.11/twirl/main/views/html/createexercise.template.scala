
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createexercise_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class createexercise extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Exercise],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Exercise]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.data.Form

Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Create a New Exercise</title>
</head>
<body>
<form name="exercise_form" action="/exercise/create" method="POST">
    <div>
        <label id="name_label" for="name">Name:</label>
        <input name="name" value=""""),_display_(/*13.36*/form("name")/*13.48*/.value()),format.raw/*13.56*/(""""/>
    </div>
    <div>
        <label id="minutes_label" for="minutes">Minutes:</label>
        <input name="minutes" value=""""),_display_(/*17.39*/form("minutes")/*17.54*/.value()),format.raw/*17.62*/(""""/>
    </div>
    <input id="submit" name="submit" type="submit" value="Create"/>
</form>
</body>
</html>"""))
      }
    }
  }

  def render(form:Form[Exercise]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Exercise]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


}

/**/
object createexercise extends createexercise_Scope0.createexercise
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 23:29:27 PDT 2015
                  SOURCE: C:/Training/Scala/projects/sanjay-fitness/app/views/createexercise.scala.html
                  HASH: 67a02151e7815c62684c3bd55a80e948c0353e09
                  MATRIX: 553->1|691->23|719->49|747->51|1038->315|1059->327|1088->335|1247->467|1271->482|1300->490
                  LINES: 20->1|25->1|26->3|27->4|36->13|36->13|36->13|40->17|40->17|40->17
                  -- GENERATED --
              */
          