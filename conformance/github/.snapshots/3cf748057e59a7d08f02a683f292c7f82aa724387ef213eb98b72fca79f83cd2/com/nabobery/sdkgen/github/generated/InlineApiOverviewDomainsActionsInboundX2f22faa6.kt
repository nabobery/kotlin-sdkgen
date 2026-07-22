package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/api-overview/properties/domains/properties/actions_inbound.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-overview/properties/domains/properties/actions_inbound
 */
@Serializable(with = InlineApiOverviewDomainsActionsInboundX2f22faa6.Serializer::class)
public class InlineApiOverviewDomainsActionsInboundX2f22faa6(
  public val fullDomains: List<String>? = null,
  public val wildcardDomains: List<String>? = null,
) {
  public class Builder {
    public var fullDomains: List<String>? = null

    public var wildcardDomains: List<String>? = null

    public fun build(): InlineApiOverviewDomainsActionsInboundX2f22faa6 = InlineApiOverviewDomainsActionsInboundX2f22faa6(
      fullDomains = fullDomains,
      wildcardDomains = wildcardDomains,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApiOverviewDomainsActionsInboundX2f22faa6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineApiOverviewDomainsActionsInboundX2f22faa6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiOverviewDomainsActionsInboundX2f22faa6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiOverviewDomainsActionsInboundX2f22faa6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApiOverviewDomainsActionsInboundX2f22faa6 must be a JSON object")
      return InlineApiOverviewDomainsActionsInboundX2f22faa6(
        fullDomains = rawObject["full_domains"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        wildcardDomains = rawObject["wildcard_domains"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiOverviewDomainsActionsInboundX2f22faa6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApiOverviewDomainsActionsInboundX2f22faa6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fullDomains?.let { put("full_domains", json.encodeToJsonElement(it)) }
        value.wildcardDomains?.let { put("wildcard_domains", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApiOverviewDomainsActionsInboundX2f22faa6(block: InlineApiOverviewDomainsActionsInboundX2f22faa6.Builder.() -> Unit): InlineApiOverviewDomainsActionsInboundX2f22faa6 = InlineApiOverviewDomainsActionsInboundX2f22faa6.build(block)
