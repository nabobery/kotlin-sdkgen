package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineMcpServerToolAllowedToolsX70edd418Branch {
  Branch1,
  InlineMcpServerToolAllowedToolsAnyOf2X94107112,
  Branch3,
}

public sealed class InlineMcpServerToolAllowedToolsX70edd418DecodingException(
  message: String,
) : SerializationException(message)

public class InlineMcpServerToolAllowedToolsX70edd418NoMatchException(
  message: String,
) : InlineMcpServerToolAllowedToolsX70edd418DecodingException(message)

internal data class InlineMcpServerToolAllowedToolsX70edd418Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineMcpServerToolAllowedToolsAnyOf2X94107112: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineMcpServerToolAllowedToolsAnyOf2X94107112, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/allowed_tools.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/allowed_tools
 */
@Serializable(with = InlineMcpServerToolAllowedToolsX70edd418.Serializer::class)
public class InlineMcpServerToolAllowedToolsX70edd418 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineMcpServerToolAllowedToolsX70edd418Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineMcpServerToolAllowedToolsAnyOf2X94107112:
      InlineMcpServerToolAllowedToolsAnyOf2X94107112? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMcpServerToolAllowedToolsAnyOf2X94107112) json.decodeFromJsonElement<InlineMcpServerToolAllowedToolsAnyOf2X94107112>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineMcpServerToolAllowedToolsX70edd418Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineMcpServerToolAllowedToolsX70edd418Branch.Branch1)
      if (inspection.matchesInlineMcpServerToolAllowedToolsAnyOf2X94107112) add(InlineMcpServerToolAllowedToolsX70edd418Branch.InlineMcpServerToolAllowedToolsAnyOf2X94107112)
      if (inspection.matchesBranch3) add(InlineMcpServerToolAllowedToolsX70edd418Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMcpServerToolAllowedToolsX70edd418 {
      val inspection = inspectInlineMcpServerToolAllowedToolsX70edd418(raw)
      if (inspection.matchCount == 0) {
        throw InlineMcpServerToolAllowedToolsX70edd418NoMatchException("InlineMcpServerToolAllowedToolsX70edd418 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMcpServerToolAllowedToolsX70edd418(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMcpServerToolAllowedToolsX70edd418> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMcpServerToolAllowedToolsX70edd418 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMcpServerToolAllowedToolsX70edd418")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolAllowedToolsX70edd418) {
      encoder.requireJsonEncoder("InlineMcpServerToolAllowedToolsX70edd418").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMcpServerToolAllowedToolsX70edd418(element: JsonElement): InlineMcpServerToolAllowedToolsX70edd418Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineMcpServerToolAllowedToolsAnyOf2X94107112 = element.isJsonDecodable<InlineMcpServerToolAllowedToolsAnyOf2X94107112>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineMcpServerToolAllowedToolsX70edd418Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineMcpServerToolAllowedToolsAnyOf2X94107112 = matchesInlineMcpServerToolAllowedToolsAnyOf2X94107112,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineMcpServerToolAllowedToolsAnyOf2X94107112) add("InlineMcpServerToolAllowedToolsAnyOf2X94107112: value does not match InlineMcpServerToolAllowedToolsAnyOf2X94107112")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
