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
 * The changes to the milestone if the action was `edited`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-edited/properties/changes
 */
@Serializable(with = InlineWebhookMilestoneEditedChangesXf48da2ba.Serializer::class)
public class InlineWebhookMilestoneEditedChangesXf48da2ba(
  public val description: InlineWebhookMilestoneEditedChangesDescriptionX309f5ebb? = null,
  public val dueOn: InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec? = null,
  public val title: InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6? = null,
) {
  public class Builder {
    public var description: InlineWebhookMilestoneEditedChangesDescriptionX309f5ebb? = null

    public var dueOn: InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec? = null

    public var title: InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6? = null

    public fun build(): InlineWebhookMilestoneEditedChangesXf48da2ba = InlineWebhookMilestoneEditedChangesXf48da2ba(
      description = description,
      dueOn = dueOn,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMilestoneEditedChangesXf48da2ba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookMilestoneEditedChangesXf48da2ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMilestoneEditedChangesXf48da2ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMilestoneEditedChangesXf48da2ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMilestoneEditedChangesXf48da2ba must be a JSON object")
      return InlineWebhookMilestoneEditedChangesXf48da2ba(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineWebhookMilestoneEditedChangesDescriptionX309f5ebb>(it) },
        dueOn = rawObject["due_on"]?.let { json.decodeFromJsonElement<InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMilestoneEditedChangesXf48da2ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMilestoneEditedChangesXf48da2ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.dueOn?.let { put("due_on", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMilestoneEditedChangesXf48da2ba(block: InlineWebhookMilestoneEditedChangesXf48da2ba.Builder.() -> Unit): InlineWebhookMilestoneEditedChangesXf48da2ba = InlineWebhookMilestoneEditedChangesXf48da2ba.build(block)
