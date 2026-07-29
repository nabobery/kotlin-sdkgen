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

public enum class InlineLineItemDiscountsItemX6313e0c2Branch {
  Branch1,
  Discount,
}

public sealed class InlineLineItemDiscountsItemX6313e0c2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLineItemDiscountsItemX6313e0c2NoMatchException(
  message: String,
) : InlineLineItemDiscountsItemX6313e0c2DecodingException(message)

internal data class InlineLineItemDiscountsItemX6313e0c2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesDiscount).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/line_item/properties/discounts/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/line_item/properties/discounts/items
 */
@Serializable(with = InlineLineItemDiscountsItemX6313e0c2.Serializer::class)
public class InlineLineItemDiscountsItemX6313e0c2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLineItemDiscountsItemX6313e0c2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val matchedBranches: Set<InlineLineItemDiscountsItemX6313e0c2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineLineItemDiscountsItemX6313e0c2Branch.Branch1)
      if (inspection.matchesDiscount) add(InlineLineItemDiscountsItemX6313e0c2Branch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLineItemDiscountsItemX6313e0c2 {
      val inspection = inspectInlineLineItemDiscountsItemX6313e0c2(raw)
      if (inspection.matchCount == 0) {
        throw InlineLineItemDiscountsItemX6313e0c2NoMatchException("InlineLineItemDiscountsItemX6313e0c2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLineItemDiscountsItemX6313e0c2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineLineItemDiscountsItemX6313e0c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLineItemDiscountsItemX6313e0c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLineItemDiscountsItemX6313e0c2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLineItemDiscountsItemX6313e0c2) {
      encoder.requireJsonEncoder("InlineLineItemDiscountsItemX6313e0c2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLineItemDiscountsItemX6313e0c2(element: JsonElement): InlineLineItemDiscountsItemX6313e0c2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  return InlineLineItemDiscountsItemX6313e0c2Inspection(
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
