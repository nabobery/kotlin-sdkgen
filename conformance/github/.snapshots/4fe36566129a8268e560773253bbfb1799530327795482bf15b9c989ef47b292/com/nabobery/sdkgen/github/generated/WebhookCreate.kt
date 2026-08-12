package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-create.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-create
 */
@Serializable(with = WebhookCreate.Serializer::class)
public class WebhookCreate internal constructor(
  /**
   * The repository's current description.
   */
  public val description: String?,
  /**
   * The name of the repository's default branch (usually `main`).
   */
  public val masterBranch: String,
  public val pusherType: String,
  public val ref: String,
  /**
   * The type of Git ref object created in the repository.
   */
  public val refType: InlineWebhookCreateRefTypeX9b7316c3,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val installationState: FieldState<SimpleInstallation>,
  private val organizationState: FieldState<OrganizationSimpleWebhooks>,
) {
  public val enterprise: EnterpriseWebhooks?
    get() = enterpriseState.valueOrNull()

  public val installation: SimpleInstallation?
    get() = installationState.valueOrNull()

  public val organization: OrganizationSimpleWebhooks?
    get() = organizationState.valueOrNull()

  public constructor(
    description: String?,
    masterBranch: String,
    pusherType: String,
    ref: String,
    refType: InlineWebhookCreateRefTypeX9b7316c3,
    repository: RepositoryWebhooks,
    sender: SimpleUser,
  ) : this(description = description,
  masterBranch = masterBranch,
  pusherType = pusherType,
  ref = ref,
  refType = refType,
  repository = repository,
  sender = sender,
  enterpriseState = FieldState.Absent,
  installationState = FieldState.Absent,
  organizationState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enterprise`.
   */
  public fun enterprisePresence(): FieldPresence = enterpriseState.presence

  /**
   * Returns the wire presence of `installation`.
   */
  public fun installationPresence(): FieldPresence = installationState.presence

  /**
   * Returns the wire presence of `organization`.
   */
  public fun organizationPresence(): FieldPresence = organizationState.presence

  public class Builder {
    private var masterBranchValue: String? = null

    public var masterBranch: String
      get() = requireNotNull(masterBranchValue) { "masterBranch is required" }
      set(`value`) {
        masterBranchValue = value
      }

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

    private var refTypeValue: InlineWebhookCreateRefTypeX9b7316c3? = null

    public var refType: InlineWebhookCreateRefTypeX9b7316c3
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

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * The repository's current description.
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
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

    private var installationState: FieldState<SimpleInstallation> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var installation: SimpleInstallation?
      get() = installationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "installation is not nullable; call unsetInstallation() to omit it" }
        installationState = FieldState.Value(present)
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
     * Omits `installation` from serialized output.
     */
    public fun unsetInstallation() {
      installationState = FieldState.Absent
    }

    /**
     * Omits `organization` from serialized output.
     */
    public fun unsetOrganization() {
      organizationState = FieldState.Absent
    }

    public fun build(): WebhookCreate {
      check(masterBranchValue != null) { "masterBranch is required" }
      check(pusherTypeValue != null) { "pusherType is required" }
      check(refValue != null) { "ref is required" }
      check(refTypeValue != null) { "refType is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return WebhookCreate(
        description = descriptionState.valueOrNull(),
        masterBranch = masterBranch,
        pusherType = pusherType,
        ref = ref,
        refType = refType,
        repository = repository,
        sender = sender,
        enterpriseState = enterpriseState,
        installationState = installationState,
        organizationState = organizationState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCreate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCreate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCreate {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCreate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCreate must be a JSON object")
      val masterBranch = json.decodeRequired<String>(rawObject, "master_branch")
      val pusherType = json.decodeRequired<String>(rawObject, "pusher_type")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val refType = json.decodeRequired<InlineWebhookCreateRefTypeX9b7316c3>(rawObject, "ref_type")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("WebhookCreate is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return WebhookCreate(
        description = description,
        masterBranch = masterBranch,
        pusherType = pusherType,
        ref = ref,
        refType = refType,
        repository = repository,
        sender = sender,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCreate) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCreate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("master_branch", value.masterBranch)
        put("pusher_type", value.pusherType)
        put("ref", value.ref)
        put("ref_type", json.encodeToJsonElement(value.refType))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("installation", value.installationState, json::encodeToJsonElement)
        putState("organization", value.organizationState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCreate(block: WebhookCreate.Builder.() -> Unit): WebhookCreate = WebhookCreate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCreate is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookCreate property '" + name + "' is not nullable")
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
