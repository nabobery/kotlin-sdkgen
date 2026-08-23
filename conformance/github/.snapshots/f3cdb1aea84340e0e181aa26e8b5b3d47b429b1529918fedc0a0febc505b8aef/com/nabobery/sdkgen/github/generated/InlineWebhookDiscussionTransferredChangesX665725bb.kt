package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-transferred/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-transferred/properties/changes
 */
@Serializable(with = InlineWebhookDiscussionTransferredChangesX665725bb.Serializer::class)
public class InlineWebhookDiscussionTransferredChangesX665725bb(
  public val newDiscussion: Discussion,
  public val newRepository: RepositoryWebhooks,
) {
  public class Builder {
    private var newDiscussionValue: Discussion? = null

    public var newDiscussion: Discussion
      get() = requireNotNull(newDiscussionValue) { "newDiscussion is required" }
      set(`value`) {
        newDiscussionValue = value
      }

    private var newRepositoryValue: RepositoryWebhooks? = null

    public var newRepository: RepositoryWebhooks
      get() = requireNotNull(newRepositoryValue) { "newRepository is required" }
      set(`value`) {
        newRepositoryValue = value
      }

    public fun build(): InlineWebhookDiscussionTransferredChangesX665725bb {
      check(newDiscussionValue != null) { "newDiscussion is required" }
      check(newRepositoryValue != null) { "newRepository is required" }
      return InlineWebhookDiscussionTransferredChangesX665725bb(
        newDiscussion = newDiscussion,
        newRepository = newRepository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionTransferredChangesX665725bb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionTransferredChangesX665725bb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionTransferredChangesX665725bb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionTransferredChangesX665725bb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionTransferredChangesX665725bb must be a JSON object")
      val newDiscussion = json.decodeRequired<Discussion>(rawObject, "new_discussion")
      val newRepository = json.decodeRequired<RepositoryWebhooks>(rawObject, "new_repository")
      return InlineWebhookDiscussionTransferredChangesX665725bb(
        newDiscussion = newDiscussion,
        newRepository = newRepository,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionTransferredChangesX665725bb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionTransferredChangesX665725bb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("new_discussion", json.encodeToJsonElement(value.newDiscussion))
        put("new_repository", json.encodeToJsonElement(value.newRepository))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionTransferredChangesX665725bb(block: InlineWebhookDiscussionTransferredChangesX665725bb.Builder.() -> Unit): InlineWebhookDiscussionTransferredChangesX665725bb = InlineWebhookDiscussionTransferredChangesX665725bb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDiscussionTransferredChangesX665725bb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
