package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes/properties/owner.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes/properties/owner
 */
@Serializable(with = InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1.Serializer::class)
public class InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1(
  public val from: InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c,
) {
  public class Builder {
    private var fromValue: InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c? = null

    public var from: InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1 must be a JSON object")
      val from = json.decodeRequired<InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c>(rawObject, "from")
      return InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1(block: InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1.Builder.() -> Unit): InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1 = InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRepositoryTransferredChangesOwnerX6a0d4ff1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
