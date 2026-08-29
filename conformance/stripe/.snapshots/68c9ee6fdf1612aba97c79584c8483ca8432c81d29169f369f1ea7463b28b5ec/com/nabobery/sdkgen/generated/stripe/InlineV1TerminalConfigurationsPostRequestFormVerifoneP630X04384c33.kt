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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33Branch {
  InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4,
  InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33Inspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4:
      Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4, matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1).count { it }
}

/**
 * An object containing device type specific settings for Verifone P630 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p630
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33Inspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33NoMatchException("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33Inspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1>()
  return InlineV1TerminalConfigurationsPostRequestFormVerifoneP630X04384c33Inspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4,
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf2X1d85cef1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
