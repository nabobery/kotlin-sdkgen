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
 * The check_run.requested_action webhook encoded with URL encoding
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-requested-action-form-encoded
 */
@Serializable(with = WebhookCheckRunRequestedActionFormEncoded.Serializer::class)
public class WebhookCheckRunRequestedActionFormEncoded(
  /**
   * A URL-encoded string of the check_run.requested_action JSON payload. The decoded payload is a JSON object.
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

    public fun build(): WebhookCheckRunRequestedActionFormEncoded {
      check(payloadValue != null) { "payload is required" }
      return WebhookCheckRunRequestedActionFormEncoded(
        payload = payload,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCheckRunRequestedActionFormEncoded = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookCheckRunRequestedActionFormEncoded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCheckRunRequestedActionFormEncoded {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCheckRunRequestedActionFormEncoded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCheckRunRequestedActionFormEncoded must be a JSON object")
      val payload = json.decodeRequired<String>(rawObject, "payload")
      return WebhookCheckRunRequestedActionFormEncoded(
        payload = payload,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCheckRunRequestedActionFormEncoded) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCheckRunRequestedActionFormEncoded")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payload", value.payload)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCheckRunRequestedActionFormEncoded(block: WebhookCheckRunRequestedActionFormEncoded.Builder.() -> Unit): WebhookCheckRunRequestedActionFormEncoded = WebhookCheckRunRequestedActionFormEncoded.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCheckRunRequestedActionFormEncoded is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
