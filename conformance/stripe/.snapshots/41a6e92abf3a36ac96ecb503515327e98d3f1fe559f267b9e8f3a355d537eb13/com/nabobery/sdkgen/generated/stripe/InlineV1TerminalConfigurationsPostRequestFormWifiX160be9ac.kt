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

public enum class InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acBranch {
  InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d,
  InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acInspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d, matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b).count { it }
}

/**
 * Configurations for connecting to a WiFi network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/wifi
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acInspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d:
      InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b:
      InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d) add(InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acBranch.InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b) add(InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acBranch.InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acNoMatchException("InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acInspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b>()
  return InlineV1TerminalConfigurationsPostRequestFormWifiX160be9acInspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d = matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d,
    matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b = matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d) add("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d: value does not match InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b) add("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b: value does not match InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2X9fed819b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
