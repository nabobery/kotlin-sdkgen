package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed/properties/changes
 */
@Serializable(with = InlineWebhookDiscussionCategoryChangedChangesX23ce6119.Serializer::class)
public class InlineWebhookDiscussionCategoryChangedChangesX23ce6119(
  public val category: InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8,
) {
  public class Builder {
    private var categoryValue: InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8? =
        null

    public var category: InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8
      get() = requireNotNull(categoryValue) { "category is required" }
      set(`value`) {
        categoryValue = value
      }

    public fun build(): InlineWebhookDiscussionCategoryChangedChangesX23ce6119 {
      check(categoryValue != null) { "category is required" }
      return InlineWebhookDiscussionCategoryChangedChangesX23ce6119(
        category = category,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionCategoryChangedChangesX23ce6119 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionCategoryChangedChangesX23ce6119> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionCategoryChangedChangesX23ce6119 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionCategoryChangedChangesX23ce6119")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionCategoryChangedChangesX23ce6119 must be a JSON object")
      val category = json.decodeRequired<InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8>(rawObject, "category")
      return InlineWebhookDiscussionCategoryChangedChangesX23ce6119(
        category = category,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionCategoryChangedChangesX23ce6119) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionCategoryChangedChangesX23ce6119")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("category", json.encodeToJsonElement(value.category))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionCategoryChangedChangesX23ce6119(block: InlineWebhookDiscussionCategoryChangedChangesX23ce6119.Builder.() -> Unit): InlineWebhookDiscussionCategoryChangedChangesX23ce6119 = InlineWebhookDiscussionCategoryChangedChangesX23ce6119.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDiscussionCategoryChangedChangesX23ce6119 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
