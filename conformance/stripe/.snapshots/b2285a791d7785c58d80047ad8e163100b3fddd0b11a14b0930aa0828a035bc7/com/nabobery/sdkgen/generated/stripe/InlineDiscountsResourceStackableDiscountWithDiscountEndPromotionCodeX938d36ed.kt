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

public enum class InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edBranch {
  Branch1,
  PromotionCode,
}

public sealed class InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edDecodingException(
  message: String,
) : SerializationException(message)

public class InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edNoMatchException(
  message: String,
) : InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edDecodingException(message)

internal data class InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edInspection(
  public val matchesBranch1: Boolean,
  public val matchesPromotionCode: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPromotionCode).count { it }
}

/**
 * ID of the promotion code to create a new discount for.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/discounts_resource_stackable_discount_with_discount_end/properties/p
 * romotion_code
 */
@Serializable(with = InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed.Serializer::class)
public class InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val promotionCode: PromotionCode? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPromotionCode) json.decodeFromJsonElement<PromotionCode>(raw) else null }

  public val matchedBranches:
      Set<InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edBranch.Branch1)
      if (inspection.matchesPromotionCode) add(InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edBranch.PromotionCode)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed {
      val inspection = inspectInlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed(raw)
      if (inspection.matchCount == 0) {
        throw InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edNoMatchException("InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed) {
      encoder.requireJsonEncoder("InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed(element: JsonElement): InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPromotionCode = element.isJsonDecodable<PromotionCode>()
  return InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36edInspection(
    matchesBranch1 = matchesBranch1,
    matchesPromotionCode = matchesPromotionCode,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPromotionCode) add("PromotionCode: value does not match PromotionCode")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
