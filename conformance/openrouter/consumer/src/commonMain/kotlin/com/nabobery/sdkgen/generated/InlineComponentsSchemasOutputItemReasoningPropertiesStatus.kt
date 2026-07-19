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

public enum class InlineComponentsSchemasOutputItemReasoningPropertiesStatusBranch {
  InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0,
  InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1,
  InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2,
}

public sealed class InlineComponentsSchemasOutputItemReasoningPropertiesStatusDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOutputItemReasoningPropertiesStatusNoMatchException(
  message: String,
) : InlineComponentsSchemasOutputItemReasoningPropertiesStatusDecodingException(message)

internal data class InlineComponentsSchemasOutputItemReasoningPropertiesStatusInspection(
  public val matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0,
      matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1,
        matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status.
 */
@Serializable(with = InlineComponentsSchemasOutputItemReasoningPropertiesStatus.Serializer::class)
public class InlineComponentsSchemasOutputItemReasoningPropertiesStatus internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasOutputItemReasoningPropertiesStatusInspection,
) {
  public val inlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0:
      InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0>(raw) else null }

  public val inlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1:
      InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1>(raw) else null }

  public val inlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2:
      InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasOutputItemReasoningPropertiesStatusBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0) add(InlineComponentsSchemasOutputItemReasoningPropertiesStatusBranch.InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1) add(InlineComponentsSchemasOutputItemReasoningPropertiesStatusBranch.InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2) add(InlineComponentsSchemasOutputItemReasoningPropertiesStatusBranch.InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasOutputItemReasoningPropertiesStatus {
      val inspection = inspectInlineComponentsSchemasOutputItemReasoningPropertiesStatus(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasOutputItemReasoningPropertiesStatusNoMatchException("InlineComponentsSchemasOutputItemReasoningPropertiesStatus " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasOutputItemReasoningPropertiesStatus(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemReasoningPropertiesStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemReasoningPropertiesStatus {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOutputItemReasoningPropertiesStatus")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemReasoningPropertiesStatus) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOutputItemReasoningPropertiesStatus").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasOutputItemReasoningPropertiesStatus(element: JsonElement): InlineComponentsSchemasOutputItemReasoningPropertiesStatusInspection {
  val matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0>()
  val matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1>()
  val matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2>()
  return InlineComponentsSchemasOutputItemReasoningPropertiesStatusInspection(
    matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0 =
      matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0,
    matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1 =
      matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1,
    matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2 =
      matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2,
    failures = buildList {
      if (!matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0) add("InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0: " +
        "value does not match InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0")
      if (!matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1) add("InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1: " +
        "value does not match InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1")
      if (!matchesInlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2) add("InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2: " +
        "value does not match InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
