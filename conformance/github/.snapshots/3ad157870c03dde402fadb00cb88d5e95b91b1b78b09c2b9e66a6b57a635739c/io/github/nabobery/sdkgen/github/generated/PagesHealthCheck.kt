package io.github.nabobery.sdkgen.github.generated

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
 * Pages Health Check Status
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pages-health-check
 */
@Serializable(with = PagesHealthCheck.Serializer::class)
public class PagesHealthCheck(
  public val altDomain: InlinePagesHealthCheckAltDomainX15f3886e? = null,
  public val domain: InlinePagesHealthCheckDomainX1a7de513? = null,
) {
  public class Builder {
    public var altDomain: InlinePagesHealthCheckAltDomainX15f3886e? = null

    public var domain: InlinePagesHealthCheckDomainX1a7de513? = null

    public fun build(): PagesHealthCheck = PagesHealthCheck(
      altDomain = altDomain,
      domain = domain,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PagesHealthCheck = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PagesHealthCheck> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PagesHealthCheck {
      val jsonDecoder = decoder.requireJsonDecoder("PagesHealthCheck")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PagesHealthCheck must be a JSON object")
      return PagesHealthCheck(
        altDomain = rawObject["alt_domain"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePagesHealthCheckAltDomainX15f3886e?>(element) },
        domain = rawObject["domain"]?.let { json.decodeFromJsonElement<InlinePagesHealthCheckDomainX1a7de513>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PagesHealthCheck) {
      val jsonEncoder = encoder.requireJsonEncoder("PagesHealthCheck")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.altDomain?.let { put("alt_domain", json.encodeToJsonElement(it)) }
        value.domain?.let { put("domain", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pagesHealthCheck(block: PagesHealthCheck.Builder.() -> Unit): PagesHealthCheck = PagesHealthCheck.build(block)
