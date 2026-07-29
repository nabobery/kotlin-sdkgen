package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * A GitHub Classroom accepted assignment
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/classroom-accepted-assignment
 */
@Serializable(with = ClassroomAcceptedAssignment.Serializer::class)
public class ClassroomAcceptedAssignment(
  public val assignment: SimpleClassroomAssignment,
  /**
   * Count of student commits.
   */
  public val commitCount: Int,
  /**
   * Most recent grade.
   */
  public val grade: String,
  /**
   * Unique identifier of the repository.
   */
  public val id: Int,
  /**
   * Whether a submission passed.
   */
  public val passing: Boolean,
  public val repository: SimpleClassroomRepository,
  students: List<SimpleClassroomUser>,
  /**
   * Whether an accepted assignment has been submitted.
   */
  public val submitted: Boolean,
) {
  public val students: List<SimpleClassroomUser> = students.toList()

  public class Builder {
    private var assignmentValue: SimpleClassroomAssignment? = null

    public var assignment: SimpleClassroomAssignment
      get() = requireNotNull(assignmentValue) { "assignment is required" }
      set(`value`) {
        assignmentValue = value
      }

    private var commitCountValue: Int? = null

    public var commitCount: Int
      get() = requireNotNull(commitCountValue) { "commitCount is required" }
      set(`value`) {
        commitCountValue = value
      }

    private var gradeValue: String? = null

    public var grade: String
      get() = requireNotNull(gradeValue) { "grade is required" }
      set(`value`) {
        gradeValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var passingValue: Boolean? = null

    public var passing: Boolean
      get() = requireNotNull(passingValue) { "passing is required" }
      set(`value`) {
        passingValue = value
      }

    private var repositoryValue: SimpleClassroomRepository? = null

    public var repository: SimpleClassroomRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var studentsValue: List<SimpleClassroomUser>? = null

    public var students: List<SimpleClassroomUser>
      get() = requireNotNull(studentsValue) { "students is required" }.toList()
      set(`value`) {
        studentsValue = value.toList()
      }

    private var submittedValue: Boolean? = null

    public var submitted: Boolean
      get() = requireNotNull(submittedValue) { "submitted is required" }
      set(`value`) {
        submittedValue = value
      }

    public fun build(): ClassroomAcceptedAssignment {
      check(assignmentValue != null) { "assignment is required" }
      check(commitCountValue != null) { "commitCount is required" }
      check(gradeValue != null) { "grade is required" }
      check(idValue != null) { "id is required" }
      check(passingValue != null) { "passing is required" }
      check(repositoryValue != null) { "repository is required" }
      check(studentsValue != null) { "students is required" }
      check(submittedValue != null) { "submitted is required" }
      return ClassroomAcceptedAssignment(
        assignment = assignment,
        commitCount = commitCount,
        grade = grade,
        id = id,
        passing = passing,
        repository = repository,
        students = students,
        submitted = submitted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ClassroomAcceptedAssignment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ClassroomAcceptedAssignment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ClassroomAcceptedAssignment {
      val jsonDecoder = decoder.requireJsonDecoder("ClassroomAcceptedAssignment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ClassroomAcceptedAssignment must be a JSON object")
      val assignment = json.decodeRequired<SimpleClassroomAssignment>(rawObject, "assignment")
      val commitCount = json.decodeRequired<Int>(rawObject, "commit_count")
      val grade = json.decodeRequired<String>(rawObject, "grade")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val passing = json.decodeRequired<Boolean>(rawObject, "passing")
      val repository = json.decodeRequired<SimpleClassroomRepository>(rawObject, "repository")
      val students = json.decodeRequired<List<SimpleClassroomUser>>(rawObject, "students")
      val submitted = json.decodeRequired<Boolean>(rawObject, "submitted")
      return ClassroomAcceptedAssignment(
        assignment = assignment,
        commitCount = commitCount,
        grade = grade,
        id = id,
        passing = passing,
        repository = repository,
        students = students,
        submitted = submitted,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ClassroomAcceptedAssignment) {
      val jsonEncoder = encoder.requireJsonEncoder("ClassroomAcceptedAssignment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assignment", json.encodeToJsonElement(value.assignment))
        put("commit_count", json.encodeToJsonElement(value.commitCount))
        put("grade", value.grade)
        put("id", json.encodeToJsonElement(value.id))
        put("passing", json.encodeToJsonElement(value.passing))
        put("repository", json.encodeToJsonElement(value.repository))
        put("students", json.encodeToJsonElement(value.students))
        put("submitted", json.encodeToJsonElement(value.submitted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun classroomAcceptedAssignment(block: ClassroomAcceptedAssignment.Builder.() -> Unit): ClassroomAcceptedAssignment = ClassroomAcceptedAssignment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ClassroomAcceptedAssignment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
