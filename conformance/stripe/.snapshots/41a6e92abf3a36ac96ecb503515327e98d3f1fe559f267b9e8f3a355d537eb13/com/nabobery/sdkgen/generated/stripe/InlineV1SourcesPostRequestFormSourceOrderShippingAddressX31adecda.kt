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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order/properties/shipping/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order/properties/shipping/properties/address
 */
@Serializable(with = InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda.Serializer::class)
public class InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda(
  public val line1: String,
  public val city: String? = null,
  public val country: String? = null,
  public val line2: String? = null,
  public val postalCode: String? = null,
  public val state: String? = null,
) {
  public class Builder {
    private var line1Value: String? = null

    public var line1: String
      get() = requireNotNull(line1Value) { "line1 is required" }
      set(`value`) {
        line1Value = value
      }

    public var city: String? = null

    public var country: String? = null

    public var line2: String? = null

    public var postalCode: String? = null

    public var state: String? = null

    public fun build(): InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda {
      check(line1Value != null) { "line1 is required" }
      return InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda(
        line1 = line1,
        city = city,
        country = country,
        line2 = line2,
        postalCode = postalCode,
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda must be a JSON object")
      val line1 = json.decodeRequired<String>(rawObject, "line1")
      return InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda(
        line1 = line1,
        city = rawObject["city"]?.let { json.decodeFromJsonElement<String>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<String>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("line1", value.line1)
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.line2?.let { put("line2", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda(block: InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda.Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda = InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SourcesPostRequestFormSourceOrderShippingAddressX31adecda is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
