package io.github.nabobery.sdkgen.generated

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
 * Approximate user location for location-biased results.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchUserLocationServerTool
 */
@Serializable(with = WebSearchUserLocationServerTool.Serializer::class)
public class WebSearchUserLocationServerTool(
  public val city: String? = null,
  public val country: String? = null,
  public val region: String? = null,
  public val timezone: String? = null,
  public val type: InlineWebSearchUserLocationServerToolTypeX157cfed4? = null,
) {
  public class Builder {
    public var city: String? = null

    public var country: String? = null

    public var region: String? = null

    public var timezone: String? = null

    public var type: InlineWebSearchUserLocationServerToolTypeX157cfed4? = null

    public fun build(): WebSearchUserLocationServerTool = WebSearchUserLocationServerTool(
      city = city,
      country = country,
      region = region,
      timezone = timezone,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebSearchUserLocationServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebSearchUserLocationServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebSearchUserLocationServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("WebSearchUserLocationServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebSearchUserLocationServerTool must be a JSON object")
      return WebSearchUserLocationServerTool(
        city = rawObject["city"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        region = rawObject["region"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        timezone = rawObject["timezone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineWebSearchUserLocationServerToolTypeX157cfed4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebSearchUserLocationServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("WebSearchUserLocationServerTool")
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

public fun webSearchUserLocationServerTool(block: WebSearchUserLocationServerTool.Builder.() -> Unit): WebSearchUserLocationServerTool = WebSearchUserLocationServerTool.build(block)
