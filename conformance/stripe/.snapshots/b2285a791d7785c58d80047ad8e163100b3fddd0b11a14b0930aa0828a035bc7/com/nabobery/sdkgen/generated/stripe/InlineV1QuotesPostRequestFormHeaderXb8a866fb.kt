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

public enum class InlineV1QuotesPostRequestFormHeaderXb8a866fbBranch {
  Branch1,
  InlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4,
}

public sealed class InlineV1QuotesPostRequestFormHeaderXb8a866fbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormHeaderXb8a866fbNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormHeaderXb8a866fbDecodingException(message)

internal data class InlineV1QuotesPostRequestFormHeaderXb8a866fbInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4).count { it }
}

/**
 * A header that will be displayed on the quote PDF.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/header
 */
@Serializable(with = InlineV1QuotesPostRequestFormHeaderXb8a866fb.Serializer::class)
public class InlineV1QuotesPostRequestFormHeaderXb8a866fb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormHeaderXb8a866fbInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4:
      InlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormHeaderXb8a866fbBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormHeaderXb8a866fbBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4) add(InlineV1QuotesPostRequestFormHeaderXb8a866fbBranch.InlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormHeaderXb8a866fb {
      val inspection = inspectInlineV1QuotesPostRequestFormHeaderXb8a866fb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormHeaderXb8a866fbNoMatchException("InlineV1QuotesPostRequestFormHeaderXb8a866fb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormHeaderXb8a866fb(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormHeaderXb8a866fb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormHeaderXb8a866fb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormHeaderXb8a866fb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormHeaderXb8a866fb) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormHeaderXb8a866fb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormHeaderXb8a866fb(element: JsonElement): InlineV1QuotesPostRequestFormHeaderXb8a866fbInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4 = element.isJsonDecodable<InlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4>()
  return InlineV1QuotesPostRequestFormHeaderXb8a866fbInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4 = matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4) add("InlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4: value does not match InlineV1QuotesPostRequestFormHeaderAnyOf2X8440b9a4")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
