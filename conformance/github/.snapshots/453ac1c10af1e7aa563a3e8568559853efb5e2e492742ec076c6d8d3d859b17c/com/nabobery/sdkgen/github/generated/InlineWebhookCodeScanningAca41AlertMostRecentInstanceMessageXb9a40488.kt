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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/most_recent_instance/properties/message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/most_recent_instance/properties/message
 */
@Serializable(with = InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488.Serializer::class)
public class InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488(
  public val text: String? = null,
) {
  public class Builder {
    public var text: String? = null

    public fun build(): InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488 = InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488(
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488 must be a JSON object")
      return InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488(
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488(block: InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488.Builder.() -> Unit): InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488 = InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488.build(block)
