package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePortalFlowsRetentionCouponOfferX51f9e84eBranch {
  PortalFlowsCouponOffer,
}

public sealed class InlinePortalFlowsRetentionCouponOfferX51f9e84eDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePortalFlowsRetentionCouponOfferX51f9e84eNoMatchException(
  message: String,
) : InlinePortalFlowsRetentionCouponOfferX51f9e84eDecodingException(message)

internal data class InlinePortalFlowsRetentionCouponOfferX51f9e84eInspection(
  public val matchesPortalFlowsCouponOffer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPortalFlowsCouponOffer).count { it }
}

/**
 * Configuration when `retention.type=coupon_offer`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_retention/properties/coupon_offer
 */
@Serializable(with = InlinePortalFlowsRetentionCouponOfferX51f9e84e.Serializer::class)
public class InlinePortalFlowsRetentionCouponOfferX51f9e84e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePortalFlowsRetentionCouponOfferX51f9e84eInspection,
) {
  public val portalFlowsCouponOffer: PortalFlowsCouponOfferView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPortalFlowsCouponOffer) json.decodeFromJsonElement<PortalFlowsCouponOfferView>(raw) else null }

  public val matchedBranches: Set<InlinePortalFlowsRetentionCouponOfferX51f9e84eBranch>
    get() = buildSet {
      if (inspection.matchesPortalFlowsCouponOffer) add(InlinePortalFlowsRetentionCouponOfferX51f9e84eBranch.PortalFlowsCouponOffer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePortalFlowsRetentionCouponOfferX51f9e84e {
      val inspection = inspectInlinePortalFlowsRetentionCouponOfferX51f9e84e(raw)
      if (inspection.matchCount == 0) {
        throw InlinePortalFlowsRetentionCouponOfferX51f9e84eNoMatchException("InlinePortalFlowsRetentionCouponOfferX51f9e84e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePortalFlowsRetentionCouponOfferX51f9e84e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePortalFlowsRetentionCouponOfferX51f9e84e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePortalFlowsRetentionCouponOfferX51f9e84e {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePortalFlowsRetentionCouponOfferX51f9e84e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsRetentionCouponOfferX51f9e84e) {
      encoder.requireJsonEncoder("InlinePortalFlowsRetentionCouponOfferX51f9e84e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePortalFlowsRetentionCouponOfferX51f9e84e(element: JsonElement): InlinePortalFlowsRetentionCouponOfferX51f9e84eInspection {
  val raw = element as? JsonObject ?: return InlinePortalFlowsRetentionCouponOfferX51f9e84eInspection(
    matchesPortalFlowsCouponOffer = false,
    failures = listOf("PortalFlowsCouponOffer: expected JSON object"),
  )
  val matchesPortalFlowsCouponOffer = raw["coupon"].isString()
  return InlinePortalFlowsRetentionCouponOfferX51f9e84eInspection(
    matchesPortalFlowsCouponOffer = matchesPortalFlowsCouponOffer,
    failures = buildList {
      if (!matchesPortalFlowsCouponOffer) add("PortalFlowsCouponOffer: required properties 'coupon' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
