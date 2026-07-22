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
 * The webhooks ping payload encoded with URL encoding.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-ping-form-encoded
 */
@Serializable(with = WebhookPingFormEncoded.Serializer::class)
public class WebhookPingFormEncoded(
  /**
   * A URL-encoded string of the ping JSON payload. The decoded payload is a JSON object.
   */
  public val payload: String,
) {
  public class Builder {
    private var payloadValue: String? = null

    public var payload: String
      get() = requireNotNull(payloadValue) { "payload is required" }
      set(`value`) {
        payloadValue = value
      }

    public fun build(): WebhookPingFormEncoded {
      check(payloadValue != null) { "payload is required" }
      return WebhookPingFormEncoded(
        payload = payload,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPingFormEncoded = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookPingFormEncoded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPingFormEncoded {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPingFormEncoded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPingFormEncoded must be a JSON object")
      val payload = json.decodeRequired<String>(rawObject, "payload")
      return WebhookPingFormEncoded(
        payload = payload,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPingFormEncoded) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPingFormEncoded")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payload", value.payload)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookPingFormEncoded(block: WebhookPingFormEncoded.Builder.() -> Unit): WebhookPingFormEncoded = WebhookPingFormEncoded.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPingFormEncoded is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
