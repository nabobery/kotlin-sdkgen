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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_schedules/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_schedules/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c(
  public val billUntil: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilX0cdf5e54,
  appliesTo: List<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48>? = null,
  public val key: String? = null,
) {
  public val appliesTo:
      List<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48>? =
      appliesTo?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var billUntilValue:
        InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilX0cdf5e54? = null

    public var billUntil: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilX0cdf5e54
      get() = requireNotNull(billUntilValue) { "billUntil is required" }
      set(`value`) {
        billUntilValue = value
      }

    private var appliesToValue:
        List<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48>? = null

    public var appliesTo:
        List<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48>?
      get() = appliesToValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appliesToValue = value?.let { collection0 -> collection0.toList() }
      }

    public var key: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c {
      check(billUntilValue != null) { "billUntil is required" }
      return InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c(
        billUntil = billUntil,
        appliesTo = appliesTo,
        key = key,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c must be a JSON object")
      val billUntil = json.decodeRequired<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilX0cdf5e54>(rawObject, "bill_until")
      return InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c(
        billUntil = billUntil,
        appliesTo = rawObject["applies_to"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48>>(it) },
        key = rawObject["key"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bill_until", json.encodeToJsonElement(value.billUntil))
        value.appliesTo?.let { put("applies_to", json.encodeToJsonElement(it)) }
        value.key?.let { put("key", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c(block: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c = InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
