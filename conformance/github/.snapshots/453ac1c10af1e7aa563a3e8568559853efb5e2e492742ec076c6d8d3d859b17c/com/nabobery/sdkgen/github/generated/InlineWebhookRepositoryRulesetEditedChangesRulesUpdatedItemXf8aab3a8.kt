package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/rule
 * s/properties/updated/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/rule
 * s/properties/updated/items
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8(
  public val changes:
      InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66? = null,
  public val rule: RepositoryRule? = null,
) {
  public class Builder {
    public var changes: InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66?
        = null

    public var rule: RepositoryRule? = null

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8 = InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8(
      changes = changes,
      rule = rule,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8(
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66>(it) },
        rule = rawObject["rule"]?.let { json.decodeFromJsonElement<RepositoryRule>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.changes?.let { put("changes", json.encodeToJsonElement(it)) }
        value.rule?.let { put("rule", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8(block: InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8 = InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8.build(block)
