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
 * ded/schema/properties/country_options/properties/za/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/za/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX791147ae? = null,
) {
  public class Builder {
    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX791147ae? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b = InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b(
      placeOfSupplyScheme = placeOfSupplyScheme,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b must be a JSON object")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b(
        placeOfSupplyScheme = rawObject["place_of_supply_scheme"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX791147ae>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.placeOfSupplyScheme?.let { put("place_of_supply_scheme", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b = InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaStandardXcf466a7b.build(block)
