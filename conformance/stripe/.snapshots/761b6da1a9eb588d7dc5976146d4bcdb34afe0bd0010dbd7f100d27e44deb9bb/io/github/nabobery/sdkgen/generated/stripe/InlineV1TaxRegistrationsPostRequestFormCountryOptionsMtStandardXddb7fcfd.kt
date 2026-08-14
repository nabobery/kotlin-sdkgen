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
 * ded/schema/properties/country_options/properties/mt/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/mt/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd(
  public val placeOfSupplyScheme:
      InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX57436546,
) {
  public class Builder {
    private var placeOfSupplySchemeValue:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX57436546? = null

    public var placeOfSupplyScheme:
        InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX57436546
      get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
      set(`value`) {
        placeOfSupplySchemeValue = value
      }

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd {
      check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd must be a JSON object")
      val placeOfSupplyScheme = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX57436546>(rawObject, "place_of_supply_scheme")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd(
        placeOfSupplyScheme = placeOfSupplyScheme,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("place_of_supply_scheme", json.encodeToJsonElement(value.placeOfSupplyScheme))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
