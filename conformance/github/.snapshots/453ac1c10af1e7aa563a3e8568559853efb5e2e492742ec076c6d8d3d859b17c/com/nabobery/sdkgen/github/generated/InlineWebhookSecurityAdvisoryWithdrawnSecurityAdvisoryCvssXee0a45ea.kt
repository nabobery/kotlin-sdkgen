package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory/pro
 * perties/cvss.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory/pro
 * perties/cvss
 */
@Serializable(with = InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea.Serializer::class)
public class InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
  public val vectorString: String?,
) {
  public class Builder {
    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
      }

    private var vectorStringState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var vectorString: String?
      get() = vectorStringState.valueOrNull()
      set(`value`) {
        vectorStringState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea {
      check(scoreValue != null) { "score is required" }
      check(vectorStringState !== FieldState.Absent) { "vectorString is required, even when null" }
      return InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea(
        score = score,
        vectorString = vectorStringState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea must be a JSON object")
      val score = json.decodeRequired<Double>(rawObject, "score")
      if (!rawObject.containsKey("vector_string")) {
        throw SerializationException("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea is missing required property 'vector_string'")
      }
      val vectorString = rawObject["vector_string"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea(
        score = score,
        vectorString = vectorString,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("score", json.encodeToJsonElement(value.score))
        put("vector_string", value.vectorString?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea(block: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea.Builder.() -> Unit): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea = InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea property '" + name + "' is not nullable")
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
