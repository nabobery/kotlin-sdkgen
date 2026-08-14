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

public enum class InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3Branch {
  Branch1,
  InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a,
}

public sealed class InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3DecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_issuing/properties/tos_acceptance/properties/user_agent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_issuing/properties/tos_acceptance/properties/user_agent
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a:
      InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a) add(InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3Branch.InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3 {
      val inspection = inspectInlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3NoMatchException("InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3(element: JsonElement): InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a = element.isJsonDecodable<InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a>()
  return InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a = matchesInlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a) add("InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a: value does not match InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
