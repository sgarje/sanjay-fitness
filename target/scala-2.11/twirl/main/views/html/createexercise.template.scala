
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

class createexercise extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Exercise],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Exercise])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.data.Form
import play.api.i18n.Messages

Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Create a New Exercise</title>
</head>
<body>
<form name="exercise_form" action="/exercise/create" method="POST">
    <div>
        <label id="name_label" for="name">Name:</label>
        <input name="name" value=""""),_display_(/*14.36*/form("name")/*14.48*/.value),format.raw/*14.54*/(""""/>
        """),_display_(/*15.10*/for(error <- form.errors("name")) yield /*15.43*/ {_display_(Seq[Any](format.raw/*15.45*/("""
           """),format.raw/*16.12*/("""<span style="color : red">"""),_display_(/*16.39*/messages(error.message)),format.raw/*16.62*/("""</span>
        """)))}),format.raw/*17.10*/("""
    """),format.raw/*18.5*/("""</div>
    <div>
        <label id="minutes_label" for="minutes">Minutes:</label>
        <input name="minutes" value=""""),_display_(/*21.39*/form("minutes")/*21.54*/.value),format.raw/*21.60*/(""""/>
        """),_display_(/*22.10*/for(error <- form.errors("minutes")) yield /*22.46*/ {_display_(Seq[Any](format.raw/*22.48*/("""
            """),format.raw/*23.13*/("""<span style="color : red">"""),_display_(/*23.40*/messages(error.message)),format.raw/*23.63*/("""</span>
        """)))}),format.raw/*24.10*/("""
    """),format.raw/*25.5*/("""</div>
    <input id="submit" name="submit" type="submit" value="Create"/>
</form>
</body>
</html>"""))
      }
    }
  }

  def render(form:Form[Exercise],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(form)(messages)

  def f:((Form[Exercise]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (form) => (messages) => apply(form)(messages)

  def ref: this.type = this

}


}

/**/
object createexercise extends createexercise_Scope0.createexercise
              /*
                  -- GENERATED --
                  DATE: Thu Jul 02 14:18:54 PDT 2015
                  SOURCE: C:/Training/Scala/projects/sanjay-fitness/app/views/createexercise.scala.html
                  HASH: 1ff221b4c7709f6f3e1430bde4a27a3898f7006e
                  MATRIX: 562->1|763->52|791->114|819->116|1110->380|1131->392|1158->398|1199->412|1248->445|1288->447|1329->460|1383->487|1427->510|1476->528|1509->534|1659->657|1683->672|1710->678|1751->692|1803->728|1843->730|1885->744|1939->771|1983->794|2032->812|2065->818
                  LINES: 20->1|26->1|27->4|28->5|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|41->18|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|48->25
                  -- GENERATED --
              */
          