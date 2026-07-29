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

public enum class InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22Branch {
  Branch1,
  InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8,
}

public sealed class InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22NoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22DecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/additional_tos_acceptances/properties/account/properties/user_agent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/additional_tos_acceptances/properties/account/properties/user_agent
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8:
      InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8) add(InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22Branch.InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22 {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22NoMatchException("InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22(element: JsonElement): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8 = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8>()
  return InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8 = matchesInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8) add("InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8: value does not match InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAnyOf2Xc00eceb8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
