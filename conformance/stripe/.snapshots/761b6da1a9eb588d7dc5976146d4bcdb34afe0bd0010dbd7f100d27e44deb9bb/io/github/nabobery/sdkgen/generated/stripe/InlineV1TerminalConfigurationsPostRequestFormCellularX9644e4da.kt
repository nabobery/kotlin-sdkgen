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

public enum class InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daBranch {
  InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744,
  InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daInspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744, matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2).count { it }
}

/**
 * Configuration for cellular connectivity.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/cellular
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daInspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744:
      InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2:
      InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744) add(InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daBranch.InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2) add(InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daBranch.InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daNoMatchException("InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormCellularX9644e4da(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daInspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2>()
  return InlineV1TerminalConfigurationsPostRequestFormCellularX9644e4daInspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744 = matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744,
    matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2 = matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744) add("InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744: value does not match InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X7979e744")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2) add("InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2: value does not match InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2X037acac2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
