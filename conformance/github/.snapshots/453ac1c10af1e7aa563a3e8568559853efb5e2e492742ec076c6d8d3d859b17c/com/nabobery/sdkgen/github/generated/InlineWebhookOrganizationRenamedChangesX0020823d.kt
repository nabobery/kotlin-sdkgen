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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-renamed/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-renamed/properties/changes
 */
@Serializable(with = InlineWebhookOrganizationRenamedChangesX0020823d.Serializer::class)
public class InlineWebhookOrganizationRenamedChangesX0020823d(
  public val login: InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d? = null,
) {
  public class Builder {
    public var login: InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d? = null

    public fun build(): InlineWebhookOrganizationRenamedChangesX0020823d = InlineWebhookOrganizationRenamedChangesX0020823d(
      login = login,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookOrganizationRenamedChangesX0020823d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookOrganizationRenamedChangesX0020823d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationRenamedChangesX0020823d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookOrganizationRenamedChangesX0020823d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookOrganizationRenamedChangesX0020823d must be a JSON object")
      return InlineWebhookOrganizationRenamedChangesX0020823d(
        login = rawObject["login"]?.let { json.decodeFromJsonElement<InlineWebhookOrganizationRenamedChangesLoginX4ea7b51d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationRenamedChangesX0020823d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookOrganizationRenamedChangesX0020823d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.login?.let { put("login", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookOrganizationRenamedChangesX0020823d(block: InlineWebhookOrganizationRenamedChangesX0020823d.Builder.() -> Unit): InlineWebhookOrganizationRenamedChangesX0020823d = InlineWebhookOrganizationRenamedChangesX0020823d.build(block)
