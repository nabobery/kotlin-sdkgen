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
 * ded/schema/properties/country_options/properties/aw.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/aw
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwTypeX0a8a6fe7,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwStandardXb9e61122? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwTypeX0a8a6fe7? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwTypeX0a8a6fe7
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwStandardXb9e61122? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwTypeX0a8a6fe7>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwStandardXb9e61122>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
