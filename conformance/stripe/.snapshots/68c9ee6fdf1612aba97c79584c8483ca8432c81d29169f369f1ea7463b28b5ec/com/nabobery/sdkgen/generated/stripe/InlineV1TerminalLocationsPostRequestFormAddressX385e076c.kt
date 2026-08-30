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
import kotlinx.serialization.json.put

/**
 * The full address of the location.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/address
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormAddressX385e076c.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormAddressX385e076c(
  public val country: String,
  public val city: String? = null,
  public val line1: String? = null,
  public val line2: String? = null,
  public val postalCode: String? = null,
  public val state: String? = null,
) {
  public class Builder {
    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public var city: String? = null

    public var line1: String? = null

    public var line2: String? = null

    public var postalCode: String? = null

    public var state: String? = null

    public fun build(): InlineV1TerminalLocationsPostRequestFormAddressX385e076c {
      check(countryValue != null) { "country is required" }
      return InlineV1TerminalLocationsPostRequestFormAddressX385e076c(
        country = country,
        city = city,
        line1 = line1,
        line2 = line2,
        postalCode = postalCode,
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalLocationsPostRequestFormAddressX385e076c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormAddressX385e076c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormAddressX385e076c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostRequestFormAddressX385e076c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalLocationsPostRequestFormAddressX385e076c must be a JSON object")
      val country = json.decodeRequired<String>(rawObject, "country")
      return InlineV1TerminalLocationsPostRequestFormAddressX385e076c(
        country = country,
        city = rawObject["city"]?.let { json.decodeFromJsonElement<String>(it) },
        line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<String>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<String>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalLocationsPostRequestFormAddressX385e076c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalLocationsPostRequestFormAddressX385e076c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", value.country)
        value.city?.let { put("city", it) }
        value.line1?.let { put("line1", it) }
        value.line2?.let { put("line2", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalLocationsPostRequestFormAddressX385e076c(block: InlineV1TerminalLocationsPostRequestFormAddressX385e076c.Builder.() -> Unit): InlineV1TerminalLocationsPostRequestFormAddressX385e076c = InlineV1TerminalLocationsPostRequestFormAddressX385e076c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalLocationsPostRequestFormAddressX385e076c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
