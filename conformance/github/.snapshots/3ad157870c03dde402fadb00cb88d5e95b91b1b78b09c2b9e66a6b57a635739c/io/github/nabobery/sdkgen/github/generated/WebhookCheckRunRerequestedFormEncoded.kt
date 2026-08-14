package io.github.nabobery.sdkgen.github.generated

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
 * The check_run.rerequested webhook encoded with URL encoding
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-rerequested-form-encoded
 */
@Serializable(with = WebhookCheckRunRerequestedFormEncoded.Serializer::class)
public class WebhookCheckRunRerequestedFormEncoded(
  /**
   * A URL-encoded string of the check_run.rerequested JSON payload. The decoded payload is a JSON object.
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

    public fun build(): WebhookCheckRunRerequestedFormEncoded {
      check(payloadValue != null) { "payload is required" }
      return WebhookCheckRunRerequestedFormEncoded(
        payload = payload,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCheckRunRerequestedFormEncoded = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCheckRunRerequestedFormEncoded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCheckRunRerequestedFormEncoded {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCheckRunRerequestedFormEncoded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCheckRunRerequestedFormEncoded must be a JSON object")
      val payload = json.decodeRequired<String>(rawObject, "payload")
      return WebhookCheckRunRerequestedFormEncoded(
        payload = payload,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCheckRunRerequestedFormEncoded) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCheckRunRerequestedFormEncoded")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payload", value.payload)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCheckRunRerequestedFormEncoded(block: WebhookCheckRunRerequestedFormEncoded.Builder.() -> Unit): WebhookCheckRunRerequestedFormEncoded = WebhookCheckRunRerequestedFormEncoded.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCheckRunRerequestedFormEncoded is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
