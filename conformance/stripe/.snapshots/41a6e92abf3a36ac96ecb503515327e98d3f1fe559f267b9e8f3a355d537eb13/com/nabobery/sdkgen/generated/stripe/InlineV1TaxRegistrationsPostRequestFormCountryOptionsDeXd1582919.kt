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
 * ded/schema/properties/country_options/properties/de.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/de
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeTypeXa448142c,
  public val standard:
      InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeStandardX05d16b52? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeTypeXa448142c? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeTypeXa448142c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeStandardX05d16b52? =
        null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeTypeXa448142c>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeStandardX05d16b52>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
