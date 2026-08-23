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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663(
  appliesTo: List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d>? = null,
  public val billUntil: InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d? = null,
  public val key: String? = null,
) {
  public val appliesTo:
      List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d>? =
      appliesTo?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var appliesToValue:
        List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d>? = null

    public var appliesTo:
        List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d>?
      get() = appliesToValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appliesToValue = value?.let { collection0 -> collection0.toList() }
      }

    public var billUntil: InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d? = null

    public var key: String? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663 = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663(
      appliesTo = appliesTo,
      billUntil = billUntil,
      key = key,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663 must be a JSON object")
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663(
        appliesTo = rawObject["applies_to"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d>>(it) },
        billUntil = rawObject["bill_until"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormBillUntilX7a36859d>(it) },
        key = rawObject["key"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.appliesTo?.let { put("applies_to", json.encodeToJsonElement(it)) }
        value.billUntil?.let { put("bill_until", json.encodeToJsonElement(it)) }
        value.key?.let { put("key", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663(block: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663 = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663.build(block)
