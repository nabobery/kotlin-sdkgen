package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
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
 * x_election
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection(
  /**
   * The type of the election for the state sales tax registration.
   */
  public val type: InlineTaxProductRegistratib2b8TypeX2ae784d1,
  /**
   * A [FIPS code](https://www.census.gov/library/reference/code-lists/ansi.html) representing the local jurisdiction.
   */
  public val jurisdiction: String? = null,
) {
  public class Builder {
    private var typeValue: InlineTaxProductRegistratib2b8TypeX2ae784d1? = null

    public var type: InlineTaxProductRegistratib2b8TypeX2ae784d1
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * A [FIPS code](https://www.census.gov/library/reference/code-lists/ansi.html) representing the local jurisdiction.
     */
    public var jurisdiction: String? = null

    public fun build(): TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection {
      check(typeValue != null) { "type is required" }
      return TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection(
        type = type,
        jurisdiction = jurisdiction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection must be a JSON object")
      val type = json.decodeRequired<InlineTaxProductRegistratib2b8TypeX2ae784d1>(rawObject, "type")
      return TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection(
        type = type,
        jurisdiction = rawObject["jurisdiction"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.jurisdiction?.let { put("jurisdiction", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection(block: TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection = TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsUsStateSalesTaxElection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
