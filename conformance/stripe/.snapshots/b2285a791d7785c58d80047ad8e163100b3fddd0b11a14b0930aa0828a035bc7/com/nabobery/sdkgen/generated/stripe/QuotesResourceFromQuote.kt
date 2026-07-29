package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class QuotesResourceFromQuoteView(
  @SerialName("is_revision")
  public val isRevision: Boolean,
  public val quote: InlineQuotesResourceFromQuoteQuoteX29f217fa,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_from_quote
 */
@Serializable(with = QuotesResourceFromQuote.Serializer::class)
public class QuotesResourceFromQuote(
  /**
   * Whether this quote is a revision of a different quote.
   */
  public val isRevision: Boolean,
  /**
   * The quote that was cloned.
   */
  public val quote: InlineQuotesResourceFromQuoteQuoteX29f217fa,
) {
  public class Builder {
    private var isRevisionValue: Boolean? = null

    public var isRevision: Boolean
      get() = requireNotNull(isRevisionValue) { "isRevision is required" }
      set(`value`) {
        isRevisionValue = value
      }

    private var quoteValue: InlineQuotesResourceFromQuoteQuoteX29f217fa? = null

    public var quote: InlineQuotesResourceFromQuoteQuoteX29f217fa
      get() = requireNotNull(quoteValue) { "quote is required" }
      set(`value`) {
        quoteValue = value
      }

    public fun build(): QuotesResourceFromQuote {
      check(isRevisionValue != null) { "isRevision is required" }
      check(quoteValue != null) { "quote is required" }
      return QuotesResourceFromQuote(
        isRevision = isRevision,
        quote = quote,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceFromQuote = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<QuotesResourceFromQuote> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceFromQuote {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceFromQuote")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceFromQuote must be a JSON object")
      val isRevision = json.decodeRequired<Boolean>(rawObject, "is_revision")
      val quote = json.decodeRequired<InlineQuotesResourceFromQuoteQuoteX29f217fa>(rawObject, "quote")
      return QuotesResourceFromQuote(
        isRevision = isRevision,
        quote = quote,
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceFromQuote) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceFromQuote")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("is_revision", json.encodeToJsonElement(value.isRevision))
        put("quote", json.encodeToJsonElement(value.quote))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceFromQuote(block: QuotesResourceFromQuote.Builder.() -> Unit): QuotesResourceFromQuote = QuotesResourceFromQuote.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceFromQuote is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
