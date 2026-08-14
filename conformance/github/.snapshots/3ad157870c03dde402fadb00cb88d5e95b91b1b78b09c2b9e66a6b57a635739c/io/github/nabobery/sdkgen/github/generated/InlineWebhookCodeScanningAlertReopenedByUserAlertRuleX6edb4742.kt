package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/alert/proper
 * ties/rule.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/alert/proper
 * ties/rule
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742.Serializer::class)
public class InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742(
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
  public val severity: InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42?,
) {
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
        FieldState<InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42?> =
        FieldState.Absent

    /**
     * The severity of the alert.
     * Required nullable field; assigning `null` records present-null.
     */
    public var severity: InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42?
      get() = severityState.valueOrNull()
      set(`value`) {
        severityState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742 {
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(severityState !== FieldState.Absent) { "severity is required, even when null" }
      return InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742(
        description = description,
        id = id,
        severity = severityState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742 must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<String>(rawObject, "id")
      if (!rawObject.containsKey("severity")) {
        throw SerializationException("InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742 is missing required property 'severity'")
      }
      val severity = rawObject["severity"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42?>(requireNotNull(element)) }
      return InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742(
        description = description,
        id = id,
        severity = severity,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("id", value.id)
        put("severity", value.severity?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742(block: InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742.Builder.() -> Unit): InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742 = InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookCodeScanningAlertReopenedByUserAlertRuleX6edb4742 property '" + name + "' is not nullable")
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
