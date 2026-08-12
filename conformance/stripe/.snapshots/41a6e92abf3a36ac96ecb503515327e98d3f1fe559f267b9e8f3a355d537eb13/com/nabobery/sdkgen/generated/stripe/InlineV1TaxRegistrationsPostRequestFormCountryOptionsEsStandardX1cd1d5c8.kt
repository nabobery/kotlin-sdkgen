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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/es/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/es/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX13752f39,
) {
  public class Builder {
    private var placeOfSupplySchemeValue:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX13752f39? = null

    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX13752f39
      get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
      set(`value`) {
        placeOfSupplySchemeValue = value
      }

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8 {
      check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8 must be a JSON object")
      val placeOfSupplyScheme = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX13752f39>(rawObject, "place_of_supply_scheme")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("place_of_supply_scheme", json.encodeToJsonElement(value.placeOfSupplyScheme))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsStandardX1cd1d5c8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
