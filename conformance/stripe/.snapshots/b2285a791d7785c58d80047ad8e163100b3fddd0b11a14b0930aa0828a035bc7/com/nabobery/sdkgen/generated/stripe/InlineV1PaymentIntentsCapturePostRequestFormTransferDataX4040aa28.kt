package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * The parameters that you can use to automatically create a transfer after the payment
 * is captured. Learn more about the [use case for connected
 * accounts](https://docs.stripe.com/payments/connected-accounts).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/transfer_data
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28(
  public val amount: Int? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public fun build(): InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28 = InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28(
      amount = amount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28 must be a JSON object")
      return InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28(block: InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28.Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28 = InlineV1PaymentIntentsCapturePostRequestFormTransferDataX4040aa28.build(block)
