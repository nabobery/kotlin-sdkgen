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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6Branch {
  InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f,
  InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6Inspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f:
      Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f, matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2).count { it }
}

/**
 * An object containing device type specific settings for Verifone P400 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p400
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6Inspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6NoMatchException("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6Inspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2>()
  return InlineV1TerminalConfigurationsPostRequestFormVerifoneP400X801c80d6Inspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f,
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1Xd843195f")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X4af6c5a2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
