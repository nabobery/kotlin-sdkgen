package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a(
  public val filters:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df? = null,
  permissions: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXebe38980>? = null,
  prefetch: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX2c1f6012>? = null,
  public val returnUrl: String? = null,
) {
  public val permissions:
      List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXebe38980>? =
      permissions?.let { collection0 -> collection0.toList() }

  public val prefetch: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX2c1f6012>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df? =
        null

    private var permissionsValue:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXebe38980>? = null

    public var permissions:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXebe38980>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX2c1f6012>? = null

    public var prefetch: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX2c1f6012>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public var returnUrl: String? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a = InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
      returnUrl = returnUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXebe38980>>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX2c1f6012>>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a(block: InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a = InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a.build(block)
