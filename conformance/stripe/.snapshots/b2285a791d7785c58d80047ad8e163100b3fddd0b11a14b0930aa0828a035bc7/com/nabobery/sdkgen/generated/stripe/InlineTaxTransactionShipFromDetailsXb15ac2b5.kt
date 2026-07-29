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

public enum class InlineTaxTransactionShipFromDetailsXb15ac2b5Branch {
  TaxProductResourceShipFromDetails,
}

public sealed class InlineTaxTransactionShipFromDetailsXb15ac2b5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxTransactionShipFromDetailsXb15ac2b5NoMatchException(
  message: String,
) : InlineTaxTransactionShipFromDetailsXb15ac2b5DecodingException(message)

internal data class InlineTaxTransactionShipFromDetailsXb15ac2b5Inspection(
  public val matchesTaxProductResourceShipFromDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTaxProductResourceShipFromDetails).count { it }
}

/**
 * The details of the ship from location, such as the address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction/properties/ship_from_details
 */
@Serializable(with = InlineTaxTransactionShipFromDetailsXb15ac2b5.Serializer::class)
public class InlineTaxTransactionShipFromDetailsXb15ac2b5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxTransactionShipFromDetailsXb15ac2b5Inspection,
) {
  public val taxProductResourceShipFromDetails: TaxProductResourceShipFromDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxProductResourceShipFromDetails) json.decodeFromJsonElement<TaxProductResourceShipFromDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTaxTransactionShipFromDetailsXb15ac2b5Branch>
    get() = buildSet {
      if (inspection.matchesTaxProductResourceShipFromDetails) add(InlineTaxTransactionShipFromDetailsXb15ac2b5Branch.TaxProductResourceShipFromDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxTransactionShipFromDetailsXb15ac2b5 {
      val inspection = inspectInlineTaxTransactionShipFromDetailsXb15ac2b5(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxTransactionShipFromDetailsXb15ac2b5NoMatchException("InlineTaxTransactionShipFromDetailsXb15ac2b5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxTransactionShipFromDetailsXb15ac2b5(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTaxTransactionShipFromDetailsXb15ac2b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxTransactionShipFromDetailsXb15ac2b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxTransactionShipFromDetailsXb15ac2b5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxTransactionShipFromDetailsXb15ac2b5) {
      encoder.requireJsonEncoder("InlineTaxTransactionShipFromDetailsXb15ac2b5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxTransactionShipFromDetailsXb15ac2b5(element: JsonElement): InlineTaxTransactionShipFromDetailsXb15ac2b5Inspection {
  val raw = element as? JsonObject ?: return InlineTaxTransactionShipFromDetailsXb15ac2b5Inspection(
    matchesTaxProductResourceShipFromDetails = false,
    failures = listOf("TaxProductResourceShipFromDetails: expected JSON object"),
  )
  val matchesTaxProductResourceShipFromDetails = raw["address"] != null
  return InlineTaxTransactionShipFromDetailsXb15ac2b5Inspection(
    matchesTaxProductResourceShipFromDetails = matchesTaxProductResourceShipFromDetails,
    failures = buildList {
      if (!matchesTaxProductResourceShipFromDetails) add("TaxProductResourceShipFromDetails: required properties 'address' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
