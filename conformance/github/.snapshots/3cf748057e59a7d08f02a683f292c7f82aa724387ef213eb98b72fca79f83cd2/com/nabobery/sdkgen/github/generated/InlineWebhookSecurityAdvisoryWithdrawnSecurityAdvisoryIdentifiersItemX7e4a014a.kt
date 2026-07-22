package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory/pro
 * perties/identifiers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory/pro
 * perties/identifiers/items
 */
@Serializable(with = InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a.Serializer::class)
public class InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a(
  public val type: String,
  public val `value`: String,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a(block: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a.Builder.() -> Unit): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a = InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
