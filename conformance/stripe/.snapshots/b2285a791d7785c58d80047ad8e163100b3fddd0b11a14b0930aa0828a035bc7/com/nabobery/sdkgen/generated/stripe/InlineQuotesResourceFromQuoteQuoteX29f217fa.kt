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

public enum class InlineQuotesResourceFromQuoteQuoteX29f217faBranch {
  Branch1,
  Quote,
}

public sealed class InlineQuotesResourceFromQuoteQuoteX29f217faDecodingException(
  message: String,
) : SerializationException(message)

public class InlineQuotesResourceFromQuoteQuoteX29f217faNoMatchException(
  message: String,
) : InlineQuotesResourceFromQuoteQuoteX29f217faDecodingException(message)

internal data class InlineQuotesResourceFromQuoteQuoteX29f217faInspection(
  public val matchesBranch1: Boolean,
  public val matchesQuote: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesQuote).count { it }
}

/**
 * The quote that was cloned.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_from_quote/properties/quote
 */
@Serializable(with = InlineQuotesResourceFromQuoteQuoteX29f217fa.Serializer::class)
public class InlineQuotesResourceFromQuoteQuoteX29f217fa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineQuotesResourceFromQuoteQuoteX29f217faInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val quote: Quote? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesQuote) json.decodeFromJsonElement<Quote>(raw) else null }

  public val matchedBranches: Set<InlineQuotesResourceFromQuoteQuoteX29f217faBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineQuotesResourceFromQuoteQuoteX29f217faBranch.Branch1)
      if (inspection.matchesQuote) add(InlineQuotesResourceFromQuoteQuoteX29f217faBranch.Quote)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineQuotesResourceFromQuoteQuoteX29f217fa {
      val inspection = inspectInlineQuotesResourceFromQuoteQuoteX29f217fa(raw)
      if (inspection.matchCount == 0) {
        throw InlineQuotesResourceFromQuoteQuoteX29f217faNoMatchException("InlineQuotesResourceFromQuoteQuoteX29f217fa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineQuotesResourceFromQuoteQuoteX29f217fa(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineQuotesResourceFromQuoteQuoteX29f217fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuotesResourceFromQuoteQuoteX29f217fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuotesResourceFromQuoteQuoteX29f217fa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuotesResourceFromQuoteQuoteX29f217fa) {
      encoder.requireJsonEncoder("InlineQuotesResourceFromQuoteQuoteX29f217fa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineQuotesResourceFromQuoteQuoteX29f217fa(element: JsonElement): InlineQuotesResourceFromQuoteQuoteX29f217faInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesQuote = element.isJsonDecodable<Quote>()
  return InlineQuotesResourceFromQuoteQuoteX29f217faInspection(
    matchesBranch1 = matchesBranch1,
    matchesQuote = matchesQuote,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesQuote) add("Quote: value does not match Quote")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
