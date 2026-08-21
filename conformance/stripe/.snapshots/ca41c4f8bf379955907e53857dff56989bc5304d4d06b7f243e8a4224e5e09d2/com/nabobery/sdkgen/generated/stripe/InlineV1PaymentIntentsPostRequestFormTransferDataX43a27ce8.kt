package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Use this parameter to automatically create a Transfer when the payment succeeds. Learn more about the [use case for
 * connected accounts](https://docs.stripe.com/payments/connected-accounts).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/transfer_data
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8(
  public val amount: Int? = null,
  public val description: String? = null,
  public val metadata: InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355? = null,
  public val paymentData:
      InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var description: String? = null

    public var metadata: InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355? = null

    public var paymentData: InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8 = InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8(
      amount = amount,
      description = description,
      metadata = metadata,
      paymentData = paymentData,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355>(it) },
        paymentData = rawObject["payment_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.paymentData?.let { put("payment_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8(block: InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8 = InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8.build(block)
