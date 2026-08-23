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
 * The code scanning alert involved in the event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert
 */
@Serializable(with = InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871.Serializer::class)
public class InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 internal constructor(
  /**
   * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val dismissedAt: String,
  public val dismissedBy: InlineWebhookCodeScanningAlertClosedByUserAlertDismissedByX4cbc66cf?,
  /**
   * The reason for dismissing or closing the alert.
   */
  public val dismissedReason:
      InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461?,
  /**
   * The GitHub URL of the alert resource.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * The code scanning alert number.
   */
  public val number: Int,
  public val rule: InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea,
  /**
   * State of a code scanning alert.
   */
  public val state: InlineWebhookCodeScanningAlertClosedByUserAlertStateXb838114b,
  public val tool: InlineWebhookCodeScanningAlertClosedByUserAlertToolXd18f59d9,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  assigneesState: FieldState<List<SimpleUser>>,
  private val dismissalApprovedByState:
      FieldState<InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByX8e118c07?>,
  private val dismissedCommentState: FieldState<String?>,
  private val fixedAtState: FieldState<JsonElement?>,
  private val mostRecentInstanceState:
      FieldState<InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c?>,
) {
  private val assigneesState: FieldState<List<SimpleUser>> =
      assigneesState.copyValue { fieldValue -> fieldValue.toList() }

  public val assignees: List<SimpleUser>?
    get() = assigneesState.valueOrNull()

  public val dismissalApprovedBy:
      InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByX8e118c07?
    get() = dismissalApprovedByState.valueOrNull()

  public val dismissedComment: String?
    get() = dismissedCommentState.valueOrNull()

  /**
   * The time that the alert was fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   */
  public val fixedAt: JsonElement?
    get() = fixedAtState.valueOrNull()

  public val mostRecentInstance:
      InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c?
    get() = mostRecentInstanceState.valueOrNull()

  public constructor(
    createdAt: String,
    dismissedAt: String,
    dismissedBy: InlineWebhookCodeScanningAlertClosedByUserAlertDismissedByX4cbc66cf?,
    dismissedReason: InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461?,
    htmlUrl: String,
    number: Int,
    rule: InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea,
    state: InlineWebhookCodeScanningAlertClosedByUserAlertStateXb838114b,
    tool: InlineWebhookCodeScanningAlertClosedByUserAlertToolXd18f59d9,
    url: String,
  ) : this(createdAt = createdAt,
  dismissedAt = dismissedAt,
  dismissedBy = dismissedBy,
  dismissedReason = dismissedReason,
  htmlUrl = htmlUrl,
  number = number,
  rule = rule,
  state = state,
  tool = tool,
  url = url,
  assigneesState = FieldState.Absent,
  dismissalApprovedByState = FieldState.Absent,
  dismissedCommentState = FieldState.Absent,
  fixedAtState = FieldState.Absent,
  mostRecentInstanceState = FieldState.Absent,
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
   * Returns the wire presence of `most_recent_instance`.
   */
  public fun mostRecentInstancePresence(): FieldPresence = mostRecentInstanceState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var dismissedAtValue: String? = null

    public var dismissedAt: String
      get() = requireNotNull(dismissedAtValue) { "dismissedAt is required" }
      set(`value`) {
        dismissedAtValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var ruleValue: InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea? = null

    public var rule: InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea
      get() = requireNotNull(ruleValue) { "rule is required" }
      set(`value`) {
        ruleValue = value
      }

    private var stateValue: InlineWebhookCodeScanningAlertClosedByUserAlertStateXb838114b? = null

    public var state: InlineWebhookCodeScanningAlertClosedByUserAlertStateXb838114b
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var toolValue: InlineWebhookCodeScanningAlertClosedByUserAlertToolXd18f59d9? = null

    public var tool: InlineWebhookCodeScanningAlertClosedByUserAlertToolXd18f59d9
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

    private var dismissedByState:
        FieldState<InlineWebhookCodeScanningAlertClosedByUserAlertDismissedByX4cbc66cf?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedBy: InlineWebhookCodeScanningAlertClosedByUserAlertDismissedByX4cbc66cf?
      get() = dismissedByState.valueOrNull()
      set(`value`) {
        dismissedByState = value.toNullableFieldState()
      }

    private var dismissedReasonState:
        FieldState<InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461?> =
        FieldState.Absent

    /**
     * The reason for dismissing or closing the alert.
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedReason:
        InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461?
      get() = dismissedReasonState.valueOrNull()
      set(`value`) {
        dismissedReasonState = value.toNullableFieldState()
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

    private var dismissalApprovedByState:
        FieldState<InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByX8e118c07?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var dismissalApprovedBy:
        InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByX8e118c07?
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

    private var fixedAtState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * The time that the alert was fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var fixedAt: JsonElement?
      get() = fixedAtState.valueOrNull()
      set(`value`) {
        fixedAtState = value.toNullableFieldState()
      }

    private var mostRecentInstanceState:
        FieldState<InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var mostRecentInstance:
        InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c?
      get() = mostRecentInstanceState.valueOrNull()
      set(`value`) {
        mostRecentInstanceState = value.toNullableFieldState()
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
     * Omits `most_recent_instance` from serialized output.
     */
    public fun unsetMostRecentInstance() {
      mostRecentInstanceState = FieldState.Absent
    }

    public fun build(): InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 {
      check(createdAtValue != null) { "createdAt is required" }
      check(dismissedAtValue != null) { "dismissedAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(numberValue != null) { "number is required" }
      check(ruleValue != null) { "rule is required" }
      check(stateValue != null) { "state is required" }
      check(toolValue != null) { "tool is required" }
      check(urlValue != null) { "url is required" }
      check(dismissedByState !== FieldState.Absent) { "dismissedBy is required, even when null" }
      check(dismissedReasonState !== FieldState.Absent) { "dismissedReason is required, even when null" }
      return InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871(
        createdAt = createdAt,
        dismissedAt = dismissedAt,
        dismissedBy = dismissedByState.valueOrNull(),
        dismissedReason = dismissedReasonState.valueOrNull(),
        htmlUrl = htmlUrl,
        number = number,
        rule = rule,
        state = state,
        tool = tool,
        url = url,
        assigneesState = assigneesState,
        dismissalApprovedByState = dismissalApprovedByState,
        dismissedCommentState = dismissedCommentState,
        fixedAtState = fixedAtState,
        mostRecentInstanceState = mostRecentInstanceState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val dismissedAt = json.decodeRequired<String>(rawObject, "dismissed_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val rule = json.decodeRequired<InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea>(rawObject, "rule")
      val state = json.decodeRequired<InlineWebhookCodeScanningAlertClosedByUserAlertStateXb838114b>(rawObject, "state")
      val tool = json.decodeRequired<InlineWebhookCodeScanningAlertClosedByUserAlertToolXd18f59d9>(rawObject, "tool")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("dismissed_by")) {
        throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 is missing required property 'dismissed_by'")
      }
      val dismissedBy = rawObject["dismissed_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCodeScanningAlertClosedByUserAlertDismissedByX4cbc66cf?>(requireNotNull(element)) }
      if (!rawObject.containsKey("dismissed_reason")) {
        throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 is missing required property 'dismissed_reason'")
      }
      val dismissedReason = rawObject["dismissed_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461?>(requireNotNull(element)) }
      return InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871(
        createdAt = createdAt,
        dismissedAt = dismissedAt,
        dismissedBy = dismissedBy,
        dismissedReason = dismissedReason,
        htmlUrl = htmlUrl,
        number = number,
        rule = rule,
        state = state,
        tool = tool,
        url = url,
        assigneesState = json.decodeOptional(rawObject, "assignees", nullable = false),
        dismissalApprovedByState = json.decodeOptional(rawObject, "dismissal_approved_by", nullable = true),
        dismissedCommentState = json.decodeOptional(rawObject, "dismissed_comment", nullable = true),
        fixedAtState = json.decodeOptional(rawObject, "fixed_at", nullable = true),
        mostRecentInstanceState = json.decodeOptional(rawObject, "most_recent_instance", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("dismissed_at", value.dismissedAt)
        put("dismissed_by", value.dismissedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("dismissed_reason", value.dismissedReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("number", json.encodeToJsonElement(value.number))
        put("rule", json.encodeToJsonElement(value.rule))
        put("state", json.encodeToJsonElement(value.state))
        put("tool", json.encodeToJsonElement(value.tool))
        put("url", value.url)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("dismissal_approved_by", value.dismissalApprovedByState, json::encodeToJsonElement)
        putState("dismissed_comment", value.dismissedCommentState, json::encodeToJsonElement)
        putState("fixed_at", value.fixedAtState, json::encodeToJsonElement)
        putState("most_recent_instance", value.mostRecentInstanceState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871(block: InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871.Builder.() -> Unit): InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 = InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertX4d65c871 property '" + name + "' is not nullable")
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
