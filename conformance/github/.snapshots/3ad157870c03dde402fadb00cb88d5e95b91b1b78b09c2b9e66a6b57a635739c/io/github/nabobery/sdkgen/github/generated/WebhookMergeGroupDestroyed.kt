package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-destroyed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-destroyed
 */
@Serializable(with = WebhookMergeGroupDestroyed.Serializer::class)
public class WebhookMergeGroupDestroyed(
  public val action: InlineWebhookMergeGroupDestroyedActionX5bdea1f1,
  public val mergeGroup: MergeGroup,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  /**
   * Explains why the merge group is being destroyed. The group could have been merged, removed from the queue
   * (dequeued), or invalidated by an earlier queue entry being dequeued (invalidated).
   */
  public val reason: InlineWebhookMergeGroupDestroyedReasonX7c31747f? = null,
  public val repository: RepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookMergeGroupDestroyedActionX5bdea1f1? = null

    public var action: InlineWebhookMergeGroupDestroyedActionX5bdea1f1
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var mergeGroupValue: MergeGroup? = null

    public var mergeGroup: MergeGroup
      get() = requireNotNull(mergeGroupValue) { "mergeGroup is required" }
      set(`value`) {
        mergeGroupValue = value
      }

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    /**
     * Explains why the merge group is being destroyed. The group could have been merged, removed from the queue
     * (dequeued), or invalidated by an earlier queue entry being dequeued (invalidated).
     */
    public var reason: InlineWebhookMergeGroupDestroyedReasonX7c31747f? = null

    public var repository: RepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookMergeGroupDestroyed {
      check(actionValue != null) { "action is required" }
      check(mergeGroupValue != null) { "mergeGroup is required" }
      return WebhookMergeGroupDestroyed(
        action = action,
        mergeGroup = mergeGroup,
        installation = installation,
        organization = organization,
        reason = reason,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookMergeGroupDestroyed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookMergeGroupDestroyed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookMergeGroupDestroyed {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookMergeGroupDestroyed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookMergeGroupDestroyed must be a JSON object")
      val action = json.decodeRequired<InlineWebhookMergeGroupDestroyedActionX5bdea1f1>(rawObject, "action")
      val mergeGroup = json.decodeRequired<MergeGroup>(rawObject, "merge_group")
      return WebhookMergeGroupDestroyed(
        action = action,
        mergeGroup = mergeGroup,
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<InlineWebhookMergeGroupDestroyedReasonX7c31747f>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookMergeGroupDestroyed) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookMergeGroupDestroyed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("merge_group", json.encodeToJsonElement(value.mergeGroup))
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookMergeGroupDestroyed(block: WebhookMergeGroupDestroyed.Builder.() -> Unit): WebhookMergeGroupDestroyed = WebhookMergeGroupDestroyed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookMergeGroupDestroyed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
