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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-converted/properties/changes/properties/note.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-converted/properties/changes/properties/note
 */
@Serializable(with = InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e.Serializer::class)
public class InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e(
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e {
      check(fromValue != null) { "from is required" }
      return InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectCardConvertedChangesNoteXe2db5a4e(block: InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e.Builder.() -> Unit): InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e = InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectCardConvertedChangesNoteXe2db5a4e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
