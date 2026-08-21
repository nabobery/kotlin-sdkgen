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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-edited/properties/changes
 */
@Serializable(with = InlineWebhookProjectCardEditedChangesXc7ba66de.Serializer::class)
public class InlineWebhookProjectCardEditedChangesXc7ba66de(
  public val note: InlineWebhookProjectCardEditedChangesNoteXc99e11d5,
) {
  public class Builder {
    private var noteValue: InlineWebhookProjectCardEditedChangesNoteXc99e11d5? = null

    public var note: InlineWebhookProjectCardEditedChangesNoteXc99e11d5
      get() = requireNotNull(noteValue) { "note is required" }
      set(`value`) {
        noteValue = value
      }

    public fun build(): InlineWebhookProjectCardEditedChangesXc7ba66de {
      check(noteValue != null) { "note is required" }
      return InlineWebhookProjectCardEditedChangesXc7ba66de(
        note = note,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectCardEditedChangesXc7ba66de = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardEditedChangesXc7ba66de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardEditedChangesXc7ba66de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectCardEditedChangesXc7ba66de")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectCardEditedChangesXc7ba66de must be a JSON object")
      val note = json.decodeRequired<InlineWebhookProjectCardEditedChangesNoteXc99e11d5>(rawObject, "note")
      return InlineWebhookProjectCardEditedChangesXc7ba66de(
        note = note,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardEditedChangesXc7ba66de) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectCardEditedChangesXc7ba66de")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("note", json.encodeToJsonElement(value.note))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectCardEditedChangesXc7ba66de(block: InlineWebhookProjectCardEditedChangesXc7ba66de.Builder.() -> Unit): InlineWebhookProjectCardEditedChangesXc7ba66de = InlineWebhookProjectCardEditedChangesXc7ba66de.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectCardEditedChangesXc7ba66de is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
