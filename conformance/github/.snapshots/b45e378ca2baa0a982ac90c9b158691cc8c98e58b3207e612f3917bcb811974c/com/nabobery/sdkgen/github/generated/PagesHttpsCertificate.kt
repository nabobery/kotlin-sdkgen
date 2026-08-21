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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pages-https-certificate.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pages-https-certificate
 */
@Serializable(with = PagesHttpsCertificate.Serializer::class)
public class PagesHttpsCertificate(
  public val description: String,
  domains: List<String>,
  public val state: InlinePagesHttpsCertificateStateXf46abca2,
  /**
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val expiresAt: String? = null,
) {
  /**
   * Array of the domain set and its alternate name (if it is configured)
   */
  public val domains: List<String> = domains.toList()

  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var domainsValue: List<String>? = null

    public var domains: List<String>
      get() = requireNotNull(domainsValue) { "domains is required" }.toList()
      set(`value`) {
        domainsValue = value.toList()
      }

    private var stateValue: InlinePagesHttpsCertificateStateXf46abca2? = null

    public var state: InlinePagesHttpsCertificateStateXf46abca2
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var expiresAt: String? = null

    public fun build(): PagesHttpsCertificate {
      check(descriptionValue != null) { "description is required" }
      check(domainsValue != null) { "domains is required" }
      check(stateValue != null) { "state is required" }
      return PagesHttpsCertificate(
        description = description,
        domains = domains,
        state = state,
        expiresAt = expiresAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PagesHttpsCertificate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PagesHttpsCertificate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PagesHttpsCertificate {
      val jsonDecoder = decoder.requireJsonDecoder("PagesHttpsCertificate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PagesHttpsCertificate must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val domains = json.decodeRequired<List<String>>(rawObject, "domains")
      val state = json.decodeRequired<InlinePagesHttpsCertificateStateXf46abca2>(rawObject, "state")
      return PagesHttpsCertificate(
        description = description,
        domains = domains,
        state = state,
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PagesHttpsCertificate) {
      val jsonEncoder = encoder.requireJsonEncoder("PagesHttpsCertificate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("domains", json.encodeToJsonElement(value.domains))
        put("state", json.encodeToJsonElement(value.state))
        value.expiresAt?.let { put("expires_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pagesHttpsCertificate(block: PagesHttpsCertificate.Builder.() -> Unit): PagesHttpsCertificate = PagesHttpsCertificate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PagesHttpsCertificate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
