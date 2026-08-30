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

public enum class InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8Branch {
  Branch1,
  Branch2,
}

public sealed class InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8NoMatchException(
  message: String,
) : InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8DecodingException(message)

internal data class InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2/properties/con
 * tent.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2/properties/con
 * tent
 */
@Serializable(with = InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8.Serializer::class)
public class InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<InlineAnthropicDocumentBlockParamSourceOneOf3ContentAnyOf2ItemX4887d144>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineAnthropicDocumentBlockParamSourceOneOf3ContentAnyOf2ItemX4887d144>>(raw) else null }

  public val matchedBranches:
      Set<InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8 {
      val inspection = inspectInlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8(raw)
      if (inspection.matchCount == 0) {
        throw InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8NoMatchException("InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8) {
      encoder.requireJsonEncoder("InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8(element: JsonElement): InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineAnthropicDocumentBlockParamSourceOneOf3ContentAnyOf2ItemX4887d144>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8Inspection(
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
