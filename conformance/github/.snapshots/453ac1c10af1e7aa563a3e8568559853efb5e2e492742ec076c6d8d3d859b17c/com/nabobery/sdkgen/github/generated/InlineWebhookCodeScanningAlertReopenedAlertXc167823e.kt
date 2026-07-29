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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened/properties/alert
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedAlertXc167823e.Serializer::class)
public class InlineWebhookCodeScanningAlertReopenedAlertXc167823e internal constructor(
  /**
   * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   */
  public val dismissedAt: String?,
  public val dismissedBy: JsonObject?,
  /**
   * The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.
   */
  public val dismissedReason: String?,
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
  public val rule: InlineWebhookCodeScanningAlertReopenedAlertRuleXd8b47417,
  /**
   * State of a code scanning alert. Events for alerts found outside the default branch will return a `null` value until
   * they are dismissed or fixed.
   */
  public val state: InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e?,
  public val tool: InlineWebhookCodeScanningAlertReopenedAlertToolX4a4cda20,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  assigneesState: FieldState<List<SimpleUser>>,
  private val dismissalApprovedByState: FieldState<JsonElement?>,
  private val dismissedCommentState: FieldState<String?>,
  private val fixedAtState: FieldState<JsonElement?>,
  private val instancesUrlState: FieldState<String>,
  private val mostRecentInstanceState:
      FieldState<InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceX0beeed3c?>,
  private val updatedAtState: FieldState<String?>,
) {
  private val assigneesState: FieldState<List<SimpleUser>> =
      assigneesState.copyValue { fieldValue -> fieldValue.toList() }

  public val assignees: List<SimpleUser>?
    get() = assigneesState.valueOrNull()

  public val dismissalApprovedBy: JsonElement?
    get() = dismissalApprovedByState.valueOrNull()

  public val dismissedComment: String?
    get() = dismissedCommentState.valueOrNull()

  /**
   * The time that the alert was fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   */
  public val fixedAt: JsonElement?
    get() = fixedAtState.valueOrNull()

  public val instancesUrl: String?
    get() = instancesUrlState.valueOrNull()

  public val mostRecentInstance:
      InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceX0beeed3c?
    get() = mostRecentInstanceState.valueOrNull()

  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public constructor(
    createdAt: String,
    dismissedAt: String?,
    dismissedBy: JsonObject?,
    dismissedReason: String?,
    htmlUrl: String,
    number: Int,
    rule: InlineWebhookCodeScanningAlertReopenedAlertRuleXd8b47417,
    state: InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e?,
    tool: InlineWebhookCodeScanningAlertReopenedAlertToolX4a4cda20,
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
  instancesUrlState = FieldState.Absent,
  mostRecentInstanceState = FieldState.Absent,
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
   * Returns the wire presence of `instances_url`.
   */
  public fun instancesUrlPresence(): FieldPresence = instancesUrlState.presence

  /**
   * Returns the wire presence of `most_recent_instance`.
   */
  public fun mostRecentInstancePresence(): FieldPresence = mostRecentInstanceState.presence

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

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var ruleValue: InlineWebhookCodeScanningAlertReopenedAlertRuleXd8b47417? = null

    public var rule: InlineWebhookCodeScanningAlertReopenedAlertRuleXd8b47417
      get() = requireNotNull(ruleValue) { "rule is required" }
      set(`value`) {
        ruleValue = value
      }

    private var toolValue: InlineWebhookCodeScanningAlertReopenedAlertToolX4a4cda20? = null

    public var tool: InlineWebhookCodeScanningAlertReopenedAlertToolX4a4cda20
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
     * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedAt: String?
      get() = dismissedAtState.valueOrNull()
      set(`value`) {
        dismissedAtState = value.toNullableFieldState()
      }

    private var dismissedByState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedBy: JsonObject?
      get() = dismissedByState.valueOrNull()
      set(`value`) {
        dismissedByState = value.toNullableFieldState()
      }

    private var dismissedReasonState: FieldState<String?> = FieldState.Absent

    /**
     * The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in
     * tests`.
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedReason: String?
      get() = dismissedReasonState.valueOrNull()
      set(`value`) {
        dismissedReasonState = value.toNullableFieldState()
      }

    private var stateState: FieldState<InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e?> =
        FieldState.Absent

    /**
     * State of a code scanning alert. Events for alerts found outside the default branch will return a `null` value
     * until they are dismissed or fixed.
     * Required nullable field; assigning `null` records present-null.
     */
    public var state: InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e?
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

    private var dismissalApprovedByState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var dismissalApprovedBy: JsonElement?
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

    private var instancesUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var instancesUrl: String?
      get() = instancesUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "instancesUrl is not nullable; call unsetInstancesUrl() to omit it" }
        instancesUrlState = FieldState.Value(present)
      }

    private var mostRecentInstanceState:
        FieldState<InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceX0beeed3c?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var mostRecentInstance:
        InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceX0beeed3c?
      get() = mostRecentInstanceState.valueOrNull()
      set(`value`) {
        mostRecentInstanceState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
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
     * Omits `instances_url` from serialized output.
     */
    public fun unsetInstancesUrl() {
      instancesUrlState = FieldState.Absent
    }

    /**
     * Omits `most_recent_instance` from serialized output.
     */
    public fun unsetMostRecentInstance() {
      mostRecentInstanceState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    public fun build(): InlineWebhookCodeScanningAlertReopenedAlertXc167823e {
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(numberValue != null) { "number is required" }
      check(ruleValue != null) { "rule is required" }
      check(toolValue != null) { "tool is required" }
      check(urlValue != null) { "url is required" }
      check(dismissedAtState !== FieldState.Absent) { "dismissedAt is required, even when null" }
      check(dismissedByState !== FieldState.Absent) { "dismissedBy is required, even when null" }
      check(dismissedReasonState !== FieldState.Absent) { "dismissedReason is required, even when null" }
      check(stateState !== FieldState.Absent) { "state is required, even when null" }
      return InlineWebhookCodeScanningAlertReopenedAlertXc167823e(
        createdAt = createdAt,
        dismissedAt = dismissedAtState.valueOrNull(),
        dismissedBy = dismissedByState.valueOrNull(),
        dismissedReason = dismissedReasonState.valueOrNull(),
        htmlUrl = htmlUrl,
        number = number,
        rule = rule,
        state = stateState.valueOrNull(),
        tool = tool,
        url = url,
        assigneesState = assigneesState,
        dismissalApprovedByState = dismissalApprovedByState,
        dismissedCommentState = dismissedCommentState,
        fixedAtState = fixedAtState,
        instancesUrlState = instancesUrlState,
        mostRecentInstanceState = mostRecentInstanceState,
        updatedAtState = updatedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertReopenedAlertXc167823e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedAlertXc167823e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedAlertXc167823e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertReopenedAlertXc167823e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertReopenedAlertXc167823e must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val rule = json.decodeRequired<InlineWebhookCodeScanningAlertReopenedAlertRuleXd8b47417>(rawObject, "rule")
      val tool = json.decodeRequired<InlineWebhookCodeScanningAlertReopenedAlertToolX4a4cda20>(rawObject, "tool")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("dismissed_at")) {
        throw SerializationException("InlineWebhookCodeScanningAlertReopenedAlertXc167823e is missing required property 'dismissed_at'")
      }
      val dismissedAt = rawObject["dismissed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("dismissed_by")) {
        throw SerializationException("InlineWebhookCodeScanningAlertReopenedAlertXc167823e is missing required property 'dismissed_by'")
      }
      val dismissedBy = rawObject["dismissed_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(requireNotNull(element)) }
      if (!rawObject.containsKey("dismissed_reason")) {
        throw SerializationException("InlineWebhookCodeScanningAlertReopenedAlertXc167823e is missing required property 'dismissed_reason'")
      }
      val dismissedReason = rawObject["dismissed_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("state")) {
        throw SerializationException("InlineWebhookCodeScanningAlertReopenedAlertXc167823e is missing required property 'state'")
      }
      val state = rawObject["state"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e?>(requireNotNull(element)) }
      return InlineWebhookCodeScanningAlertReopenedAlertXc167823e(
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
        instancesUrlState = json.decodeOptional(rawObject, "instances_url", nullable = false),
        mostRecentInstanceState = json.decodeOptional(rawObject, "most_recent_instance", nullable = true),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedAlertXc167823e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertReopenedAlertXc167823e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("dismissed_at", value.dismissedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("dismissed_by", value.dismissedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("dismissed_reason", value.dismissedReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("number", json.encodeToJsonElement(value.number))
        put("rule", json.encodeToJsonElement(value.rule))
        put("state", value.state?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("tool", json.encodeToJsonElement(value.tool))
        put("url", value.url)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("dismissal_approved_by", value.dismissalApprovedByState, json::encodeToJsonElement)
        putState("dismissed_comment", value.dismissedCommentState, json::encodeToJsonElement)
        putState("fixed_at", value.fixedAtState, json::encodeToJsonElement)
        putState("instances_url", value.instancesUrlState, json::encodeToJsonElement)
        putState("most_recent_instance", value.mostRecentInstanceState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertReopenedAlertXc167823e(block: InlineWebhookCodeScanningAlertReopenedAlertXc167823e.Builder.() -> Unit): InlineWebhookCodeScanningAlertReopenedAlertXc167823e = InlineWebhookCodeScanningAlertReopenedAlertXc167823e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertReopenedAlertXc167823e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookCodeScanningAlertReopenedAlertXc167823e property '" + name + "' is not nullable")
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
