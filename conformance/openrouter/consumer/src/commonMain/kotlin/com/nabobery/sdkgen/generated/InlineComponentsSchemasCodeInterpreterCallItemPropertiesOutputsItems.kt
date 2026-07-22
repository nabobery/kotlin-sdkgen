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
public data class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0View(
  public val type:
      InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType,
  public val url: String,
)

@Serializable
public data class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1View(
  public val logs: String,
  public val type:
      InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType,
)

public enum class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsBranch {
  InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0,
  InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1,
}

public sealed class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsDecodingException(message)

internal data class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsInspection(
  public val matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0:
      Boolean,
  public val matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0,
      matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems.Serializer::class)
public class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsInspection,
) {
  public val inlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0:
      InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0View>(raw) else null }

  public val inlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1:
      InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1View>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0) add(InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsBranch.InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1) add(InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsBranch.InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems {
      val inspection = inspectInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsNoMatchException("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItems(element: JsonElement): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsInspection {
  val raw = element as? JsonObject ?:
    return InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsInspection(
    matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 = false,
    matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 = false,
    failures =
      listOf("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0: expected JSON object",
        "InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1: expected JSON object"),
  )
  val matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 = raw["type"] != null &&
    raw["url"].isString()
  val matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 = raw["logs"].isString() &&
    raw["type"] != null
  return InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsInspection(
    matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 =
      matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0,
    matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1 =
      matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1,
    failures = buildList {
      if (!matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0) add("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0: " +
        "required properties 'type', 'url' do not match their declared types")
      if (!matchesInlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1) add("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1: " +
        "required properties 'logs', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
