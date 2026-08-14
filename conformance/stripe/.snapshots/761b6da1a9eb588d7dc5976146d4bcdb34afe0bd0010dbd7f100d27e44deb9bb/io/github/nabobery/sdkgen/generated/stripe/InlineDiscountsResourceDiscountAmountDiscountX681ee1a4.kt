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

public enum class InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Branch {
  Branch1,
  Discount,
  DeletedDiscount,
}

public sealed class InlineDiscountsResourceDiscountAmountDiscountX681ee1a4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDiscountsResourceDiscountAmountDiscountX681ee1a4NoMatchException(
  message: String,
) : InlineDiscountsResourceDiscountAmountDiscountX681ee1a4DecodingException(message)

internal data class InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesDiscount: Boolean,
  public val matchesDeletedDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesDiscount, matchesDeletedDiscount).count { it }
}

/**
 * The discount that was applied to get this discount amount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/discounts_resource_discount_amount/properties/discount
 */
@Serializable(with = InlineDiscountsResourceDiscountAmountDiscountX681ee1a4.Serializer::class)
public class InlineDiscountsResourceDiscountAmountDiscountX681ee1a4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val deletedDiscount: DeletedDiscount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedDiscount) json.decodeFromJsonElement<DeletedDiscount>(raw) else null }

  public val matchedBranches: Set<InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Branch.Branch1)
      if (inspection.matchesDiscount) add(InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Branch.Discount)
      if (inspection.matchesDeletedDiscount) add(InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Branch.DeletedDiscount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDiscountsResourceDiscountAmountDiscountX681ee1a4 {
      val inspection = inspectInlineDiscountsResourceDiscountAmountDiscountX681ee1a4(raw)
      if (inspection.matchCount == 0) {
        throw InlineDiscountsResourceDiscountAmountDiscountX681ee1a4NoMatchException("InlineDiscountsResourceDiscountAmountDiscountX681ee1a4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDiscountsResourceDiscountAmountDiscountX681ee1a4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDiscountsResourceDiscountAmountDiscountX681ee1a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDiscountsResourceDiscountAmountDiscountX681ee1a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDiscountsResourceDiscountAmountDiscountX681ee1a4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDiscountsResourceDiscountAmountDiscountX681ee1a4) {
      encoder.requireJsonEncoder("InlineDiscountsResourceDiscountAmountDiscountX681ee1a4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDiscountsResourceDiscountAmountDiscountX681ee1a4(element: JsonElement): InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  val matchesDeletedDiscount = element.isJsonDecodable<DeletedDiscount>()
  return InlineDiscountsResourceDiscountAmountDiscountX681ee1a4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesDiscount = matchesDiscount,
    matchesDeletedDiscount = matchesDeletedDiscount,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesDiscount) add("Discount: value does not match Discount")
      if (!matchesDeletedDiscount) add("DeletedDiscount: value does not match DeletedDiscount")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
