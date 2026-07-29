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
 * ded/schema/properties/country_options/properties/fr.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/fr
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrTypeX9a4c050c,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrStandardXdb61f93a? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrTypeX9a4c050c? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrTypeX9a4c050c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrStandardXdb61f93a? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrTypeX9a4c050c>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrStandardXdb61f93a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb = InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
