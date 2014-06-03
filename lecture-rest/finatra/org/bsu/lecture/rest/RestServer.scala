package org.bsu.lecture.rest

import com.twitter.finatra.{FinatraServer, Controller}
import org.bsu.lecture.rest.entities.{User, Credentials, Course}

class RestServer extends Controller{

  get("/lecture") { request =>
    val id = request.params.getOrElse("id", "")
    val json = null
    //json = LectureNotes.getLecture(id)
    render.json(json).toFuture
  }

  post("/lecture") { request =>
    val subject = request.params.getOrElse("subject", "")
    val year = request.params.getOrElse("year", "")
    val holderId = request.params.getOrElse("holderId", "")
    val isAutumn = request.params.getOrElse("isAutumn", "")
    val courseNumber = request.params.getOrElse("courseNumber", "")
    val university = request.params.getOrElse("university", "")
    val userEmail = request.params.getOrElse("userEmail", "")
    val password = request.params.getOrElse("password", "")

    val credentials = new Credentials(userEmail, password)
    val course = new Course(subject, year.toLong, isAutumn.toBoolean, courseNumber.toShort, university, holderId)
    val result = null
    //result = LectureNotes.createLecture(course, credentials)
    render.plain(result).toFuture
  }

  delete("/like") {request =>
    val userEmail = request.params.getOrElse("userEmail", "")
    val password = request.params.getOrElse("password", "")
    val lectureId = request.params.getOrElse("lectureId", "")

    val credentials = new Credentials(userEmail, password)

    val result = null
    //result = Like.unsetLike(credentials, lectureId)
    render.plain(result).toFuture
  }

  post("/like") {request =>
    val userEmail = request.params.getOrElse("userEmail", "")
    val password = request.params.getOrElse("password", "")
    val lectureId = request.params.getOrElse("lectureId", "")

    if (!userEmail.isEmpty() && !password.isEmpty() && !lectureId.isEmpty()) {
      render.plain("true").toFuture
    } else {
      render.plain("some error").toFuture
    }
  }

  get("/user") {request =>
    val userEmail = request.params.getOrElse("userEmail", "")
    if (!userEmail.isEmpty() && userEmail.equals("user@gmail.com")) {
      render.json(new User("user", "user@gmail.com", "avatar.jpg")).toFuture
    } else {
      render.plain("not found").toFuture
    }
  }
}

object App extends FinatraServer {
  register(new RestServer())
}
