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
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_default_standard
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsDefaultStandard.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsDefaultStandard(
  /**
   * Place of supply scheme used in an Default standard registration.
   */
  public val placeOfSupplyScheme: InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0,
) {
  public class Builder {
    private var placeOfSupplySchemeValue:
        InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0? = null

    public var placeOfSupplyScheme: InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0
      get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
      set(`value`) {
        placeOfSupplySchemeValue = value
      }

    public fun build(): TaxProductRegistrationsResourceCountryOptionsDefaultStandard {
      check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
      return TaxProductRegistrationsResourceCountryOptionsDefaultStandard(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsDefaultStandard = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsDefaultStandard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsDefaultStandard {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsDefaultStandard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsDefaultStandard must be a JSON object")
      val placeOfSupplyScheme = json.decodeRequired<InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0>(rawObject, "place_of_supply_scheme")
      return TaxProductRegistrationsResourceCountryOptionsDefaultStandard(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsDefaultStandard) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsDefaultStandard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("place_of_supply_scheme", json.encodeToJsonElement(value.placeOfSupplyScheme))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsDefaultStandard(block: TaxProductRegistrationsResourceCountryOptionsDefaultStandard.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsDefaultStandard = TaxProductRegistrationsResourceCountryOptionsDefaultStandard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsDefaultStandard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
