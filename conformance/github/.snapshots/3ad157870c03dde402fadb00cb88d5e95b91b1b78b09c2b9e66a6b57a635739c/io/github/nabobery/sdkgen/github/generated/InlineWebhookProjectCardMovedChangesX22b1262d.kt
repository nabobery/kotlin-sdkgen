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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/changes
 */
@Serializable(with = InlineWebhookProjectCardMovedChangesX22b1262d.Serializer::class)
public class InlineWebhookProjectCardMovedChangesX22b1262d(
  public val columnId: InlineWebhookProjectCardMovedChangesColumnIdX2bcbaa49,
) {
  public class Builder {
    private var columnIdValue: InlineWebhookProjectCardMovedChangesColumnIdX2bcbaa49? = null

    public var columnId: InlineWebhookProjectCardMovedChangesColumnIdX2bcbaa49
      get() = requireNotNull(columnIdValue) { "columnId is required" }
      set(`value`) {
        columnIdValue = value
      }

    public fun build(): InlineWebhookProjectCardMovedChangesX22b1262d {
      check(columnIdValue != null) { "columnId is required" }
      return InlineWebhookProjectCardMovedChangesX22b1262d(
        columnId = columnId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectCardMovedChangesX22b1262d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardMovedChangesX22b1262d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardMovedChangesX22b1262d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectCardMovedChangesX22b1262d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectCardMovedChangesX22b1262d must be a JSON object")
      val columnId = json.decodeRequired<InlineWebhookProjectCardMovedChangesColumnIdX2bcbaa49>(rawObject, "column_id")
      return InlineWebhookProjectCardMovedChangesX22b1262d(
        columnId = columnId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardMovedChangesX22b1262d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectCardMovedChangesX22b1262d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("column_id", json.encodeToJsonElement(value.columnId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectCardMovedChangesX22b1262d(block: InlineWebhookProjectCardMovedChangesX22b1262d.Builder.() -> Unit): InlineWebhookProjectCardMovedChangesX22b1262d = InlineWebhookProjectCardMovedChangesX22b1262d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectCardMovedChangesX22b1262d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
