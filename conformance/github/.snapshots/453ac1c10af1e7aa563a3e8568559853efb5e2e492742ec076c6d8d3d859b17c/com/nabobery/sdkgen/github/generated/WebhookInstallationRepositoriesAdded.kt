package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-added.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-added
 */
@Serializable(with = WebhookInstallationRepositoriesAdded.Serializer::class)
public class WebhookInstallationRepositoriesAdded internal constructor(
  public val action: InlineWebhookInstallationRepositoriesAddedActionXa0eac975,
  public val installation: Installation,
  repositoriesAdded: List<InlineWebhooksRepositoriesAddedItemXfb7d035a>,
  repositoriesRemoved: List<InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc>,
  public val repositorySelection: WebhooksRepositorySelection,
  public val requester: WebhooksUser?,
  public val sender: SimpleUser,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val organizationState: FieldState<OrganizationSimpleWebhooks>,
  private val repositoryState: FieldState<RepositoryWebhooks>,
) {
  public val repositoriesAdded: List<InlineWebhooksRepositoriesAddedItemXfb7d035a> =
      repositoriesAdded.toList()

  /**
   * An array of repository objects, which were removed from the installation.
   */
  public val repositoriesRemoved:
      List<InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc> =
      repositoriesRemoved.toList()

  public val enterprise: EnterpriseWebhooks?
    get() = enterpriseState.valueOrNull()

  public val organization: OrganizationSimpleWebhooks?
    get() = organizationState.valueOrNull()

  public val repository: RepositoryWebhooks?
    get() = repositoryState.valueOrNull()

  public constructor(
    action: InlineWebhookInstallationRepositoriesAddedActionXa0eac975,
    installation: Installation,
    repositoriesAdded: List<InlineWebhooksRepositoriesAddedItemXfb7d035a>,
    repositoriesRemoved: List<InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc>,
    repositorySelection: WebhooksRepositorySelection,
    requester: WebhooksUser?,
    sender: SimpleUser,
  ) : this(action = action,
  installation = installation,
  repositoriesAdded = repositoriesAdded,
  repositoriesRemoved = repositoriesRemoved,
  repositorySelection = repositorySelection,
  requester = requester,
  sender = sender,
  enterpriseState = FieldState.Absent,
  organizationState = FieldState.Absent,
  repositoryState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enterprise`.
   */
  public fun enterprisePresence(): FieldPresence = enterpriseState.presence

  /**
   * Returns the wire presence of `organization`.
   */
  public fun organizationPresence(): FieldPresence = organizationState.presence

  /**
   * Returns the wire presence of `repository`.
   */
  public fun repositoryPresence(): FieldPresence = repositoryState.presence

  public class Builder {
    private var actionValue: InlineWebhookInstallationRepositoriesAddedActionXa0eac975? = null

    public var action: InlineWebhookInstallationRepositoriesAddedActionXa0eac975
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var installationValue: Installation? = null

    public var installation: Installation
      get() = requireNotNull(installationValue) { "installation is required" }
      set(`value`) {
        installationValue = value
      }

    private var repositoriesAddedValue: List<InlineWebhooksRepositoriesAddedItemXfb7d035a>? = null

    public var repositoriesAdded: List<InlineWebhooksRepositoriesAddedItemXfb7d035a>
      get() = requireNotNull(repositoriesAddedValue) { "repositoriesAdded is required" }.toList()
      set(`value`) {
        repositoriesAddedValue = value.toList()
      }

    private var repositoriesRemovedValue:
        List<InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc>? = null

    public var repositoriesRemoved:
        List<InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc>
      get() = requireNotNull(repositoriesRemovedValue) { "repositoriesRemoved is required" }.toList()
      set(`value`) {
        repositoriesRemovedValue = value.toList()
      }

    private var repositorySelectionValue: WebhooksRepositorySelection? = null

    public var repositorySelection: WebhooksRepositorySelection
      get() = requireNotNull(repositorySelectionValue) { "repositorySelection is required" }
      set(`value`) {
        repositorySelectionValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    private var requesterState: FieldState<WebhooksUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var requester: WebhooksUser?
      get() = requesterState.valueOrNull()
      set(`value`) {
        requesterState = value.toNullableFieldState()
      }

    private var enterpriseState: FieldState<EnterpriseWebhooks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enterprise: EnterpriseWebhooks?
      get() = enterpriseState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enterprise is not nullable; call unsetEnterprise() to omit it" }
        enterpriseState = FieldState.Value(present)
      }

    private var organizationState: FieldState<OrganizationSimpleWebhooks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var organization: OrganizationSimpleWebhooks?
      get() = organizationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "organization is not nullable; call unsetOrganization() to omit it" }
        organizationState = FieldState.Value(present)
      }

    private var repositoryState: FieldState<RepositoryWebhooks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var repository: RepositoryWebhooks?
      get() = repositoryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "repository is not nullable; call unsetRepository() to omit it" }
        repositoryState = FieldState.Value(present)
      }

    /**
     * Omits `enterprise` from serialized output.
     */
    public fun unsetEnterprise() {
      enterpriseState = FieldState.Absent
    }

    /**
     * Omits `organization` from serialized output.
     */
    public fun unsetOrganization() {
      organizationState = FieldState.Absent
    }

    /**
     * Omits `repository` from serialized output.
     */
    public fun unsetRepository() {
      repositoryState = FieldState.Absent
    }

    public fun build(): WebhookInstallationRepositoriesAdded {
      check(actionValue != null) { "action is required" }
      check(installationValue != null) { "installation is required" }
      check(repositoriesAddedValue != null) { "repositoriesAdded is required" }
      check(repositoriesRemovedValue != null) { "repositoriesRemoved is required" }
      check(repositorySelectionValue != null) { "repositorySelection is required" }
      check(senderValue != null) { "sender is required" }
      check(requesterState !== FieldState.Absent) { "requester is required, even when null" }
      return WebhookInstallationRepositoriesAdded(
        action = action,
        installation = installation,
        repositoriesAdded = repositoriesAdded,
        repositoriesRemoved = repositoriesRemoved,
        repositorySelection = repositorySelection,
        requester = requesterState.valueOrNull(),
        sender = sender,
        enterpriseState = enterpriseState,
        organizationState = organizationState,
        repositoryState = repositoryState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookInstallationRepositoriesAdded = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookInstallationRepositoriesAdded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookInstallationRepositoriesAdded {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookInstallationRepositoriesAdded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookInstallationRepositoriesAdded must be a JSON object")
      val action = json.decodeRequired<InlineWebhookInstallationRepositoriesAddedActionXa0eac975>(rawObject, "action")
      val installation = json.decodeRequired<Installation>(rawObject, "installation")
      val repositoriesAdded = json.decodeRequired<List<InlineWebhooksRepositoriesAddedItemXfb7d035a>>(rawObject, "repositories_added")
      val repositoriesRemoved = json.decodeRequired<List<InlineWebhookInstallationRepositoriesAddedRepositoriesRemovedItemX7e3551bc>>(rawObject, "repositories_removed")
      val repositorySelection = json.decodeRequired<WebhooksRepositorySelection>(rawObject, "repository_selection")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      if (!rawObject.containsKey("requester")) {
        throw SerializationException("WebhookInstallationRepositoriesAdded is missing required property 'requester'")
      }
      val requester = rawObject["requester"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksUser?>(requireNotNull(element)) }
      return WebhookInstallationRepositoriesAdded(
        action = action,
        installation = installation,
        repositoriesAdded = repositoriesAdded,
        repositoriesRemoved = repositoriesRemoved,
        repositorySelection = repositorySelection,
        requester = requester,
        sender = sender,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = false),
        repositoryState = json.decodeOptional(rawObject, "repository", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookInstallationRepositoriesAdded) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookInstallationRepositoriesAdded")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("installation", json.encodeToJsonElement(value.installation))
        put("repositories_added", json.encodeToJsonElement(value.repositoriesAdded))
        put("repositories_removed", json.encodeToJsonElement(value.repositoriesRemoved))
        put("repository_selection", json.encodeToJsonElement(value.repositorySelection))
        put("requester", value.requester?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("sender", json.encodeToJsonElement(value.sender))
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("organization", value.organizationState, json::encodeToJsonElement)
        putState("repository", value.repositoryState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookInstallationRepositoriesAdded(block: WebhookInstallationRepositoriesAdded.Builder.() -> Unit): WebhookInstallationRepositoriesAdded = WebhookInstallationRepositoriesAdded.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookInstallationRepositoriesAdded is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("WebhookInstallationRepositoriesAdded property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
