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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_changes/properties/body.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_changes/properties/body
 */
@Serializable(with = InlineWebhooksChangesBodyXa38d6b09.Serializer::class)
public class InlineWebhooksChangesBodyXa38d6b09(
  /**
   * The previous version of the body.
   */
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhooksChangesBodyXa38d6b09 {
      check(fromValue != null) { "from is required" }
      return InlineWebhooksChangesBodyXa38d6b09(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksChangesBodyXa38d6b09 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksChangesBodyXa38d6b09> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksChangesBodyXa38d6b09 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksChangesBodyXa38d6b09")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksChangesBodyXa38d6b09 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhooksChangesBodyXa38d6b09(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksChangesBodyXa38d6b09) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksChangesBodyXa38d6b09")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksChangesBodyXa38d6b09(block: InlineWebhooksChangesBodyXa38d6b09.Builder.() -> Unit): InlineWebhooksChangesBodyXa38d6b09 = InlineWebhooksChangesBodyXa38d6b09.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksChangesBodyXa38d6b09 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
