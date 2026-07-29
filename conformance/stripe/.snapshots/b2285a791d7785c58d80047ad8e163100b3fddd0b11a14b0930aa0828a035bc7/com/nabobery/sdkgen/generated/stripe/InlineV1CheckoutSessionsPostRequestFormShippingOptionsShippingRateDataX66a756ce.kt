package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce(
  public val displayName: String,
  public val deliveryEstimate:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080? = null,
  public val fixedAmount:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741? = null,
  metadata: Map<String, String>? = null,
  public val taxBehavior:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorXafd09bb0? = null,
  public val taxCode: String? = null,
  public val type: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    public var deliveryEstimate:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080? = null

    public var fixedAmount:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var taxBehavior:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorXafd09bb0? = null

    public var taxCode: String? = null

    public var type: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce {
      check(displayNameValue != null) { "displayName is required" }
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce(
        displayName = displayName,
        deliveryEstimate = deliveryEstimate,
        fixedAmount = fixedAmount,
        metadata = metadata,
        taxBehavior = taxBehavior,
        taxCode = taxCode,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce must be a JSON object")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce(
        displayName = displayName,
        deliveryEstimate = rawObject["delivery_estimate"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080>(it) },
        fixedAmount = rawObject["fixed_amount"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorXafd09bb0>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_name", value.displayName)
        value.deliveryEstimate?.let { put("delivery_estimate", json.encodeToJsonElement(it)) }
        value.fixedAmount?.let { put("fixed_amount", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce = InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
