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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_acc
 * ount/anyOf/0/properties/financial_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_acc
 * ount/anyOf/0/properties/financial_connections
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584(
  public val filters: InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersXc9241378? = null,
  permissions: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXec9b32a0>? = null,
  prefetch: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX28f4e986>? = null,
) {
  public val permissions: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXec9b32a0>? =
      permissions?.let { collection0 -> collection0.toList() }

  public val prefetch: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX28f4e986>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters: InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersXc9241378? = null

    private var permissionsValue:
        List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXec9b32a0>? = null

    public var permissions: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXec9b32a0>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue:
        List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX28f4e986>? = null

    public var prefetch: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX28f4e986>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584 = InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersXc9241378>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXec9b32a0>>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX28f4e986>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584")
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

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584 = InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584.build(block)
