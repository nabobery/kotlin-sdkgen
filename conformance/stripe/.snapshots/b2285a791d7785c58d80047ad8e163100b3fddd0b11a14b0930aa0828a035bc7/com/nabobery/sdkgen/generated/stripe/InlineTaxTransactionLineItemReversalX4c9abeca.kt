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

public enum class InlineTaxTransactionLineItemReversalX4c9abecaBranch {
  TaxProductResourceTaxTransactionLineItemResourceReversal,
}

public sealed class InlineTaxTransactionLineItemReversalX4c9abecaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxTransactionLineItemReversalX4c9abecaNoMatchException(
  message: String,
) : InlineTaxTransactionLineItemReversalX4c9abecaDecodingException(message)

internal data class InlineTaxTransactionLineItemReversalX4c9abecaInspection(
  public val matchesTaxProductResourceTaxTransactionLineItemResourceReversal: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTaxProductResourceTaxTransactionLineItemResourceReversal).count { it }
}

/**
 * If `type=reversal`, contains information about what was reversed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction_line_item/properties/reversal
 */
@Serializable(with = InlineTaxTransactionLineItemReversalX4c9abeca.Serializer::class)
public class InlineTaxTransactionLineItemReversalX4c9abeca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxTransactionLineItemReversalX4c9abecaInspection,
) {
  public val taxProductResourceTaxTransactionLineItemResourceReversal:
      TaxProductResourceTaxTransactionLineItemResourceReversalView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxProductResourceTaxTransactionLineItemResourceReversal) json.decodeFromJsonElement<TaxProductResourceTaxTransactionLineItemResourceReversalView>(raw) else null }

  public val matchedBranches: Set<InlineTaxTransactionLineItemReversalX4c9abecaBranch>
    get() = buildSet {
      if (inspection.matchesTaxProductResourceTaxTransactionLineItemResourceReversal) add(InlineTaxTransactionLineItemReversalX4c9abecaBranch.TaxProductResourceTaxTransactionLineItemResourceReversal)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxTransactionLineItemReversalX4c9abeca {
      val inspection = inspectInlineTaxTransactionLineItemReversalX4c9abeca(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxTransactionLineItemReversalX4c9abecaNoMatchException("InlineTaxTransactionLineItemReversalX4c9abeca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxTransactionLineItemReversalX4c9abeca(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTaxTransactionLineItemReversalX4c9abeca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxTransactionLineItemReversalX4c9abeca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxTransactionLineItemReversalX4c9abeca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxTransactionLineItemReversalX4c9abeca) {
      encoder.requireJsonEncoder("InlineTaxTransactionLineItemReversalX4c9abeca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxTransactionLineItemReversalX4c9abeca(element: JsonElement): InlineTaxTransactionLineItemReversalX4c9abecaInspection {
  val raw = element as? JsonObject ?: return InlineTaxTransactionLineItemReversalX4c9abecaInspection(
    matchesTaxProductResourceTaxTransactionLineItemResourceReversal = false,
    failures = listOf("TaxProductResourceTaxTransactionLineItemResourceReversal: expected JSON object"),
  )
  val matchesTaxProductResourceTaxTransactionLineItemResourceReversal = raw["original_line_item"].isString()
  return InlineTaxTransactionLineItemReversalX4c9abecaInspection(
    matchesTaxProductResourceTaxTransactionLineItemResourceReversal = matchesTaxProductResourceTaxTransactionLineItemResourceReversal,
    failures = buildList {
      if (!matchesTaxProductResourceTaxTransactionLineItemResourceReversal) add("TaxProductResourceTaxTransactionLineItemResourceReversal: required properties 'original_line_item' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
