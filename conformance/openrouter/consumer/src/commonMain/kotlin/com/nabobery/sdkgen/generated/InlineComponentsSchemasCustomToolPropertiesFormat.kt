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
public data class InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0View(
  public val type: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType,
)

@Serializable
public data class InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1View(
  public val definition: String,
  public val syntax: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax,
  public val type: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType,
)

public enum class InlineComponentsSchemasCustomToolPropertiesFormatBranch {
  InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0,
  InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1,
}

public sealed class InlineComponentsSchemasCustomToolPropertiesFormatDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasCustomToolPropertiesFormatNoMatchException(
  message: String,
) : InlineComponentsSchemasCustomToolPropertiesFormatDecodingException(message)

internal data class InlineComponentsSchemasCustomToolPropertiesFormatInspection(
  public val matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0,
      matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format.
 */
@Serializable(with = InlineComponentsSchemasCustomToolPropertiesFormat.Serializer::class)
public class InlineComponentsSchemasCustomToolPropertiesFormat internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasCustomToolPropertiesFormatInspection,
) {
  public val inlineComponentsSchemasCustomToolPropertiesFormatAnyOf0:
      InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0View>(raw) else null }

  public val inlineComponentsSchemasCustomToolPropertiesFormatAnyOf1:
      InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1View>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasCustomToolPropertiesFormatBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0) add(InlineComponentsSchemasCustomToolPropertiesFormatBranch.InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1) add(InlineComponentsSchemasCustomToolPropertiesFormatBranch.InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasCustomToolPropertiesFormat {
      val inspection = inspectInlineComponentsSchemasCustomToolPropertiesFormat(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasCustomToolPropertiesFormatNoMatchException("InlineComponentsSchemasCustomToolPropertiesFormat " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasCustomToolPropertiesFormat(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCustomToolPropertiesFormat> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCustomToolPropertiesFormat {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasCustomToolPropertiesFormat")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCustomToolPropertiesFormat) {
      encoder.requireJsonEncoder("InlineComponentsSchemasCustomToolPropertiesFormat").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasCustomToolPropertiesFormat(element: JsonElement): InlineComponentsSchemasCustomToolPropertiesFormatInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasCustomToolPropertiesFormatInspection(
    matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 = false,
    matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 = false,
    failures = listOf("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0: expected JSON object",
      "InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1: expected JSON object"),
  )
  val matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 = raw["type"] != null
  val matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 = raw["definition"].isString() &&
    raw["syntax"] != null && raw["type"] != null
  return InlineComponentsSchemasCustomToolPropertiesFormatInspection(
    matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0 =
      matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0,
    matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1 =
      matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1,
    failures = buildList {
      if (!matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf0) add("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0: " +
        "required properties 'type' do not match their declared types")
      if (!matchesInlineComponentsSchemasCustomToolPropertiesFormatAnyOf1) add("InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1: " +
        "required properties 'definition', 'syntax', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
