package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-converted/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-converted/properties/changes
 */
@Serializable(with = InlineWebhookProjectCardConvertedChangesX9556f3ea.Serializer::class)
public class InlineWebhookProjectCardConvertedChangesX9556f3ea(
  public val note: InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e,
) {
  public class Builder {
    private var noteValue: InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e? = null

    public var note: InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e
      get() = requireNotNull(noteValue) { "note is required" }
      set(`value`) {
        noteValue = value
      }

    public fun build(): InlineWebhookProjectCardConvertedChangesX9556f3ea {
      check(noteValue != null) { "note is required" }
      return InlineWebhookProjectCardConvertedChangesX9556f3ea(
        note = note,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectCardConvertedChangesX9556f3ea = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectCardConvertedChangesX9556f3ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardConvertedChangesX9556f3ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectCardConvertedChangesX9556f3ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectCardConvertedChangesX9556f3ea must be a JSON object")
      val note = json.decodeRequired<InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e>(rawObject, "note")
      return InlineWebhookProjectCardConvertedChangesX9556f3ea(
        note = note,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardConvertedChangesX9556f3ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectCardConvertedChangesX9556f3ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("note", json.encodeToJsonElement(value.note))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectCardConvertedChangesX9556f3ea(block: InlineWebhookProjectCardConvertedChangesX9556f3ea.Builder.() -> Unit): InlineWebhookProjectCardConvertedChangesX9556f3ea = InlineWebhookProjectCardConvertedChangesX9556f3ea.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectCardConvertedChangesX9556f3ea is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
