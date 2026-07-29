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

public enum class InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aBranch {
  InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b,
  InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aInspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b, matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe).count { it }
}

/**
 * Configuration for cellular connectivity.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/cellular
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aInspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b:
      InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe:
      InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b) add(InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aBranch.InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe) add(InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aBranch.InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aNoMatchException("InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aInspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe>()
  return InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8aInspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b = matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b,
    matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe = matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b) add("InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b: value does not match InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf1X0eb0e20b")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe) add("InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe: value does not match InlineV1TerminalConfigurationsPostRequestFormCellularAnyOf2Xbd3c09fe")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
