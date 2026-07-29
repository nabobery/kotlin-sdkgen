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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}~1cancel/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}~1cancel/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3.Serializer::class)
public class InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3(
  expand: List<String>? = null,
  /**
   * If the subscription schedule is `active`, indicates if a final invoice will be generated that contains any
   * un-invoiced metered usage and new/pending proration invoice items. Defaults to `true`.
   */
  public val invoiceNow: Boolean? = null,
  /**
   * If the subscription schedule is `active`, indicates if the cancellation should be prorated. Defaults to `true`.
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
     * If the subscription schedule is `active`, indicates if a final invoice will be generated that contains any
     * un-invoiced metered usage and new/pending proration invoice items. Defaults to `true`.
     */
    public var invoiceNow: Boolean? = null

    /**
     * If the subscription schedule is `active`, indicates if the cancellation should be prorated. Defaults to `true`.
     */
    public var prorate: Boolean? = null

    public fun build(): InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3 = InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3(
      expand = expand,
      invoiceNow = invoiceNow,
      prorate = prorate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3 must be a JSON object")
      return InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        invoiceNow = rawObject["invoice_now"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        prorate = rawObject["prorate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3")
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

public fun inlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3(block: InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3.Builder.() -> Unit): InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3 = InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3.build(block)
