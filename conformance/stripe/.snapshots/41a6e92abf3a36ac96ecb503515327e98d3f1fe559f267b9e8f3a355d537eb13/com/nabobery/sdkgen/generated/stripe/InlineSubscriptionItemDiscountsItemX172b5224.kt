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

public enum class InlineSubscriptionItemDiscountsItemX172b5224Branch {
  Branch1,
  Discount,
}

public sealed class InlineSubscriptionItemDiscountsItemX172b5224DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionItemDiscountsItemX172b5224NoMatchException(
  message: String,
) : InlineSubscriptionItemDiscountsItemX172b5224DecodingException(message)

internal data class InlineSubscriptionItemDiscountsItemX172b5224Inspection(
  public val matchesBranch1: Boolean,
  public val matchesDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesDiscount).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/subscription_item/properties/discounts/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_item/properties/discounts/items
 */
@Serializable(with = InlineSubscriptionItemDiscountsItemX172b5224.Serializer::class)
public class InlineSubscriptionItemDiscountsItemX172b5224 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionItemDiscountsItemX172b5224Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionItemDiscountsItemX172b5224Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionItemDiscountsItemX172b5224Branch.Branch1)
      if (inspection.matchesDiscount) add(InlineSubscriptionItemDiscountsItemX172b5224Branch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionItemDiscountsItemX172b5224 {
      val inspection = inspectInlineSubscriptionItemDiscountsItemX172b5224(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionItemDiscountsItemX172b5224NoMatchException("InlineSubscriptionItemDiscountsItemX172b5224 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionItemDiscountsItemX172b5224(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionItemDiscountsItemX172b5224> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionItemDiscountsItemX172b5224 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionItemDiscountsItemX172b5224")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionItemDiscountsItemX172b5224) {
      encoder.requireJsonEncoder("InlineSubscriptionItemDiscountsItemX172b5224").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionItemDiscountsItemX172b5224(element: JsonElement): InlineSubscriptionItemDiscountsItemX172b5224Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  return InlineSubscriptionItemDiscountsItemX172b5224Inspection(
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
