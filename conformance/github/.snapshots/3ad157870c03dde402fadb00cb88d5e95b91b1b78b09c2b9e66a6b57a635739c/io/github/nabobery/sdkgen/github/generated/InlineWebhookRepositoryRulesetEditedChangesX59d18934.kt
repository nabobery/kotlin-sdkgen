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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesX59d18934.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesX59d18934(
  public val conditions: InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27? = null,
  public val enforcement: InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11? = null,
  public val name: InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5? = null,
  public val rules: InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1? = null,
) {
  public class Builder {
    public var conditions: InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27? = null

    public var enforcement: InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11? = null

    public var name: InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5? = null

    public var rules: InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1? = null

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesX59d18934 = InlineWebhookRepositoryRulesetEditedChangesX59d18934(
      conditions = conditions,
      enforcement = enforcement,
      name = name,
      rules = rules,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesX59d18934 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesX59d18934> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesX59d18934 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesX59d18934")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesX59d18934 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesX59d18934(
        conditions = rawObject["conditions"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27>(it) },
        enforcement = rawObject["enforcement"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRulesetEditedChangesEnforcementX5174ec11>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRulesetEditedChangesNameXfb3407b5>(it) },
        rules = rawObject["rules"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesX59d18934) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesX59d18934")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.conditions?.let { put("conditions", json.encodeToJsonElement(it)) }
        value.enforcement?.let { put("enforcement", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
        value.rules?.let { put("rules", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRulesetEditedChangesX59d18934(block: InlineWebhookRepositoryRulesetEditedChangesX59d18934.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesX59d18934 = InlineWebhookRepositoryRulesetEditedChangesX59d18934.build(block)
