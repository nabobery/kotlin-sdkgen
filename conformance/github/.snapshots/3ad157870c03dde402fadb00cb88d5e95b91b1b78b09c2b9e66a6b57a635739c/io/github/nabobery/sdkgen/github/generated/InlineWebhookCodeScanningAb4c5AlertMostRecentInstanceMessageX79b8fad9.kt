package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/most_recent_instance/properties/message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/most_recent_instance/properties/message
 */
@Serializable(with = InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9.Serializer::class)
public class InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9(
  public val text: String? = null,
) {
  public class Builder {
    public var text: String? = null

    public fun build(): InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9 = InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9(
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9 must be a JSON object")
      return InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9(
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9(block: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9.Builder.() -> Unit): InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9 = InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9.build(block)
