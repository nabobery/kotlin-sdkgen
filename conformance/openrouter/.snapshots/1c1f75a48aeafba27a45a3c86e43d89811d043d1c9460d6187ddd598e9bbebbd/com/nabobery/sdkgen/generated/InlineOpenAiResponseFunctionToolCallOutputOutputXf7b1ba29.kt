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

public enum class InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29Branch {
  Branch1,
  Branch2,
}

public sealed class InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29DecodingException(
  message: String,
) : SerializationException(message)

public class InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29NoMatchException(
  message: String,
) : InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29DecodingException(message)

internal data class InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCallOutput/properties/output.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCallOutput/properties/output
 */
@Serializable(with = InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29.Serializer::class)
public class InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<InlineOpenAiResponseFunctionToolCallOutputOutputAnyOf2ItemX76e31c45>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineOpenAiResponseFunctionToolCallOutputOutputAnyOf2ItemX76e31c45>>(raw) else null }

  public val matchedBranches: Set<InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29 {
      val inspection = inspectInlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29(raw)
      if (inspection.matchCount == 0) {
        throw InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29NoMatchException("InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29) {
      encoder.requireJsonEncoder("InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29(element: JsonElement): InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineOpenAiResponseFunctionToolCallOutputOutputAnyOf2ItemX76e31c45>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29Inspection(
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
