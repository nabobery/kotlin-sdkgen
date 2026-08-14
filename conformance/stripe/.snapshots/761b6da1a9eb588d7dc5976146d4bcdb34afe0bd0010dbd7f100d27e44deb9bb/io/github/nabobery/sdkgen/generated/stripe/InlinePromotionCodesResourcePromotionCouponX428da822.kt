package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlinePromotionCodesResourcePromotionCouponX428da822Branch {
  Branch1,
  Coupon,
}

public sealed class InlinePromotionCodesResourcePromotionCouponX428da822DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePromotionCodesResourcePromotionCouponX428da822NoMatchException(
  message: String,
) : InlinePromotionCodesResourcePromotionCouponX428da822DecodingException(message)

internal data class InlinePromotionCodesResourcePromotionCouponX428da822Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCoupon: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCoupon).count { it }
}

/**
 * If promotion `type` is `coupon`, the coupon for this promotion.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/promotion_codes_resource_promotion/properties/coupon
 */
@Serializable(with = InlinePromotionCodesResourcePromotionCouponX428da822.Serializer::class)
public class InlinePromotionCodesResourcePromotionCouponX428da822 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePromotionCodesResourcePromotionCouponX428da822Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val coupon: Coupon? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCoupon) json.decodeFromJsonElement<Coupon>(raw) else null }

  public val matchedBranches: Set<InlinePromotionCodesResourcePromotionCouponX428da822Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePromotionCodesResourcePromotionCouponX428da822Branch.Branch1)
      if (inspection.matchesCoupon) add(InlinePromotionCodesResourcePromotionCouponX428da822Branch.Coupon)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePromotionCodesResourcePromotionCouponX428da822 {
      val inspection = inspectInlinePromotionCodesResourcePromotionCouponX428da822(raw)
      if (inspection.matchCount == 0) {
        throw InlinePromotionCodesResourcePromotionCouponX428da822NoMatchException("InlinePromotionCodesResourcePromotionCouponX428da822 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePromotionCodesResourcePromotionCouponX428da822(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePromotionCodesResourcePromotionCouponX428da822> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePromotionCodesResourcePromotionCouponX428da822 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePromotionCodesResourcePromotionCouponX428da822")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePromotionCodesResourcePromotionCouponX428da822) {
      encoder.requireJsonEncoder("InlinePromotionCodesResourcePromotionCouponX428da822").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePromotionCodesResourcePromotionCouponX428da822(element: JsonElement): InlinePromotionCodesResourcePromotionCouponX428da822Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCoupon = element.isJsonDecodable<Coupon>()
  return InlinePromotionCodesResourcePromotionCouponX428da822Inspection(
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
