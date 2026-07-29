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
 * itions/properties/updated/items/properties/changes/properties/include.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited/properties/changes/properties/cond
 * itions/properties/updated/items/properties/changes/properties/include
 */
@Serializable(with = InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306.Serializer::class)
public class InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306(
  from: List<String>? = null,
) {
  public val from: List<String>? = from?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var fromValue: List<String>? = null

    public var from: List<String>?
      get() = fromValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        fromValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306 = InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306(
      from = from,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306 must be a JSON object")
      return InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306(block: InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306.Builder.() -> Unit): InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306 = InlineWebhookRepositoryRul3a4eChangesConditionsUpdatedItemIncludeX52f7b306.build(block)
