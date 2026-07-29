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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/most_recent_instance/properties/message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/most_recent_instance/properties/message
 */
@Serializable(with = InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd.Serializer::class)
public class InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd(
  public val text: String? = null,
) {
  public class Builder {
    public var text: String? = null

    public fun build(): InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd = InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd(
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd must be a JSON object")
      return InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd(
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd(block: InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd.Builder.() -> Unit): InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd = InlineWebhookCodeScanningA2384AlertMostRecentInstanceMessageX8e8190dd.build(block)
