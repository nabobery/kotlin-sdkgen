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
 * ded/schema/properties/country_options/properties/sk.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/sk
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkTypeX594c9bde,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkTypeX594c9bde? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkTypeX594c9bde
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkTypeX594c9bde>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
