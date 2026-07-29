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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineDiscountSourceCouponX03063bd3Branch {
  Branch1,
  Coupon,
}

public sealed class InlineDiscountSourceCouponX03063bd3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDiscountSourceCouponX03063bd3NoMatchException(
  message: String,
) : InlineDiscountSourceCouponX03063bd3DecodingException(message)

internal data class InlineDiscountSourceCouponX03063bd3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCoupon: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCoupon).count { it }
}

/**
 * The coupon that was redeemed to create this discount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/discount_source/properties/coupon
 */
@Serializable(with = InlineDiscountSourceCouponX03063bd3.Serializer::class)
public class InlineDiscountSourceCouponX03063bd3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDiscountSourceCouponX03063bd3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val coupon: Coupon? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCoupon) json.decodeFromJsonElement<Coupon>(raw) else null }

  public val matchedBranches: Set<InlineDiscountSourceCouponX03063bd3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDiscountSourceCouponX03063bd3Branch.Branch1)
      if (inspection.matchesCoupon) add(InlineDiscountSourceCouponX03063bd3Branch.Coupon)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDiscountSourceCouponX03063bd3 {
      val inspection = inspectInlineDiscountSourceCouponX03063bd3(raw)
      if (inspection.matchCount == 0) {
        throw InlineDiscountSourceCouponX03063bd3NoMatchException("InlineDiscountSourceCouponX03063bd3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDiscountSourceCouponX03063bd3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineDiscountSourceCouponX03063bd3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDiscountSourceCouponX03063bd3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDiscountSourceCouponX03063bd3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDiscountSourceCouponX03063bd3) {
      encoder.requireJsonEncoder("InlineDiscountSourceCouponX03063bd3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDiscountSourceCouponX03063bd3(element: JsonElement): InlineDiscountSourceCouponX03063bd3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCoupon = element.isJsonDecodable<Coupon>()
  return InlineDiscountSourceCouponX03063bd3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCoupon = matchesCoupon,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCoupon) add("Coupon: value does not match Coupon")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
