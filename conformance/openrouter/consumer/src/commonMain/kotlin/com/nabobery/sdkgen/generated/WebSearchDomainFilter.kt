package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/WebSearchDomainFilter.
 */
@Serializable(with = WebSearchDomainFilter.Serializer::class)
public class WebSearchDomainFilter(
  public val allowedDomains: List<String>? = null,
  public val excludedDomains: List<String>? = null,
) {
  public class Builder {
    public var allowedDomains: List<String>? = null

    public var excludedDomains: List<String>? = null

    public fun build(): WebSearchDomainFilter = WebSearchDomainFilter(
      allowedDomains = allowedDomains,
      excludedDomains = excludedDomains,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebSearchDomainFilter = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebSearchDomainFilter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebSearchDomainFilter {
      val jsonDecoder = decoder.requireJsonDecoder("WebSearchDomainFilter")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("WebSearchDomainFilter must be a JSON object")
      return WebSearchDomainFilter(
        allowedDomains = raw["allowed_domains"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
        excludedDomains = raw["excluded_domains"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebSearchDomainFilter) {
      val jsonEncoder = encoder.requireJsonEncoder("WebSearchDomainFilter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowedDomains?.let { put("allowed_domains", json.encodeToJsonElement(it)) }
        value.excludedDomains?.let { put("excluded_domains", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webSearchDomainFilter(block: WebSearchDomainFilter.Builder.() -> Unit): WebSearchDomainFilter =
  WebSearchDomainFilter.build(block)
