package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes/properties/make_latest.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes/properties/make_latest
 */
@Serializable(with = InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf.Serializer::class)
public class InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf(
  /**
   * Whether this release was explicitly `edited` to be the latest.
   */
  public val to: Boolean,
) {
  public class Builder {
    private var toValue: Boolean? = null

    public var to: Boolean
      get() = requireNotNull(toValue) { "to is required" }
      set(`value`) {
        toValue = value
      }

    public fun build(): InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf {
      check(toValue != null) { "to is required" }
      return InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf(
        to = to,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf must be a JSON object")
      val to = json.decodeRequired<Boolean>(rawObject, "to")
      return InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf(
        to = to,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("to", json.encodeToJsonElement(value.to))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf(block: InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf.Builder.() -> Unit): InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf = InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookReleaseEditedChangesMakeLatestXf4ae4fbf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
