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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68Branch {
  Branch1,
  InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928,
}

public sealed class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68DecodingException(message)

internal data class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928:
      InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928) add(InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68Branch.InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68 {
      val inspection = inspectInlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68NoMatchException("InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68(element: JsonElement): InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928 = element.isJsonDecodable<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928>()
  return InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928 = matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928) add("InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928: value does not match InlineV1QuotesPostRequestFormLineItemsItemTaxRatesAnyOf2Xfdfb9928")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
