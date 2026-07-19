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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsBranch {
  Branch1,
  InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1,
  Branch3,
}

public sealed class InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsNoMatchException(
  message: String,
) : InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsDecodingException(message)

internal data class InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1,
      matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/allowed_tools.
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesAllowedTools.Serializer::class)
public class InlineComponentsSchemasMcpServerToolPropertiesAllowedTools internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1:
      InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsBranch.Branch1)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1) add(InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsBranch.InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasMcpServerToolPropertiesAllowedTools {
      val inspection = inspectInlineComponentsSchemasMcpServerToolPropertiesAllowedTools(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsNoMatchException("InlineComponentsSchemasMcpServerToolPropertiesAllowedTools " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasMcpServerToolPropertiesAllowedTools(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesAllowedTools> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesAllowedTools {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMcpServerToolPropertiesAllowedTools")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpServerToolPropertiesAllowedTools) {
      encoder.requireJsonEncoder("InlineComponentsSchemasMcpServerToolPropertiesAllowedTools").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasMcpServerToolPropertiesAllowedTools(element: JsonElement): InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  val matchesInlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1 =
      matchesInlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1) add("InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1: " +
        "value does not match InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
