package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/transfer_data/properties/payment_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/transfer_data/properties/payment_data
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a(
  public val description: String? = null,
  public val metadata:
      InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61? = null,
) {
  public class Builder {
    public var description: String? = null

    public var metadata:
        InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a = InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a(
      description = description,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a(block: InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a = InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX28fb9b6a.build(block)
