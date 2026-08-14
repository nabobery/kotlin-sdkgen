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

public enum class InlineTaxCalculationShipFromDetailsX621a3c3eBranch {
  TaxProductResourceShipFromDetails,
}

public sealed class InlineTaxCalculationShipFromDetailsX621a3c3eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxCalculationShipFromDetailsX621a3c3eNoMatchException(
  message: String,
) : InlineTaxCalculationShipFromDetailsX621a3c3eDecodingException(message)

internal data class InlineTaxCalculationShipFromDetailsX621a3c3eInspection(
  public val matchesTaxProductResourceShipFromDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTaxProductResourceShipFromDetails).count { it }
}

/**
 * The details of the ship from location, such as the address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation/properties/ship_from_details
 */
@Serializable(with = InlineTaxCalculationShipFromDetailsX621a3c3e.Serializer::class)
public class InlineTaxCalculationShipFromDetailsX621a3c3e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxCalculationShipFromDetailsX621a3c3eInspection,
) {
  public val taxProductResourceShipFromDetails: TaxProductResourceShipFromDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxProductResourceShipFromDetails) json.decodeFromJsonElement<TaxProductResourceShipFromDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTaxCalculationShipFromDetailsX621a3c3eBranch>
    get() = buildSet {
      if (inspection.matchesTaxProductResourceShipFromDetails) add(InlineTaxCalculationShipFromDetailsX621a3c3eBranch.TaxProductResourceShipFromDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxCalculationShipFromDetailsX621a3c3e {
      val inspection = inspectInlineTaxCalculationShipFromDetailsX621a3c3e(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxCalculationShipFromDetailsX621a3c3eNoMatchException("InlineTaxCalculationShipFromDetailsX621a3c3e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxCalculationShipFromDetailsX621a3c3e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTaxCalculationShipFromDetailsX621a3c3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxCalculationShipFromDetailsX621a3c3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxCalculationShipFromDetailsX621a3c3e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxCalculationShipFromDetailsX621a3c3e) {
      encoder.requireJsonEncoder("InlineTaxCalculationShipFromDetailsX621a3c3e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxCalculationShipFromDetailsX621a3c3e(element: JsonElement): InlineTaxCalculationShipFromDetailsX621a3c3eInspection {
  val raw = element as? JsonObject ?: return InlineTaxCalculationShipFromDetailsX621a3c3eInspection(
    matchesTaxProductResourceShipFromDetails = false,
    failures = listOf("TaxProductResourceShipFromDetails: expected JSON object"),
  )
  val matchesTaxProductResourceShipFromDetails = raw["address"] != null
  return InlineTaxCalculationShipFromDetailsX621a3c3eInspection(
    matchesTaxProductResourceShipFromDetails = matchesTaxProductResourceShipFromDetails,
    failures = buildList {
      if (!matchesTaxProductResourceShipFromDetails) add("TaxProductResourceShipFromDetails: required properties 'address' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
