package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/rule.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/rule
 */
@Serializable(with = InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea.Serializer::class)
public class InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea internal constructor(
  /**
   * A short description of the rule used to detect the alert.
   */
  public val description: String,
  /**
   * A unique identifier for the rule used to detect the alert.
   */
  public val id: String,
  /**
   * The severity of the alert.
   */
  public val severity: InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9?,
  private val fullDescriptionState: FieldState<String>,
  private val helpState: FieldState<String?>,
  private val helpUriState: FieldState<String?>,
  private val nameState: FieldState<String>,
  tagsState: FieldState<List<String>?>,
) {
  private val tagsState: FieldState<List<String>?> =
      tagsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  public val fullDescription: String?
    get() = fullDescriptionState.valueOrNull()

  public val help: String?
    get() = helpState.valueOrNull()

  /**
   * A link to the documentation for the rule used to detect the alert.
   */
  public val helpUri: String?
    get() = helpUriState.valueOrNull()

  public val name: String?
    get() = nameState.valueOrNull()

  public val tags: List<String>?
    get() = tagsState.valueOrNull()

  public constructor(
    description: String,
    id: String,
    severity: InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9?,
  ) : this(description = description,
  id = id,
  severity = severity,
  fullDescriptionState = FieldState.Absent,
  helpState = FieldState.Absent,
  helpUriState = FieldState.Absent,
  nameState = FieldState.Absent,
  tagsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `full_description`.
   */
  public fun fullDescriptionPresence(): FieldPresence = fullDescriptionState.presence

  /**
   * Returns the wire presence of `help`.
   */
  public fun helpPresence(): FieldPresence = helpState.presence

  /**
   * Returns the wire presence of `help_uri`.
   */
  public fun helpUriPresence(): FieldPresence = helpUriState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `tags`.
   */
  public fun tagsPresence(): FieldPresence = tagsState.presence

  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var severityState:
        FieldState<InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9?> =
        FieldState.Absent

    /**
     * The severity of the alert.
     * Required nullable field; assigning `null` records present-null.
     */
    public var severity: InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9?
      get() = severityState.valueOrNull()
      set(`value`) {
        severityState = value.toNullableFieldState()
      }

    private var fullDescriptionState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var fullDescription: String?
      get() = fullDescriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "fullDescription is not nullable; call unsetFullDescription() to omit it" }
        fullDescriptionState = FieldState.Value(present)
      }

    private var helpState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var help: String?
      get() = helpState.valueOrNull()
      set(`value`) {
        helpState = value.toNullableFieldState()
      }

    private var helpUriState: FieldState<String?> = FieldState.Absent

    /**
     * A link to the documentation for the rule used to detect the alert.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var helpUri: String?
      get() = helpUriState.valueOrNull()
      set(`value`) {
        helpUriState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var tagsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var tags: List<String>?
      get() = tagsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tagsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    /**
     * Omits `full_description` from serialized output.
     */
    public fun unsetFullDescription() {
      fullDescriptionState = FieldState.Absent
    }

    /**
     * Omits `help` from serialized output.
     */
    public fun unsetHelp() {
      helpState = FieldState.Absent
    }

    /**
     * Omits `help_uri` from serialized output.
     */
    public fun unsetHelpUri() {
      helpUriState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `tags` from serialized output.
     */
    public fun unsetTags() {
      tagsState = FieldState.Absent
    }

    public fun build(): InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea {
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(severityState !== FieldState.Absent) { "severity is required, even when null" }
      return InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea(
        description = description,
        id = id,
        severity = severityState.valueOrNull(),
        fullDescriptionState = fullDescriptionState,
        helpState = helpState,
        helpUriState = helpUriState,
        nameState = nameState,
        tagsState = tagsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<String>(rawObject, "id")
      if (!rawObject.containsKey("severity")) {
        throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea is missing required property 'severity'")
      }
      val severity = rawObject["severity"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9?>(requireNotNull(element)) }
      return InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea(
        description = description,
        id = id,
        severity = severity,
        fullDescriptionState = json.decodeOptional(rawObject, "full_description", nullable = false),
        helpState = json.decodeOptional(rawObject, "help", nullable = true),
        helpUriState = json.decodeOptional(rawObject, "help_uri", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        tagsState = json.decodeOptional(rawObject, "tags", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("id", value.id)
        put("severity", value.severity?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("full_description", value.fullDescriptionState, json::encodeToJsonElement)
        putState("help", value.helpState, json::encodeToJsonElement)
        putState("help_uri", value.helpUriState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("tags", value.tagsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea(block: InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea.Builder.() -> Unit): InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea = InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertRuleX7c3281ea property '" + name + "' is not nullable")
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
