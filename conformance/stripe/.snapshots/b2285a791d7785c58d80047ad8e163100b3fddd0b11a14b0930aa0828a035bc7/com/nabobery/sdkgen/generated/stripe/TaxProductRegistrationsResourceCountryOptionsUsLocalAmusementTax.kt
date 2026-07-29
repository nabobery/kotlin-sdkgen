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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_us_local_amusemen
 * t_tax
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax(
  /**
   * A [FIPS code](https://www.census.gov/library/reference/code-lists/ansi.html) representing the local jurisdiction.
   */
  public val jurisdiction: String,
) {
  public class Builder {
    private var jurisdictionValue: String? = null

    public var jurisdiction: String
      get() = requireNotNull(jurisdictionValue) { "jurisdiction is required" }
      set(`value`) {
        jurisdictionValue = value
      }

    public fun build(): TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax {
      check(jurisdictionValue != null) { "jurisdiction is required" }
      return TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax(
        jurisdiction = jurisdiction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax must be a JSON object")
      val jurisdiction = json.decodeRequired<String>(rawObject, "jurisdiction")
      return TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax(
        jurisdiction = jurisdiction,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("jurisdiction", value.jurisdiction)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax(block: TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax = TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsUsLocalAmusementTax is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
