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
 * ded/schema/properties/country_options/properties/ee.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ee
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeTypeX21a36213,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeStandardX29797471? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeTypeX21a36213? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeTypeX21a36213
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeStandardX29797471? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeTypeX21a36213>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeStandardX29797471>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c = InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
