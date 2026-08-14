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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/alert/proper
 * ties/most_recent_instance/properties/message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/alert/proper
 * ties/most_recent_instance/properties/message
 */
@Serializable(with = InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae.Serializer::class)
public class InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae(
  public val text: String? = null,
) {
  public class Builder {
    public var text: String? = null

    public fun build(): InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae = InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae(
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae must be a JSON object")
      return InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae(
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae(block: InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae.Builder.() -> Unit): InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae = InlineWebhookCodeScanningAea05AlertMostRecentInstanceMessageX049ef4ae.build(block)
