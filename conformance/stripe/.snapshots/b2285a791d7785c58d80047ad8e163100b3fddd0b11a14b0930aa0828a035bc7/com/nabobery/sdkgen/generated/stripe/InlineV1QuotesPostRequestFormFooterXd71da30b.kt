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

public enum class InlineV1QuotesPostRequestFormFooterXd71da30bBranch {
  Branch1,
  InlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4,
}

public sealed class InlineV1QuotesPostRequestFormFooterXd71da30bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormFooterXd71da30bNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormFooterXd71da30bDecodingException(message)

internal data class InlineV1QuotesPostRequestFormFooterXd71da30bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4).count { it }
}

/**
 * A footer that will be displayed on the quote PDF. If no value is passed, the default footer configured in your [quote
 * template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/footer
 */
@Serializable(with = InlineV1QuotesPostRequestFormFooterXd71da30b.Serializer::class)
public class InlineV1QuotesPostRequestFormFooterXd71da30b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormFooterXd71da30bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4:
      InlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormFooterXd71da30bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormFooterXd71da30bBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4) add(InlineV1QuotesPostRequestFormFooterXd71da30bBranch.InlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormFooterXd71da30b {
      val inspection = inspectInlineV1QuotesPostRequestFormFooterXd71da30b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormFooterXd71da30bNoMatchException("InlineV1QuotesPostRequestFormFooterXd71da30b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormFooterXd71da30b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormFooterXd71da30b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormFooterXd71da30b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormFooterXd71da30b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormFooterXd71da30b) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormFooterXd71da30b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormFooterXd71da30b(element: JsonElement): InlineV1QuotesPostRequestFormFooterXd71da30bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4 = element.isJsonDecodable<InlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4>()
  return InlineV1QuotesPostRequestFormFooterXd71da30bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4 = matchesInlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4) add("InlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4: value does not match InlineV1QuotesPostRequestFormFooterAnyOf2Xc84dafc4")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
