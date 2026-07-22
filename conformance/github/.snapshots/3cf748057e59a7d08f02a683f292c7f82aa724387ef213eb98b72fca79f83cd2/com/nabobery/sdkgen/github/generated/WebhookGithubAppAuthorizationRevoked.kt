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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-github-app-authorization-revoked.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-github-app-authorization-revoked
 */
@Serializable(with = WebhookGithubAppAuthorizationRevoked.Serializer::class)
public class WebhookGithubAppAuthorizationRevoked(
  public val action: InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4,
  public val sender: SimpleUser,
) {
  public class Builder {
    private var actionValue: InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4? = null

    public var action: InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public fun build(): WebhookGithubAppAuthorizationRevoked {
      check(actionValue != null) { "action is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookGithubAppAuthorizationRevoked(
        action = action,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookGithubAppAuthorizationRevoked = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookGithubAppAuthorizationRevoked> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookGithubAppAuthorizationRevoked {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookGithubAppAuthorizationRevoked")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookGithubAppAuthorizationRevoked must be a JSON object")
      val action = json.decodeRequired<InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4>(rawObject, "action")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookGithubAppAuthorizationRevoked(
        action = action,
        sender = sender,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookGithubAppAuthorizationRevoked) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookGithubAppAuthorizationRevoked")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("sender", json.encodeToJsonElement(value.sender))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookGithubAppAuthorizationRevoked(block: WebhookGithubAppAuthorizationRevoked.Builder.() -> Unit): WebhookGithubAppAuthorizationRevoked = WebhookGithubAppAuthorizationRevoked.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookGithubAppAuthorizationRevoked is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
