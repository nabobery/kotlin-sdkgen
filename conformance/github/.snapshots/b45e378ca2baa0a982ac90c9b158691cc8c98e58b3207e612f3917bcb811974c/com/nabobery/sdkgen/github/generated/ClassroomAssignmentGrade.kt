package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Grade for a student or groups GitHub Classroom assignment
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/classroom-assignment-grade
 */
@Serializable(with = ClassroomAssignmentGrade.Serializer::class)
public class ClassroomAssignmentGrade(
  /**
   * Name of the assignment
   */
  public val assignmentName: String,
  /**
   * URL of the assignment
   */
  public val assignmentUrl: String,
  /**
   * GitHub username of the student
   */
  public val githubUsername: String,
  /**
   * Number of points available for the assignment
   */
  public val pointsAvailable: Int,
  /**
   * Number of points awarded to the student
   */
  public val pointsAwarded: Int,
  /**
   * Roster identifier of the student
   */
  public val rosterIdentifier: String,
  /**
   * URL of the starter code for the assignment
   */
  public val starterCodeUrl: String,
  /**
   * Name of the student's assignment repository
   */
  public val studentRepositoryName: String,
  /**
   * URL of the student's assignment repository
   */
  public val studentRepositoryUrl: String,
  /**
   * Timestamp of the student's assignment submission
   */
  public val submissionTimestamp: String,
  /**
   * If a group assignment, name of the group the student is in
   */
  public val groupName: String? = null,
) {
  public class Builder {
    private var assignmentNameValue: String? = null

    public var assignmentName: String
      get() = requireNotNull(assignmentNameValue) { "assignmentName is required" }
      set(`value`) {
        assignmentNameValue = value
      }

    private var assignmentUrlValue: String? = null

    public var assignmentUrl: String
      get() = requireNotNull(assignmentUrlValue) { "assignmentUrl is required" }
      set(`value`) {
        assignmentUrlValue = value
      }

    private var githubUsernameValue: String? = null

    public var githubUsername: String
      get() = requireNotNull(githubUsernameValue) { "githubUsername is required" }
      set(`value`) {
        githubUsernameValue = value
      }

    private var pointsAvailableValue: Int? = null

    public var pointsAvailable: Int
      get() = requireNotNull(pointsAvailableValue) { "pointsAvailable is required" }
      set(`value`) {
        pointsAvailableValue = value
      }

    private var pointsAwardedValue: Int? = null

    public var pointsAwarded: Int
      get() = requireNotNull(pointsAwardedValue) { "pointsAwarded is required" }
      set(`value`) {
        pointsAwardedValue = value
      }

    private var rosterIdentifierValue: String? = null

    public var rosterIdentifier: String
      get() = requireNotNull(rosterIdentifierValue) { "rosterIdentifier is required" }
      set(`value`) {
        rosterIdentifierValue = value
      }

    private var starterCodeUrlValue: String? = null

    public var starterCodeUrl: String
      get() = requireNotNull(starterCodeUrlValue) { "starterCodeUrl is required" }
      set(`value`) {
        starterCodeUrlValue = value
      }

    private var studentRepositoryNameValue: String? = null

    public var studentRepositoryName: String
      get() = requireNotNull(studentRepositoryNameValue) { "studentRepositoryName is required" }
      set(`value`) {
        studentRepositoryNameValue = value
      }

    private var studentRepositoryUrlValue: String? = null

    public var studentRepositoryUrl: String
      get() = requireNotNull(studentRepositoryUrlValue) { "studentRepositoryUrl is required" }
      set(`value`) {
        studentRepositoryUrlValue = value
      }

    private var submissionTimestampValue: String? = null

    public var submissionTimestamp: String
      get() = requireNotNull(submissionTimestampValue) { "submissionTimestamp is required" }
      set(`value`) {
        submissionTimestampValue = value
      }

    /**
     * If a group assignment, name of the group the student is in
     */
    public var groupName: String? = null

    public fun build(): ClassroomAssignmentGrade {
      check(assignmentNameValue != null) { "assignmentName is required" }
      check(assignmentUrlValue != null) { "assignmentUrl is required" }
      check(githubUsernameValue != null) { "githubUsername is required" }
      check(pointsAvailableValue != null) { "pointsAvailable is required" }
      check(pointsAwardedValue != null) { "pointsAwarded is required" }
      check(rosterIdentifierValue != null) { "rosterIdentifier is required" }
      check(starterCodeUrlValue != null) { "starterCodeUrl is required" }
      check(studentRepositoryNameValue != null) { "studentRepositoryName is required" }
      check(studentRepositoryUrlValue != null) { "studentRepositoryUrl is required" }
      check(submissionTimestampValue != null) { "submissionTimestamp is required" }
      return ClassroomAssignmentGrade(
        assignmentName = assignmentName,
        assignmentUrl = assignmentUrl,
        githubUsername = githubUsername,
        pointsAvailable = pointsAvailable,
        pointsAwarded = pointsAwarded,
        rosterIdentifier = rosterIdentifier,
        starterCodeUrl = starterCodeUrl,
        studentRepositoryName = studentRepositoryName,
        studentRepositoryUrl = studentRepositoryUrl,
        submissionTimestamp = submissionTimestamp,
        groupName = groupName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ClassroomAssignmentGrade = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ClassroomAssignmentGrade> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ClassroomAssignmentGrade {
      val jsonDecoder = decoder.requireJsonDecoder("ClassroomAssignmentGrade")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ClassroomAssignmentGrade must be a JSON object")
      val assignmentName = json.decodeRequired<String>(rawObject, "assignment_name")
      val assignmentUrl = json.decodeRequired<String>(rawObject, "assignment_url")
      val githubUsername = json.decodeRequired<String>(rawObject, "github_username")
      val pointsAvailable = json.decodeRequired<Int>(rawObject, "points_available")
      val pointsAwarded = json.decodeRequired<Int>(rawObject, "points_awarded")
      val rosterIdentifier = json.decodeRequired<String>(rawObject, "roster_identifier")
      val starterCodeUrl = json.decodeRequired<String>(rawObject, "starter_code_url")
      val studentRepositoryName = json.decodeRequired<String>(rawObject, "student_repository_name")
      val studentRepositoryUrl = json.decodeRequired<String>(rawObject, "student_repository_url")
      val submissionTimestamp = json.decodeRequired<String>(rawObject, "submission_timestamp")
      return ClassroomAssignmentGrade(
        assignmentName = assignmentName,
        assignmentUrl = assignmentUrl,
        githubUsername = githubUsername,
        pointsAvailable = pointsAvailable,
        pointsAwarded = pointsAwarded,
        rosterIdentifier = rosterIdentifier,
        starterCodeUrl = starterCodeUrl,
        studentRepositoryName = studentRepositoryName,
        studentRepositoryUrl = studentRepositoryUrl,
        submissionTimestamp = submissionTimestamp,
        groupName = rawObject["group_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ClassroomAssignmentGrade) {
      val jsonEncoder = encoder.requireJsonEncoder("ClassroomAssignmentGrade")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assignment_name", value.assignmentName)
        put("assignment_url", value.assignmentUrl)
        put("github_username", value.githubUsername)
        put("points_available", json.encodeToJsonElement(value.pointsAvailable))
        put("points_awarded", json.encodeToJsonElement(value.pointsAwarded))
        put("roster_identifier", value.rosterIdentifier)
        put("starter_code_url", value.starterCodeUrl)
        put("student_repository_name", value.studentRepositoryName)
        put("student_repository_url", value.studentRepositoryUrl)
        put("submission_timestamp", value.submissionTimestamp)
        value.groupName?.let { put("group_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun classroomAssignmentGrade(block: ClassroomAssignmentGrade.Builder.() -> Unit): ClassroomAssignmentGrade = ClassroomAssignmentGrade.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ClassroomAssignmentGrade is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
