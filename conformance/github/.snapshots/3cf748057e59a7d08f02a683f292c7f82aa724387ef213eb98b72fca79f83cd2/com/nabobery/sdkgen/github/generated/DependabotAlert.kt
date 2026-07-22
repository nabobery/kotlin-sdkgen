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
 * A Dependabot alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert
 */
@Serializable(with = DependabotAlert.Serializer::class)
public class DependabotAlert internal constructor(
  public val createdAt: String,
  /**
   * Details for the vulnerable dependency.
   */
  public val dependency: InlineDependabotAlertDependencyX5297f633,
  public val dismissedAt: String?,
  public val dismissedBy: NullableSimpleUser?,
  /**
   * An optional comment associated with the alert's dismissal.
   */
  public val dismissedComment: String?,
  /**
   * The reason that the alert was dismissed.
   */
  public val dismissedReason: InlineDependabotAlertDismissedReasonX898acc69?,
  public val fixedAt: String?,
  public val htmlUrl: String,
  public val number: Int,
  public val securityAdvisory: DependabotAlertSecurityAdvisory,
  public val securityVulnerability: DependabotAlertSecurityVulnerability,
  /**
   * The state of the Dependabot alert.
   */
  public val state: InlineDependabotAlertStateXb785b8c7,
  public val updatedAt: String,
  public val url: String,
  private val assigneesState: FieldState<List<SimpleUser>>,
  private val autoDismissedAtState: FieldState<String?>,
  private val dismissalRequestState: FieldState<DependabotAlertDismissalRequestSimple?>,
) {
  /**
   * The users assigned to this alert.
   */
  public val assignees: List<SimpleUser>?
    get() = assigneesState.valueOrNull()

  public val autoDismissedAt: String?
    get() = autoDismissedAtState.valueOrNull()

  public val dismissalRequest: DependabotAlertDismissalRequestSimple?
    get() = dismissalRequestState.valueOrNull()

  public constructor(
    createdAt: String,
    dependency: InlineDependabotAlertDependencyX5297f633,
    dismissedAt: String?,
    dismissedBy: NullableSimpleUser?,
    dismissedComment: String?,
    dismissedReason: InlineDependabotAlertDismissedReasonX898acc69?,
    fixedAt: String?,
    htmlUrl: String,
    number: Int,
    securityAdvisory: DependabotAlertSecurityAdvisory,
    securityVulnerability: DependabotAlertSecurityVulnerability,
    state: InlineDependabotAlertStateXb785b8c7,
    updatedAt: String,
    url: String,
  ) : this(createdAt = createdAt,
  dependency = dependency,
  dismissedAt = dismissedAt,
  dismissedBy = dismissedBy,
  dismissedComment = dismissedComment,
  dismissedReason = dismissedReason,
  fixedAt = fixedAt,
  htmlUrl = htmlUrl,
  number = number,
  securityAdvisory = securityAdvisory,
  securityVulnerability = securityVulnerability,
  state = state,
  updatedAt = updatedAt,
  url = url,
  assigneesState = FieldState.Absent,
  autoDismissedAtState = FieldState.Absent,
  dismissalRequestState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `assignees`.
   */
  public fun assigneesPresence(): FieldPresence = assigneesState.presence

  /**
   * Returns the wire presence of `auto_dismissed_at`.
   */
  public fun autoDismissedAtPresence(): FieldPresence = autoDismissedAtState.presence

  /**
   * Returns the wire presence of `dismissal_request`.
   */
  public fun dismissalRequestPresence(): FieldPresence = dismissalRequestState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var dependencyValue: InlineDependabotAlertDependencyX5297f633? = null

    public var dependency: InlineDependabotAlertDependencyX5297f633
      get() = requireNotNull(dependencyValue) { "dependency is required" }
      set(`value`) {
        dependencyValue = value
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

    private var securityAdvisoryValue: DependabotAlertSecurityAdvisory? = null

    public var securityAdvisory: DependabotAlertSecurityAdvisory
      get() = requireNotNull(securityAdvisoryValue) { "securityAdvisory is required" }
      set(`value`) {
        securityAdvisoryValue = value
      }

    private var securityVulnerabilityValue: DependabotAlertSecurityVulnerability? = null

    public var securityVulnerability: DependabotAlertSecurityVulnerability
      get() = requireNotNull(securityVulnerabilityValue) { "securityVulnerability is required" }
      set(`value`) {
        securityVulnerabilityValue = value
      }

    private var stateValue: InlineDependabotAlertStateXb785b8c7? = null

    public var state: InlineDependabotAlertStateXb785b8c7
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var dismissedAtState: FieldState<String?> = FieldState.Absent

    /**
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

    private var dismissedCommentState: FieldState<String?> = FieldState.Absent

    /**
     * An optional comment associated with the alert's dismissal.
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedComment: String?
      get() = dismissedCommentState.valueOrNull()
      set(`value`) {
        dismissedCommentState = value.toNullableFieldState()
      }

    private var dismissedReasonState: FieldState<InlineDependabotAlertDismissedReasonX898acc69?> =
        FieldState.Absent

    /**
     * The reason that the alert was dismissed.
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissedReason: InlineDependabotAlertDismissedReasonX898acc69?
      get() = dismissedReasonState.valueOrNull()
      set(`value`) {
        dismissedReasonState = value.toNullableFieldState()
      }

    private var fixedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var fixedAt: String?
      get() = fixedAtState.valueOrNull()
      set(`value`) {
        fixedAtState = value.toNullableFieldState()
      }

    private var assigneesState: FieldState<List<SimpleUser>> = FieldState.Absent

    /**
     * The users assigned to this alert.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var assignees: List<SimpleUser>?
      get() = assigneesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "assignees is not nullable; call unsetAssignees() to omit it" }
        assigneesState = FieldState.Value(present)
      }

    private var autoDismissedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var autoDismissedAt: String?
      get() = autoDismissedAtState.valueOrNull()
      set(`value`) {
        autoDismissedAtState = value.toNullableFieldState()
      }

    private var dismissalRequestState: FieldState<DependabotAlertDismissalRequestSimple?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var dismissalRequest: DependabotAlertDismissalRequestSimple?
      get() = dismissalRequestState.valueOrNull()
      set(`value`) {
        dismissalRequestState = value.toNullableFieldState()
      }

    /**
     * Omits `assignees` from serialized output.
     */
    public fun unsetAssignees() {
      assigneesState = FieldState.Absent
    }

    /**
     * Omits `auto_dismissed_at` from serialized output.
     */
    public fun unsetAutoDismissedAt() {
      autoDismissedAtState = FieldState.Absent
    }

    /**
     * Omits `dismissal_request` from serialized output.
     */
    public fun unsetDismissalRequest() {
      dismissalRequestState = FieldState.Absent
    }

    public fun build(): DependabotAlert {
      check(createdAtValue != null) { "createdAt is required" }
      check(dependencyValue != null) { "dependency is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(numberValue != null) { "number is required" }
      check(securityAdvisoryValue != null) { "securityAdvisory is required" }
      check(securityVulnerabilityValue != null) { "securityVulnerability is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(dismissedAtState !== FieldState.Absent) { "dismissedAt is required, even when null" }
      check(dismissedByState !== FieldState.Absent) { "dismissedBy is required, even when null" }
      check(dismissedCommentState !== FieldState.Absent) { "dismissedComment is required, even when null" }
      check(dismissedReasonState !== FieldState.Absent) { "dismissedReason is required, even when null" }
      check(fixedAtState !== FieldState.Absent) { "fixedAt is required, even when null" }
      return DependabotAlert(
        createdAt = createdAt,
        dependency = dependency,
        dismissedAt = dismissedAtState.valueOrNull(),
        dismissedBy = dismissedByState.valueOrNull(),
        dismissedComment = dismissedCommentState.valueOrNull(),
        dismissedReason = dismissedReasonState.valueOrNull(),
        fixedAt = fixedAtState.valueOrNull(),
        htmlUrl = htmlUrl,
        number = number,
        securityAdvisory = securityAdvisory,
        securityVulnerability = securityVulnerability,
        state = state,
        updatedAt = updatedAt,
        url = url,
        assigneesState = assigneesState,
        autoDismissedAtState = autoDismissedAtState,
        dismissalRequestState = dismissalRequestState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DependabotAlert = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DependabotAlert> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DependabotAlert {
      val jsonDecoder = decoder.requireJsonDecoder("DependabotAlert")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DependabotAlert must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val dependency = json.decodeRequired<InlineDependabotAlertDependencyX5297f633>(rawObject, "dependency")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val securityAdvisory = json.decodeRequired<DependabotAlertSecurityAdvisory>(rawObject, "security_advisory")
      val securityVulnerability = json.decodeRequired<DependabotAlertSecurityVulnerability>(rawObject, "security_vulnerability")
      val state = json.decodeRequired<InlineDependabotAlertStateXb785b8c7>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("dismissed_at")) {
        throw SerializationException("DependabotAlert is missing required property 'dismissed_at'")
      }
      val dismissedAt = rawObject["dismissed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("dismissed_by")) {
        throw SerializationException("DependabotAlert is missing required property 'dismissed_by'")
      }
      val dismissedBy = rawObject["dismissed_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("dismissed_comment")) {
        throw SerializationException("DependabotAlert is missing required property 'dismissed_comment'")
      }
      val dismissedComment = rawObject["dismissed_comment"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("dismissed_reason")) {
        throw SerializationException("DependabotAlert is missing required property 'dismissed_reason'")
      }
      val dismissedReason = rawObject["dismissed_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDependabotAlertDismissedReasonX898acc69?>(requireNotNull(element)) }
      if (!rawObject.containsKey("fixed_at")) {
        throw SerializationException("DependabotAlert is missing required property 'fixed_at'")
      }
      val fixedAt = rawObject["fixed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return DependabotAlert(
        createdAt = createdAt,
        dependency = dependency,
        dismissedAt = dismissedAt,
        dismissedBy = dismissedBy,
        dismissedComment = dismissedComment,
        dismissedReason = dismissedReason,
        fixedAt = fixedAt,
        htmlUrl = htmlUrl,
        number = number,
        securityAdvisory = securityAdvisory,
        securityVulnerability = securityVulnerability,
        state = state,
        updatedAt = updatedAt,
        url = url,
        assigneesState = json.decodeOptional(rawObject, "assignees", nullable = false),
        autoDismissedAtState = json.decodeOptional(rawObject, "auto_dismissed_at", nullable = true),
        dismissalRequestState = json.decodeOptional(rawObject, "dismissal_request", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: DependabotAlert) {
      val jsonEncoder = encoder.requireJsonEncoder("DependabotAlert")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("dependency", json.encodeToJsonElement(value.dependency))
        put("dismissed_at", value.dismissedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("dismissed_by", value.dismissedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("dismissed_comment", value.dismissedComment?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("dismissed_reason", value.dismissedReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("fixed_at", value.fixedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("number", json.encodeToJsonElement(value.number))
        put("security_advisory", json.encodeToJsonElement(value.securityAdvisory))
        put("security_vulnerability", json.encodeToJsonElement(value.securityVulnerability))
        put("state", json.encodeToJsonElement(value.state))
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("auto_dismissed_at", value.autoDismissedAtState, json::encodeToJsonElement)
        putState("dismissal_request", value.dismissalRequestState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun dependabotAlert(block: DependabotAlert.Builder.() -> Unit): DependabotAlert = DependabotAlert.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DependabotAlert is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("DependabotAlert property '" + name + "' is not nullable")
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
