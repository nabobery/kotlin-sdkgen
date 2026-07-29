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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes/properties/name.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes/properties/name
 */
@Serializable(with = InlineWebhookReleaseEditedChangesNameXed023b24.Serializer::class)
public class InlineWebhookReleaseEditedChangesNameXed023b24(
  /**
   * The previous version of the name if the action was `edited`.
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

    public fun build(): InlineWebhookReleaseEditedChangesNameXed023b24 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookReleaseEditedChangesNameXed023b24(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookReleaseEditedChangesNameXed023b24 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookReleaseEditedChangesNameXed023b24> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseEditedChangesNameXed023b24 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookReleaseEditedChangesNameXed023b24")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookReleaseEditedChangesNameXed023b24 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookReleaseEditedChangesNameXed023b24(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseEditedChangesNameXed023b24) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookReleaseEditedChangesNameXed023b24")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookReleaseEditedChangesNameXed023b24(block: InlineWebhookReleaseEditedChangesNameXed023b24.Builder.() -> Unit): InlineWebhookReleaseEditedChangesNameXed023b24 = InlineWebhookReleaseEditedChangesNameXed023b24.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookReleaseEditedChangesNameXed023b24 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
