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

public enum class InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2Branch {
  InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0,
  InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2Inspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0, matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b).count { it }
}

/**
 * Configurations for collecting transactions offline.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/offline
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2Inspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0:
      InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b:
      InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0) add(InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2Branch.InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b) add(InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2Branch.InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2NoMatchException("InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2Inspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b>()
  return InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2Inspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0 = matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0,
    matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b = matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0) add("InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0: value does not match InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1Xe19e9da0")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b) add("InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b: value does not match InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xbbee4d7b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
