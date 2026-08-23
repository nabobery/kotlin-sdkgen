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

public enum class InlineNamespaceToolToolsItemXec65fe71Branch {
  NamespaceFunctionTool,
  CustomTool,
}

public sealed class InlineNamespaceToolToolsItemXec65fe71DecodingException(
  message: String,
) : SerializationException(message)

public class InlineNamespaceToolToolsItemXec65fe71NoMatchException(
  message: String,
) : InlineNamespaceToolToolsItemXec65fe71DecodingException(message)

internal data class InlineNamespaceToolToolsItemXec65fe71Inspection(
  public val matchesNamespaceFunctionTool: Boolean,
  public val matchesCustomTool: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesNamespaceFunctionTool, matchesCustomTool).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/NamespaceTool/properties/tools/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/NamespaceTool/properties/tools/items
 */
@Serializable(with = InlineNamespaceToolToolsItemXec65fe71.Serializer::class)
public class InlineNamespaceToolToolsItemXec65fe71 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineNamespaceToolToolsItemXec65fe71Inspection,
) {
  public val namespaceFunctionTool: NamespaceFunctionToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesNamespaceFunctionTool) json.decodeFromJsonElement<NamespaceFunctionToolView>(raw) else null }

  public val customTool: CustomToolView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomTool) json.decodeFromJsonElement<CustomToolView>(raw) else null }

  public val matchedBranches: Set<InlineNamespaceToolToolsItemXec65fe71Branch>
    get() = buildSet {
      if (inspection.matchesNamespaceFunctionTool) add(InlineNamespaceToolToolsItemXec65fe71Branch.NamespaceFunctionTool)
      if (inspection.matchesCustomTool) add(InlineNamespaceToolToolsItemXec65fe71Branch.CustomTool)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineNamespaceToolToolsItemXec65fe71 {
      val inspection = inspectInlineNamespaceToolToolsItemXec65fe71(raw)
      if (inspection.matchCount == 0) {
        throw InlineNamespaceToolToolsItemXec65fe71NoMatchException("InlineNamespaceToolToolsItemXec65fe71 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineNamespaceToolToolsItemXec65fe71(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineNamespaceToolToolsItemXec65fe71> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNamespaceToolToolsItemXec65fe71 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNamespaceToolToolsItemXec65fe71")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineNamespaceToolToolsItemXec65fe71) {
      encoder.requireJsonEncoder("InlineNamespaceToolToolsItemXec65fe71").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineNamespaceToolToolsItemXec65fe71(element: JsonElement): InlineNamespaceToolToolsItemXec65fe71Inspection {
  val raw = element as? JsonObject ?: return InlineNamespaceToolToolsItemXec65fe71Inspection(
    matchesNamespaceFunctionTool = false,
    matchesCustomTool = false,
    failures = listOf("NamespaceFunctionTool: expected JSON object", "CustomTool: expected JSON object"),
  )
  val matchesNamespaceFunctionTool = raw["name"].isString() && raw["type"] != null
  val matchesCustomTool = raw["name"].isString() && raw["type"] != null
  return InlineNamespaceToolToolsItemXec65fe71Inspection(
    matchesNamespaceFunctionTool = matchesNamespaceFunctionTool,
    matchesCustomTool = matchesCustomTool,
    failures = buildList {
      if (!matchesNamespaceFunctionTool) add("NamespaceFunctionTool: required properties 'name', 'type' do not match their declared types")
      if (!matchesCustomTool) add("CustomTool: required properties 'name', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
