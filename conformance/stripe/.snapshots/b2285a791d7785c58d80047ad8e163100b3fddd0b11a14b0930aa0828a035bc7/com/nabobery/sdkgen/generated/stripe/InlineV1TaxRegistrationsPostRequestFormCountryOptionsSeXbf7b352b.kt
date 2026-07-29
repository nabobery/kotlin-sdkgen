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
 * ded/schema/properties/country_options/properties/se.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/se
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeTypeX200f7f48,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeStandardXea71cd0e? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeTypeX200f7f48? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeTypeX200f7f48
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeStandardXea71cd0e? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeTypeX200f7f48>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeStandardXea71cd0e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
