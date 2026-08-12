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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14(
  public val collectionMethod:
      InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c? = null,
) {
  public class Builder {
    public var collectionMethod: InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14(
      collectionMethod = collectionMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14(
        collectionMethod = rawObject["collection_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14.build(block)
