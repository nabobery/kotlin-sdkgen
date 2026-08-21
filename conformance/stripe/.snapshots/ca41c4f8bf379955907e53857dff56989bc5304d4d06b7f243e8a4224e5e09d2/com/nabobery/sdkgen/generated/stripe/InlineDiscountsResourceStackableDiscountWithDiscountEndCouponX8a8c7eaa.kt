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

public enum class InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaBranch {
  Branch1,
  Coupon,
}

public sealed class InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaNoMatchException(
  message: String,
) : InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaDecodingException(message)

internal data class InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaInspection(
  public val matchesBranch1: Boolean,
  public val matchesCoupon: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCoupon).count { it }
}

/**
 * ID of the coupon to create a new discount for.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/discounts_resource_stackable_discount_with_discount_end/properties/c
 * oupon
 */
@Serializable(with = InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa.Serializer::class)
public class InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val coupon: Coupon? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCoupon) json.decodeFromJsonElement<Coupon>(raw) else null }

  public val matchedBranches:
      Set<InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaBranch.Branch1)
      if (inspection.matchesCoupon) add(InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaBranch.Coupon)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa {
      val inspection = inspectInlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa(raw)
      if (inspection.matchCount == 0) {
        throw InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaNoMatchException("InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa) {
      encoder.requireJsonEncoder("InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa(element: JsonElement): InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCoupon = element.isJsonDecodable<Coupon>()
  return InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaaInspection(
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
