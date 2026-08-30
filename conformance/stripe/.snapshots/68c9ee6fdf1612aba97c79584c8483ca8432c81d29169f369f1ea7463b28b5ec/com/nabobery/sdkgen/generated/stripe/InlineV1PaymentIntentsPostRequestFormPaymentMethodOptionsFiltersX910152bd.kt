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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_connectio
 * ns/properties/filters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_connectio
 * ns/properties/filters
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd(
  accountSubcategories: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX6d549d57>? = null,
) {
  public val accountSubcategories:
      List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX6d549d57>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX6d549d57>? = null

    public var accountSubcategories:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX6d549d57>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX6d549d57>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX910152bd.build(block)
