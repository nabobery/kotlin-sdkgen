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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account
 * /anyOf/0/properties/financial_connections/properties/filters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account
 * /anyOf/0/properties/financial_connections/properties/filters
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745(
  accountSubcategories: List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXc30226da>? = null,
) {
  public val accountSubcategories:
      List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXc30226da>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXc30226da>? = null

    public var accountSubcategories:
        List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXc30226da>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745 = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745 must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXc30226da>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745 = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745.build(block)
