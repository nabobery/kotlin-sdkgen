package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 * Clone an existing quote. The new quote will be created in `status=draft`. When using this parameter, you cannot
 * specify any other parameters except for `expires_at`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/from_quote
 */
@Serializable(with = InlineV1QuotesPostRequestFormFromQuoteXa868383a.Serializer::class)
public class InlineV1QuotesPostRequestFormFromQuoteXa868383a(
  public val quote: String,
  public val isRevision: Boolean? = null,
) {
  public class Builder {
    private var quoteValue: String? = null

    public var quote: String
      get() = requireNotNull(quoteValue) { "quote is required" }
      set(`value`) {
        quoteValue = value
      }

    public var isRevision: Boolean? = null

    public fun build(): InlineV1QuotesPostRequestFormFromQuoteXa868383a {
      check(quoteValue != null) { "quote is required" }
      return InlineV1QuotesPostRequestFormFromQuoteXa868383a(
        quote = quote,
        isRevision = isRevision,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormFromQuoteXa868383a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormFromQuoteXa868383a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormFromQuoteXa868383a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormFromQuoteXa868383a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormFromQuoteXa868383a must be a JSON object")
      val quote = json.decodeRequired<String>(rawObject, "quote")
      return InlineV1QuotesPostRequestFormFromQuoteXa868383a(
        quote = quote,
        isRevision = rawObject["is_revision"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormFromQuoteXa868383a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormFromQuoteXa868383a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("quote", value.quote)
        value.isRevision?.let { put("is_revision", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormFromQuoteXa868383a(block: InlineV1QuotesPostRequestFormFromQuoteXa868383a.Builder.() -> Unit): InlineV1QuotesPostRequestFormFromQuoteXa868383a = InlineV1QuotesPostRequestFormFromQuoteXa868383a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1QuotesPostRequestFormFromQuoteXa868383a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
