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
 * ded/schema/properties/country_options/properties/hu/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/hu/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXc0367011,
) {
  public class Builder {
    private var placeOfSupplySchemeValue:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXc0367011? = null

    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXc0367011
      get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
      set(`value`) {
        placeOfSupplySchemeValue = value
      }

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd {
      check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd must be a JSON object")
      val placeOfSupplyScheme = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXc0367011>(rawObject, "place_of_supply_scheme")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("place_of_supply_scheme", json.encodeToJsonElement(value.placeOfSupplyScheme))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd = InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuStandardXb4c8afdd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
