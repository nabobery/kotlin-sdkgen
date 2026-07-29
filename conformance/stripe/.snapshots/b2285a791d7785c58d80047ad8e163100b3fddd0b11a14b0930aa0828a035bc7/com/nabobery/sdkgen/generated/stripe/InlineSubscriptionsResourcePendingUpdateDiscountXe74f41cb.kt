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

public enum class InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbBranch {
  Discount,
}

public sealed class InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbNoMatchException(
  message: String,
) : InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbDecodingException(message)

internal data class InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbInspection(
  public val matchesDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesDiscount).count { it }
}

/**
 * The pending subscription-level discount that will be applied when the pending update is applied.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_pending_update/properties/discount
 */
@Serializable(with = InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb.Serializer::class)
public class InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbInspection,
) {
  public val discount: DiscountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<DiscountView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbBranch>
    get() = buildSet {
      if (inspection.matchesDiscount) add(InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbBranch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb {
      val inspection = inspectInlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbNoMatchException("InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb(element: JsonElement): InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbInspection(
    matchesDiscount = false,
    failures = listOf("Discount: expected JSON object"),
  )
  val matchesDiscount = raw["id"].isString() && raw["object"] != null && raw["source"] != null && raw["start"] != null
  return InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cbInspection(
    matchesDiscount = matchesDiscount,
    failures = buildList {
      if (!matchesDiscount) add("Discount: required properties 'id', 'object', 'source', 'start' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
