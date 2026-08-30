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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-edited/properties/changes/properties/topics.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-edited/properties/changes/properties/topics
 */
@Serializable(with = InlineWebhookRepositoryEditedChangesTopicsXd6a3c754.Serializer::class)
public class InlineWebhookRepositoryEditedChangesTopicsXd6a3c754(
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

    public fun build(): InlineWebhookRepositoryEditedChangesTopicsXd6a3c754 = InlineWebhookRepositoryEditedChangesTopicsXd6a3c754(
      from = from,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryEditedChangesTopicsXd6a3c754 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryEditedChangesTopicsXd6a3c754> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryEditedChangesTopicsXd6a3c754 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryEditedChangesTopicsXd6a3c754")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryEditedChangesTopicsXd6a3c754 must be a JSON object")
      return InlineWebhookRepositoryEditedChangesTopicsXd6a3c754(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryEditedChangesTopicsXd6a3c754) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryEditedChangesTopicsXd6a3c754")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryEditedChangesTopicsXd6a3c754(block: InlineWebhookRepositoryEditedChangesTopicsXd6a3c754.Builder.() -> Unit): InlineWebhookRepositoryEditedChangesTopicsXd6a3c754 = InlineWebhookRepositoryEditedChangesTopicsXd6a3c754.build(block)
