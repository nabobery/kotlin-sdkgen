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
 * ded/schema/properties/country_options/properties/zw.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/zw
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwTypeXf3fe206e,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwTypeXf3fe206e? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwTypeXf3fe206e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwTypeXf3fe206e>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwStandardX45e8f279>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
