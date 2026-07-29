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

public enum class InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70Branch {
  Branch1,
  InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c,
}

public sealed class InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70DecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/treasury/properties/tos_acceptance/properties/user_agent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/treasury/properties/tos_acceptance/properties/user_agent
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c:
      InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c) add(InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70Branch.InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70 {
      val inspection = inspectInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70NoMatchException("InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70(element: JsonElement): InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c = element.isJsonDecodable<InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c>()
  return InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceUserAgentXed5c6b70Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c = matchesInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c) add("InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c: value does not match InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceAnyOf2Xa91b137c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
