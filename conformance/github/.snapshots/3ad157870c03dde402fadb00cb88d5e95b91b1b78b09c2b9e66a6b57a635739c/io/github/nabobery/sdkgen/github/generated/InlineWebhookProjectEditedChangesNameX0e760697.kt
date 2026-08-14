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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited/properties/changes/properties/name.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited/properties/changes/properties/name
 */
@Serializable(with = InlineWebhookProjectEditedChangesNameX0e760697.Serializer::class)
public class InlineWebhookProjectEditedChangesNameX0e760697(
  /**
   * The changes to the project if the action was `edited`.
   */
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookProjectEditedChangesNameX0e760697 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookProjectEditedChangesNameX0e760697(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectEditedChangesNameX0e760697 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectEditedChangesNameX0e760697> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectEditedChangesNameX0e760697 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectEditedChangesNameX0e760697")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectEditedChangesNameX0e760697 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookProjectEditedChangesNameX0e760697(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectEditedChangesNameX0e760697) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectEditedChangesNameX0e760697")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectEditedChangesNameX0e760697(block: InlineWebhookProjectEditedChangesNameX0e760697.Builder.() -> Unit): InlineWebhookProjectEditedChangesNameX0e760697 = InlineWebhookProjectEditedChangesNameX0e760697.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectEditedChangesNameX0e760697 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
