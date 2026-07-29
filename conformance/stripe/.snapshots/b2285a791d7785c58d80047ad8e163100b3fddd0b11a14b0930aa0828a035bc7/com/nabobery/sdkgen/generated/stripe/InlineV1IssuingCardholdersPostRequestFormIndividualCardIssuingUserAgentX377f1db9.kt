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

public enum class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9Branch {
  Branch1,
  InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22,
}

public sealed class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9NoMatchException(
  message: String,
) : InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9DecodingException(message)

internal data class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/individual/properties/card_issuing/properties/user_terms_acceptance/properties/
 * user_agent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/individual/properties/card_issuing/properties/user_terms_acceptance/properties/
 * user_agent
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22:
      InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22) json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9Branch.Branch1)
      if (inspection.matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22) add(InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9Branch.InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9 {
      val inspection = inspectInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9NoMatchException("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9) {
      encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9(element: JsonElement): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22 = element.isJsonDecodable<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22>()
  return InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX377f1db9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22 = matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22) add("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22: value does not match InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2X20b52f22")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
