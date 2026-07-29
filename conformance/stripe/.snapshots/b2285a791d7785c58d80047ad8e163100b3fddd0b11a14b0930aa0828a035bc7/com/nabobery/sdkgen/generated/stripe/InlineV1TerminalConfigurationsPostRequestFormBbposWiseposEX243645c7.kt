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

public enum class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7Branch {
  InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6,
  InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7Inspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6:
      Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6, matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964).count { it }
}

/**
 * An object containing device type specific settings for BBPOS WisePOS E readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/bbpos_wisepos_e
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7Inspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6:
      InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964:
      InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6) add(InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7Branch.InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964) add(InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7Branch.InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7NoMatchException("InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7Inspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964>()
  return InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX243645c7Inspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6 = matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6,
    matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964 = matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6) add("InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6: value does not match InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf1X50e59fb6")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964) add("InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964: value does not match InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2Xde426964")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
