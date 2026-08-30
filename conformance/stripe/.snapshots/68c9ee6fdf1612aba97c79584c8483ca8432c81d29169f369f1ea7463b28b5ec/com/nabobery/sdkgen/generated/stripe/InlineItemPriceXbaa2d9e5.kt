package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineItemPriceXbaa2d9e5Branch {
  Price,
}

public sealed class InlineItemPriceXbaa2d9e5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineItemPriceXbaa2d9e5NoMatchException(
  message: String,
) : InlineItemPriceXbaa2d9e5DecodingException(message)

internal data class InlineItemPriceXbaa2d9e5Inspection(
  public val matchesPrice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPrice).count { it }
}

/**
 * The price used to generate the line item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/item/properties/price
 */
@Serializable(with = InlineItemPriceXbaa2d9e5.Serializer::class)
public class InlineItemPriceXbaa2d9e5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineItemPriceXbaa2d9e5Inspection,
) {
  public val price: PriceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPrice) json.decodeFromJsonElement<PriceView>(raw) else null }

  public val matchedBranches: Set<InlineItemPriceXbaa2d9e5Branch>
    get() = buildSet {
      if (inspection.matchesPrice) add(InlineItemPriceXbaa2d9e5Branch.Price)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineItemPriceXbaa2d9e5 {
      val inspection = inspectInlineItemPriceXbaa2d9e5(raw)
      if (inspection.matchCount == 0) {
        throw InlineItemPriceXbaa2d9e5NoMatchException("InlineItemPriceXbaa2d9e5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineItemPriceXbaa2d9e5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineItemPriceXbaa2d9e5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineItemPriceXbaa2d9e5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineItemPriceXbaa2d9e5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineItemPriceXbaa2d9e5) {
      encoder.requireJsonEncoder("InlineItemPriceXbaa2d9e5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineItemPriceXbaa2d9e5(element: JsonElement): InlineItemPriceXbaa2d9e5Inspection {
  val raw = element as? JsonObject ?: return InlineItemPriceXbaa2d9e5Inspection(
    matchesPrice = false,
    failures = listOf("Price: expected JSON object"),
  )
  val matchesPrice = raw["active"] != null && raw["billing_scheme"] != null && raw["created"] != null && raw["currency"].isString() && raw["id"].isString() && raw["livemode"] != null && raw["metadata"] != null && raw["object"] != null && raw["product"] != null && raw["type"] != null
  return InlineItemPriceXbaa2d9e5Inspection(
    matchesPrice = matchesPrice,
    failures = buildList {
      if (!matchesPrice) add("Price: required properties 'active', 'billing_scheme', 'created', 'currency', 'id', 'livemode', 'metadata', 'object', 'product', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
