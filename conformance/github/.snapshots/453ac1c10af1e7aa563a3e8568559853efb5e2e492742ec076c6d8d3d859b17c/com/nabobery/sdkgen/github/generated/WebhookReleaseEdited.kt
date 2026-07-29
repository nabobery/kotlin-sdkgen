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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited
 */
@Serializable(with = WebhookReleaseEdited.Serializer::class)
public class WebhookReleaseEdited(
  public val action: InlineWebhookReleaseEditedActionX692a0bdc,
  public val changes: InlineWebhookReleaseEditedChangesX85eb0a77,
  public val release: WebhooksRelease,
  public val repository: RepositoryWebhooks,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookReleaseEditedActionX692a0bdc? = null

    public var action: InlineWebhookReleaseEditedActionX692a0bdc
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookReleaseEditedChangesX85eb0a77? = null

    public var changes: InlineWebhookReleaseEditedChangesX85eb0a77
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var releaseValue: WebhooksRelease? = null

    public var release: WebhooksRelease
      get() = requireNotNull(releaseValue) { "release is required" }
      set(`value`) {
        releaseValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookReleaseEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(releaseValue != null) { "release is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookReleaseEdited(
        action = action,
        changes = changes,
        release = release,
        repository = repository,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookReleaseEdited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookReleaseEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookReleaseEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookReleaseEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookReleaseEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookReleaseEditedActionX692a0bdc>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookReleaseEditedChangesX85eb0a77>(rawObject, "changes")
      val release = json.decodeRequired<WebhooksRelease>(rawObject, "release")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      return WebhookReleaseEdited(
        action = action,
        changes = changes,
        release = release,
        repository = repository,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookReleaseEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookReleaseEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("release", json.encodeToJsonElement(value.release))
        put("repository", json.encodeToJsonElement(value.repository))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookReleaseEdited(block: WebhookReleaseEdited.Builder.() -> Unit): WebhookReleaseEdited = WebhookReleaseEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookReleaseEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
