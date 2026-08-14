package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account/anyOf/0/properties/financial_connections/properties/filters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account/anyOf/0/properties/financial_connections/properties/filters
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef(
  accountSubcategories: List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d>? = null,
) {
  public val accountSubcategories:
      List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d>? = null

    public var accountSubcategories:
        List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef.build(block)
