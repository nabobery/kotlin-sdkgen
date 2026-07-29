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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/enfo
 * rcement.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/enfo
 * rcement
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11(
  public val from: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11 = InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11(
      from = from,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11(block: InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11 = InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11.build(block)
