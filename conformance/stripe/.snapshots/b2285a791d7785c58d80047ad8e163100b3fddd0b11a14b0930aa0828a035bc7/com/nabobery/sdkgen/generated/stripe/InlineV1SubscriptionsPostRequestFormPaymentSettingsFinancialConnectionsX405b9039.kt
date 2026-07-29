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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/fin
 * ancial_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/fin
 * ancial_connections
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039(
  public val filters: InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230? = null,
  permissions: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773>? = null,
  prefetch: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX24f386c6>? = null,
) {
  public val permissions: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773>? =
      permissions?.let { collection0 -> collection0.toList() }

  public val prefetch: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX24f386c6>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters: InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230? = null

    private var permissionsValue:
        List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773>? = null

    public var permissions: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue:
        List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX24f386c6>? = null

    public var prefetch: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX24f386c6>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039 = InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773>>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX24f386c6>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039")
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

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039 = InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX405b9039.build(block)
