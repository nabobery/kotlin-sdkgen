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
 * ded/schema/properties/country_options/properties/cz.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/cz
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
