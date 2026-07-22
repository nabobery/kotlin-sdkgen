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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened/properties/alert/properties/mos
 * t_recent_instance/properties/message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened/properties/alert/properties/mos
 * t_recent_instance/properties/message
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3.Serializer::class)
public class InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3(
  public val text: String? = null,
) {
  public class Builder {
    public var text: String? = null

    public fun build(): InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3 = InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3(
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3 must be a JSON object")
      return InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3(
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3(block: InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3.Builder.() -> Unit): InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3 = InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceMessageX0a5d5ae3.build(block)
