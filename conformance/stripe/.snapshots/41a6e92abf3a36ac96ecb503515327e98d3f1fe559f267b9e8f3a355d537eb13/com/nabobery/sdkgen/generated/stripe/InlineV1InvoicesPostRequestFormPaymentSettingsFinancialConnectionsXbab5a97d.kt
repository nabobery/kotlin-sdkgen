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
 * es/financial_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properti
 * es/financial_connections
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d(
  public val filters: InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a? = null,
  permissions: List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX10deb169>? = null,
  prefetch: List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd>? = null,
) {
  public val permissions:
      List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX10deb169>? =
      permissions?.let { collection0 -> collection0.toList() }

  public val prefetch:
      List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters: InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a? = null

    private var permissionsValue:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX10deb169>? =
        null

    public var permissions:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX10deb169>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd>? =
        null

    public var prefetch:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d = InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX0a34e77a>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX10deb169>>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d(block: InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d = InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXbab5a97d.build(block)
