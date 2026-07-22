package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes
 */
@Serializable(with = InlineWebhookRepositoryTransferredChangesXcc7e5ce7.Serializer::class)
public class InlineWebhookRepositoryTransferredChangesXcc7e5ce7(
  public val owner: InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1,
) {
  public class Builder {
    private var ownerValue: InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1? = null

    public var owner: InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1
      get() = requireNotNull(ownerValue) { "owner is required" }
      set(`value`) {
        ownerValue = value
      }

    public fun build(): InlineWebhookRepositoryTransferredChangesXcc7e5ce7 {
      check(ownerValue != null) { "owner is required" }
      return InlineWebhookRepositoryTransferredChangesXcc7e5ce7(
        owner = owner,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryTransferredChangesXcc7e5ce7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryTransferredChangesXcc7e5ce7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryTransferredChangesXcc7e5ce7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryTransferredChangesXcc7e5ce7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryTransferredChangesXcc7e5ce7 must be a JSON object")
      val owner = json.decodeRequired<InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1>(rawObject, "owner")
      return InlineWebhookRepositoryTransferredChangesXcc7e5ce7(
        owner = owner,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryTransferredChangesXcc7e5ce7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryTransferredChangesXcc7e5ce7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("owner", json.encodeToJsonElement(value.owner))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryTransferredChangesXcc7e5ce7(block: InlineWebhookRepositoryTransferredChangesXcc7e5ce7.Builder.() -> Unit): InlineWebhookRepositoryTransferredChangesXcc7e5ce7 = InlineWebhookRepositoryTransferredChangesXcc7e5ce7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRepositoryTransferredChangesXcc7e5ce7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
