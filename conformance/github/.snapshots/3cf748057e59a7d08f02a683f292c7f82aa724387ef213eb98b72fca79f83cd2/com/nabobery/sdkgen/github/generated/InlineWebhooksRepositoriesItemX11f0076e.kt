package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_repositories/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_repositories/items
 */
@Serializable(with = InlineWebhooksRepositoriesItemX11f0076e.Serializer::class)
public class InlineWebhooksRepositoriesItemX11f0076e(
  public val fullName: String,
  /**
   * Unique identifier of the repository
   */
  public val id: Int,
  /**
   * The name of the repository.
   */
  public val name: String,
  public val nodeId: String,
  /**
   * Whether the repository is private or public.
   */
  public val `private`: Boolean,
) {
  public class Builder {
    private var fullNameValue: String? = null

    public var fullName: String
      get() = requireNotNull(fullNameValue) { "fullName is required" }
      set(`value`) {
        fullNameValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var privateValue: Boolean? = null

    public var `private`: Boolean
      get() = requireNotNull(privateValue) { "private is required" }
      set(`value`) {
        privateValue = value
      }

    public fun build(): InlineWebhooksRepositoriesItemX11f0076e {
      check(fullNameValue != null) { "fullName is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(privateValue != null) { "private is required" }
      return InlineWebhooksRepositoriesItemX11f0076e(
        fullName = fullName,
        id = id,
        name = name,
        nodeId = nodeId,
        private = private,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksRepositoriesItemX11f0076e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksRepositoriesItemX11f0076e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksRepositoriesItemX11f0076e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksRepositoriesItemX11f0076e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksRepositoriesItemX11f0076e must be a JSON object")
      val fullName = json.decodeRequired<String>(rawObject, "full_name")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val private = json.decodeRequired<Boolean>(rawObject, "private")
      return InlineWebhooksRepositoriesItemX11f0076e(
        fullName = fullName,
        id = id,
        name = name,
        nodeId = nodeId,
        private = private,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRepositoriesItemX11f0076e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksRepositoriesItemX11f0076e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("full_name", value.fullName)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("private", json.encodeToJsonElement(value.private))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksRepositoriesItemX11f0076e(block: InlineWebhooksRepositoriesItemX11f0076e.Builder.() -> Unit): InlineWebhooksRepositoriesItemX11f0076e = InlineWebhooksRepositoriesItemX11f0076e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksRepositoriesItemX11f0076e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
