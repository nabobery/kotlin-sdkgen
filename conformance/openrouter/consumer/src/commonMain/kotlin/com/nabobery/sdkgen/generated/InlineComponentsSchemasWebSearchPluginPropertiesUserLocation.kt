package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/WebSearchPlugin/properties/user_location.
 */
@Serializable(with = InlineComponentsSchemasWebSearchPluginPropertiesUserLocation.Serializer::class)
public class InlineComponentsSchemasWebSearchPluginPropertiesUserLocation(
  public val city: String? = null,
  public val country: String? = null,
  public val region: String? = null,
  public val timezone: String? = null,
  public val type: InlineComponentsSchemasWebSearchUserLocationPropertiesType? = null,
) {
  public class Builder {
    public var city: String? = null

    public var country: String? = null

    public var region: String? = null

    public var timezone: String? = null

    public var type: InlineComponentsSchemasWebSearchUserLocationPropertiesType? = null

    public fun build(): InlineComponentsSchemasWebSearchPluginPropertiesUserLocation =
      InlineComponentsSchemasWebSearchPluginPropertiesUserLocation(
      city = city,
      country = country,
      region = region,
      timezone = timezone,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasWebSearchPluginPropertiesUserLocation =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebSearchPluginPropertiesUserLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebSearchPluginPropertiesUserLocation {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasWebSearchPluginPropertiesUserLocation")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasWebSearchPluginPropertiesUserLocation must be a JSON " +
          "object")
      return InlineComponentsSchemasWebSearchPluginPropertiesUserLocation(
        city = raw["city"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        country = raw["country"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        region = raw["region"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        timezone = raw["timezone"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        type = raw["type"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasWebSearchUserLocationPropertiesType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWebSearchPluginPropertiesUserLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasWebSearchPluginPropertiesUserLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.region?.let { put("region", it) }
        value.timezone?.let { put("timezone", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasWebSearchPluginPropertiesUserLocation(block: InlineComponentsSchemasWebSearchPluginPropertiesUserLocation.Builder.() -> Unit): InlineComponentsSchemasWebSearchPluginPropertiesUserLocation = InlineComponentsSchemasWebSearchPluginPropertiesUserLocation.build(block)
