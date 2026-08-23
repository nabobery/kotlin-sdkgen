package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted
 */
@Serializable(with = WebhookMetaDeleted.Serializer::class)
public class WebhookMetaDeleted(
  public val action: InlineWebhookMetaDeletedActionX013a523d,
  /**
   * The deleted webhook. This will contain different keys based on the type of webhook it is: repository, organization,
   * business, app, or GitHub Marketplace.
   */
  public val hook: InlineWebhookMetaDeletedHookX7d6c0cae,
  /**
   * The id of the modified webhook.
   */
  public val hookId: Int,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: NullableRepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookMetaDeletedActionX013a523d? = null

    public var action: InlineWebhookMetaDeletedActionX013a523d
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var hookValue: InlineWebhookMetaDeletedHookX7d6c0cae? = null

    public var hook: InlineWebhookMetaDeletedHookX7d6c0cae
      get() = requireNotNull(hookValue) { "hook is required" }
      set(`value`) {
        hookValue = value
      }

    private var hookIdValue: Int? = null

    public var hookId: Int
      get() = requireNotNull(hookIdValue) { "hookId is required" }
      set(`value`) {
        hookIdValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: NullableRepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookMetaDeleted {
      check(actionValue != null) { "action is required" }
      check(hookValue != null) { "hook is required" }
      check(hookIdValue != null) { "hookId is required" }
      return WebhookMetaDeleted(
        action = action,
        hook = hook,
        hookId = hookId,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookMetaDeleted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookMetaDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookMetaDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookMetaDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookMetaDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookMetaDeletedActionX013a523d>(rawObject, "action")
      val hook = json.decodeRequired<InlineWebhookMetaDeletedHookX7d6c0cae>(rawObject, "hook")
      val hookId = json.decodeRequired<Int>(rawObject, "hook_id")
      return WebhookMetaDeleted(
        action = action,
        hook = hook,
        hookId = hookId,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableRepositoryWebhooks?>(element) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookMetaDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookMetaDeleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("hook", json.encodeToJsonElement(value.hook))
        put("hook_id", json.encodeToJsonElement(value.hookId))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookMetaDeleted(block: WebhookMetaDeleted.Builder.() -> Unit): WebhookMetaDeleted = WebhookMetaDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookMetaDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
