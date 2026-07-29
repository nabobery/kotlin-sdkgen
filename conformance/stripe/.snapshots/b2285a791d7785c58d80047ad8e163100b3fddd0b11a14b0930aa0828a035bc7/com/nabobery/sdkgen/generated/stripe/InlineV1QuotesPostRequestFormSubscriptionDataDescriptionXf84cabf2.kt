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

public enum class InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2Branch {
  Branch1,
  InlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf,
}

public sealed class InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2DecodingException(message)

internal data class InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/description
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf:
      InlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf>(raw) else null }

  public val matchedBranches:
      Set<InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf) add(InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2Branch.InlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2 {
      val inspection = inspectInlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2NoMatchException("InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2(element: JsonElement): InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf = element.isJsonDecodable<InlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf>()
  return InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf = matchesInlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf) add("InlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf: value does not match InlineV1QuotesPostRequestFormSubscriptionDataDescriptionAnyOf2X7829aecf")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
