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

public enum class InlineV1TokensPostRequestFormCardX3af5dd08Branch {
  InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef,
  Branch2,
}

public sealed class InlineV1TokensPostRequestFormCardX3af5dd08DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormCardX3af5dd08NoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormCardX3af5dd08DecodingException(message)

internal data class InlineV1TokensPostRequestFormCardX3af5dd08Inspection(
  public val matchesInlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef, matchesBranch2).count { it }
}

/**
 * The card this token will represent. If you also pass in a customer, the card must be the ID of a card belonging to
 * the customer. Otherwise, if you do not pass in a customer, this is a dictionary containing a user's credit card
 * details, with the options described below.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/card
 */
@Serializable(with = InlineV1TokensPostRequestFormCardX3af5dd08.Serializer::class)
public class InlineV1TokensPostRequestFormCardX3af5dd08 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TokensPostRequestFormCardX3af5dd08Inspection,
) {
  public val inlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef:
      InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef) json.decodeFromJsonElement<InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineV1TokensPostRequestFormCardX3af5dd08Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef) add(InlineV1TokensPostRequestFormCardX3af5dd08Branch.InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef)
      if (inspection.matchesBranch2) add(InlineV1TokensPostRequestFormCardX3af5dd08Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormCardX3af5dd08 {
      val inspection = inspectInlineV1TokensPostRequestFormCardX3af5dd08(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormCardX3af5dd08NoMatchException("InlineV1TokensPostRequestFormCardX3af5dd08 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormCardX3af5dd08(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormCardX3af5dd08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormCardX3af5dd08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormCardX3af5dd08")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormCardX3af5dd08) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormCardX3af5dd08").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormCardX3af5dd08(element: JsonElement): InlineV1TokensPostRequestFormCardX3af5dd08Inspection {
  val matchesInlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef = element.isJsonDecodable<InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1TokensPostRequestFormCardX3af5dd08Inspection(
    matchesInlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef = matchesInlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef) add("InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef: value does not match InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
