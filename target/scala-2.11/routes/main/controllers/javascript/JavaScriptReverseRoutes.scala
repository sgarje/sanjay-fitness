
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Training/Scala/projects/sanjay-fitness/conf/routes
// @DATE:Thu Jul 02 15:30:51 PDT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseFitnessController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def listExercises: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FitnessController.listExercises",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listexercises"})
        }
      """
    )
  
    // @LINE:15
    def createExercise: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FitnessController.createExercise",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exercise/create"})
        }
      """
    )
  
    // @LINE:13
    def workoutOfTheDay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FitnessController.workoutOfTheDay",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workoutoftheday"})
        }
      """
    )
  
    // @LINE:10
    def welcome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FitnessController.welcome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "welcome"})
        }
      """
    )
  
    // @LINE:12
    def exerciseOfTheDay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FitnessController.exerciseOfTheDay",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exrciseoftheday"})
        }
      """
    )
  
    // @LINE:11
    def welcomeWithName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FitnessController.welcomeWithName",
      """
        function(name) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "welcome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:14
    def initExercise: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FitnessController.initExercise",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exercise/create"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}