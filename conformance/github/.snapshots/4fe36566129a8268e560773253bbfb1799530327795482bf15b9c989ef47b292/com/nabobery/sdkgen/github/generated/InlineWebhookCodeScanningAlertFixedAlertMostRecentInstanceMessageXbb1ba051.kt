package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/most_r
 * ecent_instance/properties/message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/most_r
 * ecent_instance/properties/message
 */
@Serializable(with = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051.Serializer::class)
public class InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051(
  public val text: String? = null,
) {
  public class Builder {
    public var text: String? = null

    public fun build(): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051 = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051(
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051 must be a JSON object")
      return InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051(
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051(block: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051.Builder.() -> Unit): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051 = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051.build(block)
