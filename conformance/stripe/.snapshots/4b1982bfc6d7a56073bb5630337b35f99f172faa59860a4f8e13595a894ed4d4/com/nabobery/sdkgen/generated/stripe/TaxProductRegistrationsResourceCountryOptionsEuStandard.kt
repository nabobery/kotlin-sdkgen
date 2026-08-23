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
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_eu_standard
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsEuStandard.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsEuStandard(
  /**
   * Place of supply scheme used in an EU standard registration.
   */
  public val placeOfSupplyScheme: InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46,
) {
  public class Builder {
    private var placeOfSupplySchemeValue:
        InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46? = null

    public var placeOfSupplyScheme: InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46
      get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
      set(`value`) {
        placeOfSupplySchemeValue = value
      }

    public fun build(): TaxProductRegistrationsResourceCountryOptionsEuStandard {
      check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
      return TaxProductRegistrationsResourceCountryOptionsEuStandard(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsEuStandard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsEuStandard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsEuStandard {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsEuStandard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsEuStandard must be a JSON object")
      val placeOfSupplyScheme = json.decodeRequired<InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46>(rawObject, "place_of_supply_scheme")
      return TaxProductRegistrationsResourceCountryOptionsEuStandard(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsEuStandard) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsEuStandard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("place_of_supply_scheme", json.encodeToJsonElement(value.placeOfSupplyScheme))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsEuStandard(block: TaxProductRegistrationsResourceCountryOptionsEuStandard.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsEuStandard = TaxProductRegistrationsResourceCountryOptionsEuStandard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsEuStandard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
