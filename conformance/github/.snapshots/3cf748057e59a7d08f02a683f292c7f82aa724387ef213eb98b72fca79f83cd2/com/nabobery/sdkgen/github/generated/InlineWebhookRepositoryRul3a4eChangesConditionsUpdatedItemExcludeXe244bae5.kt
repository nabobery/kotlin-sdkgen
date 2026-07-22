package com.nabobery.sdkgen.github.generated

import kotlin.String
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
 * itions/properties/updated/items/properties/changes/properties/exclude.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/cond
 * itions/properties/updated/items/properties/changes/properties/exclude
 */
@Serializable(with = InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5.Serializer::class)
public class InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5(
  public val from: List<String>? = null,
) {
  public class Builder {
    public var from: List<String>? = null

    public fun build(): InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5 = InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5(
      from = from,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5 must be a JSON object")
      return InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5(block: InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5.Builder.() -> Unit): InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5 = InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemExcludeXe244bae5.build(block)
