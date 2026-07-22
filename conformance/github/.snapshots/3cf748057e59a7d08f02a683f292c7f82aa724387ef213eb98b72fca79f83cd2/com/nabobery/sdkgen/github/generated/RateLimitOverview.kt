package com.nabobery.sdkgen.github.generated

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
 * Rate Limit Overview
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rate-limit-overview
 */
@Serializable(with = RateLimitOverview.Serializer::class)
public class RateLimitOverview(
  public val rate: RateLimit,
  public val resources: InlineRateLimitOverviewResourcesX18981ee7,
) {
  public class Builder {
    private var rateValue: RateLimit? = null

    public var rate: RateLimit
      get() = requireNotNull(rateValue) { "rate is required" }
      set(`value`) {
        rateValue = value
      }

    private var resourcesValue: InlineRateLimitOverviewResourcesX18981ee7? = null

    public var resources: InlineRateLimitOverviewResourcesX18981ee7
      get() = requireNotNull(resourcesValue) { "resources is required" }
      set(`value`) {
        resourcesValue = value
      }

    public fun build(): RateLimitOverview {
      check(rateValue != null) { "rate is required" }
      check(resourcesValue != null) { "resources is required" }
      return RateLimitOverview(
        rate = rate,
        resources = resources,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RateLimitOverview = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RateLimitOverview> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RateLimitOverview {
      val jsonDecoder = decoder.requireJsonDecoder("RateLimitOverview")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RateLimitOverview must be a JSON object")
      val rate = json.decodeRequired<RateLimit>(rawObject, "rate")
      val resources = json.decodeRequired<InlineRateLimitOverviewResourcesX18981ee7>(rawObject, "resources")
      return RateLimitOverview(
        rate = rate,
        resources = resources,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RateLimitOverview) {
      val jsonEncoder = encoder.requireJsonEncoder("RateLimitOverview")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("rate", json.encodeToJsonElement(value.rate))
        put("resources", json.encodeToJsonElement(value.resources))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rateLimitOverview(block: RateLimitOverview.Builder.() -> Unit): RateLimitOverview = RateLimitOverview.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RateLimitOverview is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
