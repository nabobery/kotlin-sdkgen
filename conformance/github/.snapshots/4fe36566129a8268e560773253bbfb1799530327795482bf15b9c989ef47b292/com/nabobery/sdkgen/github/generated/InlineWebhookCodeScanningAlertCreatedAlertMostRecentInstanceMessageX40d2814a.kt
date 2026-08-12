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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-created/properties/alert/properties/most
 * _recent_instance/properties/message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-created/properties/alert/properties/most
 * _recent_instance/properties/message
 */
@Serializable(with = InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a.Serializer::class)
public class InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a(
  public val text: String? = null,
) {
  public class Builder {
    public var text: String? = null

    public fun build(): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a = InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a(
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a must be a JSON object")
      return InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a(
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a(block: InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a.Builder.() -> Unit): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a = InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceMessageX40d2814a.build(block)
