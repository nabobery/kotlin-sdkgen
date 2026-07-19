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

public enum class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalBranch {
  InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0,
  InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1,
  InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2,
  Branch4,
}

public sealed class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalNoMatchException(
  message: String,
) : InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalDecodingException(message)

internal data class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalInspection(
  public val matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2: Boolean,
  public val matchesBranch4: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0,
      matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1,
        matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2, matchesBranch4).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval.
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesRequireApproval.Serializer::class)
public class InlineComponentsSchemasMcpServerToolPropertiesRequireApproval internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalInspection,
) {
  public val inlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0:
      InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0>(raw) else null }

  public val inlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1:
      InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1>(raw) else null }

  public val inlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2:
      InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2>(raw) else null }

  public val branch4: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0) add(InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalBranch.InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1) add(InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalBranch.InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2) add(InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalBranch.InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2)
      if (inspection.matchesBranch4) add(InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalBranch.Branch4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasMcpServerToolPropertiesRequireApproval {
      val inspection = inspectInlineComponentsSchemasMcpServerToolPropertiesRequireApproval(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalNoMatchException("InlineComponentsSchemasMcpServerToolPropertiesRequireApproval " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasMcpServerToolPropertiesRequireApproval(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesRequireApproval> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesRequireApproval {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMcpServerToolPropertiesRequireApproval")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpServerToolPropertiesRequireApproval) {
      encoder.requireJsonEncoder("InlineComponentsSchemasMcpServerToolPropertiesRequireApproval")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasMcpServerToolPropertiesRequireApproval(element: JsonElement): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalInspection {
  val matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0>()
  val matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1>()
  val matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2>()
  val matchesBranch4 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalInspection(
    matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0 =
      matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0,
    matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1 =
      matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1,
    matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2 =
      matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2,
    matchesBranch4 = matchesBranch4,
    failures = buildList {
      if (!matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0) add("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0: " +
        "value does not match InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0")
      if (!matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1) add("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1: " +
        "value does not match InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf1")
      if (!matchesInlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2) add("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2: " +
        "value does not match InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf2")
      if (!matchesBranch4) add("Branch4: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
