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

public enum class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseBranch {
  InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0,
  InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1,
  Branch3,
}

public sealed class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseNoMatchException(
  message: String,
) : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseDecodingException(message)

internal data class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseInspection(
  public val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0:
      Boolean,
  public val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1:
      Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0,
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/phase.
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase.Serializer::class)
public class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseInspection,
) {
  public val inlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0>(raw) else null }

  public val inlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseBranch.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseBranch.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseBranch
        .Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase {
      val inspection = inspectInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseNoMatchException("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase) {
      encoder.requireJsonEncoder("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhase(element: JsonElement): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseInspection {
  val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0>()
  val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseInspection(
    matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0 =
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0,
    matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1 =
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0) add("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0: " +
        "value does not match InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf0")
      if (!matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1) add("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1: " +
        "value does not match InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesPhaseAnyOf1")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
