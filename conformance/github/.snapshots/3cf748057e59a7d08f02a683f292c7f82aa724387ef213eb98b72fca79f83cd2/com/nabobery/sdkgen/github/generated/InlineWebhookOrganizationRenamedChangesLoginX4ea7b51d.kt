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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-renamed/properties/changes/properties/login.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-renamed/properties/changes/properties/login
 */
@Serializable(with = InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d.Serializer::class)
public class InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d(
  public val from: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public fun build(): InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d = InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d(
      from = from,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d must be a JSON object")
      return InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookOrganizationRenamedChangesLoginX4ea7b51d(block: InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d.Builder.() -> Unit): InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d = InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d.build(block)
