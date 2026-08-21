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

public enum class InlineQuoteDiscountsItemX7f4b5eb5Branch {
  Branch1,
  Discount,
}

public sealed class InlineQuoteDiscountsItemX7f4b5eb5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineQuoteDiscountsItemX7f4b5eb5NoMatchException(
  message: String,
) : InlineQuoteDiscountsItemX7f4b5eb5DecodingException(message)

internal data class InlineQuoteDiscountsItemX7f4b5eb5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesDiscount).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/quote/properties/discounts/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/discounts/items
 */
@Serializable(with = InlineQuoteDiscountsItemX7f4b5eb5.Serializer::class)
public class InlineQuoteDiscountsItemX7f4b5eb5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineQuoteDiscountsItemX7f4b5eb5Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val matchedBranches: Set<InlineQuoteDiscountsItemX7f4b5eb5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineQuoteDiscountsItemX7f4b5eb5Branch.Branch1)
      if (inspection.matchesDiscount) add(InlineQuoteDiscountsItemX7f4b5eb5Branch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineQuoteDiscountsItemX7f4b5eb5 {
      val inspection = inspectInlineQuoteDiscountsItemX7f4b5eb5(raw)
      if (inspection.matchCount == 0) {
        throw InlineQuoteDiscountsItemX7f4b5eb5NoMatchException("InlineQuoteDiscountsItemX7f4b5eb5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineQuoteDiscountsItemX7f4b5eb5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineQuoteDiscountsItemX7f4b5eb5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuoteDiscountsItemX7f4b5eb5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteDiscountsItemX7f4b5eb5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuoteDiscountsItemX7f4b5eb5) {
      encoder.requireJsonEncoder("InlineQuoteDiscountsItemX7f4b5eb5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineQuoteDiscountsItemX7f4b5eb5(element: JsonElement): InlineQuoteDiscountsItemX7f4b5eb5Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  return InlineQuoteDiscountsItemX7f4b5eb5Inspection(
    matchesBranch1 = matchesBranch1,
    matchesDiscount = matchesDiscount,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesDiscount) add("Discount: value does not match Discount")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
