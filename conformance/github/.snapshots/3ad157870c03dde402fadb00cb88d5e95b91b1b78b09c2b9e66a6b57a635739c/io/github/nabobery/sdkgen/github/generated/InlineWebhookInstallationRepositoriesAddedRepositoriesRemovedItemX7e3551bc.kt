package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-added/properties/repositories_remo
 * ved/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-added/properties/repositories_remo
 * ved/items
 */
@Serializable(with = InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc.Serializer::class)
public class InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc(
  public val fullName: String? = null,
  /**
   * Unique identifier of the repository
   */
  public val id: Int? = null,
  /**
   * The name of the repository.
   */
  public val name: String? = null,
  public val nodeId: String? = null,
  /**
   * Whether the repository is private or public.
   */
  public val `private`: Boolean? = null,
) {
  public class Builder {
    public var fullName: String? = null

    /**
     * Unique identifier of the repository
     */
    public var id: Int? = null

    /**
     * The name of the repository.
     */
    public var name: String? = null

    public var nodeId: String? = null

    /**
     * Whether the repository is private or public.
     */
    public var `private`: Boolean? = null

    public fun build(): InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc = InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc(
      fullName = fullName,
      id = id,
      name = name,
      nodeId = nodeId,
      private = private,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc must be a JSON object")
      return InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc(
        fullName = rawObject["full_name"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        private = rawObject["private"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fullName?.let { put("full_name", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.private?.let { put("private", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc(block: InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc.Builder.() -> Unit): InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc = InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc.build(block)
