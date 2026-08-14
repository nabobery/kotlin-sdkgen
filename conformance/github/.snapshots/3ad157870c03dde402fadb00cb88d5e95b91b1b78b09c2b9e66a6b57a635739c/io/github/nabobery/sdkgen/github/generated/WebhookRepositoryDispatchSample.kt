package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-dispatch-sample.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-dispatch-sample
 */
@Serializable(with = WebhookRepositoryDispatchSample.Serializer::class)
public class WebhookRepositoryDispatchSample internal constructor(
  /**
   * The `event_type` that was specified in the `POST /repos/{owner}/{repo}/dispatches` request body.
   */
  public val action: String,
  public val branch: String,
  /**
   * The `client_payload` that was specified in the `POST /repos/{owner}/{repo}/dispatches` request body.
   */
  public val clientPayload: JsonObject?,
  public val installation: SimpleInstallation,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val organizationState: FieldState<OrganizationSimpleWebhooks>,
) {
  public val enterprise: EnterpriseWebhooks?
    get() = enterpriseState.valueOrNull()

  public val organization: OrganizationSimpleWebhooks?
    get() = organizationState.valueOrNull()

  public constructor(
    action: String,
    branch: String,
    clientPayload: JsonObject?,
    installation: SimpleInstallation,
    repository: RepositoryWebhooks,
    sender: SimpleUser,
  ) : this(action = action,
  branch = branch,
  clientPayload = clientPayload,
  installation = installation,
  repository = repository,
  sender = sender,
  enterpriseState = FieldState.Absent,
  organizationState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enterprise`.
   */
  public fun enterprisePresence(): FieldPresence = enterpriseState.presence

  /**
   * Returns the wire presence of `organization`.
   */
  public fun organizationPresence(): FieldPresence = organizationState.presence

  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var branchValue: String? = null

    public var branch: String
      get() = requireNotNull(branchValue) { "branch is required" }
      set(`value`) {
        branchValue = value
      }

    private var installationValue: SimpleInstallation? = null

    public var installation: SimpleInstallation
      get() = requireNotNull(installationValue) { "installation is required" }
      set(`value`) {
        installationValue = value
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

    private var clientPayloadState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * The `client_payload` that was specified in the `POST /repos/{owner}/{repo}/dispatches` request body.
     * Required nullable field; assigning `null` records present-null.
     */
    public var clientPayload: JsonObject?
      get() = clientPayloadState.valueOrNull()
      set(`value`) {
        clientPayloadState = value.toNullableFieldState()
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

    public fun build(): WebhookRepositoryDispatchSample {
      check(actionValue != null) { "action is required" }
      check(branchValue != null) { "branch is required" }
      check(installationValue != null) { "installation is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(clientPayloadState !== FieldState.Absent) { "clientPayload is required, even when null" }
      return WebhookRepositoryDispatchSample(
        action = action,
        branch = branch,
        clientPayload = clientPayloadState.valueOrNull(),
        installation = installation,
        repository = repository,
        sender = sender,
        enterpriseState = enterpriseState,
        organizationState = organizationState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookRepositoryDispatchSample = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookRepositoryDispatchSample> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookRepositoryDispatchSample {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookRepositoryDispatchSample")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookRepositoryDispatchSample must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val branch = json.decodeRequired<String>(rawObject, "branch")
      val installation = json.decodeRequired<SimpleInstallation>(rawObject, "installation")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      if (!rawObject.containsKey("client_payload")) {
        throw SerializationException("WebhookRepositoryDispatchSample is missing required property 'client_payload'")
      }
      val clientPayload = rawObject["client_payload"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(requireNotNull(element)) }
      return WebhookRepositoryDispatchSample(
        action = action,
        branch = branch,
        clientPayload = clientPayload,
        installation = installation,
        repository = repository,
        sender = sender,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookRepositoryDispatchSample) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookRepositoryDispatchSample")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("branch", value.branch)
        put("client_payload", value.clientPayload?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("installation", json.encodeToJsonElement(value.installation))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("organization", value.organizationState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookRepositoryDispatchSample(block: WebhookRepositoryDispatchSample.Builder.() -> Unit): WebhookRepositoryDispatchSample = WebhookRepositoryDispatchSample.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookRepositoryDispatchSample is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("WebhookRepositoryDispatchSample property '" + name + "' is not nullable")
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
