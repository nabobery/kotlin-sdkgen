package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/target_date.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/target_date
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f.Serializer::class)
public class InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f(
  /**
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val from: String? = null,
  /**
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val to: String? = null,
) {
  public class Builder {
    /**
     * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var from: String? = null

    /**
     * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var to: String? = null

    public fun build(): InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f = InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f must be a JSON object")
      return InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f(block: InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f.Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f = InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f.build(block)
