package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/delete/requ
 * estBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/delete/requ
 * estBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08.Serializer::class)
public class InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08(
  expand: List<String>? = null,
  /**
   * Can be set to `true` if `at_period_end` is not set to `true`. Will generate a final invoice that invoices for any
   * un-invoiced metered usage and new/pending proration invoice items.
   */
  public val invoiceNow: Boolean? = null,
  /**
   * Can be set to `true` if `at_period_end` is not set to `true`. Will generate a proration invoice item that credits
   * remaining unused time until the subscription period end.
   */
  public val prorate: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Can be set to `true` if `at_period_end` is not set to `true`. Will generate a final invoice that invoices for any
     * un-invoiced metered usage and new/pending proration invoice items.
     */
    public var invoiceNow: Boolean? = null

    /**
     * Can be set to `true` if `at_period_end` is not set to `true`. Will generate a proration invoice item that credits
     * remaining unused time until the subscription period end.
     */
    public var prorate: Boolean? = null

    public fun build(): InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08 = InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08(
      expand = expand,
      invoiceNow = invoiceNow,
      prorate = prorate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08 must be a JSON object")
      return InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        invoiceNow = rawObject["invoice_now"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        prorate = rawObject["prorate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.invoiceNow?.let { put("invoice_now", json.encodeToJsonElement(it)) }
        value.prorate?.let { put("prorate", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08(block: InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08.Builder.() -> Unit): InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08 = InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08.build(block)
