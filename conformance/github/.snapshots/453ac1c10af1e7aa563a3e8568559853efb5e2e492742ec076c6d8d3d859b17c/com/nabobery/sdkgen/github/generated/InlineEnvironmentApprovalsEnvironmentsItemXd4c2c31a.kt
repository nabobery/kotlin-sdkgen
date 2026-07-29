package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/environment-approvals/properties/environments/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/environment-approvals/properties/environments/items
 */
@Serializable(with = InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a.Serializer::class)
public class InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a(
  /**
   * The time that the environment was created, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  public val htmlUrl: String? = null,
  /**
   * The id of the environment.
   */
  public val id: Int? = null,
  /**
   * The name of the environment.
   */
  public val name: String? = null,
  public val nodeId: String? = null,
  /**
   * The time that the environment was last updated, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    /**
     * The time that the environment was created, in ISO 8601 format.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    public var htmlUrl: String? = null

    /**
     * The id of the environment.
     */
    public var id: Int? = null

    /**
     * The name of the environment.
     */
    public var name: String? = null

    public var nodeId: String? = null

    /**
     * The time that the environment was last updated, in ISO 8601 format.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public var url: String? = null

    public fun build(): InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a = InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a(
      createdAt = createdAt,
      htmlUrl = htmlUrl,
      id = id,
      name = name,
      nodeId = nodeId,
      updatedAt = updatedAt,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a must be a JSON object")
      return InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a(
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.createdAt?.let { put("created_at", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a(block: InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a.Builder.() -> Unit): InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a = InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a.build(block)
