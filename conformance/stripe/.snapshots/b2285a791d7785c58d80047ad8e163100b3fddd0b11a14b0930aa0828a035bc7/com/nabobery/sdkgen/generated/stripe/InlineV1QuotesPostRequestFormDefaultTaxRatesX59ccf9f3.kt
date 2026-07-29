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

public enum class InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3Branch {
  Branch1,
  InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220,
}

public sealed class InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3DecodingException(message)

internal data class InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220).count { it }
}

/**
 * The tax rates that will apply to any line item that does not have `tax_rates` set.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/default_tax_rates
 */
@Serializable(with = InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3.Serializer::class)
public class InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220:
      InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220) add(InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3Branch.InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3 {
      val inspection = inspectInlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3NoMatchException("InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3(element: JsonElement): InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220 = element.isJsonDecodable<InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220>()
  return InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220 = matchesInlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220) add("InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220: value does not match InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X49427220")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
