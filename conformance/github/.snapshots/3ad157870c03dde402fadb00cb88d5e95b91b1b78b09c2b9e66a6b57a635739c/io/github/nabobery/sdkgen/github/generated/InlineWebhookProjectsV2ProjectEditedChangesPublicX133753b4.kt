package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes/properties/pub
 * lic.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes/properties/pub
 * lic
 */
@Serializable(with = InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4.Serializer::class)
public class InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4(
  public val from: Boolean? = null,
  public val to: Boolean? = null,
) {
  public class Builder {
    public var from: Boolean? = null

    public var to: Boolean? = null

    public fun build(): InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4 = InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4 must be a JSON object")
      return InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        to = rawObject["to"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", json.encodeToJsonElement(it)) }
        value.to?.let { put("to", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4(block: InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4.Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4 = InlineWebhookProjectsV2ProjectEditedChangesPublicX133753b4.build(block)
