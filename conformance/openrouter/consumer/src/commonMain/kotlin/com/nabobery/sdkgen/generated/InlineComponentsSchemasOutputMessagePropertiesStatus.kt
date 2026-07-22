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

public enum class InlineComponentsSchemasOutputMessagePropertiesStatusBranch {
  InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0,
  InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1,
  InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2,
}

public sealed class InlineComponentsSchemasOutputMessagePropertiesStatusDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOutputMessagePropertiesStatusNoMatchException(
  message: String,
) : InlineComponentsSchemasOutputMessagePropertiesStatusDecodingException(message)

internal data class InlineComponentsSchemasOutputMessagePropertiesStatusInspection(
  public val matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0,
      matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1,
        matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status.
 */
@Serializable(with = InlineComponentsSchemasOutputMessagePropertiesStatus.Serializer::class)
public class InlineComponentsSchemasOutputMessagePropertiesStatus internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasOutputMessagePropertiesStatusInspection,
) {
  public val inlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0:
      InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0>(raw) else null }

  public val inlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1:
      InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1>(raw) else null }

  public val inlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2:
      InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasOutputMessagePropertiesStatusBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0) add(InlineComponentsSchemasOutputMessagePropertiesStatusBranch.InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1) add(InlineComponentsSchemasOutputMessagePropertiesStatusBranch.InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1)
      if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2) add(InlineComponentsSchemasOutputMessagePropertiesStatusBranch.InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasOutputMessagePropertiesStatus {
      val inspection = inspectInlineComponentsSchemasOutputMessagePropertiesStatus(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasOutputMessagePropertiesStatusNoMatchException("InlineComponentsSchemasOutputMessagePropertiesStatus " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasOutputMessagePropertiesStatus(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputMessagePropertiesStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputMessagePropertiesStatus {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOutputMessagePropertiesStatus")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputMessagePropertiesStatus) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOutputMessagePropertiesStatus").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasOutputMessagePropertiesStatus(element: JsonElement): InlineComponentsSchemasOutputMessagePropertiesStatusInspection {
  val matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0>()
  val matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1>()
  val matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2>()
  return InlineComponentsSchemasOutputMessagePropertiesStatusInspection(
    matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0 =
      matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0,
    matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1 =
      matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1,
    matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2 =
      matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2,
    failures = buildList {
      if (!matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0) add("InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0: " +
        "value does not match InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf0")
      if (!matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1) add("InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1: " +
        "value does not match InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1")
      if (!matchesInlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2) add("InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2: " +
        "value does not match InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
