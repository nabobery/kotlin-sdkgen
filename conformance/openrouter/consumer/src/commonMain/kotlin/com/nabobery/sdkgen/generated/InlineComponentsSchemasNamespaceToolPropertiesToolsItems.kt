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

public enum class InlineComponentsSchemasNamespaceToolPropertiesToolsItemsBranch {
  NamespaceFunctionTool,
  CustomTool,
}

public sealed class InlineComponentsSchemasNamespaceToolPropertiesToolsItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasNamespaceToolPropertiesToolsItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasNamespaceToolPropertiesToolsItemsDecodingException(message)

internal data class InlineComponentsSchemasNamespaceToolPropertiesToolsItemsInspection(
  public val matchesNamespaceFunctionTool: Boolean,
  public val matchesCustomTool: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesNamespaceFunctionTool, matchesCustomTool).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/NamespaceTool/properties/tools/items.
 */
@Serializable(with = InlineComponentsSchemasNamespaceToolPropertiesToolsItems.Serializer::class)
public class InlineComponentsSchemasNamespaceToolPropertiesToolsItems internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasNamespaceToolPropertiesToolsItemsInspection,
) {
  public val namespaceFunctionTool: NamespaceFunctionToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesNamespaceFunctionTool) json
        .decodeFromJsonElement<NamespaceFunctionToolView>(raw) else null }

  public val customTool: CustomToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomTool) json
        .decodeFromJsonElement<CustomToolView>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasNamespaceToolPropertiesToolsItemsBranch>
    get() = buildSet {
      if (inspection.matchesNamespaceFunctionTool) add(InlineComponentsSchemasNamespaceToolPropertiesToolsItemsBranch
        .NamespaceFunctionTool)
      if (inspection.matchesCustomTool) add(InlineComponentsSchemasNamespaceToolPropertiesToolsItemsBranch.CustomTool)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasNamespaceToolPropertiesToolsItems {
      val inspection = inspectInlineComponentsSchemasNamespaceToolPropertiesToolsItems(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasNamespaceToolPropertiesToolsItemsNoMatchException("InlineComponentsSchemasNamespaceToolPropertiesToolsItems " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasNamespaceToolPropertiesToolsItems(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasNamespaceToolPropertiesToolsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasNamespaceToolPropertiesToolsItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasNamespaceToolPropertiesToolsItems")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasNamespaceToolPropertiesToolsItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasNamespaceToolPropertiesToolsItems").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasNamespaceToolPropertiesToolsItems(element: JsonElement): InlineComponentsSchemasNamespaceToolPropertiesToolsItemsInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasNamespaceToolPropertiesToolsItemsInspection(
    matchesNamespaceFunctionTool = false,
    matchesCustomTool = false,
    failures = listOf("NamespaceFunctionTool: expected JSON object", "CustomTool: expected JSON object"),
  )
  val matchesNamespaceFunctionTool = raw["name"].isString() && raw["type"] != null
  val matchesCustomTool = raw["name"].isString() && raw["type"] != null
  return InlineComponentsSchemasNamespaceToolPropertiesToolsItemsInspection(
    matchesNamespaceFunctionTool = matchesNamespaceFunctionTool,
    matchesCustomTool = matchesCustomTool,
    failures = buildList {
      if (!matchesNamespaceFunctionTool) add("NamespaceFunctionTool: required properties 'name', 'type' do not match " +
        "their declared types")
      if (!matchesCustomTool) add("CustomTool: required properties 'name', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
