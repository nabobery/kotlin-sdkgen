package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A GitHub Classroom assignment
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/classroom-assignment
 */
@Serializable(with = ClassroomAssignment.Serializer::class)
public class ClassroomAssignment(
  /**
   * The number of students that have accepted the assignment.
   */
  public val accepted: Int,
  public val classroom: Classroom,
  /**
   * The time at which the assignment is due.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deadline: String?,
  /**
   * The selected editor for the assignment.
   */
  public val editor: String,
  /**
   * Whether feedback pull request will be created when a student accepts the assignment.
   */
  public val feedbackPullRequestsEnabled: Boolean,
  /**
   * Unique identifier of the repository.
   */
  public val id: Int,
  /**
   * Whether the invitation link is enabled. Visiting an enabled invitation link will accept the assignment.
   */
  public val invitationsEnabled: Boolean,
  /**
   * The link that a student can use to accept the assignment.
   */
  public val inviteLink: String,
  /**
   * The programming language used in the assignment.
   */
  public val language: String,
  /**
   * The maximum allowable members per team.
   */
  public val maxMembers: Int?,
  /**
   * The maximum allowable teams for the assignment.
   */
  public val maxTeams: Int?,
  /**
   * The number of students that have passed the assignment.
   */
  public val passing: Int,
  /**
   * Whether an accepted assignment creates a public repository.
   */
  public val publicRepo: Boolean,
  /**
   * Sluggified name of the assignment.
   */
  public val slug: String,
  public val starterCodeRepository: SimpleClassroomRepository,
  /**
   * Whether students are admins on created repository when a student accepts the assignment.
   */
  public val studentsAreRepoAdmins: Boolean,
  /**
   * The number of students that have submitted the assignment.
   */
  public val submitted: Int,
  /**
   * Assignment title.
   */
  public val title: String,
  /**
   * Whether it's a group assignment or individual assignment.
   */
  public val type: InlineClassroomAssignmentTypeXa6208087,
) {
  public class Builder {
    private var acceptedValue: Int? = null

    public var accepted: Int
      get() = requireNotNull(acceptedValue) { "accepted is required" }
      set(`value`) {
        acceptedValue = value
      }

    private var classroomValue: Classroom? = null

    public var classroom: Classroom
      get() = requireNotNull(classroomValue) { "classroom is required" }
      set(`value`) {
        classroomValue = value
      }

    private var editorValue: String? = null

    public var editor: String
      get() = requireNotNull(editorValue) { "editor is required" }
      set(`value`) {
        editorValue = value
      }

    private var feedbackPullRequestsEnabledValue: Boolean? = null

    public var feedbackPullRequestsEnabled: Boolean
      get() = requireNotNull(feedbackPullRequestsEnabledValue) { "feedbackPullRequestsEnabled is required" }
      set(`value`) {
        feedbackPullRequestsEnabledValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var invitationsEnabledValue: Boolean? = null

    public var invitationsEnabled: Boolean
      get() = requireNotNull(invitationsEnabledValue) { "invitationsEnabled is required" }
      set(`value`) {
        invitationsEnabledValue = value
      }

    private var inviteLinkValue: String? = null

    public var inviteLink: String
      get() = requireNotNull(inviteLinkValue) { "inviteLink is required" }
      set(`value`) {
        inviteLinkValue = value
      }

    private var languageValue: String? = null

    public var language: String
      get() = requireNotNull(languageValue) { "language is required" }
      set(`value`) {
        languageValue = value
      }

    private var passingValue: Int? = null

    public var passing: Int
      get() = requireNotNull(passingValue) { "passing is required" }
      set(`value`) {
        passingValue = value
      }

    private var publicRepoValue: Boolean? = null

    public var publicRepo: Boolean
      get() = requireNotNull(publicRepoValue) { "publicRepo is required" }
      set(`value`) {
        publicRepoValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var starterCodeRepositoryValue: SimpleClassroomRepository? = null

    public var starterCodeRepository: SimpleClassroomRepository
      get() = requireNotNull(starterCodeRepositoryValue) { "starterCodeRepository is required" }
      set(`value`) {
        starterCodeRepositoryValue = value
      }

    private var studentsAreRepoAdminsValue: Boolean? = null

    public var studentsAreRepoAdmins: Boolean
      get() = requireNotNull(studentsAreRepoAdminsValue) { "studentsAreRepoAdmins is required" }
      set(`value`) {
        studentsAreRepoAdminsValue = value
      }

    private var submittedValue: Int? = null

    public var submitted: Int
      get() = requireNotNull(submittedValue) { "submitted is required" }
      set(`value`) {
        submittedValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var typeValue: InlineClassroomAssignmentTypeXa6208087? = null

    public var type: InlineClassroomAssignmentTypeXa6208087
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var deadlineState: FieldState<String?> = FieldState.Absent

    /**
     * The time at which the assignment is due.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var deadline: String?
      get() = deadlineState.valueOrNull()
      set(`value`) {
        deadlineState = value.toNullableFieldState()
      }

    private var maxMembersState: FieldState<Int?> = FieldState.Absent

    /**
     * The maximum allowable members per team.
     * Required nullable field; assigning `null` records present-null.
     */
    public var maxMembers: Int?
      get() = maxMembersState.valueOrNull()
      set(`value`) {
        maxMembersState = value.toNullableFieldState()
      }

    private var maxTeamsState: FieldState<Int?> = FieldState.Absent

    /**
     * The maximum allowable teams for the assignment.
     * Required nullable field; assigning `null` records present-null.
     */
    public var maxTeams: Int?
      get() = maxTeamsState.valueOrNull()
      set(`value`) {
        maxTeamsState = value.toNullableFieldState()
      }

    public fun build(): ClassroomAssignment {
      check(acceptedValue != null) { "accepted is required" }
      check(classroomValue != null) { "classroom is required" }
      check(editorValue != null) { "editor is required" }
      check(feedbackPullRequestsEnabledValue != null) { "feedbackPullRequestsEnabled is required" }
      check(idValue != null) { "id is required" }
      check(invitationsEnabledValue != null) { "invitationsEnabled is required" }
      check(inviteLinkValue != null) { "inviteLink is required" }
      check(languageValue != null) { "language is required" }
      check(passingValue != null) { "passing is required" }
      check(publicRepoValue != null) { "publicRepo is required" }
      check(slugValue != null) { "slug is required" }
      check(starterCodeRepositoryValue != null) { "starterCodeRepository is required" }
      check(studentsAreRepoAdminsValue != null) { "studentsAreRepoAdmins is required" }
      check(submittedValue != null) { "submitted is required" }
      check(titleValue != null) { "title is required" }
      check(typeValue != null) { "type is required" }
      check(deadlineState !== FieldState.Absent) { "deadline is required, even when null" }
      check(maxMembersState !== FieldState.Absent) { "maxMembers is required, even when null" }
      check(maxTeamsState !== FieldState.Absent) { "maxTeams is required, even when null" }
      return ClassroomAssignment(
        accepted = accepted,
        classroom = classroom,
        deadline = deadlineState.valueOrNull(),
        editor = editor,
        feedbackPullRequestsEnabled = feedbackPullRequestsEnabled,
        id = id,
        invitationsEnabled = invitationsEnabled,
        inviteLink = inviteLink,
        language = language,
        maxMembers = maxMembersState.valueOrNull(),
        maxTeams = maxTeamsState.valueOrNull(),
        passing = passing,
        publicRepo = publicRepo,
        slug = slug,
        starterCodeRepository = starterCodeRepository,
        studentsAreRepoAdmins = studentsAreRepoAdmins,
        submitted = submitted,
        title = title,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ClassroomAssignment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ClassroomAssignment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ClassroomAssignment {
      val jsonDecoder = decoder.requireJsonDecoder("ClassroomAssignment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ClassroomAssignment must be a JSON object")
      val accepted = json.decodeRequired<Int>(rawObject, "accepted")
      val classroom = json.decodeRequired<Classroom>(rawObject, "classroom")
      val editor = json.decodeRequired<String>(rawObject, "editor")
      val feedbackPullRequestsEnabled = json.decodeRequired<Boolean>(rawObject, "feedback_pull_requests_enabled")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val invitationsEnabled = json.decodeRequired<Boolean>(rawObject, "invitations_enabled")
      val inviteLink = json.decodeRequired<String>(rawObject, "invite_link")
      val language = json.decodeRequired<String>(rawObject, "language")
      val passing = json.decodeRequired<Int>(rawObject, "passing")
      val publicRepo = json.decodeRequired<Boolean>(rawObject, "public_repo")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val starterCodeRepository = json.decodeRequired<SimpleClassroomRepository>(rawObject, "starter_code_repository")
      val studentsAreRepoAdmins = json.decodeRequired<Boolean>(rawObject, "students_are_repo_admins")
      val submitted = json.decodeRequired<Int>(rawObject, "submitted")
      val title = json.decodeRequired<String>(rawObject, "title")
      val type = json.decodeRequired<InlineClassroomAssignmentTypeXa6208087>(rawObject, "type")
      if (!rawObject.containsKey("deadline")) {
        throw SerializationException("ClassroomAssignment is missing required property 'deadline'")
      }
      val deadline = rawObject["deadline"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("max_members")) {
        throw SerializationException("ClassroomAssignment is missing required property 'max_members'")
      }
      val maxMembers = rawObject["max_members"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("max_teams")) {
        throw SerializationException("ClassroomAssignment is missing required property 'max_teams'")
      }
      val maxTeams = rawObject["max_teams"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return ClassroomAssignment(
        accepted = accepted,
        classroom = classroom,
        deadline = deadline,
        editor = editor,
        feedbackPullRequestsEnabled = feedbackPullRequestsEnabled,
        id = id,
        invitationsEnabled = invitationsEnabled,
        inviteLink = inviteLink,
        language = language,
        maxMembers = maxMembers,
        maxTeams = maxTeams,
        passing = passing,
        publicRepo = publicRepo,
        slug = slug,
        starterCodeRepository = starterCodeRepository,
        studentsAreRepoAdmins = studentsAreRepoAdmins,
        submitted = submitted,
        title = title,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ClassroomAssignment) {
      val jsonEncoder = encoder.requireJsonEncoder("ClassroomAssignment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("accepted", json.encodeToJsonElement(value.accepted))
        put("classroom", json.encodeToJsonElement(value.classroom))
        put("deadline", value.deadline?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("editor", value.editor)
        put("feedback_pull_requests_enabled", json.encodeToJsonElement(value.feedbackPullRequestsEnabled))
        put("id", json.encodeToJsonElement(value.id))
        put("invitations_enabled", json.encodeToJsonElement(value.invitationsEnabled))
        put("invite_link", value.inviteLink)
        put("language", value.language)
        put("max_members", value.maxMembers?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("max_teams", value.maxTeams?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("passing", json.encodeToJsonElement(value.passing))
        put("public_repo", json.encodeToJsonElement(value.publicRepo))
        put("slug", value.slug)
        put("starter_code_repository", json.encodeToJsonElement(value.starterCodeRepository))
        put("students_are_repo_admins", json.encodeToJsonElement(value.studentsAreRepoAdmins))
        put("submitted", json.encodeToJsonElement(value.submitted))
        put("title", value.title)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun classroomAssignment(block: ClassroomAssignment.Builder.() -> Unit): ClassroomAssignment = ClassroomAssignment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ClassroomAssignment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("ClassroomAssignment property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
