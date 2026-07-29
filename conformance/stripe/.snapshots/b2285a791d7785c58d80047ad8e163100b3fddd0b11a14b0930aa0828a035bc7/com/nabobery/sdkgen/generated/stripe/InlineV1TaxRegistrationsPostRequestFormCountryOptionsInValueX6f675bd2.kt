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
 * ded/schema/properties/country_options/properties/in.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/in
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueTypeXbd5adbc2,
) {
  public class Builder {
    private var typeValue:
        InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueTypeXbd5adbc2? = null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueTypeXbd5adbc2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueTypeXbd5adbc2>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
