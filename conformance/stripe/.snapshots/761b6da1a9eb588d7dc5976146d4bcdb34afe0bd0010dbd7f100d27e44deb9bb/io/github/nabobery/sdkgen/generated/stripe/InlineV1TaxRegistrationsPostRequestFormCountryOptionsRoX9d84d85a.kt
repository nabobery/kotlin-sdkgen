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
 * ded/schema/properties/country_options/properties/ro.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ro
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoTypeX2228b35e,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoStandardXdcb599a5? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoTypeX2228b35e? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoTypeX2228b35e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoStandardXdcb599a5? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoTypeX2228b35e>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoStandardXdcb599a5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a = InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
