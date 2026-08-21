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
 * ded/schema/properties/country_options/properties/ao.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ao
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoTypeX0e983f1f,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoStandardX36e12273? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoTypeX0e983f1f? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoTypeX0e983f1f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoStandardX36e12273? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoTypeX0e983f1f>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoStandardX36e12273>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
