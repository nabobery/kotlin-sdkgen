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

public enum class InlineSubscriptionDiscountsItemX69962ce0Branch {
  Branch1,
  Discount,
}

public sealed class InlineSubscriptionDiscountsItemX69962ce0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionDiscountsItemX69962ce0NoMatchException(
  message: String,
) : InlineSubscriptionDiscountsItemX69962ce0DecodingException(message)

internal data class InlineSubscriptionDiscountsItemX69962ce0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesDiscount).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/subscription/properties/discounts/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/discounts/items
 */
@Serializable(with = InlineSubscriptionDiscountsItemX69962ce0.Serializer::class)
public class InlineSubscriptionDiscountsItemX69962ce0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionDiscountsItemX69962ce0Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionDiscountsItemX69962ce0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionDiscountsItemX69962ce0Branch.Branch1)
      if (inspection.matchesDiscount) add(InlineSubscriptionDiscountsItemX69962ce0Branch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionDiscountsItemX69962ce0 {
      val inspection = inspectInlineSubscriptionDiscountsItemX69962ce0(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionDiscountsItemX69962ce0NoMatchException("InlineSubscriptionDiscountsItemX69962ce0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionDiscountsItemX69962ce0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionDiscountsItemX69962ce0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionDiscountsItemX69962ce0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionDiscountsItemX69962ce0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionDiscountsItemX69962ce0) {
      encoder.requireJsonEncoder("InlineSubscriptionDiscountsItemX69962ce0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionDiscountsItemX69962ce0(element: JsonElement): InlineSubscriptionDiscountsItemX69962ce0Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  return InlineSubscriptionDiscountsItemX69962ce0Inspection(
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
