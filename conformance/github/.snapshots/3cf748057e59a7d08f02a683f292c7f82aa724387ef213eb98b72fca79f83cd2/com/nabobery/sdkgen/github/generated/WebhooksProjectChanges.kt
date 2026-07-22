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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_project_changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_project_changes
 */
@Serializable(with = WebhooksProjectChanges.Serializer::class)
public class WebhooksProjectChanges(
  public val archivedAt: InlineWebhooksProjectChangesArchivedAtX14db4be7? = null,
) {
  public class Builder {
    public var archivedAt: InlineWebhooksProjectChangesArchivedAtX14db4be7? = null

    public fun build(): WebhooksProjectChanges = WebhooksProjectChanges(
      archivedAt = archivedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksProjectChanges = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhooksProjectChanges> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksProjectChanges {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksProjectChanges")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksProjectChanges must be a JSON object")
      return WebhooksProjectChanges(
        archivedAt = rawObject["archived_at"]?.let { json.decodeFromJsonElement<InlineWebhooksProjectChangesArchivedAtX14db4be7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksProjectChanges) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksProjectChanges")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.archivedAt?.let { put("archived_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksProjectChanges(block: WebhooksProjectChanges.Builder.() -> Unit): WebhooksProjectChanges = WebhooksProjectChanges.build(block)
