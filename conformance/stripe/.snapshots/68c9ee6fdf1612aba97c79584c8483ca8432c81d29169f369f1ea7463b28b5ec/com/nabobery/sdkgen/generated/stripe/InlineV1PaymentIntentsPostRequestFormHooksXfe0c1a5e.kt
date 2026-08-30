package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Automations to be run during the PaymentIntent lifecycle
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/hooks
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e(
  public val inputs: InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a? = null,
) {
  public class Builder {
    public var inputs: InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e = InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e(
      inputs = inputs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e(
        inputs = rawObject["inputs"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormHooksInputsX74f1718a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.inputs?.let { put("inputs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e(block: InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e = InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e.build(block)
