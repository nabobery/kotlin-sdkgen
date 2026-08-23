package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PortalFlowsRetentionView(
  @SerialName("coupon_offer")
  public val couponOffer: InlinePortalFlowsRetentionCouponOfferX51f9e84e? = null,
  public val type: InlinePortalFlowsRetentionTypeX7c3ffff6,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_retention
 */
@Serializable(with = PortalFlowsRetention.Serializer::class)
public class PortalFlowsRetention(
  /**
   * Type of retention strategy that will be used.
   */
  public val type: InlinePortalFlowsRetentionTypeX7c3ffff6,
  /**
   * Configuration when `retention.type=coupon_offer`.
   */
  public val couponOffer: InlinePortalFlowsRetentionCouponOfferX51f9e84e? = null,
) {
  public class Builder {
    private var typeValue: InlinePortalFlowsRetentionTypeX7c3ffff6? = null

    public var type: InlinePortalFlowsRetentionTypeX7c3ffff6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Configuration when `retention.type=coupon_offer`.
     */
    public var couponOffer: InlinePortalFlowsRetentionCouponOfferX51f9e84e? = null

    public fun build(): PortalFlowsRetention {
      check(typeValue != null) { "type is required" }
      return PortalFlowsRetention(
        type = type,
        couponOffer = couponOffer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsRetention = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalFlowsRetention> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsRetention {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsRetention")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsRetention must be a JSON object")
      val type = json.decodeRequired<InlinePortalFlowsRetentionTypeX7c3ffff6>(rawObject, "type")
      return PortalFlowsRetention(
        type = type,
        couponOffer = rawObject["coupon_offer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePortalFlowsRetentionCouponOfferX51f9e84e?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsRetention) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsRetention")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.couponOffer?.let { put("coupon_offer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsRetention(block: PortalFlowsRetention.Builder.() -> Unit): PortalFlowsRetention = PortalFlowsRetention.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalFlowsRetention is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
