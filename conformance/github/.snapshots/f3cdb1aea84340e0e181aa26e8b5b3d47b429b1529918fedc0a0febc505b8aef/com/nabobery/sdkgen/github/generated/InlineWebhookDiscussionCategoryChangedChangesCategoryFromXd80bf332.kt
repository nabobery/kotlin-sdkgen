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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed/properties/changes/properties/ca
 * tegory/properties/from.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed/properties/changes/properties/ca
 * tegory/properties/from
 */
@Serializable(with = InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332.Serializer::class)
public class InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val description: String,
  public val emoji: String,
  public val id: Int,
  public val isAnswerable: Boolean,
  public val name: String,
  public val repositoryId: Int,
  public val slug: String,
  public val updatedAt: String,
  public val nodeId: String? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var emojiValue: String? = null

    public var emoji: String
      get() = requireNotNull(emojiValue) { "emoji is required" }
      set(`value`) {
        emojiValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var isAnswerableValue: Boolean? = null

    public var isAnswerable: Boolean
      get() = requireNotNull(isAnswerableValue) { "isAnswerable is required" }
      set(`value`) {
        isAnswerableValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var repositoryIdValue: Int? = null

    public var repositoryId: Int
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    public var nodeId: String? = null

    public fun build(): InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332 {
      check(createdAtValue != null) { "createdAt is required" }
      check(descriptionValue != null) { "description is required" }
      check(emojiValue != null) { "emoji is required" }
      check(idValue != null) { "id is required" }
      check(isAnswerableValue != null) { "isAnswerable is required" }
      check(nameValue != null) { "name is required" }
      check(repositoryIdValue != null) { "repositoryId is required" }
      check(slugValue != null) { "slug is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332(
        createdAt = createdAt,
        description = description,
        emoji = emoji,
        id = id,
        isAnswerable = isAnswerable,
        name = name,
        repositoryId = repositoryId,
        slug = slug,
        updatedAt = updatedAt,
        nodeId = nodeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val description = json.decodeRequired<String>(rawObject, "description")
      val emoji = json.decodeRequired<String>(rawObject, "emoji")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val isAnswerable = json.decodeRequired<Boolean>(rawObject, "is_answerable")
      val name = json.decodeRequired<String>(rawObject, "name")
      val repositoryId = json.decodeRequired<Int>(rawObject, "repository_id")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332(
        createdAt = createdAt,
        description = description,
        emoji = emoji,
        id = id,
        isAnswerable = isAnswerable,
        name = name,
        repositoryId = repositoryId,
        slug = slug,
        updatedAt = updatedAt,
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("description", value.description)
        put("emoji", value.emoji)
        put("id", json.encodeToJsonElement(value.id))
        put("is_answerable", json.encodeToJsonElement(value.isAnswerable))
        put("name", value.name)
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
        put("slug", value.slug)
        put("updated_at", value.updatedAt)
        value.nodeId?.let { put("node_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332(block: InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332.Builder.() -> Unit): InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332 = InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
