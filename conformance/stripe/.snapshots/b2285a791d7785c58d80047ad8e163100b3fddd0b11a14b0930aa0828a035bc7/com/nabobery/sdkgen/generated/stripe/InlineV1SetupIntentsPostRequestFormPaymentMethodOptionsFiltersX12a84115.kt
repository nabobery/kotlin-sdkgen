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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/propert
 * ies/filters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/propert
 * ies/filters
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115(
  accountSubcategories: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e>? = null,
) {
  public val accountSubcategories:
      List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e>? = null

    public var accountSubcategories:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersX12a84115.build(block)
