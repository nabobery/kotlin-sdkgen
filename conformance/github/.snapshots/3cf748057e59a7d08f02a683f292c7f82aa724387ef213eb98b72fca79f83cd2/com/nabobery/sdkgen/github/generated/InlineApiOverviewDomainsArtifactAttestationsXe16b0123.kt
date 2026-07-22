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
 * sdkgen://source/openapi.yaml#/components/schemas/api-overview/properties/domains/properties/artifact_attestations.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/api-overview/properties/domains/properties/artifact_attestations
 */
@Serializable(with = InlineApiOverviewDomainsArtifactAttestationsXe16b0123.Serializer::class)
public class InlineApiOverviewDomainsArtifactAttestationsXe16b0123(
  public val services: List<String>? = null,
  public val trustDomain: String? = null,
) {
  public class Builder {
    public var services: List<String>? = null

    public var trustDomain: String? = null

    public fun build(): InlineApiOverviewDomainsArtifactAttestationsXe16b0123 = InlineApiOverviewDomainsArtifactAttestationsXe16b0123(
      services = services,
      trustDomain = trustDomain,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApiOverviewDomainsArtifactAttestationsXe16b0123 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineApiOverviewDomainsArtifactAttestationsXe16b0123> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiOverviewDomainsArtifactAttestationsXe16b0123 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiOverviewDomainsArtifactAttestationsXe16b0123")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApiOverviewDomainsArtifactAttestationsXe16b0123 must be a JSON object")
      return InlineApiOverviewDomainsArtifactAttestationsXe16b0123(
        services = rawObject["services"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        trustDomain = rawObject["trust_domain"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiOverviewDomainsArtifactAttestationsXe16b0123) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApiOverviewDomainsArtifactAttestationsXe16b0123")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.services?.let { put("services", json.encodeToJsonElement(it)) }
        value.trustDomain?.let { put("trust_domain", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApiOverviewDomainsArtifactAttestationsXe16b0123(block: InlineApiOverviewDomainsArtifactAttestationsXe16b0123.Builder.() -> Unit): InlineApiOverviewDomainsArtifactAttestationsXe16b0123 = InlineApiOverviewDomainsArtifactAttestationsXe16b0123.build(block)
