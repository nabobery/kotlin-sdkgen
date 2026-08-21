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

public enum class InlineV1QuotesPostRequestFormDescriptionX670239c2Branch {
  Branch1,
  InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee,
}

public sealed class InlineV1QuotesPostRequestFormDescriptionX670239c2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormDescriptionX670239c2NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormDescriptionX670239c2DecodingException(message)

internal data class InlineV1QuotesPostRequestFormDescriptionX670239c2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee).count { it }
}

/**
 * A description that will be displayed on the quote PDF. If no value is passed, the default description configured in
 * your [quote template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/description
 */
@Serializable(with = InlineV1QuotesPostRequestFormDescriptionX670239c2.Serializer::class)
public class InlineV1QuotesPostRequestFormDescriptionX670239c2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormDescriptionX670239c2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee:
      InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormDescriptionX670239c2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormDescriptionX670239c2Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee) add(InlineV1QuotesPostRequestFormDescriptionX670239c2Branch.InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormDescriptionX670239c2 {
      val inspection = inspectInlineV1QuotesPostRequestFormDescriptionX670239c2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormDescriptionX670239c2NoMatchException("InlineV1QuotesPostRequestFormDescriptionX670239c2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormDescriptionX670239c2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormDescriptionX670239c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormDescriptionX670239c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormDescriptionX670239c2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormDescriptionX670239c2) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormDescriptionX670239c2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormDescriptionX670239c2(element: JsonElement): InlineV1QuotesPostRequestFormDescriptionX670239c2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee = element.isJsonDecodable<InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee>()
  return InlineV1QuotesPostRequestFormDescriptionX670239c2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee = matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee) add("InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee: value does not match InlineV1QuotesPostRequestFormDescriptionAnyOf2X934c45ee")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
