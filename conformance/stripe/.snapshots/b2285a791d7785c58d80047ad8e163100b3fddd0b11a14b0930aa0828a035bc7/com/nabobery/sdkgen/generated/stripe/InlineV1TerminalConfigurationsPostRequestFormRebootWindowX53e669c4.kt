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

public enum class InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4Branch {
  InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86,
  InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4Inspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86:
      Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86, matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace).count { it }
}

/**
 * Reboot time settings for readers. that support customized reboot time configuration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/reboot_window
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4Inspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86:
      InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace:
      InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86) add(InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4Branch.InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace) add(InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4Branch.InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4NoMatchException("InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4Inspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace>()
  return InlineV1TerminalConfigurationsPostRequestFormRebootWindowX53e669c4Inspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86 = matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86,
    matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace = matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86) add("InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86: value does not match InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace) add("InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace: value does not match InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf2X7a039ace")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
