package com.nabobery.sdkgen.generated

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

public enum class InlineCustomToolCallOutputItemAllOf2OutputXca5adec4Branch {
  Branch1,
  Branch2,
}

public sealed class InlineCustomToolCallOutputItemAllOf2OutputXca5adec4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomToolCallOutputItemAllOf2OutputXca5adec4NoMatchException(
  message: String,
) : InlineCustomToolCallOutputItemAllOf2OutputXca5adec4DecodingException(message)

internal data class InlineCustomToolCallOutputItemAllOf2OutputXca5adec4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/CustomToolCallOutputItem/allOf/1/properties/output.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomToolCallOutputItem/allOf/1/properties/output
 */
@Serializable(with = InlineCustomToolCallOutputItemAllOf2OutputXca5adec4.Serializer::class)
public class InlineCustomToolCallOutputItemAllOf2OutputXca5adec4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomToolCallOutputItemAllOf2OutputXca5adec4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemX3d03eeda>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemX3d03eeda>>(raw) else null }

  public val matchedBranches: Set<InlineCustomToolCallOutputItemAllOf2OutputXca5adec4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomToolCallOutputItemAllOf2OutputXca5adec4Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineCustomToolCallOutputItemAllOf2OutputXca5adec4Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomToolCallOutputItemAllOf2OutputXca5adec4 {
      val inspection = inspectInlineCustomToolCallOutputItemAllOf2OutputXca5adec4(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomToolCallOutputItemAllOf2OutputXca5adec4NoMatchException("InlineCustomToolCallOutputItemAllOf2OutputXca5adec4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomToolCallOutputItemAllOf2OutputXca5adec4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomToolCallOutputItemAllOf2OutputXca5adec4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomToolCallOutputItemAllOf2OutputXca5adec4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomToolCallOutputItemAllOf2OutputXca5adec4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolCallOutputItemAllOf2OutputXca5adec4) {
      encoder.requireJsonEncoder("InlineCustomToolCallOutputItemAllOf2OutputXca5adec4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomToolCallOutputItemAllOf2OutputXca5adec4(element: JsonElement): InlineCustomToolCallOutputItemAllOf2OutputXca5adec4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemX3d03eeda>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineCustomToolCallOutputItemAllOf2OutputXca5adec4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
