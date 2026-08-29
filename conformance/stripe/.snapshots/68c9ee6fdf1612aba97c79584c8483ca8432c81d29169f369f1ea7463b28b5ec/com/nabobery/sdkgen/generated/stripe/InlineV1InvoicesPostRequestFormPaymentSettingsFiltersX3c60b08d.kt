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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financia
 * l_connections/properties/filters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financia
 * l_connections/properties/filters
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d(
  accountSubcategories: List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX76aa58b7>? = null,
) {
  public val accountSubcategories:
      List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX76aa58b7>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX76aa58b7>? =
        null

    public var accountSubcategories:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX76aa58b7>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d = InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX76aa58b7>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d(block: InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d = InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d.build(block)
