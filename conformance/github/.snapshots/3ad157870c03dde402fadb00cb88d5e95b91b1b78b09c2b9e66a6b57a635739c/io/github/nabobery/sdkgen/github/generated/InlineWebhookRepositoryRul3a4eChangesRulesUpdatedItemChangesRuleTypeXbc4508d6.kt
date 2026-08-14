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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/rule
 * s/properties/updated/items/properties/changes/properties/rule_type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/rule
 * s/properties/updated/items/properties/changes/properties/rule_type
 */
@Serializable(with = InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6.Serializer::class)
public class InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6(
  public val from: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public fun build(): InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6 = InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6(
      from = from,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6 must be a JSON object")
      return InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6(block: InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6.Builder.() -> Unit): InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6 = InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6.build(block)
