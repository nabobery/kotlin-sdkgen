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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294Branch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f,
}

public sealed class InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f).count { it }
}

/**
 * A list of optional items the customer can add to their order at checkout. Use this parameter to pass one-time or
 * recurring [Prices](https://docs.stripe.com/api/prices).
 * There is a maximum of 10 optional items allowed on a payment link, and the existing limits on the number of line
 * items allowed on a payment link apply to the combined number of line items and optional items.
 * There is a maximum of 20 combined line items and optional items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/optional_items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294Inspection,
) {
  public val branch1: List<InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322>>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f:
      InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294Branch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f) add(InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294Branch.InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormOptionalItemsX45712294(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294NoMatchException("InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormOptionalItemsX45712294(element: JsonElement): InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f>()
  return InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f = matchesInlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f) add("InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f: value does not match InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf2Xaf21ea8f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
