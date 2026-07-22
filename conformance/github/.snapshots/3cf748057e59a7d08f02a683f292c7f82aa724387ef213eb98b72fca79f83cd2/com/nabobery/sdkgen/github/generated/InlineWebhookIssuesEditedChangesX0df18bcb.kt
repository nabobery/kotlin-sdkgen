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
 * The changes to the issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/changes
 */
@Serializable(with = InlineWebhookIssuesEditedChangesX0df18bcb.Serializer::class)
public class InlineWebhookIssuesEditedChangesX0df18bcb(
  public val body: InlineWebhookIssuesEditedChangesBodyX27d1e1f9? = null,
  public val title: InlineWebhookIssuesEditedChangesTitleX4a7bc5ee? = null,
) {
  public class Builder {
    public var body: InlineWebhookIssuesEditedChangesBodyX27d1e1f9? = null

    public var title: InlineWebhookIssuesEditedChangesTitleX4a7bc5ee? = null

    public fun build(): InlineWebhookIssuesEditedChangesX0df18bcb = InlineWebhookIssuesEditedChangesX0df18bcb(
      body = body,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesEditedChangesX0df18bcb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesEditedChangesX0df18bcb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedChangesX0df18bcb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesEditedChangesX0df18bcb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesEditedChangesX0df18bcb must be a JSON object")
      return InlineWebhookIssuesEditedChangesX0df18bcb(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedChangesBodyX27d1e1f9>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedChangesTitleX4a7bc5ee>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedChangesX0df18bcb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesEditedChangesX0df18bcb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesEditedChangesX0df18bcb(block: InlineWebhookIssuesEditedChangesX0df18bcb.Builder.() -> Unit): InlineWebhookIssuesEditedChangesX0df18bcb = InlineWebhookIssuesEditedChangesX0df18bcb.build(block)
