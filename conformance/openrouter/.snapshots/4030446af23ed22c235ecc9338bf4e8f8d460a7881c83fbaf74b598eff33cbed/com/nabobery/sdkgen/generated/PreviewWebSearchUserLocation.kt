package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/Preview_WebSearchUserLocation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Preview_WebSearchUserLocation
 */
@Serializable(with = PreviewWebSearchUserLocation.Serializer::class)
public class PreviewWebSearchUserLocation(
  public val type: InlinePreviewWebSearchUserLocationTypeXbcca0cb4,
  public val city: String? = null,
  public val country: String? = null,
  public val region: String? = null,
  public val timezone: String? = null,
) {
  public class Builder {
    private var typeValue: InlinePreviewWebSearchUserLocationTypeXbcca0cb4? = null

    public var type: InlinePreviewWebSearchUserLocationTypeXbcca0cb4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var city: String? = null

    public var country: String? = null

    public var region: String? = null

    public var timezone: String? = null

    public fun build(): PreviewWebSearchUserLocation {
      check(typeValue != null) { "type is required" }
      return PreviewWebSearchUserLocation(
        type = type,
        city = city,
        country = country,
        region = region,
        timezone = timezone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PreviewWebSearchUserLocation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PreviewWebSearchUserLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PreviewWebSearchUserLocation {
      val jsonDecoder = decoder.requireJsonDecoder("PreviewWebSearchUserLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PreviewWebSearchUserLocation must be a JSON object")
      val type = json.decodeRequired<InlinePreviewWebSearchUserLocationTypeXbcca0cb4>(rawObject, "type")
      return PreviewWebSearchUserLocation(
        type = type,
        city = rawObject["city"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        region = rawObject["region"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        timezone = rawObject["timezone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PreviewWebSearchUserLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("PreviewWebSearchUserLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.region?.let { put("region", it) }
        value.timezone?.let { put("timezone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun previewWebSearchUserLocation(block: PreviewWebSearchUserLocation.Builder.() -> Unit): PreviewWebSearchUserLocation = PreviewWebSearchUserLocation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PreviewWebSearchUserLocation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
