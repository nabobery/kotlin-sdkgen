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
 * ded/schema/properties/country_options/properties/kz.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/kz
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzTypeX33cee197,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzTypeX33cee197? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzTypeX33cee197
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzTypeX33cee197>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
