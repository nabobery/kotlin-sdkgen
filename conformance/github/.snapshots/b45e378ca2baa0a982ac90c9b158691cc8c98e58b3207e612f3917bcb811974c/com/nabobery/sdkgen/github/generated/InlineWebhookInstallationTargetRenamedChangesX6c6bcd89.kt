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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed/properties/changes
 */
@Serializable(with = InlineWebhookInstallationTargetRenamedChangesX6c6bcd89.Serializer::class)
public class InlineWebhookInstallationTargetRenamedChangesX6c6bcd89(
  public val login: InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d? = null,
  public val slug: InlineWebhookInstallationTargetRenamedChangesSlugX47ac3db5? = null,
) {
  public class Builder {
    public var login: InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d? = null

    public var slug: InlineWebhookInstallationTargetRenamedChangesSlugX47ac3db5? = null

    public fun build(): InlineWebhookInstallationTargetRenamedChangesX6c6bcd89 = InlineWebhookInstallationTargetRenamedChangesX6c6bcd89(
      login = login,
      slug = slug,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookInstallationTargetRenamedChangesX6c6bcd89 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationTargetRenamedChangesX6c6bcd89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationTargetRenamedChangesX6c6bcd89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookInstallationTargetRenamedChangesX6c6bcd89")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookInstallationTargetRenamedChangesX6c6bcd89 must be a JSON object")
      return InlineWebhookInstallationTargetRenamedChangesX6c6bcd89(
        login = rawObject["login"]?.let { json.decodeFromJsonElement<InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d>(it) },
        slug = rawObject["slug"]?.let { json.decodeFromJsonElement<InlineWebhookInstallationTargetRenamedChangesSlugX47ac3db5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationTargetRenamedChangesX6c6bcd89) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookInstallationTargetRenamedChangesX6c6bcd89")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.login?.let { put("login", json.encodeToJsonElement(it)) }
        value.slug?.let { put("slug", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookInstallationTargetRenamedChangesX6c6bcd89(block: InlineWebhookInstallationTargetRenamedChangesX6c6bcd89.Builder.() -> Unit): InlineWebhookInstallationTargetRenamedChangesX6c6bcd89 = InlineWebhookInstallationTargetRenamedChangesX6c6bcd89.build(block)
