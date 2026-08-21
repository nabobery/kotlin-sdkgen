package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_us_state_sales_ta
 * x
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax(
  elections: List<TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection>? = null,
) {
  /**
   * Elections for the state sales tax registration.
   */
  public val elections: List<TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection>?
      = elections?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var electionsValue:
        List<TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection>? = null

    /**
     * Elections for the state sales tax registration.
     */
    public var elections:
        List<TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection>?
      get() = electionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        electionsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax = TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax(
      elections = elections,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax must be a JSON object")
      return TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax(
        elections = rawObject["elections"]?.let { json.decodeFromJsonElement<List<TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.elections?.let { put("elections", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsUsStateSalesTax(block: TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax = TaxProductRegistrationsResourceCountryOptionsUsStateSalesTax.build(block)
