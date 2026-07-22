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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/cond
 * itions/properties/updated/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/cond
 * itions/properties/updated/items
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95(
  public val changes:
      InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57? = null,
  public val condition: RepositoryRulesetConditions? = null,
) {
  public class Builder {
    public var changes:
        InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57? = null

    public var condition: RepositoryRulesetConditions? = null

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95 = InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95(
      changes = changes,
      condition = condition,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95(
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57>(it) },
        condition = rawObject["condition"]?.let { json.decodeFromJsonElement<RepositoryRulesetConditions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.changes?.let { put("changes", json.encodeToJsonElement(it)) }
        value.condition?.let { put("condition", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95(block: InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95 = InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95.build(block)
