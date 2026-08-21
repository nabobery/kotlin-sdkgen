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
 * ded/schema/properties/country_options/properties/gb.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/gb
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbTypeX18587f82,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbStandardX3afdd568? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbTypeX18587f82? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbTypeX18587f82
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbStandardX3afdd568? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbTypeX18587f82>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbStandardX3afdd568>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd = InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
