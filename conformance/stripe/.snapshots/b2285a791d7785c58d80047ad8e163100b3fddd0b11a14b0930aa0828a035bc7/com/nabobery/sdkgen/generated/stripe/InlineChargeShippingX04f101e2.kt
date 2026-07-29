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

public enum class InlineChargeShippingX04f101e2Branch {
  Shipping,
}

public sealed class InlineChargeShippingX04f101e2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeShippingX04f101e2NoMatchException(
  message: String,
) : InlineChargeShippingX04f101e2DecodingException(message)

internal data class InlineChargeShippingX04f101e2Inspection(
  public val matchesShipping: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesShipping).count { it }
}

/**
 * Shipping information for the charge.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/shipping
 */
@Serializable(with = InlineChargeShippingX04f101e2.Serializer::class)
public class InlineChargeShippingX04f101e2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeShippingX04f101e2Inspection,
) {
  public val shipping: ShippingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShipping) json.decodeFromJsonElement<ShippingView>(raw) else null }

  public val matchedBranches: Set<InlineChargeShippingX04f101e2Branch>
    get() = buildSet {
      if (inspection.matchesShipping) add(InlineChargeShippingX04f101e2Branch.Shipping)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeShippingX04f101e2 {
      val inspection = inspectInlineChargeShippingX04f101e2(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeShippingX04f101e2NoMatchException("InlineChargeShippingX04f101e2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeShippingX04f101e2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineChargeShippingX04f101e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeShippingX04f101e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeShippingX04f101e2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeShippingX04f101e2) {
      encoder.requireJsonEncoder("InlineChargeShippingX04f101e2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeShippingX04f101e2(element: JsonElement): InlineChargeShippingX04f101e2Inspection {
  val raw = element as? JsonObject ?: return InlineChargeShippingX04f101e2Inspection(
    matchesShipping = false,
    failures = listOf("Shipping: expected JSON object"),
  )
  val matchesShipping = true
  return InlineChargeShippingX04f101e2Inspection(
    matchesShipping = matchesShipping,
    failures = buildList {
      if (!matchesShipping) add("Shipping: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
