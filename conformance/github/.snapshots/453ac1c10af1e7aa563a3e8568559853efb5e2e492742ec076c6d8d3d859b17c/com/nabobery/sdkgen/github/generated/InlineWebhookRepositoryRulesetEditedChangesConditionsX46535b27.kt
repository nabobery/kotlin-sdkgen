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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/cond
 * itions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/cond
 * itions
 */
@Serializable(with = InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27.Serializer::class)
public class InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27(
  added: List<RepositoryRulesetConditions>? = null,
  deleted: List<RepositoryRulesetConditions>? = null,
  updated: List<InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95>? = null,
) {
  public val added: List<RepositoryRulesetConditions>? =
      added?.let { collection0 -> collection0.toList() }

  public val deleted: List<RepositoryRulesetConditions>? =
      deleted?.let { collection0 -> collection0.toList() }

  public val updated:
      List<InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95>? =
      updated?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var addedValue: List<RepositoryRulesetConditions>? = null

    public var added: List<RepositoryRulesetConditions>?
      get() = addedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        addedValue = value?.let { collection0 -> collection0.toList() }
      }

    private var deletedValue: List<RepositoryRulesetConditions>? = null

    public var deleted: List<RepositoryRulesetConditions>?
      get() = deletedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        deletedValue = value?.let { collection0 -> collection0.toList() }
      }

    private var updatedValue:
        List<InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95>? = null

    public var updated:
        List<InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95>?
      get() = updatedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        updatedValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27 = InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27(
      added = added,
      deleted = deleted,
      updated = updated,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27 must be a JSON object")
      return InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27(
        added = rawObject["added"]?.let { json.decodeFromJsonElement<List<RepositoryRulesetConditions>>(it) },
        deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<List<RepositoryRulesetConditions>>(it) },
        updated = rawObject["updated"]?.let { json.decodeFromJsonElement<List<InlineWebhookRepositoryRulesetEditedChangesConditionsUpdatedItemX5eb3ff95>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27")
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

public fun inlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27(block: InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27.Builder.() -> Unit): InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27 = InlineWebhookRepositoryRulesetEditedChangesConditionsX46535b27.build(block)
