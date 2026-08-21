package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_connections/propert
 * ies/filters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_connections/propert
 * ies/filters
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6(
  accountSubcategories: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX33db4df8>? = null,
) {
  public val accountSubcategories:
      List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX33db4df8>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX33db4df8>? = null

    public var accountSubcategories:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX33db4df8>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX33db4df8>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6.build(block)
