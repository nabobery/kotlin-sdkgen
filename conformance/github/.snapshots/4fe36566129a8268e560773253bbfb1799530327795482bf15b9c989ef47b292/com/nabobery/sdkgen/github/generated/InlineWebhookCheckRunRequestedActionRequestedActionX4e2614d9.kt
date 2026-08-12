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
 * The action requested by the user.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-requested-action/properties/requested_action
 */
@Serializable(with = InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9.Serializer::class)
public class InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9(
  /**
   * The integrator reference of the action requested by the user.
   */
  public val identifier: String? = null,
) {
  public class Builder {
    /**
     * The integrator reference of the action requested by the user.
     */
    public var identifier: String? = null

    public fun build(): InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9 = InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9(
      identifier = identifier,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9 must be a JSON object")
      return InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9(
        identifier = rawObject["identifier"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.identifier?.let { put("identifier", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9(block: InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9.Builder.() -> Unit): InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9 = InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9.build(block)
