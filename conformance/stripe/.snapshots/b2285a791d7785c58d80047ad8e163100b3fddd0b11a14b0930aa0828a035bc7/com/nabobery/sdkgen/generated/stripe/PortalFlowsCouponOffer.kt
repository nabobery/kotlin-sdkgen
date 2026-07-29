package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

@Serializable
public data class PortalFlowsCouponOfferView(
  public val coupon: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_coupon_offer
 */
@Serializable(with = PortalFlowsCouponOffer.Serializer::class)
public class PortalFlowsCouponOffer(
  /**
   * The ID of the coupon to be offered.
   */
  public val coupon: String,
) {
  public class Builder {
    private var couponValue: String? = null

    public var coupon: String
      get() = requireNotNull(couponValue) { "coupon is required" }
      set(`value`) {
        couponValue = value
      }

    public fun build(): PortalFlowsCouponOffer {
      check(couponValue != null) { "coupon is required" }
      return PortalFlowsCouponOffer(
        coupon = coupon,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsCouponOffer = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PortalFlowsCouponOffer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsCouponOffer {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsCouponOffer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsCouponOffer must be a JSON object")
      val coupon = json.decodeRequired<String>(rawObject, "coupon")
      return PortalFlowsCouponOffer(
        coupon = coupon,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsCouponOffer) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsCouponOffer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("coupon", value.coupon)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsCouponOffer(block: PortalFlowsCouponOffer.Builder.() -> Unit): PortalFlowsCouponOffer = PortalFlowsCouponOffer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalFlowsCouponOffer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
