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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeBranch {
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0,
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1,
}

public sealed class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeNoMatchException(
  message: String,
) : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeDecodingException(message)

internal data class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeInspection(
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0:
      Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0,
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType.Serializer::class)
public class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeInspection,
) {
  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0) add(InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeBranch.InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1) add(InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeBranch.InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType {
      val inspection = inspectInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeNoMatchException("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType(element: JsonElement): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeInspection {
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0>()
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1>()
  return InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeInspection(
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0,
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1,
    failures = buildList {
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf0")
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesTypeAnyOf1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
