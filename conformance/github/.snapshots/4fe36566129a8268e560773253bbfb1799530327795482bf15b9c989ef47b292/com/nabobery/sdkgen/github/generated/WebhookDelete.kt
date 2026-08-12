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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-delete.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-delete
 */
@Serializable(with = WebhookDelete.Serializer::class)
public class WebhookDelete(
  public val pusherType: String,
  public val ref: String,
  /**
   * The type of Git ref object deleted in the repository.
   */
  public val refType: InlineWebhookDeleteRefTypeX906d8e51,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var pusherTypeValue: String? = null

    public var pusherType: String
      get() = requireNotNull(pusherTypeValue) { "pusherType is required" }
      set(`value`) {
        pusherTypeValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var refTypeValue: InlineWebhookDeleteRefTypeX906d8e51? = null

    public var refType: InlineWebhookDeleteRefTypeX906d8e51
      get() = requireNotNull(refTypeValue) { "refType is required" }
      set(`value`) {
        refTypeValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookDelete {
      check(pusherTypeValue != null) { "pusherType is required" }
      check(refValue != null) { "ref is required" }
      check(refTypeValue != null) { "refType is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDelete(
        pusherType = pusherType,
        ref = ref,
        refType = refType,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookDelete = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDelete> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDelete {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDelete")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDelete must be a JSON object")
      val pusherType = json.decodeRequired<String>(rawObject, "pusher_type")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val refType = json.decodeRequired<InlineWebhookDeleteRefTypeX906d8e51>(rawObject, "ref_type")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDelete(
        pusherType = pusherType,
        ref = ref,
        refType = refType,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDelete) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDelete")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pusher_type", value.pusherType)
        put("ref", value.ref)
        put("ref_type", json.encodeToJsonElement(value.refType))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookDelete(block: WebhookDelete.Builder.() -> Unit): WebhookDelete = WebhookDelete.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDelete is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
