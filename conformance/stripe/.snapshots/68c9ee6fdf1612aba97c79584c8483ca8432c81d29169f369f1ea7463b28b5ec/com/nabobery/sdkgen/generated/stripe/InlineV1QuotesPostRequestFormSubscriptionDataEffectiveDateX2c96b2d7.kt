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

public enum class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Branch {
  InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e,
  Branch2,
  InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12,
}

public sealed class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7DecodingException(message)

internal data class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Inspection(
  public val matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e:
      Boolean,
  public val matchesBranch2: Boolean,
  public val matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e, matchesBranch2, matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/effective_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/effective_date
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Inspection,
) {
  public val inlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e:
      InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12:
      InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12>(raw) else null }

  public val matchedBranches:
      Set<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e) add(InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Branch.InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e)
      if (inspection.matchesBranch2) add(InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Branch.Branch2)
      if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12) add(InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Branch.InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7 {
      val inspection = inspectInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7NoMatchException("InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7(element: JsonElement): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Inspection {
  val matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e = element.isJsonDecodable<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  val matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12 = element.isJsonDecodable<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12>()
  return InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7Inspection(
    matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e = matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e,
    matchesBranch2 = matchesBranch2,
    matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12 = matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12,
    failures = buildList {
      if (!matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e) add("InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e: value does not match InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X1293cd1e")
      if (!matchesBranch2) add("Branch2: value does not match Int")
      if (!matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12) add("InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12: value does not match InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
