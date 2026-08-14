package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-organization-alert-items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-organization-alert-items
 */
@Serializable(with = CodeScanningOrganizationAlertItems.Serializer::class)
public class CodeScanningOrganizationAlertItems internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val dismissedAt: String?,
  public val dismissedBy: NullableSimpleUser?,
  public val dismissedReason: CodeScanningAlertDismissedReason?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val instancesUrl: String,
  public val mostRecentInstance: CodeScanningAlertInstance,
  public val number: Int,
  public val repository: SimpleRepository,
  public val rule: CodeScanningAlertRuleSummary,
  public val state: CodeScanningAlertState?,
  public val tool: CodeScanningAnalysisTool,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  assigneesState: FieldState<List<SimpleUser>>,
  private val dismissalApprovedByState: FieldState<NullableSimpleUser?>,
  private val dismissedCommentState: FieldState<String?>,
  private val fixedAtState: FieldState<String?>,
  private val updatedAtState: FieldState<String>,
) {
  private val assigneesState: FieldState<List<SimpleUser>> =
      assigneesState.copyValue { fieldValue -> fieldValue.toList() }

  public val assignees: List<SimpleUser>?
    get() = assigneesState.valueOrNull()

  public val dismissalApprovedBy: NullableSimpleUser?
    get() = dismissalApprovedByState.valueOrNull()

  public val dismissedComment: String?
    get() = dismissedCommentState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val fixedAt: String?
    get() = fixedAtState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public constructor(
    createdAt: String,
    dismissedAt: String?,
    dismissedBy: NullableSimpleUser?,
    dismissedReason: CodeScanningAlertDismissedReason?,
    htmlUrl: String,
    instancesUrl: String,
    mostRecentInstance: CodeScanningAlertInstance,
    number: Int,
    repository: SimpleRepository,
    rule: CodeScanningAlertRuleSummary,
    state: CodeScanningAlertState?,
    tool: CodeScanningAnalysisTool,
    url: String,
  ) : this(createdAt = createdAt,
  dismissedAt = dismissedAt,
  dismissedBy = dismissedBy,
  dismissedReason = dismissedReason,
  htmlUrl = htmlUrl,
  instancesUrl = instancesUrl,
  mostRecentInstance = mostRecentInstance,
  number = number,
  repository = repository,
  rule = rule,
  state = state,
  tool = tool,
  url = url,
  assigneesState = FieldState.Absent,
  dismissalApprovedByState = FieldState.Absent,
  dismissedCommentState = FieldState.Absent,
  fixedAtState = FieldState.Absent,
  updatedAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `assignees`.
   */
  public fun assigneesPresence(): FieldPresence = assigneesState.presence

  /**
   * Returns the wire presence of `dismissal_approved_by`.
   */
  public fun dismissalApprovedByPresence(): FieldPresence = dismissalApprovedByState.presence

  /**
   * Returns the wire presence of `dismissed_comment`.
   */
  public fun dismissedCommentPresence(): FieldPresence = dismissedCommentState.presence

  /**
   * Returns the wire presence of `fixed_at`.
   */
  public fun fixedAtPresence(): FieldPresence = fixedAtState.presence

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var instancesUrlValue: String? = null

    public var instancesUrl: String
      get() = requireNotNull(instancesUrlValue) { "instancesUrl is required" }
      set(`value`) {
        instancesUrlValue = value
      }

    private var mostRecentInstanceValue: CodeScanningAlertInstance? = null

    public var mostRecentInstance: CodeScanningAlertInstance
      get() = requireNotNull(mostRecentInstanceValue) { "mostRecentInstance is required" }
      set(`value`) {
        mostRecentInstanceValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var repositoryValue: SimpleRepository? = null

    public var repository: SimpleRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var ruleValue: CodeScanningAlertRuleSummary? = null

    public var rule: CodeScanningAlertRuleSummary
      get() = requireNotNull(ruleValue) { "rule is required" }
      set(`value`) {
        ruleValue = value
      }

    private var toolValue: CodeScanningAnalysisTool? = null

    public var tool: CodeScanningAnalysisTool
      get() = requireNotNull(toolValue) { "tool is required" }
      set(`value`) {
        toolValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var dismissedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedAt: String?
      get() = dismissedAtState.valueOrNull()
      set(`value`) {
        dismissedAtState = value.toNullableFieldState()
      }

    private var dismissedByState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedBy: NullableSimpleUser?
      get() = dismissedByState.valueOrNull()
      set(`value`) {
        dismissedByState = value.toNullableFieldState()
      }

    private var dismissedReasonState: FieldState<CodeScanningAlertDismissedReason?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedReason: CodeScanningAlertDismissedReason?
      get() = dismissedReasonState.valueOrNull()
      set(`value`) {
        dismissedReasonState = value.toNullableFieldState()
      }

    private var stateState: FieldState<CodeScanningAlertState?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var state: CodeScanningAlertState?
      get() = stateState.valueOrNull()
      set(`value`) {
        stateState = value.toNullableFieldState()
      }

    private var assigneesState: FieldState<List<SimpleUser>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var assignees: List<SimpleUser>?
      get() = assigneesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "assignees is not nullable; call unsetAssignees() to omit it" }
        assigneesState = FieldState.Value(present.toList())
      }

    private var dismissalApprovedByState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var dismissalApprovedBy: NullableSimpleUser?
      get() = dismissalApprovedByState.valueOrNull()
      set(`value`) {
        dismissalApprovedByState = value.toNullableFieldState()
      }

    private var dismissedCommentState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var dismissedComment: String?
      get() = dismissedCommentState.valueOrNull()
      set(`value`) {
        dismissedCommentState = value.toNullableFieldState()
      }

    private var fixedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var fixedAt: String?
      get() = fixedAtState.valueOrNull()
      set(`value`) {
        fixedAtState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "updatedAt is not nullable; call unsetUpdatedAt() to omit it" }
        updatedAtState = FieldState.Value(present)
      }

    /**
     * Omits `assignees` from serialized output.
     */
    public fun unsetAssignees() {
      assigneesState = FieldState.Absent
    }

    /**
     * Omits `dismissal_approved_by` from serialized output.
     */
    public fun unsetDismissalApprovedBy() {
      dismissalApprovedByState = FieldState.Absent
    }

    /**
     * Omits `dismissed_comment` from serialized output.
     */
    public fun unsetDismissedComment() {
      dismissedCommentState = FieldState.Absent
    }

    /**
     * Omits `fixed_at` from serialized output.
     */
    public fun unsetFixedAt() {
      fixedAtState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    public fun build(): CodeScanningOrganizationAlertItems {
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(instancesUrlValue != null) { "instancesUrl is required" }
      check(mostRecentInstanceValue != null) { "mostRecentInstance is required" }
      check(numberValue != null) { "number is required" }
      check(repositoryValue != null) { "repository is required" }
      check(ruleValue != null) { "rule is required" }
      check(toolValue != null) { "tool is required" }
      check(urlValue != null) { "url is required" }
      check(dismissedAtState !== FieldState.Absent) { "dismissedAt is required, even when null" }
      check(dismissedByState !== FieldState.Absent) { "dismissedBy is required, even when null" }
      check(dismissedReasonState !== FieldState.Absent) { "dismissedReason is required, even when null" }
      check(stateState !== FieldState.Absent) { "state is required, even when null" }
      return CodeScanningOrganizationAlertItems(
        createdAt = createdAt,
        dismissedAt = dismissedAtState.valueOrNull(),
        dismissedBy = dismissedByState.valueOrNull(),
        dismissedReason = dismissedReasonState.valueOrNull(),
        htmlUrl = htmlUrl,
        instancesUrl = instancesUrl,
        mostRecentInstance = mostRecentInstance,
        number = number,
        repository = repository,
        rule = rule,
        state = stateState.valueOrNull(),
        tool = tool,
        url = url,
        assigneesState = assigneesState,
        dismissalApprovedByState = dismissalApprovedByState,
        dismissedCommentState = dismissedCommentState,
        fixedAtState = fixedAtState,
        updatedAtState = updatedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningOrganizationAlertItems = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeScanningOrganizationAlertItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningOrganizationAlertItems {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningOrganizationAlertItems")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningOrganizationAlertItems must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val instancesUrl = json.decodeRequired<String>(rawObject, "instances_url")
      val mostRecentInstance = json.decodeRequired<CodeScanningAlertInstance>(rawObject, "most_recent_instance")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val repository = json.decodeRequired<SimpleRepository>(rawObject, "repository")
      val rule = json.decodeRequired<CodeScanningAlertRuleSummary>(rawObject, "rule")
      val tool = json.decodeRequired<CodeScanningAnalysisTool>(rawObject, "tool")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("dismissed_at")) {
        throw SerializationException("CodeScanningOrganizationAlertItems is missing required property 'dismissed_at'")
      }
      val dismissedAt = rawObject["dismissed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("dismissed_by")) {
        throw SerializationException("CodeScanningOrganizationAlertItems is missing required property 'dismissed_by'")
      }
      val dismissedBy = rawObject["dismissed_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("dismissed_reason")) {
        throw SerializationException("CodeScanningOrganizationAlertItems is missing required property 'dismissed_reason'")
      }
      val dismissedReason = rawObject["dismissed_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CodeScanningAlertDismissedReason?>(requireNotNull(element)) }
      if (!rawObject.containsKey("state")) {
        throw SerializationException("CodeScanningOrganizationAlertItems is missing required property 'state'")
      }
      val state = rawObject["state"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CodeScanningAlertState?>(requireNotNull(element)) }
      return CodeScanningOrganizationAlertItems(
        createdAt = createdAt,
        dismissedAt = dismissedAt,
        dismissedBy = dismissedBy,
        dismissedReason = dismissedReason,
        htmlUrl = htmlUrl,
        instancesUrl = instancesUrl,
        mostRecentInstance = mostRecentInstance,
        number = number,
        repository = repository,
        rule = rule,
        state = state,
        tool = tool,
        url = url,
        assigneesState = json.decodeOptional(rawObject, "assignees", nullable = false),
        dismissalApprovedByState = json.decodeOptional(rawObject, "dismissal_approved_by", nullable = true),
        dismissedCommentState = json.decodeOptional(rawObject, "dismissed_comment", nullable = true),
        fixedAtState = json.decodeOptional(rawObject, "fixed_at", nullable = true),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningOrganizationAlertItems) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningOrganizationAlertItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("dismissed_at", value.dismissedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("dismissed_by", value.dismissedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("dismissed_reason", value.dismissedReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("instances_url", value.instancesUrl)
        put("most_recent_instance", json.encodeToJsonElement(value.mostRecentInstance))
        put("number", json.encodeToJsonElement(value.number))
        put("repository", json.encodeToJsonElement(value.repository))
        put("rule", json.encodeToJsonElement(value.rule))
        put("state", value.state?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("tool", json.encodeToJsonElement(value.tool))
        put("url", value.url)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("dismissal_approved_by", value.dismissalApprovedByState, json::encodeToJsonElement)
        putState("dismissed_comment", value.dismissedCommentState, json::encodeToJsonElement)
        putState("fixed_at", value.fixedAtState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningOrganizationAlertItems(block: CodeScanningOrganizationAlertItems.Builder.() -> Unit): CodeScanningOrganizationAlertItems = CodeScanningOrganizationAlertItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeScanningOrganizationAlertItems is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("CodeScanningOrganizationAlertItems property '" + name + "' is not nullable")
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
