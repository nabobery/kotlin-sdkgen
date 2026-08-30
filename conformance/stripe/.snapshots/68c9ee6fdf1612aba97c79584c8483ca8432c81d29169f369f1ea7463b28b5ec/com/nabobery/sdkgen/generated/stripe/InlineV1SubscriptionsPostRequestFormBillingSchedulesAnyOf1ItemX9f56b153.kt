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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153(
  appliesTo: List<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c>? = null,
  public val billUntil:
      InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemBillUntilX0df4e0e1? = null,
  public val key: String? = null,
) {
  public val appliesTo:
      List<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c>? =
      appliesTo?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var appliesToValue:
        List<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c>? = null

    public var appliesTo:
        List<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c>?
      get() = appliesToValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appliesToValue = value?.let { collection0 -> collection0.toList() }
      }

    public var billUntil:
        InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemBillUntilX0df4e0e1? = null

    public var key: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153 = InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153(
      appliesTo = appliesTo,
      billUntil = billUntil,
      key = key,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153(
        appliesTo = rawObject["applies_to"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c>>(it) },
        billUntil = rawObject["bill_until"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemBillUntilX0df4e0e1>(it) },
        key = rawObject["key"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153")
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

public fun inlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153(block: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153 = InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153.build(block)
