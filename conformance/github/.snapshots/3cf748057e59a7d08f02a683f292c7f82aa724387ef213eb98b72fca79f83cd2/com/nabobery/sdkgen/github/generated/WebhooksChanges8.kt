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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_changes_8.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_changes_8
 */
@Serializable(with = WebhooksChanges8.Serializer::class)
public class WebhooksChanges8(
  public val tier: InlineWebhooksChanges8TierX6606caa4,
) {
  public class Builder {
    private var tierValue: InlineWebhooksChanges8TierX6606caa4? = null

    public var tier: InlineWebhooksChanges8TierX6606caa4
      get() = requireNotNull(tierValue) { "tier is required" }
      set(`value`) {
        tierValue = value
      }

    public fun build(): WebhooksChanges8 {
      check(tierValue != null) { "tier is required" }
      return WebhooksChanges8(
        tier = tier,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksChanges8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhooksChanges8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksChanges8 {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksChanges8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksChanges8 must be a JSON object")
      val tier = json.decodeRequired<InlineWebhooksChanges8TierX6606caa4>(rawObject, "tier")
      return WebhooksChanges8(
        tier = tier,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksChanges8) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksChanges8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tier", json.encodeToJsonElement(value.tier))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksChanges8(block: WebhooksChanges8.Builder.() -> Unit): WebhooksChanges8 = WebhooksChanges8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksChanges8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
