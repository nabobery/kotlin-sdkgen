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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5(
  public val inputs: InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122? = null,
) {
  public class Builder {
    public var inputs: InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5 = InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5(
      inputs = inputs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5(
        inputs = rawObject["inputs"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.inputs?.let { put("inputs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5(block: InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5 = InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5.build(block)
