package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
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
public data class InlineGenerationContentDataInputX27fbcb8eInlineGenerationContentDataInputAnyOf1X4481ea43View(
  public val prompt: String,
)

@ConsistentCopyVisibility
@Serializable
public data class InlineGenerationContentDataInputX27fbcb8eInlineGenerationContentDataInputAnyOf2X2136db71View internal constructor(
  public val messages: List<JsonElement?>,
)

public enum class InlineGenerationContentDataInputX27fbcb8eBranch {
  InlineGenerationContentDataInputAnyOf1X4481ea43,
  InlineGenerationContentDataInputAnyOf2X2136db71,
}

public sealed class InlineGenerationContentDataInputX27fbcb8eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineGenerationContentDataInputX27fbcb8eNoMatchException(
  message: String,
) : InlineGenerationContentDataInputX27fbcb8eDecodingException(message)

internal data class InlineGenerationContentDataInputX27fbcb8eInspection(
  public val matchesInlineGenerationContentDataInputAnyOf1X4481ea43: Boolean,
  public val matchesInlineGenerationContentDataInputAnyOf2X2136db71: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineGenerationContentDataInputAnyOf1X4481ea43, matchesInlineGenerationContentDataInputAnyOf2X2136db71).count { it }
}

/**
 * The input to the generation — either a prompt string or an array of messages
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationContentData/properties/input
 */
@Serializable(with = InlineGenerationContentDataInputX27fbcb8e.Serializer::class)
public class InlineGenerationContentDataInputX27fbcb8e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGenerationContentDataInputX27fbcb8eInspection,
) {
  public val inlineGenerationContentDataInputAnyOf1X4481ea43:
      InlineGenerationContentDataInputX27fbcb8eInlineGenerationContentDataInputAnyOf1X4481ea43View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineGenerationContentDataInputAnyOf1X4481ea43) json.decodeFromJsonElement<InlineGenerationContentDataInputX27fbcb8eInlineGenerationContentDataInputAnyOf1X4481ea43View>(raw) else null }

  public val inlineGenerationContentDataInputAnyOf2X2136db71:
      InlineGenerationContentDataInputX27fbcb8eInlineGenerationContentDataInputAnyOf2X2136db71View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineGenerationContentDataInputAnyOf2X2136db71) json.decodeFromJsonElement<InlineGenerationContentDataInputX27fbcb8eInlineGenerationContentDataInputAnyOf2X2136db71View>(raw) else null }

  public val matchedBranches: Set<InlineGenerationContentDataInputX27fbcb8eBranch>
    get() = buildSet {
      if (inspection.matchesInlineGenerationContentDataInputAnyOf1X4481ea43) add(InlineGenerationContentDataInputX27fbcb8eBranch.InlineGenerationContentDataInputAnyOf1X4481ea43)
      if (inspection.matchesInlineGenerationContentDataInputAnyOf2X2136db71) add(InlineGenerationContentDataInputX27fbcb8eBranch.InlineGenerationContentDataInputAnyOf2X2136db71)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGenerationContentDataInputX27fbcb8e {
      val inspection = inspectInlineGenerationContentDataInputX27fbcb8e(raw)
      if (inspection.matchCount == 0) {
        throw InlineGenerationContentDataInputX27fbcb8eNoMatchException("InlineGenerationContentDataInputX27fbcb8e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGenerationContentDataInputX27fbcb8e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineGenerationContentDataInputX27fbcb8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGenerationContentDataInputX27fbcb8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGenerationContentDataInputX27fbcb8e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGenerationContentDataInputX27fbcb8e) {
      encoder.requireJsonEncoder("InlineGenerationContentDataInputX27fbcb8e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGenerationContentDataInputX27fbcb8e(element: JsonElement): InlineGenerationContentDataInputX27fbcb8eInspection {
  val raw = element as? JsonObject ?: return InlineGenerationContentDataInputX27fbcb8eInspection(
    matchesInlineGenerationContentDataInputAnyOf1X4481ea43 = false,
    matchesInlineGenerationContentDataInputAnyOf2X2136db71 = false,
    failures = listOf("InlineGenerationContentDataInputAnyOf1X4481ea43: expected JSON object", "InlineGenerationContentDataInputAnyOf2X2136db71: expected JSON object"),
  )
  val matchesInlineGenerationContentDataInputAnyOf1X4481ea43 = raw["prompt"].isString()
  val matchesInlineGenerationContentDataInputAnyOf2X2136db71 = raw["messages"] != null
  return InlineGenerationContentDataInputX27fbcb8eInspection(
    matchesInlineGenerationContentDataInputAnyOf1X4481ea43 = matchesInlineGenerationContentDataInputAnyOf1X4481ea43,
    matchesInlineGenerationContentDataInputAnyOf2X2136db71 = matchesInlineGenerationContentDataInputAnyOf2X2136db71,
    failures = buildList {
      if (!matchesInlineGenerationContentDataInputAnyOf1X4481ea43) add("InlineGenerationContentDataInputAnyOf1X4481ea43: required properties 'prompt' do not match their declared types")
      if (!matchesInlineGenerationContentDataInputAnyOf2X2136db71) add("InlineGenerationContentDataInputAnyOf2X2136db71: required properties 'messages' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
