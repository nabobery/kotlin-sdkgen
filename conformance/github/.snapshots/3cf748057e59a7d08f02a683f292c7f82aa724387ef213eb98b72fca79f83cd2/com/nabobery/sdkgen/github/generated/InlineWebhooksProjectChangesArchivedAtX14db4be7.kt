package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_project_changes/properties/archived_at.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_project_changes/properties/archived_at
 */
@Serializable(with = InlineWebhooksProjectChangesArchivedAtX14db4be7.Serializer::class)
public class InlineWebhooksProjectChangesArchivedAtX14db4be7(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhooksProjectChangesArchivedAtX14db4be7 = InlineWebhooksProjectChangesArchivedAtX14db4be7(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksProjectChangesArchivedAtX14db4be7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksProjectChangesArchivedAtX14db4be7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksProjectChangesArchivedAtX14db4be7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksProjectChangesArchivedAtX14db4be7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksProjectChangesArchivedAtX14db4be7 must be a JSON object")
      return InlineWebhooksProjectChangesArchivedAtX14db4be7(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksProjectChangesArchivedAtX14db4be7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksProjectChangesArchivedAtX14db4be7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksProjectChangesArchivedAtX14db4be7(block: InlineWebhooksProjectChangesArchivedAtX14db4be7.Builder.() -> Unit): InlineWebhooksProjectChangesArchivedAtX14db4be7 = InlineWebhooksProjectChangesArchivedAtX14db4be7.build(block)
