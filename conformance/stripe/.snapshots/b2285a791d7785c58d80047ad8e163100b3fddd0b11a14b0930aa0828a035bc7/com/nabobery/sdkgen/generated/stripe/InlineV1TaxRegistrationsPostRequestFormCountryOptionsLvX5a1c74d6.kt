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
 * ded/schema/properties/country_options/properties/lv.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/lv
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvTypeX71492625,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvStandardX1534db35? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvTypeX71492625? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvTypeX71492625
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvStandardX1534db35? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvTypeX71492625>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvStandardX1534db35>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
