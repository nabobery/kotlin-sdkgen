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

public enum class InlineCustomerDiscountXa4928a5bBranch {
  Discount,
}

public sealed class InlineCustomerDiscountXa4928a5bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerDiscountXa4928a5bNoMatchException(
  message: String,
) : InlineCustomerDiscountXa4928a5bDecodingException(message)

internal data class InlineCustomerDiscountXa4928a5bInspection(
  public val matchesDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesDiscount).count { it }
}

/**
 * Describes the current discount active on the customer, if there is one.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/discount
 */
@Serializable(with = InlineCustomerDiscountXa4928a5b.Serializer::class)
public class InlineCustomerDiscountXa4928a5b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerDiscountXa4928a5bInspection,
) {
  public val discount: DiscountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<DiscountView>(raw) else null }

  public val matchedBranches: Set<InlineCustomerDiscountXa4928a5bBranch>
    get() = buildSet {
      if (inspection.matchesDiscount) add(InlineCustomerDiscountXa4928a5bBranch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerDiscountXa4928a5b {
      val inspection = inspectInlineCustomerDiscountXa4928a5b(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerDiscountXa4928a5bNoMatchException("InlineCustomerDiscountXa4928a5b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerDiscountXa4928a5b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerDiscountXa4928a5b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerDiscountXa4928a5b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerDiscountXa4928a5b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerDiscountXa4928a5b) {
      encoder.requireJsonEncoder("InlineCustomerDiscountXa4928a5b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerDiscountXa4928a5b(element: JsonElement): InlineCustomerDiscountXa4928a5bInspection {
  val raw = element as? JsonObject ?: return InlineCustomerDiscountXa4928a5bInspection(
    matchesDiscount = false,
    failures = listOf("Discount: expected JSON object"),
  )
  val matchesDiscount = raw["id"].isString() && raw["object"] != null && raw["source"] != null && raw["start"] != null
  return InlineCustomerDiscountXa4928a5bInspection(
    matchesDiscount = matchesDiscount,
    failures = buildList {
      if (!matchesDiscount) add("Discount: required properties 'id', 'object', 'source', 'start' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
