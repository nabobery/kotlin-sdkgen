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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-removed/properties/repositories_re
 * moved/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-removed/properties/repositories_re
 * moved/items
 */
@Serializable(with = InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d.Serializer::class)
public class InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d(
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

    public fun build(): InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d {
      check(fullNameValue != null) { "fullName is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(privateValue != null) { "private is required" }
      return InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d(
        fullName = fullName,
        id = id,
        name = name,
        nodeId = nodeId,
        private = private,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d must be a JSON object")
      val fullName = json.decodeRequired<String>(rawObject, "full_name")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val private = json.decodeRequired<Boolean>(rawObject, "private")
      return InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d(
        fullName = fullName,
        id = id,
        name = name,
        nodeId = nodeId,
        private = private,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d")
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

public fun inlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d(block: InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d.Builder.() -> Unit): InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d = InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookInstallationRepositoriesRemovedRepositoriesRemovedItemXd74d803d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
