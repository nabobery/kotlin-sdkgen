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
 * ded/schema/properties/country_options/properties/mt.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/mt
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtTypeX0d90ff7e,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtTypeX0d90ff7e? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtTypeX0d90ff7e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtTypeX0d90ff7e>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtStandardXddb7fcfd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
