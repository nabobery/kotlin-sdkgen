package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_connections
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd(
  public val filters:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6? = null,
  permissions: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXe682c706>? = null,
  prefetch: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9>? = null,
  public val returnUrl: String? = null,
) {
  public val permissions:
      List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXe682c706>? =
      permissions?.let { collection0 -> collection0.toList() }

  public val prefetch: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9>?
      = prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6? =
        null

    private var permissionsValue:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXe682c706>? = null

    public var permissions:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXe682c706>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9>? = null

    public var prefetch:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public var returnUrl: String? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd = InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
      returnUrl = returnUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFiltersX84df4cf6>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXe682c706>>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9>>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd")
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

public fun inlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd(block: InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd = InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd.build(block)
