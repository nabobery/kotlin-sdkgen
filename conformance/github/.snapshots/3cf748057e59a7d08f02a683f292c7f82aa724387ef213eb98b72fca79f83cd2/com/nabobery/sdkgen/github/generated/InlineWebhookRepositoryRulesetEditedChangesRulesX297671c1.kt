package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
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
 * s.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/rule
 * s
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1(
  public val added: List<RepositoryRule>? = null,
  public val deleted: List<RepositoryRule>? = null,
  public val updated:
      List<InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8>? = null,
) {
  public class Builder {
    public var added: List<RepositoryRule>? = null

    public var deleted: List<RepositoryRule>? = null

    public var updated: List<InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8>?
        = null

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1 = InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1(
      added = added,
      deleted = deleted,
      updated = updated,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1(
        added = rawObject["added"]?.let { json.decodeFromJsonElement<List<RepositoryRule>>(it) },
        deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<List<RepositoryRule>>(it) },
        updated = rawObject["updated"]?.let { json.decodeFromJsonElement<List<InlineWebhookRepositoryRulesetEditedChangesRulesUpdatedItemXf8aab3a8>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.added?.let { put("added", json.encodeToJsonElement(it)) }
        value.deleted?.let { put("deleted", json.encodeToJsonElement(it)) }
        value.updated?.let { put("updated", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRulesetEditedChangesRulesX297671c1(block: InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1 = InlineWebhookRepositoryRulesetEditedChangesRulesX297671c1.build(block)
