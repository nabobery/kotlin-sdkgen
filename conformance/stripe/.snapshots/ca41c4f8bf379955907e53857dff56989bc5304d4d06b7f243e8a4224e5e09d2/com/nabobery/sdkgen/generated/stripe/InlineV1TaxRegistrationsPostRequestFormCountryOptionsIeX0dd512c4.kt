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
 * ded/schema/properties/country_options/properties/ie.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ie
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeTypeX5e5c73fc,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeStandardX30b3f6fa? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeTypeX5e5c73fc? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeTypeX5e5c73fc
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeStandardX30b3f6fa? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeTypeX5e5c73fc>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeStandardX30b3f6fa>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
