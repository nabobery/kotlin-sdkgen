package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-ping.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-ping
 */
@Serializable(with = WebhookPing.Serializer::class)
public class WebhookPing(
  /**
   * The webhook that is being pinged
   */
  public val hook: InlineWebhookPingHookXab113e63? = null,
  /**
   * The ID of the webhook that triggered the ping.
   */
  public val hookId: Int? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
  /**
   * Random string of GitHub zen.
   */
  public val zen: String? = null,
) {
  public class Builder {
    /**
     * The webhook that is being pinged
     */
    public var hook: InlineWebhookPingHookXab113e63? = null

    /**
     * The ID of the webhook that triggered the ping.
     */
    public var hookId: Int? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    /**
     * Random string of GitHub zen.
     */
    public var zen: String? = null

    public fun build(): WebhookPing = WebhookPing(
      hook = hook,
      hookId = hookId,
      organization = organization,
      repository = repository,
      sender = sender,
      zen = zen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPing = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookPing> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPing {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPing")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPing must be a JSON object")
      return WebhookPing(
        hook = rawObject["hook"]?.let { json.decodeFromJsonElement<InlineWebhookPingHookXab113e63>(it) },
        hookId = rawObject["hook_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        zen = rawObject["zen"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPing) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPing")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.hook?.let { put("hook", json.encodeToJsonElement(it)) }
        value.hookId?.let { put("hook_id", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
        value.zen?.let { put("zen", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookPing(block: WebhookPing.Builder.() -> Unit): WebhookPing = WebhookPing.build(block)
