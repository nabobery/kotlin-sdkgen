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
 * The check_run.created webhook encoded with URL encoding
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-created-form-encoded
 */
@Serializable(with = WebhookCheckRunCreatedFormEncoded.Serializer::class)
public class WebhookCheckRunCreatedFormEncoded(
  /**
   * A URL-encoded string of the check_run.created JSON payload. The decoded payload is a JSON object.
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

    public fun build(): WebhookCheckRunCreatedFormEncoded {
      check(payloadValue != null) { "payload is required" }
      return WebhookCheckRunCreatedFormEncoded(
        payload = payload,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCheckRunCreatedFormEncoded = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCheckRunCreatedFormEncoded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCheckRunCreatedFormEncoded {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCheckRunCreatedFormEncoded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCheckRunCreatedFormEncoded must be a JSON object")
      val payload = json.decodeRequired<String>(rawObject, "payload")
      return WebhookCheckRunCreatedFormEncoded(
        payload = payload,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCheckRunCreatedFormEncoded) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCheckRunCreatedFormEncoded")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payload", value.payload)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCheckRunCreatedFormEncoded(block: WebhookCheckRunCreatedFormEncoded.Builder.() -> Unit): WebhookCheckRunCreatedFormEncoded = WebhookCheckRunCreatedFormEncoded.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCheckRunCreatedFormEncoded is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
