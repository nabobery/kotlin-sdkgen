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
 * ded/schema/properties/country_options/properties/lt.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/lt
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtTypeX6347cc28,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtStandardX894917bf? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtTypeX6347cc28? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtTypeX6347cc28
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtStandardX894917bf? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtTypeX6347cc28>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtStandardX894917bf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
