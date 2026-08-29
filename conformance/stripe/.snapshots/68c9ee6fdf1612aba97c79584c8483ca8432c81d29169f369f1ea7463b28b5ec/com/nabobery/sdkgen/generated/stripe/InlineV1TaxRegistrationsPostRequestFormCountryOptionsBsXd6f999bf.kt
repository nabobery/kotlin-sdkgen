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
 * ded/schema/properties/country_options/properties/bs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/bs
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsTypeXdc4cb083,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsStandardXc2f7468d? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsTypeXdc4cb083? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsTypeXdc4cb083
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsStandardXc2f7468d? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsTypeXdc4cb083>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsStandardXc2f7468d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
