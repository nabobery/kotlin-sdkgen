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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineQuoteFromQuoteX86014e8cBranch {
  QuotesResourceFromQuote,
}

public sealed class InlineQuoteFromQuoteX86014e8cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineQuoteFromQuoteX86014e8cNoMatchException(
  message: String,
) : InlineQuoteFromQuoteX86014e8cDecodingException(message)

internal data class InlineQuoteFromQuoteX86014e8cInspection(
  public val matchesQuotesResourceFromQuote: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesQuotesResourceFromQuote).count { it }
}

/**
 * Details of the quote that was cloned. See the [cloning documentation](https://docs.stripe.com/quotes/clone) for more
 * details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/from_quote
 */
@Serializable(with = InlineQuoteFromQuoteX86014e8c.Serializer::class)
public class InlineQuoteFromQuoteX86014e8c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineQuoteFromQuoteX86014e8cInspection,
) {
  public val quotesResourceFromQuote: QuotesResourceFromQuoteView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesQuotesResourceFromQuote) json.decodeFromJsonElement<QuotesResourceFromQuoteView>(raw) else null }

  public val matchedBranches: Set<InlineQuoteFromQuoteX86014e8cBranch>
    get() = buildSet {
      if (inspection.matchesQuotesResourceFromQuote) add(InlineQuoteFromQuoteX86014e8cBranch.QuotesResourceFromQuote)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineQuoteFromQuoteX86014e8c {
      val inspection = inspectInlineQuoteFromQuoteX86014e8c(raw)
      if (inspection.matchCount == 0) {
        throw InlineQuoteFromQuoteX86014e8cNoMatchException("InlineQuoteFromQuoteX86014e8c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineQuoteFromQuoteX86014e8c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineQuoteFromQuoteX86014e8c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuoteFromQuoteX86014e8c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteFromQuoteX86014e8c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuoteFromQuoteX86014e8c) {
      encoder.requireJsonEncoder("InlineQuoteFromQuoteX86014e8c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineQuoteFromQuoteX86014e8c(element: JsonElement): InlineQuoteFromQuoteX86014e8cInspection {
  val raw = element as? JsonObject ?: return InlineQuoteFromQuoteX86014e8cInspection(
    matchesQuotesResourceFromQuote = false,
    failures = listOf("QuotesResourceFromQuote: expected JSON object"),
  )
  val matchesQuotesResourceFromQuote = raw["is_revision"] != null && raw["quote"] != null
  return InlineQuoteFromQuoteX86014e8cInspection(
    matchesQuotesResourceFromQuote = matchesQuotesResourceFromQuote,
    failures = buildList {
      if (!matchesQuotesResourceFromQuote) add("QuotesResourceFromQuote: required properties 'is_revision', 'quote' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
