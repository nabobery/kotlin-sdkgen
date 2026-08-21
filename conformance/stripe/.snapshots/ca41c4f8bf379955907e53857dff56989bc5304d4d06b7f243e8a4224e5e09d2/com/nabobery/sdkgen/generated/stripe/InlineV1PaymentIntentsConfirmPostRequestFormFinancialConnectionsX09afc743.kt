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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_
 * connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_
 * connections
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743(
  public val filters:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsFiltersXeac61079? = null,
  permissions: List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8dae38cc>? = null,
  prefetch: List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX2b00580f>? = null,
  public val returnUrl: String? = null,
) {
  public val permissions:
      List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8dae38cc>? =
      permissions?.let { collection0 -> collection0.toList() }

  public val prefetch:
      List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX2b00580f>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsFiltersXeac61079? = null

    private var permissionsValue:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8dae38cc>? = null

    public var permissions:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8dae38cc>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX2b00580f>? = null

    public var prefetch:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX2b00580f>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public var returnUrl: String? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743 = InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
      returnUrl = returnUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsFiltersXeac61079>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8dae38cc>>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX2b00580f>>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743(block: InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743 = InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743.build(block)
