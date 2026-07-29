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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_op
 * tions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_op
 * tions
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7(
  public val collectionMethod:
      InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef? = null,
) {
  public class Builder {
    public var collectionMethod:
        InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7 = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7(
      collectionMethod = collectionMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7(
        collectionMethod = rawObject["collection_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7 = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7.build(block)
