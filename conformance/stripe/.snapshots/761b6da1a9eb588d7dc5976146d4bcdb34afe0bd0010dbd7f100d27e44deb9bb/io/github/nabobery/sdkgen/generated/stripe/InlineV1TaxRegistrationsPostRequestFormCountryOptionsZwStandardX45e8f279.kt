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
 * ded/schema/properties/country_options/properties/zw/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/zw/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d? = null,
) {
  public class Builder {
    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279(
      placeOfSupplyScheme = placeOfSupplyScheme,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279 must be a JSON object")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279(
        placeOfSupplyScheme = rawObject["place_of_supply_scheme"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.placeOfSupplyScheme?.let { put("place_of_supply_scheme", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279.build(block)
