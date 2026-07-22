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
 * The membership between the user and the organization. Not present when the action is `member_invited`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_membership
 */
@Serializable(with = WebhooksMembership.Serializer::class)
public class WebhooksMembership internal constructor(
  public val organizationUrl: String,
  public val role: String,
  public val state: String,
  public val url: String,
  public val user: InlineWebhooksMembershipUserXdc90daf6?,
  private val directMembershipState: FieldState<Boolean>,
  private val enterpriseTeamsProvidingIndirectMembershipState: FieldState<List<String>>,
) {
  /**
   * Whether the user has direct membership in the organization.
   */
  public val directMembership: Boolean?
    get() = directMembershipState.valueOrNull()

  /**
   * The slugs of the enterprise teams providing the user with indirect membership in the organization.
   * A limit of 100 enterprise team slugs is returned.
   */
  public val enterpriseTeamsProvidingIndirectMembership: List<String>?
    get() = enterpriseTeamsProvidingIndirectMembershipState.valueOrNull()

  public constructor(
    organizationUrl: String,
    role: String,
    state: String,
    url: String,
    user: InlineWebhooksMembershipUserXdc90daf6?,
  ) : this(organizationUrl = organizationUrl,
  role = role,
  state = state,
  url = url,
  user = user,
  directMembershipState = FieldState.Absent,
  enterpriseTeamsProvidingIndirectMembershipState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `direct_membership`.
   */
  public fun directMembershipPresence(): FieldPresence = directMembershipState.presence

  /**
   * Returns the wire presence of `enterprise_teams_providing_indirect_membership`.
   */
  public fun enterpriseTeamsProvidingIndirectMembershipPresence(): FieldPresence = enterpriseTeamsProvidingIndirectMembershipState.presence

  public class Builder {
    private var organizationUrlValue: String? = null

    public var organizationUrl: String
      get() = requireNotNull(organizationUrlValue) { "organizationUrl is required" }
      set(`value`) {
        organizationUrlValue = value
      }

    private var roleValue: String? = null

    public var role: String
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var userState: FieldState<InlineWebhooksMembershipUserXdc90daf6?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhooksMembershipUserXdc90daf6?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var directMembershipState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether the user has direct membership in the organization.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var directMembership: Boolean?
      get() = directMembershipState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "directMembership is not nullable; call unsetDirectMembership() to omit it" }
        directMembershipState = FieldState.Value(present)
      }

    private var enterpriseTeamsProvidingIndirectMembershipState: FieldState<List<String>> =
        FieldState.Absent

    /**
     * The slugs of the enterprise teams providing the user with indirect membership in the organization.
     * A limit of 100 enterprise team slugs is returned.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enterpriseTeamsProvidingIndirectMembership: List<String>?
      get() = enterpriseTeamsProvidingIndirectMembershipState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enterpriseTeamsProvidingIndirectMembership is not nullable; call unsetEnterpriseTeamsProvidingIndirectMembership() to omit it" }
        enterpriseTeamsProvidingIndirectMembershipState = FieldState.Value(present)
      }

    /**
     * Omits `direct_membership` from serialized output.
     */
    public fun unsetDirectMembership() {
      directMembershipState = FieldState.Absent
    }

    /**
     * Omits `enterprise_teams_providing_indirect_membership` from serialized output.
     */
    public fun unsetEnterpriseTeamsProvidingIndirectMembership() {
      enterpriseTeamsProvidingIndirectMembershipState = FieldState.Absent
    }

    public fun build(): WebhooksMembership {
      check(organizationUrlValue != null) { "organizationUrl is required" }
      check(roleValue != null) { "role is required" }
      check(stateValue != null) { "state is required" }
      check(urlValue != null) { "url is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return WebhooksMembership(
        organizationUrl = organizationUrl,
        role = role,
        state = state,
        url = url,
        user = userState.valueOrNull(),
        directMembershipState = directMembershipState,
        enterpriseTeamsProvidingIndirectMembershipState = enterpriseTeamsProvidingIndirectMembershipState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksMembership = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhooksMembership> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksMembership {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksMembership")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksMembership must be a JSON object")
      val organizationUrl = json.decodeRequired<String>(rawObject, "organization_url")
      val role = json.decodeRequired<String>(rawObject, "role")
      val state = json.decodeRequired<String>(rawObject, "state")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("WebhooksMembership is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksMembershipUserXdc90daf6?>(requireNotNull(element)) }
      return WebhooksMembership(
        organizationUrl = organizationUrl,
        role = role,
        state = state,
        url = url,
        user = user,
        directMembershipState = json.decodeOptional(rawObject, "direct_membership", nullable = false),
        enterpriseTeamsProvidingIndirectMembershipState = json.decodeOptional(rawObject, "enterprise_teams_providing_indirect_membership", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksMembership) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksMembership")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("organization_url", value.organizationUrl)
        put("role", value.role)
        put("state", value.state)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("direct_membership", value.directMembershipState, json::encodeToJsonElement)
        putState("enterprise_teams_providing_indirect_membership", value.enterpriseTeamsProvidingIndirectMembershipState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksMembership(block: WebhooksMembership.Builder.() -> Unit): WebhooksMembership = WebhooksMembership.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksMembership is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhooksMembership property '" + name + "' is not nullable")
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
