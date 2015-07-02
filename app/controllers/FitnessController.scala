package controllers

import models.Exercise
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._

/**
 * Created by M632144 on 7/1/2015.
 */
class FitnessController extends Controller {

  def welcome = Action {
    Ok("Welcome to Sanjay's Fitness")
  }

  def welcomeWithName(name:String) = Action {
    Ok(s"Welcome to Sanjay's Fitness $name! Time to kick some ass")
  }

  def exerciseOfTheDay = Action {
    Ok(views.html.exerciseoftheday(Exercise("Swimming", 60)))
  }

  def workoutOfTheDay = Action {
    val list = List(Exercise("Running Sprints", 10),
      Exercise("Running Light Jog", 20),
      Exercise("Running Sprints", 10),
      Exercise("Cool Down", 10))
    Ok(views.html.workoutoftheday(list))
  }

  val exerciseForm = Form(
    mapping(
      "name" -> text,
      "minutes" -> number
    )(Exercise.apply)(Exercise.unapply)
  )

  def initExercise = Action {
    Ok(views.html.createexercise.render(exerciseForm))
  }

  def createExercise = Action {implicit request =>
    exerciseForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.createexercise(formWithErrors))
      },
      exercise => {
        Ok("Received exercise for %s".format(exercise))
      }
    )
  }
}