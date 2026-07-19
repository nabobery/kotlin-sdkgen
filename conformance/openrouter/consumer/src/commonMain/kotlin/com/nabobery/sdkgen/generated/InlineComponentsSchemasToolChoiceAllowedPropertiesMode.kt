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

public enum class InlineComponentsSchemasToolChoiceAllowedPropertiesModeBranch {
  InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0,
  InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1,
}

public sealed class InlineComponentsSchemasToolChoiceAllowedPropertiesModeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasToolChoiceAllowedPropertiesModeNoMatchException(
  message: String,
) : InlineComponentsSchemasToolChoiceAllowedPropertiesModeDecodingException(message)

internal data class InlineComponentsSchemasToolChoiceAllowedPropertiesModeInspection(
  public val matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0,
      matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/mode.
 */
@Serializable(with = InlineComponentsSchemasToolChoiceAllowedPropertiesMode.Serializer::class)
public class InlineComponentsSchemasToolChoiceAllowedPropertiesMode internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasToolChoiceAllowedPropertiesModeInspection,
) {
  public val inlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0:
      InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0>(raw) else null }

  public val inlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1:
      InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasToolChoiceAllowedPropertiesModeBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0) add(InlineComponentsSchemasToolChoiceAllowedPropertiesModeBranch.InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1) add(InlineComponentsSchemasToolChoiceAllowedPropertiesModeBranch.InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasToolChoiceAllowedPropertiesMode {
      val inspection = inspectInlineComponentsSchemasToolChoiceAllowedPropertiesMode(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasToolChoiceAllowedPropertiesModeNoMatchException("InlineComponentsSchemasToolChoiceAllowedPropertiesMode " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasToolChoiceAllowedPropertiesMode(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasToolChoiceAllowedPropertiesMode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasToolChoiceAllowedPropertiesMode {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasToolChoiceAllowedPropertiesMode")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasToolChoiceAllowedPropertiesMode) {
      encoder.requireJsonEncoder("InlineComponentsSchemasToolChoiceAllowedPropertiesMode").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasToolChoiceAllowedPropertiesMode(element: JsonElement): InlineComponentsSchemasToolChoiceAllowedPropertiesModeInspection {
  val matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0>()
  val matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1>()
  return InlineComponentsSchemasToolChoiceAllowedPropertiesModeInspection(
    matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0 =
      matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0,
    matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1 =
      matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1,
    failures = buildList {
      if (!matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0) add("InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0: " +
        "value does not match InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0")
      if (!matchesInlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1) add("InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1: " +
        "value does not match InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
