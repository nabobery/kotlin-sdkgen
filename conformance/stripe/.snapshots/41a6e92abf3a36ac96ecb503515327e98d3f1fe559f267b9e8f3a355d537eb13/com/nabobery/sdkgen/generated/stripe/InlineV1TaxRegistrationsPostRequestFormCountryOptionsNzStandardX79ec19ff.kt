package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/nz/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/nz/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXbe4625a6? = null,
) {
  public class Builder {
    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXbe4625a6? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff = InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff(
      placeOfSupplyScheme = placeOfSupplyScheme,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff must be a JSON object")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff(
        placeOfSupplyScheme = rawObject["place_of_supply_scheme"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXbe4625a6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.placeOfSupplyScheme?.let { put("place_of_supply_scheme", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff = InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzStandardX79ec19ff.build(block)
