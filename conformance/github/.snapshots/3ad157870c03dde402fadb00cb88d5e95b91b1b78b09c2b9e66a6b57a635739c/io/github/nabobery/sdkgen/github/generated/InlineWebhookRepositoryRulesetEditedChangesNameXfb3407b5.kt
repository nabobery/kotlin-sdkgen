package io.github.nabobery.sdkgen.github.generated

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/name
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/name
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5(
  public val from: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5 = InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5(
      from = from,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5(block: InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5 = InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5.build(block)
