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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineReposIssuesPatchRequestJsonXa8796b8e.Serializer::class)
public class InlineReposIssuesPatchRequestJsonXa8796b8e internal constructor(
  private val assigneeState: FieldState<String?>,
  private val assigneesState:
      FieldState<List<InlineReposIssuesPatchRequestJsonAssigneesItemXb258f36d>>,
  private val bodyState: FieldState<String?>,
  private val duplicateIssueIdState: FieldState<Int>,
  private val issueFieldValuesState:
      FieldState<List<InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17>>,
  private val labelsState: FieldState<List<InlineReposIssuesPatchRequestJsonLabelsItemX709463d4>>,
  private val milestoneState: FieldState<InlineReposIssuesPatchRequestJsonMilestoneXce38a3c3?>,
  private val stateState: FieldState<InlineReposIssuesPatchRequestJsonStateXd1929ac6>,
  private val stateReasonState: FieldState<InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab?>,
  private val titleState: FieldState<InlineReposIssuesPatchRequestJsonTitleX0bc4b227?>,
  private val typeState: FieldState<String?>,
) {
  /**
   * Username to assign to this issue. **This field is closing down.**
   */
  public val assignee: String?
    get() = assigneeState.valueOrNull()

  /**
   * Usernames to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this issue.
   * Send an empty array (`[]`) to clear all assignees from the issue. Only users with push access can set assignees for
   * new issues. Without push access to the repository, assignee changes are silently dropped.
   */
  public val assignees: List<InlineReposIssuesPatchRequestJsonAssigneesItemXb258f36d>?
    get() = assigneesState.valueOrNull()

  /**
   * The contents of the issue.
   */
  public val body: String?
    get() = bodyState.valueOrNull()

  /**
   * The ID of the issue to mark as the canonical duplicate when `state_reason` is `duplicate`. The issue must exist and
   * be accessible to the authenticated user. Ignored when `state_reason` is not `duplicate`.
   */
  public val duplicateIssueId: Int?
    get() = duplicateIssueIdState.valueOrNull()

  /**
   * An array of issue field values to set on this issue. Each field value must include the field ID and the value to
   * set. Only users with push access can set field values for issues
   */
  public val issueFieldValues: List<InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17>?
    get() = issueFieldValuesState.valueOrNull()

  /**
   * Labels to associate with this issue. Pass one or more labels to _replace_ the set of labels on this issue. Send an
   * empty array (`[]`) to clear all labels from the issue. Only users with push access can set labels for issues.
   * Without push access to the repository, label changes are silently dropped.
   */
  public val labels: List<InlineReposIssuesPatchRequestJsonLabelsItemX709463d4>?
    get() = labelsState.valueOrNull()

  public val milestone: InlineReposIssuesPatchRequestJsonMilestoneXce38a3c3?
    get() = milestoneState.valueOrNull()

  /**
   * The open or closed state of the issue.
   */
  public val state: InlineReposIssuesPatchRequestJsonStateXd1929ac6?
    get() = stateState.valueOrNull()

  /**
   * The reason for the state change. Ignored unless `state` is changed.
   */
  public val stateReason: InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab?
    get() = stateReasonState.valueOrNull()

  /**
   * The title of the issue.
   */
  public val title: InlineReposIssuesPatchRequestJsonTitleX0bc4b227?
    get() = titleState.valueOrNull()

  /**
   * The name of the issue type to associate with this issue or use `null` to remove the current issue type. Only users
   * with push access can set the type for issues. Without push access to the repository, type changes are silently
   * dropped.
   */
  public val type: String?
    get() = typeState.valueOrNull()

  public constructor() : this(assigneeState = FieldState.Absent,
  assigneesState = FieldState.Absent,
  bodyState = FieldState.Absent,
  duplicateIssueIdState = FieldState.Absent,
  issueFieldValuesState = FieldState.Absent,
  labelsState = FieldState.Absent,
  milestoneState = FieldState.Absent,
  stateState = FieldState.Absent,
  stateReasonState = FieldState.Absent,
  titleState = FieldState.Absent,
  typeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `assignee`.
   */
  public fun assigneePresence(): FieldPresence = assigneeState.presence

  /**
   * Returns the wire presence of `assignees`.
   */
  public fun assigneesPresence(): FieldPresence = assigneesState.presence

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

  /**
   * Returns the wire presence of `duplicate_issue_id`.
   */
  public fun duplicateIssueIdPresence(): FieldPresence = duplicateIssueIdState.presence

  /**
   * Returns the wire presence of `issue_field_values`.
   */
  public fun issueFieldValuesPresence(): FieldPresence = issueFieldValuesState.presence

  /**
   * Returns the wire presence of `labels`.
   */
  public fun labelsPresence(): FieldPresence = labelsState.presence

  /**
   * Returns the wire presence of `milestone`.
   */
  public fun milestonePresence(): FieldPresence = milestoneState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  /**
   * Returns the wire presence of `state_reason`.
   */
  public fun stateReasonPresence(): FieldPresence = stateReasonState.presence

  /**
   * Returns the wire presence of `title`.
   */
  public fun titlePresence(): FieldPresence = titleState.presence

  /**
   * Returns the wire presence of `type`.
   */
  public fun typePresence(): FieldPresence = typeState.presence

  public class Builder {
    private var assigneeState: FieldState<String?> = FieldState.Absent

    /**
     * Username to assign to this issue. **This field is closing down.**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var assignee: String?
      get() = assigneeState.valueOrNull()
      set(`value`) {
        assigneeState = value.toNullableFieldState()
      }

    private var assigneesState:
        FieldState<List<InlineReposIssuesPatchRequestJsonAssigneesItemXb258f36d>> =
        FieldState.Absent

    /**
     * Usernames to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this issue.
     * Send an empty array (`[]`) to clear all assignees from the issue. Only users with push access can set assignees
     * for new issues. Without push access to the repository, assignee changes are silently dropped.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var assignees: List<InlineReposIssuesPatchRequestJsonAssigneesItemXb258f36d>?
      get() = assigneesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "assignees is not nullable; call unsetAssignees() to omit it" }
        assigneesState = FieldState.Value(present)
      }

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * The contents of the issue.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
      }

    private var duplicateIssueIdState: FieldState<Int> = FieldState.Absent

    /**
     * The ID of the issue to mark as the canonical duplicate when `state_reason` is `duplicate`. The issue must exist
     * and be accessible to the authenticated user. Ignored when `state_reason` is not `duplicate`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var duplicateIssueId: Int?
      get() = duplicateIssueIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "duplicateIssueId is not nullable; call unsetDuplicateIssueId() to omit it" }
        duplicateIssueIdState = FieldState.Value(present)
      }

    private var issueFieldValuesState:
        FieldState<List<InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17>> =
        FieldState.Absent

    /**
     * An array of issue field values to set on this issue. Each field value must include the field ID and the value to
     * set. Only users with push access can set field values for issues
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var issueFieldValues:
        List<InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17>?
      get() = issueFieldValuesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "issueFieldValues is not nullable; call unsetIssueFieldValues() to omit it" }
        issueFieldValuesState = FieldState.Value(present)
      }

    private var labelsState: FieldState<List<InlineReposIssuesPatchRequestJsonLabelsItemX709463d4>>
        = FieldState.Absent

    /**
     * Labels to associate with this issue. Pass one or more labels to _replace_ the set of labels on this issue. Send
     * an empty array (`[]`) to clear all labels from the issue. Only users with push access can set labels for issues.
     * Without push access to the repository, label changes are silently dropped.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var labels: List<InlineReposIssuesPatchRequestJsonLabelsItemX709463d4>?
      get() = labelsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "labels is not nullable; call unsetLabels() to omit it" }
        labelsState = FieldState.Value(present)
      }

    private var milestoneState: FieldState<InlineReposIssuesPatchRequestJsonMilestoneXce38a3c3?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var milestone: InlineReposIssuesPatchRequestJsonMilestoneXce38a3c3?
      get() = milestoneState.valueOrNull()
      set(`value`) {
        milestoneState = value.toNullableFieldState()
      }

    private var stateState: FieldState<InlineReposIssuesPatchRequestJsonStateXd1929ac6> =
        FieldState.Absent

    /**
     * The open or closed state of the issue.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: InlineReposIssuesPatchRequestJsonStateXd1929ac6?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    private var stateReasonState: FieldState<InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab?>
        = FieldState.Absent

    /**
     * The reason for the state change. Ignored unless `state` is changed.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var stateReason: InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab?
      get() = stateReasonState.valueOrNull()
      set(`value`) {
        stateReasonState = value.toNullableFieldState()
      }

    private var titleState: FieldState<InlineReposIssuesPatchRequestJsonTitleX0bc4b227?> =
        FieldState.Absent

    /**
     * The title of the issue.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var title: InlineReposIssuesPatchRequestJsonTitleX0bc4b227?
      get() = titleState.valueOrNull()
      set(`value`) {
        titleState = value.toNullableFieldState()
      }

    private var typeState: FieldState<String?> = FieldState.Absent

    /**
     * The name of the issue type to associate with this issue or use `null` to remove the current issue type. Only
     * users with push access can set the type for issues. Without push access to the repository, type changes are
     * silently dropped.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var type: String?
      get() = typeState.valueOrNull()
      set(`value`) {
        typeState = value.toNullableFieldState()
      }

    /**
     * Omits `assignee` from serialized output.
     */
    public fun unsetAssignee() {
      assigneeState = FieldState.Absent
    }

    /**
     * Omits `assignees` from serialized output.
     */
    public fun unsetAssignees() {
      assigneesState = FieldState.Absent
    }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
    }

    /**
     * Omits `duplicate_issue_id` from serialized output.
     */
    public fun unsetDuplicateIssueId() {
      duplicateIssueIdState = FieldState.Absent
    }

    /**
     * Omits `issue_field_values` from serialized output.
     */
    public fun unsetIssueFieldValues() {
      issueFieldValuesState = FieldState.Absent
    }

    /**
     * Omits `labels` from serialized output.
     */
    public fun unsetLabels() {
      labelsState = FieldState.Absent
    }

    /**
     * Omits `milestone` from serialized output.
     */
    public fun unsetMilestone() {
      milestoneState = FieldState.Absent
    }

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    /**
     * Omits `state_reason` from serialized output.
     */
    public fun unsetStateReason() {
      stateReasonState = FieldState.Absent
    }

    /**
     * Omits `title` from serialized output.
     */
    public fun unsetTitle() {
      titleState = FieldState.Absent
    }

    /**
     * Omits `type` from serialized output.
     */
    public fun unsetType() {
      typeState = FieldState.Absent
    }

    public fun build(): InlineReposIssuesPatchRequestJsonXa8796b8e = InlineReposIssuesPatchRequestJsonXa8796b8e(
      assigneeState = assigneeState,
      assigneesState = assigneesState,
      bodyState = bodyState,
      duplicateIssueIdState = duplicateIssueIdState,
      issueFieldValuesState = issueFieldValuesState,
      labelsState = labelsState,
      milestoneState = milestoneState,
      stateState = stateState,
      stateReasonState = stateReasonState,
      titleState = titleState,
      typeState = typeState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesPatchRequestJsonXa8796b8e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesPatchRequestJsonXa8796b8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesPatchRequestJsonXa8796b8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesPatchRequestJsonXa8796b8e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesPatchRequestJsonXa8796b8e must be a JSON object")
      return InlineReposIssuesPatchRequestJsonXa8796b8e(
        assigneeState = json.decodeOptional(rawObject, "assignee", nullable = true),
        assigneesState = json.decodeOptional(rawObject, "assignees", nullable = false),
        bodyState = json.decodeOptional(rawObject, "body", nullable = true),
        duplicateIssueIdState = json.decodeOptional(rawObject, "duplicate_issue_id", nullable = false),
        issueFieldValuesState = json.decodeOptional(rawObject, "issue_field_values", nullable = false),
        labelsState = json.decodeOptional(rawObject, "labels", nullable = false),
        milestoneState = json.decodeOptional(rawObject, "milestone", nullable = true),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
        stateReasonState = json.decodeOptional(rawObject, "state_reason", nullable = true),
        titleState = json.decodeOptional(rawObject, "title", nullable = true),
        typeState = json.decodeOptional(rawObject, "type", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPatchRequestJsonXa8796b8e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesPatchRequestJsonXa8796b8e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("assignee", value.assigneeState, json::encodeToJsonElement)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("body", value.bodyState, json::encodeToJsonElement)
        putState("duplicate_issue_id", value.duplicateIssueIdState, json::encodeToJsonElement)
        putState("issue_field_values", value.issueFieldValuesState, json::encodeToJsonElement)
        putState("labels", value.labelsState, json::encodeToJsonElement)
        putState("milestone", value.milestoneState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
        putState("state_reason", value.stateReasonState, json::encodeToJsonElement)
        putState("title", value.titleState, json::encodeToJsonElement)
        putState("type", value.typeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesPatchRequestJsonXa8796b8e(block: InlineReposIssuesPatchRequestJsonXa8796b8e.Builder.() -> Unit): InlineReposIssuesPatchRequestJsonXa8796b8e = InlineReposIssuesPatchRequestJsonXa8796b8e.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposIssuesPatchRequestJsonXa8796b8e property '" + name + "' is not nullable")
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
