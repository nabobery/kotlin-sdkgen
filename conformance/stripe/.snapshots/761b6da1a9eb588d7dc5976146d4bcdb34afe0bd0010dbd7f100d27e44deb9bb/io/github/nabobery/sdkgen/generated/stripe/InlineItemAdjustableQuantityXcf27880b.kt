package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineItemAdjustableQuantityXcf27880bBranch {
  LineItemsAdjustableQuantity,
}

public sealed class InlineItemAdjustableQuantityXcf27880bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineItemAdjustableQuantityXcf27880bNoMatchException(
  message: String,
) : InlineItemAdjustableQuantityXcf27880bDecodingException(message)

internal data class InlineItemAdjustableQuantityXcf27880bInspection(
  public val matchesLineItemsAdjustableQuantity: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesLineItemsAdjustableQuantity).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/item/properties/adjustable_quantity.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/item/properties/adjustable_quantity
 */
@Serializable(with = InlineItemAdjustableQuantityXcf27880b.Serializer::class)
public class InlineItemAdjustableQuantityXcf27880b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineItemAdjustableQuantityXcf27880bInspection,
) {
  public val lineItemsAdjustableQuantity: LineItemsAdjustableQuantityView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLineItemsAdjustableQuantity) json.decodeFromJsonElement<LineItemsAdjustableQuantityView>(raw) else null }

  public val matchedBranches: Set<InlineItemAdjustableQuantityXcf27880bBranch>
    get() = buildSet {
      if (inspection.matchesLineItemsAdjustableQuantity) add(InlineItemAdjustableQuantityXcf27880bBranch.LineItemsAdjustableQuantity)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineItemAdjustableQuantityXcf27880b {
      val inspection = inspectInlineItemAdjustableQuantityXcf27880b(raw)
      if (inspection.matchCount == 0) {
        throw InlineItemAdjustableQuantityXcf27880bNoMatchException("InlineItemAdjustableQuantityXcf27880b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineItemAdjustableQuantityXcf27880b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineItemAdjustableQuantityXcf27880b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineItemAdjustableQuantityXcf27880b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineItemAdjustableQuantityXcf27880b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineItemAdjustableQuantityXcf27880b) {
      encoder.requireJsonEncoder("InlineItemAdjustableQuantityXcf27880b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineItemAdjustableQuantityXcf27880b(element: JsonElement): InlineItemAdjustableQuantityXcf27880bInspection {
  val raw = element as? JsonObject ?: return InlineItemAdjustableQuantityXcf27880bInspection(
    matchesLineItemsAdjustableQuantity = false,
    failures = listOf("LineItemsAdjustableQuantity: expected JSON object"),
  )
  val matchesLineItemsAdjustableQuantity = raw["enabled"] != null
  return InlineItemAdjustableQuantityXcf27880bInspection(
    matchesLineItemsAdjustableQuantity = matchesLineItemsAdjustableQuantity,
    failures = buildList {
      if (!matchesLineItemsAdjustableQuantity) add("LineItemsAdjustableQuantity: required properties 'enabled' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
