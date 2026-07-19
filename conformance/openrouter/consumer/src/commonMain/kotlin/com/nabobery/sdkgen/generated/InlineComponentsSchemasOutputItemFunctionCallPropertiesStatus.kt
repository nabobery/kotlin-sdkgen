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

public enum class InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusBranch {
  InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0,
  InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1,
  InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2,
}

public sealed class InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusNoMatchException(
  message: String,
) : InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusDecodingException(message)

internal data class InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusInspection(
  public val matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0,
      matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1,
        matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status.
 */
@Serializable(with = InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus.Serializer::class)
public class InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusInspection,
) {
  public val inlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0:
      InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0>(raw) else null }

  public val inlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1:
      InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1>(raw) else null }

  public val inlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2:
      InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0) add(InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusBranch.InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1) add(InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusBranch.InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2) add(InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusBranch.InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus {
      val inspection = inspectInlineComponentsSchemasOutputItemFunctionCallPropertiesStatus(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusNoMatchException("InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOutputItemFunctionCallPropertiesStatus")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasOutputItemFunctionCallPropertiesStatus(element: JsonElement): InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusInspection {
  val matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0>()
  val matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1>()
  val matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2>()
  return InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusInspection(
    matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0 =
      matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0,
    matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1 =
      matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1,
    matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2 =
      matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2,
    failures = buildList {
      if (!matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0) add("InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0: " +
        "value does not match InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf0")
      if (!matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1) add("InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1: " +
        "value does not match InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1")
      if (!matchesInlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2) add("InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2: " +
        "value does not match InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
