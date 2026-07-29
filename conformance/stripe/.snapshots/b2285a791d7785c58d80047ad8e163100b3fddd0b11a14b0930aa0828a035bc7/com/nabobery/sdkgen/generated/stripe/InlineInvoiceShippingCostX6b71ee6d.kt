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

public enum class InlineInvoiceShippingCostX6b71ee6dBranch {
  InvoicesResourceShippingCost,
}

public sealed class InlineInvoiceShippingCostX6b71ee6dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceShippingCostX6b71ee6dNoMatchException(
  message: String,
) : InlineInvoiceShippingCostX6b71ee6dDecodingException(message)

internal data class InlineInvoiceShippingCostX6b71ee6dInspection(
  public val matchesInvoicesResourceShippingCost: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicesResourceShippingCost).count { it }
}

/**
 * The details of the cost of shipping, including the ShippingRate applied on the invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/shipping_cost
 */
@Serializable(with = InlineInvoiceShippingCostX6b71ee6d.Serializer::class)
public class InlineInvoiceShippingCostX6b71ee6d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceShippingCostX6b71ee6dInspection,
) {
  public val invoicesResourceShippingCost: InvoicesResourceShippingCostView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicesResourceShippingCost) json.decodeFromJsonElement<InvoicesResourceShippingCostView>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceShippingCostX6b71ee6dBranch>
    get() = buildSet {
      if (inspection.matchesInvoicesResourceShippingCost) add(InlineInvoiceShippingCostX6b71ee6dBranch.InvoicesResourceShippingCost)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceShippingCostX6b71ee6d {
      val inspection = inspectInlineInvoiceShippingCostX6b71ee6d(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceShippingCostX6b71ee6dNoMatchException("InlineInvoiceShippingCostX6b71ee6d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceShippingCostX6b71ee6d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceShippingCostX6b71ee6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceShippingCostX6b71ee6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceShippingCostX6b71ee6d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceShippingCostX6b71ee6d) {
      encoder.requireJsonEncoder("InlineInvoiceShippingCostX6b71ee6d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceShippingCostX6b71ee6d(element: JsonElement): InlineInvoiceShippingCostX6b71ee6dInspection {
  val raw = element as? JsonObject ?: return InlineInvoiceShippingCostX6b71ee6dInspection(
    matchesInvoicesResourceShippingCost = false,
    failures = listOf("InvoicesResourceShippingCost: expected JSON object"),
  )
  val matchesInvoicesResourceShippingCost = raw["amount_subtotal"] != null && raw["amount_tax"] != null && raw["amount_total"] != null
  return InlineInvoiceShippingCostX6b71ee6dInspection(
    matchesInvoicesResourceShippingCost = matchesInvoicesResourceShippingCost,
    failures = buildList {
      if (!matchesInvoicesResourceShippingCost) add("InvoicesResourceShippingCost: required properties 'amount_subtotal', 'amount_tax', 'amount_total' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
