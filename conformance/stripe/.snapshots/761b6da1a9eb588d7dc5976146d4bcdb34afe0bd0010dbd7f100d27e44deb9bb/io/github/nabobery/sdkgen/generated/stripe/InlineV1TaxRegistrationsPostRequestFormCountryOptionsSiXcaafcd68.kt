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
 * ded/schema/properties/country_options/properties/si.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/si
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiTypeXaf5d0c47,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiTypeXaf5d0c47? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiTypeXaf5d0c47
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiTypeXaf5d0c47>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiStandardXdcfeed47>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
