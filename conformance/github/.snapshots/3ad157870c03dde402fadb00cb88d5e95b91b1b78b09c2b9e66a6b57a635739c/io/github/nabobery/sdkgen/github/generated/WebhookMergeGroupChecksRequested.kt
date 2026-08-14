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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-checks-requested.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-checks-requested
 */
@Serializable(with = WebhookMergeGroupChecksRequested.Serializer::class)
public class WebhookMergeGroupChecksRequested(
  public val action: InlineWebhookMergeGroupChecksRequestedActionXd9463cac,
  public val mergeGroup: MergeGroup,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookMergeGroupChecksRequestedActionXd9463cac? = null

    public var action: InlineWebhookMergeGroupChecksRequestedActionXd9463cac
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

    public var repository: RepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookMergeGroupChecksRequested {
      check(actionValue != null) { "action is required" }
      check(mergeGroupValue != null) { "mergeGroup is required" }
      return WebhookMergeGroupChecksRequested(
        action = action,
        mergeGroup = mergeGroup,
        installation = installation,
        organization = organization,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookMergeGroupChecksRequested = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookMergeGroupChecksRequested> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookMergeGroupChecksRequested {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookMergeGroupChecksRequested")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookMergeGroupChecksRequested must be a JSON object")
      val action = json.decodeRequired<InlineWebhookMergeGroupChecksRequestedActionXd9463cac>(rawObject, "action")
      val mergeGroup = json.decodeRequired<MergeGroup>(rawObject, "merge_group")
      return WebhookMergeGroupChecksRequested(
        action = action,
        mergeGroup = mergeGroup,
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookMergeGroupChecksRequested) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookMergeGroupChecksRequested")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("merge_group", json.encodeToJsonElement(value.mergeGroup))
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookMergeGroupChecksRequested(block: WebhookMergeGroupChecksRequested.Builder.() -> Unit): WebhookMergeGroupChecksRequested = WebhookMergeGroupChecksRequested.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookMergeGroupChecksRequested is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
