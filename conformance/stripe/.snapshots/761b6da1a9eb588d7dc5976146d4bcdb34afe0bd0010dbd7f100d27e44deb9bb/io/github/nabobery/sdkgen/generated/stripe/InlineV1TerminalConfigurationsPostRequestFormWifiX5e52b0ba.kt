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

public enum class InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baBranch {
  InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2,
  InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baInspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2, matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa).count { it }
}

/**
 * Configurations for connecting to a WiFi network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/wifi
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baInspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2:
      InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa:
      InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2) add(InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baBranch.InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa) add(InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baBranch.InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baNoMatchException("InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0ba(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baInspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa>()
  return InlineV1TerminalConfigurationsPostRequestFormWifiX5e52b0baInspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2 = matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2,
    matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa = matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2) add("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2: value does not match InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa) add("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa: value does not match InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf2Xfa1b35fa")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
