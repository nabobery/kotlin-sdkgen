package io.github.nabobery.sdkgen.github.generated

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
 * s/properties/updated/items/properties/changes.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/rule
 * s/properties/updated/items/properties/changes
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66(
  public val configuration:
      InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemConfigurationXcd99c577? = null,
  public val pattern:
      InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesPatternX8ab1beea? = null,
  public val ruleType:
      InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6? = null,
) {
  public class Builder {
    public var configuration:
        InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemConfigurationXcd99c577? = null

    public var pattern:
        InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesPatternX8ab1beea? = null

    public var ruleType:
        InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6? = null

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66 = InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66(
      configuration = configuration,
      pattern = pattern,
      ruleType = ruleType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66(
        configuration = rawObject["configuration"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemConfigurationXcd99c577>(it) },
        pattern = rawObject["pattern"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesPatternX8ab1beea>(it) },
        ruleType = rawObject["rule_type"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRul3a4eChangesRulesUpdatedItemChangesRuleTypeXbc4508d6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.configuration?.let { put("configuration", json.encodeToJsonElement(it)) }
        value.pattern?.let { put("pattern", json.encodeToJsonElement(it)) }
        value.ruleType?.let { put("rule_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66(block: InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66 = InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemChangesX5a20bf66.build(block)
