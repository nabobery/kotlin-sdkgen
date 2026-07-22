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
 * itions/properties/updated/items/properties/changes.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/cond
 * itions/properties/updated/items/properties/changes
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57(
  public val conditionType:
      InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemConditionTypeXf18e09f3? = null,
  public val exclude:
      InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5? = null,
  public val include:
      InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306? = null,
  public val target:
      InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemChangesTargetX655bf238? = null,
) {
  public class Builder {
    public var conditionType:
        InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemConditionTypeXf18e09f3? = null

    public var exclude: InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5?
        = null

    public var include: InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306?
        = null

    public var target:
        InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemChangesTargetX655bf238? = null

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57 = InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57(
      conditionType = conditionType,
      exclude = exclude,
      include = include,
      target = target,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57(
        conditionType = rawObject["condition_type"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemConditionTypeXf18e09f3>(it) },
        exclude = rawObject["exclude"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5>(it) },
        include = rawObject["include"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306>(it) },
        target = rawObject["target"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemChangesTargetX655bf238>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.conditionType?.let { put("condition_type", json.encodeToJsonElement(it)) }
        value.exclude?.let { put("exclude", json.encodeToJsonElement(it)) }
        value.include?.let { put("include", json.encodeToJsonElement(it)) }
        value.target?.let { put("target", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57(block: InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57 = InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemChangesX3585ec57.build(block)
