package controllers

import javax.inject.Inject

import models.Exercise
import play.api.data.Form
import play.api.data.Forms._
import play.api.db.Database
import play.api.i18n._
import play.api.mvc._

/**
 * Created by M632144 on 7/1/2015.
 */
class FitnessController @Inject() (val messagesApi:MessagesApi, val db:Database) extends Controller with I18nSupport {

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
      "name" -> nonEmptyText,
      "minutes" -> number.verifying("Too Much Exercise", (x:Int) => x < 120) //number
    )(Exercise.apply)(Exercise.unapply)
  )

  def initExercise = Action {
    Ok(views.html.createexercise(exerciseForm))
  }

  def createExercise = Action { implicit request =>
    exerciseForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.createexercise(formWithErrors))
      },
      exercise => {
        val result = db.withConnection { connection =>
          val ps = connection.prepareStatement("INSERT INTO EXERCISE (name, minutes) VALUES (?,?)")
          ps.setString(1, exercise.name)
          ps.setInt(2, exercise.minutes)
          ps.execute()

        }

        Ok("Received exercise for %s".format(exercise))
      }
    )
  }

  def listExercises = Action {implicit request =>
    val list = db.withConnection { connection =>
      val ps = connection.prepareStatement("select name, minutes from EXERCISE")
      val resultSet = ps.executeQuery()
      import collection._
      val mutableList = mutable.MutableList.empty[Exercise]
      while(resultSet.next()) {
        val name = resultSet.getString("name")
        val minutes = resultSet.getInt("minutes")
        mutableList += new Exercise(name, minutes)
      }
      mutableList.toList
    }
    Ok(views.html.listexercises(list))
  }

}