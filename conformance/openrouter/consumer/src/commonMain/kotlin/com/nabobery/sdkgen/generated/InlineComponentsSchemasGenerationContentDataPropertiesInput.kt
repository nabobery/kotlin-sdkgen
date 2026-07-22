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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@Serializable
public data class InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0View(
  public val prompt: String,
)

@Serializable
public data class InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1View(
  public val messages: List<JsonElement?>,
)

public enum class InlineComponentsSchemasGenerationContentDataPropertiesInputBranch {
  InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0,
  InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1,
}

public sealed class InlineComponentsSchemasGenerationContentDataPropertiesInputDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasGenerationContentDataPropertiesInputNoMatchException(
  message: String,
) : InlineComponentsSchemasGenerationContentDataPropertiesInputDecodingException(message)

internal data class InlineComponentsSchemasGenerationContentDataPropertiesInputInspection(
  public val matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0,
      matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1).count { it }
}

/**
 * The input to the generation — either a prompt string or an array of messages
 */
@Serializable(with = InlineComponentsSchemasGenerationContentDataPropertiesInput.Serializer::class)
public class InlineComponentsSchemasGenerationContentDataPropertiesInput internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasGenerationContentDataPropertiesInputInspection,
) {
  public val inlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0:
      InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0View>(raw) else null }

  public val inlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1:
      InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1View>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasGenerationContentDataPropertiesInputBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0) add(InlineComponentsSchemasGenerationContentDataPropertiesInputBranch.InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1) add(InlineComponentsSchemasGenerationContentDataPropertiesInputBranch.InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasGenerationContentDataPropertiesInput {
      val inspection = inspectInlineComponentsSchemasGenerationContentDataPropertiesInput(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasGenerationContentDataPropertiesInputNoMatchException("InlineComponentsSchemasGenerationContentDataPropertiesInput " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasGenerationContentDataPropertiesInput(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasGenerationContentDataPropertiesInput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasGenerationContentDataPropertiesInput {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasGenerationContentDataPropertiesInput")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasGenerationContentDataPropertiesInput) {
      encoder.requireJsonEncoder("InlineComponentsSchemasGenerationContentDataPropertiesInput").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasGenerationContentDataPropertiesInput(element: JsonElement): InlineComponentsSchemasGenerationContentDataPropertiesInputInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasGenerationContentDataPropertiesInputInspection(
    matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 = false,
    matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 = false,
    failures = listOf("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0: expected JSON object",
      "InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1: expected JSON object"),
  )
  val matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 = raw["prompt"].isString()
  val matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 = raw["messages"] != null
  return InlineComponentsSchemasGenerationContentDataPropertiesInputInspection(
    matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 =
      matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0,
    matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 =
      matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1,
    failures = buildList {
      if (!matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0) add("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0: " +
        "required properties 'prompt' do not match their declared types")
      if (!matchesInlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1) add("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1: " +
        "required properties 'messages' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
