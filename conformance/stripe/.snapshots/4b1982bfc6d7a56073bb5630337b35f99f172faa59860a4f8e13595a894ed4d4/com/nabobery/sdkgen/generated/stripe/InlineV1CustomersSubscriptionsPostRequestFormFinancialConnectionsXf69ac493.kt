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
 * /anyOf/0/properties/financial_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account
 * /anyOf/0/properties/financial_connections
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493(
  public val filters:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745? = null,
  permissions: List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX7ba141a6>? = null,
  prefetch: List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXb07a3dc6>? = null,
) {
  public val permissions:
      List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX7ba141a6>? =
      permissions?.let { collection0 -> collection0.toList() }

  public val prefetch:
      List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXb07a3dc6>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745? = null

    private var permissionsValue:
        List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX7ba141a6>? = null

    public var permissions:
        List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX7ba141a6>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue:
        List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXb07a3dc6>? = null

    public var prefetch:
        List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXb07a3dc6>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493 = InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493 must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersX41444745>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX7ba141a6>>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXb07a3dc6>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493")
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

public fun inlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493(block: InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493 = InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXf69ac493.build(block)
