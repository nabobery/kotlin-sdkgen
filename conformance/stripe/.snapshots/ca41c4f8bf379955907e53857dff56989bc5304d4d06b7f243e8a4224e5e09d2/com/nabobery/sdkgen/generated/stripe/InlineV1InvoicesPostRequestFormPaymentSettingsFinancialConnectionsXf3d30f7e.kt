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
 * l_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financia
 * l_connections
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e(
  public val filters: InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d? = null,
  permissions: List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX7f2ab120>? = null,
  prefetch: List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX12539eaa>? = null,
) {
  public val permissions:
      List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX7f2ab120>? =
      permissions?.let { collection0 -> collection0.toList() }

  public val prefetch:
      List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX12539eaa>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters: InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d? = null

    private var permissionsValue:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX7f2ab120>? =
        null

    public var permissions:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX7f2ab120>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX12539eaa>? =
        null

    public var prefetch:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX12539eaa>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e = InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsFiltersX3c60b08d>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX7f2ab120>>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX12539eaa>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e")
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

public fun inlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e(block: InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e = InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e.build(block)
