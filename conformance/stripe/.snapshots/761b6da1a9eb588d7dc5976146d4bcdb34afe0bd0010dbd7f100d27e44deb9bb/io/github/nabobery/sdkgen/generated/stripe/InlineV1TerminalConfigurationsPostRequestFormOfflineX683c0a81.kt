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

public enum class InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81Branch {
  InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03,
  InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81Inspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03, matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe).count { it }
}

/**
 * Configurations for collecting transactions offline.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/offline
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81Inspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03:
      InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe:
      InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03) add(InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81Branch.InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe) add(InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81Branch.InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81NoMatchException("InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81Inspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe>()
  return InlineV1TerminalConfigurationsPostRequestFormOfflineX683c0a81Inspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03 = matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03,
    matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe = matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03) add("InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03: value does not match InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe) add("InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe: value does not match InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
