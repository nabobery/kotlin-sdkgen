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

public enum class InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputBranch {
  Branch1,
  Branch2,
}

public sealed class InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputNoMatchException(
  message: String,
) : InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputDecodingException(message)

internal data class InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCallOutput/properties/output.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput.Serializer::class)
public class InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2:
      List<InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputAnyOf1Items>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
























































                                                                                                                        .decodeFromJsonElement<List<InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputAnyOf1Items>>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputBranch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputBranch.Branch1)
      if (inspection
        .matchesBranch2) add(InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput {
      val inspection = inspectInlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputNoMatchException("InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutput(element: JsonElement): InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element
    .isJsonDecodable<List<InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputAnyOf1Items>>() &&
      (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesOutputInspection(
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
