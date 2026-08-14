package io.github.nabobery.sdkgen.generated.stripe

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
 * ded/schema/properties/country_options/properties/si/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/si/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4,
) {
  public class Builder {
    private var placeOfSupplySchemeValue:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4? = null

    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4
      get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
      set(`value`) {
        placeOfSupplySchemeValue = value
      }

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47 {
      check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47 must be a JSON object")
      val placeOfSupplyScheme = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4>(rawObject, "place_of_supply_scheme")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("place_of_supply_scheme", json.encodeToJsonElement(value.placeOfSupplyScheme))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
