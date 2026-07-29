package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/delete/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/delete/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1SubscriptionsDeleteRequestFormXf995d88c.Serializer::class)
public class InlineV1SubscriptionsDeleteRequestFormXf995d88c(
  /**
   * Details about why this subscription was cancelled
   */
  public val cancellationDetails:
      InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32? = null,
  expand: List<String>? = null,
  /**
   * Will generate a final invoice that invoices for any un-invoiced metered usage and new/pending proration invoice
   * items. Defaults to `false`.
   */
  public val invoiceNow: Boolean? = null,
  /**
   * Will generate a proration invoice item that credits remaining unused time until the subscription period end.
   * Defaults to `false`.
   */
  public val prorate: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Details about why this subscription was cancelled
     */
    public var cancellationDetails:
        InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32? = null

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
     * Will generate a final invoice that invoices for any un-invoiced metered usage and new/pending proration invoice
     * items. Defaults to `false`.
     */
    public var invoiceNow: Boolean? = null

    /**
     * Will generate a proration invoice item that credits remaining unused time until the subscription period end.
     * Defaults to `false`.
     */
    public var prorate: Boolean? = null

    public fun build(): InlineV1SubscriptionsDeleteRequestFormXf995d88c = InlineV1SubscriptionsDeleteRequestFormXf995d88c(
      cancellationDetails = cancellationDetails,
      expand = expand,
      invoiceNow = invoiceNow,
      prorate = prorate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsDeleteRequestFormXf995d88c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsDeleteRequestFormXf995d88c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsDeleteRequestFormXf995d88c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsDeleteRequestFormXf995d88c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsDeleteRequestFormXf995d88c must be a JSON object")
      return InlineV1SubscriptionsDeleteRequestFormXf995d88c(
        cancellationDetails = rawObject["cancellation_details"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        invoiceNow = rawObject["invoice_now"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        prorate = rawObject["prorate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsDeleteRequestFormXf995d88c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsDeleteRequestFormXf995d88c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cancellationDetails?.let { put("cancellation_details", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.invoiceNow?.let { put("invoice_now", json.encodeToJsonElement(it)) }
        value.prorate?.let { put("prorate", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsDeleteRequestFormXf995d88c(block: InlineV1SubscriptionsDeleteRequestFormXf995d88c.Builder.() -> Unit): InlineV1SubscriptionsDeleteRequestFormXf995d88c = InlineV1SubscriptionsDeleteRequestFormXf995d88c.build(block)
