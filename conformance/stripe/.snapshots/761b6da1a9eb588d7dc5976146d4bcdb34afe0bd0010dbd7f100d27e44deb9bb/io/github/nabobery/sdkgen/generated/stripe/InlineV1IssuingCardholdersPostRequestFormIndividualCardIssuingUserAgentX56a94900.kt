package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900Branch {
  Branch1,
  InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df,
}

public sealed class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900NoMatchException(
  message: String,
) : InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900DecodingException(message)

internal data class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/card_issuing/properties/user_terms_acceptance/properties/user_agent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/card_issuing/properties/user_terms_acceptance/properties/user_agent
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df:
      InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df) json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900Branch.Branch1)
      if (inspection.matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df) add(InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900Branch.InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900 {
      val inspection = inspectInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900NoMatchException("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900) {
      encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900(element: JsonElement): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df = element.isJsonDecodable<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df>()
  return InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df = matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df) add("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df: value does not match InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
