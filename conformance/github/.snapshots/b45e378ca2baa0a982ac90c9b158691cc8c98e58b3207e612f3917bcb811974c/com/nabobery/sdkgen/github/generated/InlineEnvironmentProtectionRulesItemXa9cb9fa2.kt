package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf1X8a262486View(
  public val id: Int,
  @SerialName("node_id")
  public val nodeId: String,
  public val type: String,
  @SerialName("wait_timer")
  public val waitTimer: Int? = null,
)

@ConsistentCopyVisibility
@Serializable
public data class InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186View internal constructor(
  public val id: Int,
  @SerialName("node_id")
  public val nodeId: String,
  @SerialName("prevent_self_review")
  public val preventSelfReview: Boolean? = null,
  public val reviewers:
      List<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025>? = null,
  public val type: String,
)

@Serializable
public data class InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785View(
  public val id: Int,
  @SerialName("node_id")
  public val nodeId: String,
  public val type: String,
)

public enum class InlineEnvironmentProtectionRulesItemXa9cb9fa2Branch {
  InlineEnvironmentProtectionRulesItemAnyOf1X8a262486,
  InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186,
  InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785,
}

public sealed class InlineEnvironmentProtectionRulesItemXa9cb9fa2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineEnvironmentProtectionRulesItemXa9cb9fa2NoMatchException(
  message: String,
) : InlineEnvironmentProtectionRulesItemXa9cb9fa2DecodingException(message)

internal data class InlineEnvironmentProtectionRulesItemXa9cb9fa2Inspection(
  public val matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486: Boolean,
  public val matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186: Boolean,
  public val matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486, matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186, matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items
 */
@Serializable(with = InlineEnvironmentProtectionRulesItemXa9cb9fa2.Serializer::class)
public class InlineEnvironmentProtectionRulesItemXa9cb9fa2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineEnvironmentProtectionRulesItemXa9cb9fa2Inspection,
) {
  public val inlineEnvironmentProtectionRulesItemAnyOf1X8a262486:
      InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf1X8a262486View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486) json.decodeFromJsonElement<InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf1X8a262486View>(raw) else null }

  public val inlineEnvironmentProtectionRulesItemAnyOf2X5efe1186:
      InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186) json.decodeFromJsonElement<InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186View>(raw) else null }

  public val inlineEnvironmentProtectionRulesItemAnyOf3X4ef73785:
      InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785) json.decodeFromJsonElement<InlineEnvironmentProtectionRulesItemXa9cb9fa2InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785View>(raw) else null }

  public val matchedBranches: Set<InlineEnvironmentProtectionRulesItemXa9cb9fa2Branch>
    get() = buildSet {
      if (inspection.matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486) add(InlineEnvironmentProtectionRulesItemXa9cb9fa2Branch.InlineEnvironmentProtectionRulesItemAnyOf1X8a262486)
      if (inspection.matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186) add(InlineEnvironmentProtectionRulesItemXa9cb9fa2Branch.InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186)
      if (inspection.matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785) add(InlineEnvironmentProtectionRulesItemXa9cb9fa2Branch.InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineEnvironmentProtectionRulesItemXa9cb9fa2 {
      val inspection = inspectInlineEnvironmentProtectionRulesItemXa9cb9fa2(raw)
      if (inspection.matchCount == 0) {
        throw InlineEnvironmentProtectionRulesItemXa9cb9fa2NoMatchException("InlineEnvironmentProtectionRulesItemXa9cb9fa2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineEnvironmentProtectionRulesItemXa9cb9fa2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineEnvironmentProtectionRulesItemXa9cb9fa2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnvironmentProtectionRulesItemXa9cb9fa2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnvironmentProtectionRulesItemXa9cb9fa2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnvironmentProtectionRulesItemXa9cb9fa2) {
      encoder.requireJsonEncoder("InlineEnvironmentProtectionRulesItemXa9cb9fa2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineEnvironmentProtectionRulesItemXa9cb9fa2(element: JsonElement): InlineEnvironmentProtectionRulesItemXa9cb9fa2Inspection {
  val raw = element as? JsonObject ?: return InlineEnvironmentProtectionRulesItemXa9cb9fa2Inspection(
    matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486 = false,
    matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 = false,
    matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 = false,
    failures = listOf("InlineEnvironmentProtectionRulesItemAnyOf1X8a262486: expected JSON object", "InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186: expected JSON object", "InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785: expected JSON object"),
  )
  val matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486 = raw["id"] != null && raw["node_id"].isString() && raw["type"].isString()
  val matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 = raw["id"] != null && raw["node_id"].isString() && raw["type"].isString()
  val matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 = raw["id"] != null && raw["node_id"].isString() && raw["type"].isString()
  return InlineEnvironmentProtectionRulesItemXa9cb9fa2Inspection(
    matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486 = matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486,
    matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 = matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186,
    matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785 = matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785,
    failures = buildList {
      if (!matchesInlineEnvironmentProtectionRulesItemAnyOf1X8a262486) add("InlineEnvironmentProtectionRulesItemAnyOf1X8a262486: required properties 'id', 'node_id', 'type' do not match their declared types")
      if (!matchesInlineEnvironmentProtectionRulesItemAnyOf2X5efe1186) add("InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186: required properties 'id', 'node_id', 'type' do not match their declared types")
      if (!matchesInlineEnvironmentProtectionRulesItemAnyOf3X4ef73785) add("InlineEnvironmentProtectionRulesItemAnyOf3X4ef73785: required properties 'id', 'node_id', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
