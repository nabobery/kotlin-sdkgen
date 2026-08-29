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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes/properties/body.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes/properties/body
 */
@Serializable(with = InlineWebhookReleaseEditedChangesBodyX90f05ca1.Serializer::class)
public class InlineWebhookReleaseEditedChangesBodyX90f05ca1(
  /**
   * The previous version of the body if the action was `edited`.
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

    public fun build(): InlineWebhookReleaseEditedChangesBodyX90f05ca1 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookReleaseEditedChangesBodyX90f05ca1(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookReleaseEditedChangesBodyX90f05ca1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookReleaseEditedChangesBodyX90f05ca1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseEditedChangesBodyX90f05ca1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookReleaseEditedChangesBodyX90f05ca1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookReleaseEditedChangesBodyX90f05ca1 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookReleaseEditedChangesBodyX90f05ca1(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseEditedChangesBodyX90f05ca1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookReleaseEditedChangesBodyX90f05ca1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookReleaseEditedChangesBodyX90f05ca1(block: InlineWebhookReleaseEditedChangesBodyX90f05ca1.Builder.() -> Unit): InlineWebhookReleaseEditedChangesBodyX90f05ca1 = InlineWebhookReleaseEditedChangesBodyX90f05ca1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookReleaseEditedChangesBodyX90f05ca1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
