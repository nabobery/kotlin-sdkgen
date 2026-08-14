package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/parent.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/parent
 */
@Serializable(with = InlineWebhooksTeam1ParentX55b2239e.Serializer::class)
public class InlineWebhooksTeam1ParentX55b2239e internal constructor(
  /**
   * Description of the team
   */
  public val description: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the team
   */
  public val id: Int,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val membersUrl: String,
  /**
   * Name of the team
   */
  public val name: String,
  public val nodeId: String,
  /**
   * Whether team members will receive notifications when their team is @mentioned
   */
  public val notificationSetting: InlineWebhooksTeam1ParentNotificationSettingX1aafa799,
  /**
   * Permission that the team will have for its repositories
   */
  public val permission: String,
  public val privacy: InlineWebhooksTeam1ParentPrivacyX03a391a8,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoriesUrl: String,
  public val slug: String,
  /**
   * The ownership type of the team
   */
  public val type: InlineWebhooksTeam1ParentTypeX6841bcbb,
  /**
   * URL for the team
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val enterpriseIdState: FieldState<Int>,
  private val organizationIdState: FieldState<Int>,
) {
  /**
   * Unique identifier of the enterprise to which this team belongs
   */
  public val enterpriseId: Int?
    get() = enterpriseIdState.valueOrNull()

  /**
   * Unique identifier of the organization to which this team belongs
   */
  public val organizationId: Int?
    get() = organizationIdState.valueOrNull()

  public constructor(
    description: String?,
    htmlUrl: String,
    id: Int,
    membersUrl: String,
    name: String,
    nodeId: String,
    notificationSetting: InlineWebhooksTeam1ParentNotificationSettingX1aafa799,
    permission: String,
    privacy: InlineWebhooksTeam1ParentPrivacyX03a391a8,
    repositoriesUrl: String,
    slug: String,
    type: InlineWebhooksTeam1ParentTypeX6841bcbb,
    url: String,
  ) : this(description = description,
  htmlUrl = htmlUrl,
  id = id,
  membersUrl = membersUrl,
  name = name,
  nodeId = nodeId,
  notificationSetting = notificationSetting,
  permission = permission,
  privacy = privacy,
  repositoriesUrl = repositoriesUrl,
  slug = slug,
  type = type,
  url = url,
  enterpriseIdState = FieldState.Absent,
  organizationIdState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enterprise_id`.
   */
  public fun enterpriseIdPresence(): FieldPresence = enterpriseIdState.presence

  /**
   * Returns the wire presence of `organization_id`.
   */
  public fun organizationIdPresence(): FieldPresence = organizationIdState.presence

  public class Builder {
    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var membersUrlValue: String? = null

    public var membersUrl: String
      get() = requireNotNull(membersUrlValue) { "membersUrl is required" }
      set(`value`) {
        membersUrlValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var notificationSettingValue: InlineWebhooksTeam1ParentNotificationSettingX1aafa799? =
        null

    public var notificationSetting: InlineWebhooksTeam1ParentNotificationSettingX1aafa799
      get() = requireNotNull(notificationSettingValue) { "notificationSetting is required" }
      set(`value`) {
        notificationSettingValue = value
      }

    private var permissionValue: String? = null

    public var permission: String
      get() = requireNotNull(permissionValue) { "permission is required" }
      set(`value`) {
        permissionValue = value
      }

    private var privacyValue: InlineWebhooksTeam1ParentPrivacyX03a391a8? = null

    public var privacy: InlineWebhooksTeam1ParentPrivacyX03a391a8
      get() = requireNotNull(privacyValue) { "privacy is required" }
      set(`value`) {
        privacyValue = value
      }

    private var repositoriesUrlValue: String? = null

    public var repositoriesUrl: String
      get() = requireNotNull(repositoriesUrlValue) { "repositoriesUrl is required" }
      set(`value`) {
        repositoriesUrlValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var typeValue: InlineWebhooksTeam1ParentTypeX6841bcbb? = null

    public var type: InlineWebhooksTeam1ParentTypeX6841bcbb
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Description of the team
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var enterpriseIdState: FieldState<Int> = FieldState.Absent

    /**
     * Unique identifier of the enterprise to which this team belongs
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enterpriseId: Int?
      get() = enterpriseIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enterpriseId is not nullable; call unsetEnterpriseId() to omit it" }
        enterpriseIdState = FieldState.Value(present)
      }

    private var organizationIdState: FieldState<Int> = FieldState.Absent

    /**
     * Unique identifier of the organization to which this team belongs
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var organizationId: Int?
      get() = organizationIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "organizationId is not nullable; call unsetOrganizationId() to omit it" }
        organizationIdState = FieldState.Value(present)
      }

    /**
     * Omits `enterprise_id` from serialized output.
     */
    public fun unsetEnterpriseId() {
      enterpriseIdState = FieldState.Absent
    }

    /**
     * Omits `organization_id` from serialized output.
     */
    public fun unsetOrganizationId() {
      organizationIdState = FieldState.Absent
    }

    public fun build(): InlineWebhooksTeam1ParentX55b2239e {
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(membersUrlValue != null) { "membersUrl is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(notificationSettingValue != null) { "notificationSetting is required" }
      check(permissionValue != null) { "permission is required" }
      check(privacyValue != null) { "privacy is required" }
      check(repositoriesUrlValue != null) { "repositoriesUrl is required" }
      check(slugValue != null) { "slug is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return InlineWebhooksTeam1ParentX55b2239e(
        description = descriptionState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        membersUrl = membersUrl,
        name = name,
        nodeId = nodeId,
        notificationSetting = notificationSetting,
        permission = permission,
        privacy = privacy,
        repositoriesUrl = repositoriesUrl,
        slug = slug,
        type = type,
        url = url,
        enterpriseIdState = enterpriseIdState,
        organizationIdState = organizationIdState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksTeam1ParentX55b2239e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksTeam1ParentX55b2239e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksTeam1ParentX55b2239e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksTeam1ParentX55b2239e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksTeam1ParentX55b2239e must be a JSON object")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val membersUrl = json.decodeRequired<String>(rawObject, "members_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val notificationSetting = json.decodeRequired<InlineWebhooksTeam1ParentNotificationSettingX1aafa799>(rawObject, "notification_setting")
      val permission = json.decodeRequired<String>(rawObject, "permission")
      val privacy = json.decodeRequired<InlineWebhooksTeam1ParentPrivacyX03a391a8>(rawObject, "privacy")
      val repositoriesUrl = json.decodeRequired<String>(rawObject, "repositories_url")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val type = json.decodeRequired<InlineWebhooksTeam1ParentTypeX6841bcbb>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhooksTeam1ParentX55b2239e is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhooksTeam1ParentX55b2239e(
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        membersUrl = membersUrl,
        name = name,
        nodeId = nodeId,
        notificationSetting = notificationSetting,
        permission = permission,
        privacy = privacy,
        repositoriesUrl = repositoriesUrl,
        slug = slug,
        type = type,
        url = url,
        enterpriseIdState = json.decodeOptional(rawObject, "enterprise_id", nullable = false),
        organizationIdState = json.decodeOptional(rawObject, "organization_id", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeam1ParentX55b2239e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksTeam1ParentX55b2239e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("members_url", value.membersUrl)
        put("name", value.name)
        put("node_id", value.nodeId)
        put("notification_setting", json.encodeToJsonElement(value.notificationSetting))
        put("permission", value.permission)
        put("privacy", json.encodeToJsonElement(value.privacy))
        put("repositories_url", value.repositoriesUrl)
        put("slug", value.slug)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
        putState("enterprise_id", value.enterpriseIdState, json::encodeToJsonElement)
        putState("organization_id", value.organizationIdState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksTeam1ParentX55b2239e(block: InlineWebhooksTeam1ParentX55b2239e.Builder.() -> Unit): InlineWebhooksTeam1ParentX55b2239e = InlineWebhooksTeam1ParentX55b2239e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksTeam1ParentX55b2239e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhooksTeam1ParentX55b2239e property '" + name + "' is not nullable")
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
