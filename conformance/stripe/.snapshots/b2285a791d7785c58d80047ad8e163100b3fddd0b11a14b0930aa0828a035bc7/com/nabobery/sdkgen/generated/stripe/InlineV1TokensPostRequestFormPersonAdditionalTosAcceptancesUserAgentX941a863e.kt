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

public enum class InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eBranch {
  Branch1,
  InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681,
}

public sealed class InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eNoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eDecodingException(message)

internal data class InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/additional_tos_acceptances/properties/account/properties/user_agent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/additional_tos_acceptances/properties/account/properties/user_agent
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e.Serializer::class)
public class InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681:
      InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681) json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eBranch.Branch1)
      if (inspection.matchesInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681) add(InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eBranch.InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e {
      val inspection = inspectInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eNoMatchException("InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e(element: JsonElement): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681 = element.isJsonDecodable<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681>()
  return InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681 = matchesInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681) add("InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681: value does not match InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
