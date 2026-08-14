package io.github.nabobery.sdkgen.generated.stripe

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
 * ded/schema/properties/country_options/properties/bd/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/bd/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX4f4f47ac? = null,
) {
  public class Builder {
    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX4f4f47ac? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91(
      placeOfSupplyScheme = placeOfSupplyScheme,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91 must be a JSON object")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91(
        placeOfSupplyScheme = rawObject["place_of_supply_scheme"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX4f4f47ac>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.placeOfSupplyScheme?.let { put("place_of_supply_scheme", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91.build(block)
