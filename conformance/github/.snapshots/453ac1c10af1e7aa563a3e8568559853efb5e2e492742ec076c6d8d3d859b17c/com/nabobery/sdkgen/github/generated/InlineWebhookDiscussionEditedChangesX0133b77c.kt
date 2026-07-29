package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-edited/properties/changes
 */
@Serializable(with = InlineWebhookDiscussionEditedChangesX0133b77c.Serializer::class)
public class InlineWebhookDiscussionEditedChangesX0133b77c(
  public val body: InlineWebhookDiscussionEditedChangesBodyXf4c23509? = null,
  public val title: InlineWebhookDiscussionEditedChangesTitleX9d519bfb? = null,
) {
  public class Builder {
    public var body: InlineWebhookDiscussionEditedChangesBodyXf4c23509? = null

    public var title: InlineWebhookDiscussionEditedChangesTitleX9d519bfb? = null

    public fun build(): InlineWebhookDiscussionEditedChangesX0133b77c = InlineWebhookDiscussionEditedChangesX0133b77c(
      body = body,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionEditedChangesX0133b77c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDiscussionEditedChangesX0133b77c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionEditedChangesX0133b77c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionEditedChangesX0133b77c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionEditedChangesX0133b77c must be a JSON object")
      return InlineWebhookDiscussionEditedChangesX0133b77c(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookDiscussionEditedChangesBodyXf4c23509>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<InlineWebhookDiscussionEditedChangesTitleX9d519bfb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionEditedChangesX0133b77c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionEditedChangesX0133b77c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionEditedChangesX0133b77c(block: InlineWebhookDiscussionEditedChangesX0133b77c.Builder.() -> Unit): InlineWebhookDiscussionEditedChangesX0133b77c = InlineWebhookDiscussionEditedChangesX0133b77c.build(block)
