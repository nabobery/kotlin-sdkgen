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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes
 */
@Serializable(with = InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0.Serializer::class)
public class InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0(
  public val description: InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e? = null,
  public val `public`: InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4? = null,
  public val shortDescription:
      InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e? = null,
  public val title: InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5? = null,
) {
  public class Builder {
    public var description: InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e? = null

    public var `public`: InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4? = null

    public var shortDescription:
        InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e? = null

    public var title: InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5? = null

    public fun build(): InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0 = InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0(
      description = description,
      public = public,
      shortDescription = shortDescription,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0 must be a JSON object")
      return InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e>(it) },
        public = rawObject["public"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4>(it) },
        shortDescription = rawObject["short_description"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.public?.let { put("public", json.encodeToJsonElement(it)) }
        value.shortDescription?.let { put("short_description", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0(block: InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0.Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0 = InlineWebhookProjectsV2ProjectEditedChangesXf3cf54f0.build(block)
