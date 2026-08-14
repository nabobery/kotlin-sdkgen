package io.github.nabobery.sdkgen.generated.stripe

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
 * ded/schema/properties/country_options/properties/uy.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/uy
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyTypeX8d98ecbc,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyStandardXa69299a5? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyTypeX8d98ecbc? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyTypeX8d98ecbc
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyStandardXa69299a5? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyTypeX8d98ecbc>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyStandardXa69299a5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
