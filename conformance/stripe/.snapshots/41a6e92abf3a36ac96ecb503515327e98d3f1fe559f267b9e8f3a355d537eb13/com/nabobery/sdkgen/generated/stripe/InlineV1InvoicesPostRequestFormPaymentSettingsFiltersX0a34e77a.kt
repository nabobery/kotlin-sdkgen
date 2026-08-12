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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properti
 * es/financial_connections/properties/filters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properti
 * es/financial_connections/properties/filters
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a(
  accountSubcategories: List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX8a700296>? = null,
) {
  public val accountSubcategories:
      List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX8a700296>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX8a700296>? =
        null

    public var accountSubcategories:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX8a700296>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a = InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX8a700296>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a(block: InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a = InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a.build(block)
