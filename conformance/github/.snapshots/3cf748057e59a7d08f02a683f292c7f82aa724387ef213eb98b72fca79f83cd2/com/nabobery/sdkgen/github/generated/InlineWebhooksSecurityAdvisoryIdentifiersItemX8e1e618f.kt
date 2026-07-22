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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/identifiers/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/identifiers/items
 */
@Serializable(with = InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f.Serializer::class)
public class InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f(
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

    public fun build(): InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f(block: InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f.Builder.() -> Unit): InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f = InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
