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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122(
  public val tax: InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxX47ce7ec9? = null,
) {
  public class Builder {
    public var tax: InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxX47ce7ec9? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122 = InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122(
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122(
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxX47ce7ec9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122(block: InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122 = InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsXfc33d122.build(block)
