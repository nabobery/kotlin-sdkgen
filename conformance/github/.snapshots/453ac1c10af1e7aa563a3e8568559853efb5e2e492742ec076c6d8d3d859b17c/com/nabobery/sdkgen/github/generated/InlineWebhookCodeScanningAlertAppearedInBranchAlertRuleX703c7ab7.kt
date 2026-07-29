package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/rule.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/rule
 */
@Serializable(with = InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7.Serializer::class)
public class InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7(
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
  public val severity: InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba?,
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
        FieldState<InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba?> =
        FieldState.Absent

    /**
     * The severity of the alert.
     * Required nullable field; assigning `null` records present-null.
     */
    public var severity: InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba?
      get() = severityState.valueOrNull()
      set(`value`) {
        severityState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7 {
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(severityState !== FieldState.Absent) { "severity is required, even when null" }
      return InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7(
        description = description,
        id = id,
        severity = severityState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7 must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<String>(rawObject, "id")
      if (!rawObject.containsKey("severity")) {
        throw SerializationException("InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7 is missing required property 'severity'")
      }
      val severity = rawObject["severity"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba?>(requireNotNull(element)) }
      return InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7(
        description = description,
        id = id,
        severity = severity,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7")
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

public fun inlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7(block: InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7.Builder.() -> Unit): InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7 = InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleX703c7ab7 property '" + name + "' is not nullable")
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
