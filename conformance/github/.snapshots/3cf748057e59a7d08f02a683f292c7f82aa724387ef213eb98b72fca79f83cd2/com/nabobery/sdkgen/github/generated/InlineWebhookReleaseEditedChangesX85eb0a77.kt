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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes
 */
@Serializable(with = InlineWebhookReleaseEditedChangesX85eb0a77.Serializer::class)
public class InlineWebhookReleaseEditedChangesX85eb0a77(
  public val body: InlineWebhookReleaseEditedChangesBodyX90f05ca1? = null,
  public val makeLatest: InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf? = null,
  public val name: InlineWebhookReleaseEditedChangesNameXed023b24? = null,
  public val tagName: InlineWebhookReleaseEditedChangesTagNameX04005e16? = null,
) {
  public class Builder {
    public var body: InlineWebhookReleaseEditedChangesBodyX90f05ca1? = null

    public var makeLatest: InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf? = null

    public var name: InlineWebhookReleaseEditedChangesNameXed023b24? = null

    public var tagName: InlineWebhookReleaseEditedChangesTagNameX04005e16? = null

    public fun build(): InlineWebhookReleaseEditedChangesX85eb0a77 = InlineWebhookReleaseEditedChangesX85eb0a77(
      body = body,
      makeLatest = makeLatest,
      name = name,
      tagName = tagName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookReleaseEditedChangesX85eb0a77 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookReleaseEditedChangesX85eb0a77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseEditedChangesX85eb0a77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookReleaseEditedChangesX85eb0a77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookReleaseEditedChangesX85eb0a77 must be a JSON object")
      return InlineWebhookReleaseEditedChangesX85eb0a77(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookReleaseEditedChangesBodyX90f05ca1>(it) },
        makeLatest = rawObject["make_latest"]?.let { json.decodeFromJsonElement<InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineWebhookReleaseEditedChangesNameXed023b24>(it) },
        tagName = rawObject["tag_name"]?.let { json.decodeFromJsonElement<InlineWebhookReleaseEditedChangesTagNameX04005e16>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseEditedChangesX85eb0a77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookReleaseEditedChangesX85eb0a77")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
        value.makeLatest?.let { put("make_latest", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
        value.tagName?.let { put("tag_name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookReleaseEditedChangesX85eb0a77(block: InlineWebhookReleaseEditedChangesX85eb0a77.Builder.() -> Unit): InlineWebhookReleaseEditedChangesX85eb0a77 = InlineWebhookReleaseEditedChangesX85eb0a77.build(block)
