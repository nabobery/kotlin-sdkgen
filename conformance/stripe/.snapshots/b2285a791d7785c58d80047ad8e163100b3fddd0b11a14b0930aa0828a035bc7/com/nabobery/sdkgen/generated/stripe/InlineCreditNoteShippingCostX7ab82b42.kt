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

public enum class InlineCreditNoteShippingCostX7ab82b42Branch {
  InvoicesResourceShippingCost,
}

public sealed class InlineCreditNoteShippingCostX7ab82b42DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCreditNoteShippingCostX7ab82b42NoMatchException(
  message: String,
) : InlineCreditNoteShippingCostX7ab82b42DecodingException(message)

internal data class InlineCreditNoteShippingCostX7ab82b42Inspection(
  public val matchesInvoicesResourceShippingCost: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicesResourceShippingCost).count { it }
}

/**
 * The details of the cost of shipping, including the ShippingRate applied to the invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/shipping_cost
 */
@Serializable(with = InlineCreditNoteShippingCostX7ab82b42.Serializer::class)
public class InlineCreditNoteShippingCostX7ab82b42 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCreditNoteShippingCostX7ab82b42Inspection,
) {
  public val invoicesResourceShippingCost: InvoicesResourceShippingCostView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicesResourceShippingCost) json.decodeFromJsonElement<InvoicesResourceShippingCostView>(raw) else null }

  public val matchedBranches: Set<InlineCreditNoteShippingCostX7ab82b42Branch>
    get() = buildSet {
      if (inspection.matchesInvoicesResourceShippingCost) add(InlineCreditNoteShippingCostX7ab82b42Branch.InvoicesResourceShippingCost)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCreditNoteShippingCostX7ab82b42 {
      val inspection = inspectInlineCreditNoteShippingCostX7ab82b42(raw)
      if (inspection.matchCount == 0) {
        throw InlineCreditNoteShippingCostX7ab82b42NoMatchException("InlineCreditNoteShippingCostX7ab82b42 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCreditNoteShippingCostX7ab82b42(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCreditNoteShippingCostX7ab82b42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreditNoteShippingCostX7ab82b42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreditNoteShippingCostX7ab82b42")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteShippingCostX7ab82b42) {
      encoder.requireJsonEncoder("InlineCreditNoteShippingCostX7ab82b42").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCreditNoteShippingCostX7ab82b42(element: JsonElement): InlineCreditNoteShippingCostX7ab82b42Inspection {
  val raw = element as? JsonObject ?: return InlineCreditNoteShippingCostX7ab82b42Inspection(
    matchesInvoicesResourceShippingCost = false,
    failures = listOf("InvoicesResourceShippingCost: expected JSON object"),
  )
  val matchesInvoicesResourceShippingCost = raw["amount_subtotal"] != null && raw["amount_tax"] != null && raw["amount_total"] != null
  return InlineCreditNoteShippingCostX7ab82b42Inspection(
    matchesInvoicesResourceShippingCost = matchesInvoicesResourceShippingCost,
    failures = buildList {
      if (!matchesInvoicesResourceShippingCost) add("InvoicesResourceShippingCost: required properties 'amount_subtotal', 'amount_tax', 'amount_total' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
