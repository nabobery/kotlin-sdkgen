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
 * ded/schema/properties/country_options/properties/ca.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ca
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308,
  public val provinceStandard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaProvinceStandardX75e9da51? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var provinceStandard:
        InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaProvinceStandardX75e9da51? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898(
        type = type,
        provinceStandard = provinceStandard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898(
        type = type,
        provinceStandard = rawObject["province_standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaProvinceStandardX75e9da51>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.provinceStandard?.let { put("province_standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
