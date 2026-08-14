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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-location-created-form-encoded.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-location-created-form-encoded
 */
@Serializable(with = WebhookSecretScanningAlertLocationCreatedFormEncoded.Serializer::class)
public class WebhookSecretScanningAlertLocationCreatedFormEncoded(
  /**
   * A URL-encoded string of the secret_scanning_alert_location.created JSON payload. The decoded payload is a JSON
   * object.
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

    public fun build(): WebhookSecretScanningAlertLocationCreatedFormEncoded {
      check(payloadValue != null) { "payload is required" }
      return WebhookSecretScanningAlertLocationCreatedFormEncoded(
        payload = payload,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSecretScanningAlertLocationCreatedFormEncoded = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSecretScanningAlertLocationCreatedFormEncoded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSecretScanningAlertLocationCreatedFormEncoded {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSecretScanningAlertLocationCreatedFormEncoded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSecretScanningAlertLocationCreatedFormEncoded must be a JSON object")
      val payload = json.decodeRequired<String>(rawObject, "payload")
      return WebhookSecretScanningAlertLocationCreatedFormEncoded(
        payload = payload,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSecretScanningAlertLocationCreatedFormEncoded) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSecretScanningAlertLocationCreatedFormEncoded")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payload", value.payload)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSecretScanningAlertLocationCreatedFormEncoded(block: WebhookSecretScanningAlertLocationCreatedFormEncoded.Builder.() -> Unit): WebhookSecretScanningAlertLocationCreatedFormEncoded = WebhookSecretScanningAlertLocationCreatedFormEncoded.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSecretScanningAlertLocationCreatedFormEncoded is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
