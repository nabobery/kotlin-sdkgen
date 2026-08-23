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
public data class InlineCodeInterpreterCallItemOutputsItemXcf11179aInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31bView(
  public val type: InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089,
  public val url: String,
)

@Serializable
public data class InlineCodeInterpreterCallItemOutputsItemXcf11179aInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6cView(
  public val logs: String,
  public val type: InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662,
)

public enum class InlineCodeInterpreterCallItemOutputsItemXcf11179aBranch {
  InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b,
  InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c,
}

public sealed class InlineCodeInterpreterCallItemOutputsItemXcf11179aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCodeInterpreterCallItemOutputsItemXcf11179aNoMatchException(
  message: String,
) : InlineCodeInterpreterCallItemOutputsItemXcf11179aDecodingException(message)

internal data class InlineCodeInterpreterCallItemOutputsItemXcf11179aInspection(
  public val matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b: Boolean,
  public val matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b, matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items
 */
@Serializable(with = InlineCodeInterpreterCallItemOutputsItemXcf11179a.Serializer::class)
public class InlineCodeInterpreterCallItemOutputsItemXcf11179a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCodeInterpreterCallItemOutputsItemXcf11179aInspection,
) {
  public val inlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b:
      InlineCodeInterpreterCallItemOutputsItemXcf11179aInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31bView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b) json.decodeFromJsonElement<InlineCodeInterpreterCallItemOutputsItemXcf11179aInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31bView>(raw) else null }

  public val inlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c:
      InlineCodeInterpreterCallItemOutputsItemXcf11179aInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6cView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c) json.decodeFromJsonElement<InlineCodeInterpreterCallItemOutputsItemXcf11179aInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6cView>(raw) else null }

  public val matchedBranches: Set<InlineCodeInterpreterCallItemOutputsItemXcf11179aBranch>
    get() = buildSet {
      if (inspection.matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b) add(InlineCodeInterpreterCallItemOutputsItemXcf11179aBranch.InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b)
      if (inspection.matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c) add(InlineCodeInterpreterCallItemOutputsItemXcf11179aBranch.InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCodeInterpreterCallItemOutputsItemXcf11179a {
      val inspection = inspectInlineCodeInterpreterCallItemOutputsItemXcf11179a(raw)
      if (inspection.matchCount == 0) {
        throw InlineCodeInterpreterCallItemOutputsItemXcf11179aNoMatchException("InlineCodeInterpreterCallItemOutputsItemXcf11179a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCodeInterpreterCallItemOutputsItemXcf11179a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterCallItemOutputsItemXcf11179a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterCallItemOutputsItemXcf11179a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeInterpreterCallItemOutputsItemXcf11179a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterCallItemOutputsItemXcf11179a) {
      encoder.requireJsonEncoder("InlineCodeInterpreterCallItemOutputsItemXcf11179a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCodeInterpreterCallItemOutputsItemXcf11179a(element: JsonElement): InlineCodeInterpreterCallItemOutputsItemXcf11179aInspection {
  val raw = element as? JsonObject ?: return InlineCodeInterpreterCallItemOutputsItemXcf11179aInspection(
    matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b = false,
    matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c = false,
    failures = listOf("InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b: expected JSON object", "InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c: expected JSON object"),
  )
  val matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b = raw["type"] != null && raw["url"].isString()
  val matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c = raw["logs"].isString() && raw["type"] != null
  return InlineCodeInterpreterCallItemOutputsItemXcf11179aInspection(
    matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b = matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b,
    matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c = matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c,
    failures = buildList {
      if (!matchesInlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b) add("InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b: required properties 'type', 'url' do not match their declared types")
      if (!matchesInlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c) add("InlineCodeInterpreterCallItemOutputsItemAnyOf2Xdc47eb6c: required properties 'logs', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
