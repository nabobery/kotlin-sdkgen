package com.nabobery.sdkgen.github.generated

import kotlin.Long
import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pending-deployment/properties/environment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pending-deployment/properties/environment
 */
@Serializable(with = InlinePendingDeploymentEnvironmentX86f49901.Serializer::class)
public class InlinePendingDeploymentEnvironmentX86f49901(
  public val htmlUrl: String? = null,
  /**
   * The id of the environment.
   */
  public val id: Long? = null,
  /**
   * The name of the environment.
   */
  public val name: String? = null,
  public val nodeId: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var htmlUrl: String? = null

    /**
     * The id of the environment.
     */
    public var id: Long? = null

    /**
     * The name of the environment.
     */
    public var name: String? = null

    public var nodeId: String? = null

    public var url: String? = null

    public fun build(): InlinePendingDeploymentEnvironmentX86f49901 = InlinePendingDeploymentEnvironmentX86f49901(
      htmlUrl = htmlUrl,
      id = id,
      name = name,
      nodeId = nodeId,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePendingDeploymentEnvironmentX86f49901 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePendingDeploymentEnvironmentX86f49901> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePendingDeploymentEnvironmentX86f49901 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePendingDeploymentEnvironmentX86f49901")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePendingDeploymentEnvironmentX86f49901 must be a JSON object")
      return InlinePendingDeploymentEnvironmentX86f49901(
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePendingDeploymentEnvironmentX86f49901) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePendingDeploymentEnvironmentX86f49901")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePendingDeploymentEnvironmentX86f49901(block: InlinePendingDeploymentEnvironmentX86f49901.Builder.() -> Unit): InlinePendingDeploymentEnvironmentX86f49901 = InlinePendingDeploymentEnvironmentX86f49901.build(block)
