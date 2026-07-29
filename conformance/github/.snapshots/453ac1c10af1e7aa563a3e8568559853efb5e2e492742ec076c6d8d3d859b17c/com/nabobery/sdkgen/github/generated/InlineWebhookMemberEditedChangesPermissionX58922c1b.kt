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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited/properties/changes/properties/permission.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited/properties/changes/properties/permission
 */
@Serializable(with = InlineWebhookMemberEditedChangesPermissionX58922c1b.Serializer::class)
public class InlineWebhookMemberEditedChangesPermissionX58922c1b(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhookMemberEditedChangesPermissionX58922c1b = InlineWebhookMemberEditedChangesPermissionX58922c1b(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMemberEditedChangesPermissionX58922c1b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookMemberEditedChangesPermissionX58922c1b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMemberEditedChangesPermissionX58922c1b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMemberEditedChangesPermissionX58922c1b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMemberEditedChangesPermissionX58922c1b must be a JSON object")
      return InlineWebhookMemberEditedChangesPermissionX58922c1b(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberEditedChangesPermissionX58922c1b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMemberEditedChangesPermissionX58922c1b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMemberEditedChangesPermissionX58922c1b(block: InlineWebhookMemberEditedChangesPermissionX58922c1b.Builder.() -> Unit): InlineWebhookMemberEditedChangesPermissionX58922c1b = InlineWebhookMemberEditedChangesPermissionX58922c1b.build(block)
