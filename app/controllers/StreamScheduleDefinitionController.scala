package controllers

import javax.inject._
import io.swagger.annotations.{ Api, ApiOperation }
import models.{ StreamScheduleDefinition, UniverseConfiguration }
import play.api.mvc.{ AbstractController, ControllerComponents }
import play.api.libs.json._

@Api(value = "/stream-schedule-definition")
class StreamScheduleDefinitionController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  @ApiOperation(
    nickname = "getAllStreamScheduleDefinitions",
    value = "Get all streamScheduleDefinitions object by id.",
    notes = "Returns a streamScheduleDefinition",
    response = classOf[String],
    httpMethod = "GET",
  )
  def getAllStreamScheduleDefinitions() = Action {
    val strSchDef = List()
    Ok(views.html.hello(strSchDef.toString))
  }

  @ApiOperation(
    nickname = "getStreamScheduleDefinition",
    value = "Get streamScheduleDefinition object by id.",
    notes = "Returns a streamScheduleDefinition",
    response = classOf[String],
    httpMethod = "GET",
  )
  def getStreamScheduleDefinition(id: Int) = Action {
    val strSchDef = StreamScheduleDefinition(id)
    Ok(strSchDef.toString)
  }

  @ApiOperation(
    nickname = "updateStreamScheduleDefinition",
    value = "Update streamScheduleDefinition object by id.",
    notes = "Returns a streamScheduleDefinition",
    response = classOf[String],
    httpMethod = "POST",
  )
  def updateStreamScheduleDefinition = Action { request =>
    request.body.asJson.map { json =>
      (json \ "name").asOpt[String].map { name =>
        Ok("Hello " + name)
      }.getOrElse {
        BadRequest("Missing parameter [name]")
      }
    }.getOrElse {
      BadRequest("Expecting Json data")
    }
  }
}
