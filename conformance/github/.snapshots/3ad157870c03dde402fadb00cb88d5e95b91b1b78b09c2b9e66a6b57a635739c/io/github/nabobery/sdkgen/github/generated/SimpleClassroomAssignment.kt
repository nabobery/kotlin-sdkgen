package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-classroom-assignment
 */
@Serializable(with = SimpleClassroomAssignment.Serializer::class)
public class SimpleClassroomAssignment internal constructor(
  /**
   * The number of students that have accepted the assignment.
   */
  public val accepted: Int,
  public val classroom: SimpleClassroom,
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
   * Whether feedback pull request will be created on assignment acceptance.
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
  /**
   * Whether students are admins on created repository on accepted assignment.
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
   * Whether it's a Group Assignment or Individual Assignment.
   */
  public val type: InlineSimpleClassroomAssignmentTypeXbf67cd1f,
  private val maxMembersState: FieldState<Int?>,
  private val maxTeamsState: FieldState<Int?>,
) {
  /**
   * The maximum allowable members per team.
   */
  public val maxMembers: Int?
    get() = maxMembersState.valueOrNull()

  /**
   * The maximum allowable teams for the assignment.
   */
  public val maxTeams: Int?
    get() = maxTeamsState.valueOrNull()

  public constructor(
    accepted: Int,
    classroom: SimpleClassroom,
    deadline: String?,
    editor: String,
    feedbackPullRequestsEnabled: Boolean,
    id: Int,
    invitationsEnabled: Boolean,
    inviteLink: String,
    language: String,
    passing: Int,
    publicRepo: Boolean,
    slug: String,
    studentsAreRepoAdmins: Boolean,
    submitted: Int,
    title: String,
    type: InlineSimpleClassroomAssignmentTypeXbf67cd1f,
  ) : this(accepted = accepted,
  classroom = classroom,
  deadline = deadline,
  editor = editor,
  feedbackPullRequestsEnabled = feedbackPullRequestsEnabled,
  id = id,
  invitationsEnabled = invitationsEnabled,
  inviteLink = inviteLink,
  language = language,
  passing = passing,
  publicRepo = publicRepo,
  slug = slug,
  studentsAreRepoAdmins = studentsAreRepoAdmins,
  submitted = submitted,
  title = title,
  type = type,
  maxMembersState = FieldState.Absent,
  maxTeamsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `max_members`.
   */
  public fun maxMembersPresence(): FieldPresence = maxMembersState.presence

  /**
   * Returns the wire presence of `max_teams`.
   */
  public fun maxTeamsPresence(): FieldPresence = maxTeamsState.presence

  public class Builder {
    private var acceptedValue: Int? = null

    public var accepted: Int
      get() = requireNotNull(acceptedValue) { "accepted is required" }
      set(`value`) {
        acceptedValue = value
      }

    private var classroomValue: SimpleClassroom? = null

    public var classroom: SimpleClassroom
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

    private var typeValue: InlineSimpleClassroomAssignmentTypeXbf67cd1f? = null

    public var type: InlineSimpleClassroomAssignmentTypeXbf67cd1f
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
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var maxMembers: Int?
      get() = maxMembersState.valueOrNull()
      set(`value`) {
        maxMembersState = value.toNullableFieldState()
      }

    private var maxTeamsState: FieldState<Int?> = FieldState.Absent

    /**
     * The maximum allowable teams for the assignment.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var maxTeams: Int?
      get() = maxTeamsState.valueOrNull()
      set(`value`) {
        maxTeamsState = value.toNullableFieldState()
      }

    /**
     * Omits `max_members` from serialized output.
     */
    public fun unsetMaxMembers() {
      maxMembersState = FieldState.Absent
    }

    /**
     * Omits `max_teams` from serialized output.
     */
    public fun unsetMaxTeams() {
      maxTeamsState = FieldState.Absent
    }

    public fun build(): SimpleClassroomAssignment {
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
      check(studentsAreRepoAdminsValue != null) { "studentsAreRepoAdmins is required" }
      check(submittedValue != null) { "submitted is required" }
      check(titleValue != null) { "title is required" }
      check(typeValue != null) { "type is required" }
      check(deadlineState !== FieldState.Absent) { "deadline is required, even when null" }
      return SimpleClassroomAssignment(
        accepted = accepted,
        classroom = classroom,
        deadline = deadlineState.valueOrNull(),
        editor = editor,
        feedbackPullRequestsEnabled = feedbackPullRequestsEnabled,
        id = id,
        invitationsEnabled = invitationsEnabled,
        inviteLink = inviteLink,
        language = language,
        passing = passing,
        publicRepo = publicRepo,
        slug = slug,
        studentsAreRepoAdmins = studentsAreRepoAdmins,
        submitted = submitted,
        title = title,
        type = type,
        maxMembersState = maxMembersState,
        maxTeamsState = maxTeamsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SimpleClassroomAssignment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SimpleClassroomAssignment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SimpleClassroomAssignment {
      val jsonDecoder = decoder.requireJsonDecoder("SimpleClassroomAssignment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SimpleClassroomAssignment must be a JSON object")
      val accepted = json.decodeRequired<Int>(rawObject, "accepted")
      val classroom = json.decodeRequired<SimpleClassroom>(rawObject, "classroom")
      val editor = json.decodeRequired<String>(rawObject, "editor")
      val feedbackPullRequestsEnabled = json.decodeRequired<Boolean>(rawObject, "feedback_pull_requests_enabled")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val invitationsEnabled = json.decodeRequired<Boolean>(rawObject, "invitations_enabled")
      val inviteLink = json.decodeRequired<String>(rawObject, "invite_link")
      val language = json.decodeRequired<String>(rawObject, "language")
      val passing = json.decodeRequired<Int>(rawObject, "passing")
      val publicRepo = json.decodeRequired<Boolean>(rawObject, "public_repo")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val studentsAreRepoAdmins = json.decodeRequired<Boolean>(rawObject, "students_are_repo_admins")
      val submitted = json.decodeRequired<Int>(rawObject, "submitted")
      val title = json.decodeRequired<String>(rawObject, "title")
      val type = json.decodeRequired<InlineSimpleClassroomAssignmentTypeXbf67cd1f>(rawObject, "type")
      if (!rawObject.containsKey("deadline")) {
        throw SerializationException("SimpleClassroomAssignment is missing required property 'deadline'")
      }
      val deadline = rawObject["deadline"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return SimpleClassroomAssignment(
        accepted = accepted,
        classroom = classroom,
        deadline = deadline,
        editor = editor,
        feedbackPullRequestsEnabled = feedbackPullRequestsEnabled,
        id = id,
        invitationsEnabled = invitationsEnabled,
        inviteLink = inviteLink,
        language = language,
        passing = passing,
        publicRepo = publicRepo,
        slug = slug,
        studentsAreRepoAdmins = studentsAreRepoAdmins,
        submitted = submitted,
        title = title,
        type = type,
        maxMembersState = json.decodeOptional(rawObject, "max_members", nullable = true),
        maxTeamsState = json.decodeOptional(rawObject, "max_teams", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: SimpleClassroomAssignment) {
      val jsonEncoder = encoder.requireJsonEncoder("SimpleClassroomAssignment")
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
        put("passing", json.encodeToJsonElement(value.passing))
        put("public_repo", json.encodeToJsonElement(value.publicRepo))
        put("slug", value.slug)
        put("students_are_repo_admins", json.encodeToJsonElement(value.studentsAreRepoAdmins))
        put("submitted", json.encodeToJsonElement(value.submitted))
        put("title", value.title)
        put("type", json.encodeToJsonElement(value.type))
        putState("max_members", value.maxMembersState, json::encodeToJsonElement)
        putState("max_teams", value.maxTeamsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun simpleClassroomAssignment(block: SimpleClassroomAssignment.Builder.() -> Unit): SimpleClassroomAssignment = SimpleClassroomAssignment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SimpleClassroomAssignment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("SimpleClassroomAssignment property '" + name + "' is not nullable")
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
