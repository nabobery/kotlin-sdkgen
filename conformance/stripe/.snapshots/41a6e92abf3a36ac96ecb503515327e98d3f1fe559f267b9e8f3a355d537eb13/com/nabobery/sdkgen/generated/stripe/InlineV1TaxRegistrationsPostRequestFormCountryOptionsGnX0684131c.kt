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
 * ded/schema/properties/country_options/properties/gn.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/gn
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnTypeXe48fb33c,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnStandardXe6b0eac2? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnTypeXe48fb33c? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnTypeXe48fb33c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnStandardXe6b0eac2? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnTypeXe48fb33c>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnStandardXe6b0eac2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c = InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
