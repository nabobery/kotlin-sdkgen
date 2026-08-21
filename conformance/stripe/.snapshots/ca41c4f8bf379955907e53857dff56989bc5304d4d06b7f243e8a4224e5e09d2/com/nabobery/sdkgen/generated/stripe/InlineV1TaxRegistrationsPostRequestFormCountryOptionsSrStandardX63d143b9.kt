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
 * ded/schema/properties/country_options/properties/sr/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/sr/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXf09ee915? = null,
) {
  public class Builder {
    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXf09ee915? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9(
      placeOfSupplyScheme = placeOfSupplyScheme,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9 must be a JSON object")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9(
        placeOfSupplyScheme = rawObject["place_of_supply_scheme"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXf09ee915>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.placeOfSupplyScheme?.let { put("place_of_supply_scheme", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrStandardX63d143b9.build(block)
