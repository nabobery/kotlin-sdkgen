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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A list of line items, each containing information about a product in the PaymentIntent. There is a maximum of 200
 * line items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details/properties/line_items
 */
@Serializable(with = InlinePaymentFlowsAmountDetailsLineItemsXce22638c.Serializer::class)
public class InlinePaymentFlowsAmountDetailsLineItemsXce22638c(
  `data`: List<PaymentIntentAmountDetailsLineItem>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<PaymentIntentAmountDetailsLineItem> = data.toList()

  public class Builder {
    private var dataValue: List<PaymentIntentAmountDetailsLineItem>? = null

    public var `data`: List<PaymentIntentAmountDetailsLineItem>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue: InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef? =
        null

    public var objectValue: InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlinePaymentFlowsAmountDetailsLineItemsXce22638c {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlinePaymentFlowsAmountDetailsLineItemsXce22638c(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePaymentFlowsAmountDetailsLineItemsXce22638c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePaymentFlowsAmountDetailsLineItemsXce22638c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsAmountDetailsLineItemsXce22638c {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentFlowsAmountDetailsLineItemsXce22638c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePaymentFlowsAmountDetailsLineItemsXce22638c must be a JSON object")
      val data = json.decodeRequired<List<PaymentIntentAmountDetailsLineItem>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlinePaymentFlowsAmountDetailsLineItemsXce22638c(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsAmountDetailsLineItemsXce22638c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePaymentFlowsAmountDetailsLineItemsXce22638c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePaymentFlowsAmountDetailsLineItemsXce22638c(block: InlinePaymentFlowsAmountDetailsLineItemsXce22638c.Builder.() -> Unit): InlinePaymentFlowsAmountDetailsLineItemsXce22638c = InlinePaymentFlowsAmountDetailsLineItemsXce22638c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePaymentFlowsAmountDetailsLineItemsXce22638c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
