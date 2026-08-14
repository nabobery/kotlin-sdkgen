package io.github.nabobery.sdkgen.github.generated

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
 * The changes to the comment if the action was `edited`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-edited/properties/changes
 */
@Serializable(with = InlineWebhookPullRequestEditedChangesXf46d9019.Serializer::class)
public class InlineWebhookPullRequestEditedChangesXf46d9019(
  public val base: InlineWebhookPullRequestEditedChangesBaseX208d22c2? = null,
  public val body: InlineWebhookPullRequestEditedChangesBodyX6940571d? = null,
  public val title: InlineWebhookPullRequestEditedChangesTitleX1a46cc5e? = null,
) {
  public class Builder {
    public var base: InlineWebhookPullRequestEditedChangesBaseX208d22c2? = null

    public var body: InlineWebhookPullRequestEditedChangesBodyX6940571d? = null

    public var title: InlineWebhookPullRequestEditedChangesTitleX1a46cc5e? = null

    public fun build(): InlineWebhookPullRequestEditedChangesXf46d9019 = InlineWebhookPullRequestEditedChangesXf46d9019(
      base = base,
      body = body,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEditedChangesXf46d9019 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEditedChangesXf46d9019> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEditedChangesXf46d9019 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEditedChangesXf46d9019")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEditedChangesXf46d9019 must be a JSON object")
      return InlineWebhookPullRequestEditedChangesXf46d9019(
        base = rawObject["base"]?.let { json.decodeFromJsonElement<InlineWebhookPullRequestEditedChangesBaseX208d22c2>(it) },
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookPullRequestEditedChangesBodyX6940571d>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<InlineWebhookPullRequestEditedChangesTitleX1a46cc5e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEditedChangesXf46d9019) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEditedChangesXf46d9019")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.base?.let { put("base", json.encodeToJsonElement(it)) }
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEditedChangesXf46d9019(block: InlineWebhookPullRequestEditedChangesXf46d9019.Builder.() -> Unit): InlineWebhookPullRequestEditedChangesXf46d9019 = InlineWebhookPullRequestEditedChangesXf46d9019.build(block)
