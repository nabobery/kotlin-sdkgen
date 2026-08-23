package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}/patch/requestBody/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}/patch/requestBody/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineOrgsTeamsPatchRequestJsonXa9bea8ae.Serializer::class)
public class InlineOrgsTeamsPatchRequestJsonXa9bea8ae internal constructor(
  private val descriptionState: FieldState<String>,
  private val nameState: FieldState<String>,
  private val notificationSettingState:
      FieldState<InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48>,
  private val parentTeamIdState: FieldState<Int?>,
  private val permissionState: FieldState<InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57>,
  private val privacyState: FieldState<InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee>,
) {
  /**
   * The description of the team.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The name of the team.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The notification setting the team has chosen. Editing teams without specifying this parameter leaves
   * `notification_setting` intact. The options are:
   * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
   * * `notifications_disabled` - no one receives notifications.
   */
  public val notificationSetting: InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48?
    get() = notificationSettingState.valueOrNull()

  /**
   * The ID of a team to set as the parent team.
   */
  public val parentTeamId: Int?
    get() = parentTeamIdState.valueOrNull()

  /**
   * **Closing down notice**. The permission that new repositories will be added to the team with when none is
   * specified.
   */
  public val permission: InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57?
    get() = permissionState.valueOrNull()

  /**
   * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy`
   * intact. When a team is nested, the `privacy` for parent teams cannot be `secret`. The options are:
   * **For a non-nested team:**
   * * `secret` - only visible to organization owners and members of this team.
   * * `closed` - visible to all members of this organization.
   * **For a parent or child team:**
   * * `closed` - visible to all members of this organization.
   */
  public val privacy: InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee?
    get() = privacyState.valueOrNull()

  public constructor() : this(descriptionState = FieldState.Absent,
  nameState = FieldState.Absent,
  notificationSettingState = FieldState.Absent,
  parentTeamIdState = FieldState.Absent,
  permissionState = FieldState.Absent,
  privacyState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `notification_setting`.
   */
  public fun notificationSettingPresence(): FieldPresence = notificationSettingState.presence

  /**
   * Returns the wire presence of `parent_team_id`.
   */
  public fun parentTeamIdPresence(): FieldPresence = parentTeamIdState.presence

  /**
   * Returns the wire presence of `permission`.
   */
  public fun permissionPresence(): FieldPresence = permissionState.presence

  /**
   * Returns the wire presence of `privacy`.
   */
  public fun privacyPresence(): FieldPresence = privacyState.presence

  public class Builder {
    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * The description of the team.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the team.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var notificationSettingState:
        FieldState<InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48> = FieldState.Absent

    /**
     * The notification setting the team has chosen. Editing teams without specifying this parameter leaves
     * `notification_setting` intact. The options are:
     * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
     * * `notifications_disabled` - no one receives notifications.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var notificationSetting: InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48?
      get() = notificationSettingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "notificationSetting is not nullable; call unsetNotificationSetting() to omit it" }
        notificationSettingState = FieldState.Value(present)
      }

    private var parentTeamIdState: FieldState<Int?> = FieldState.Absent

    /**
     * The ID of a team to set as the parent team.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var parentTeamId: Int?
      get() = parentTeamIdState.valueOrNull()
      set(`value`) {
        parentTeamIdState = value.toNullableFieldState()
      }

    private var permissionState: FieldState<InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57> =
        FieldState.Absent

    /**
     * **Closing down notice**. The permission that new repositories will be added to the team with when none is
     * specified.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permission: InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57?
      get() = permissionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permission is not nullable; call unsetPermission() to omit it" }
        permissionState = FieldState.Value(present)
      }

    private var privacyState: FieldState<InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee> =
        FieldState.Absent

    /**
     * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy`
     * intact. When a team is nested, the `privacy` for parent teams cannot be `secret`. The options are:
     * **For a non-nested team:**
     * * `secret` - only visible to organization owners and members of this team.
     * * `closed` - visible to all members of this organization.
     * **For a parent or child team:**
     * * `closed` - visible to all members of this organization.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var privacy: InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee?
      get() = privacyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "privacy is not nullable; call unsetPrivacy() to omit it" }
        privacyState = FieldState.Value(present)
      }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `notification_setting` from serialized output.
     */
    public fun unsetNotificationSetting() {
      notificationSettingState = FieldState.Absent
    }

    /**
     * Omits `parent_team_id` from serialized output.
     */
    public fun unsetParentTeamId() {
      parentTeamIdState = FieldState.Absent
    }

    /**
     * Omits `permission` from serialized output.
     */
    public fun unsetPermission() {
      permissionState = FieldState.Absent
    }

    /**
     * Omits `privacy` from serialized output.
     */
    public fun unsetPrivacy() {
      privacyState = FieldState.Absent
    }

    public fun build(): InlineOrgsTeamsPatchRequestJsonXa9bea8ae = InlineOrgsTeamsPatchRequestJsonXa9bea8ae(
      descriptionState = descriptionState,
      nameState = nameState,
      notificationSettingState = notificationSettingState,
      parentTeamIdState = parentTeamIdState,
      permissionState = permissionState,
      privacyState = privacyState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsTeamsPatchRequestJsonXa9bea8ae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsTeamsPatchRequestJsonXa9bea8ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsPatchRequestJsonXa9bea8ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsTeamsPatchRequestJsonXa9bea8ae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsTeamsPatchRequestJsonXa9bea8ae must be a JSON object")
      return InlineOrgsTeamsPatchRequestJsonXa9bea8ae(
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        notificationSettingState = json.decodeOptional(rawObject, "notification_setting", nullable = false),
        parentTeamIdState = json.decodeOptional(rawObject, "parent_team_id", nullable = true),
        permissionState = json.decodeOptional(rawObject, "permission", nullable = false),
        privacyState = json.decodeOptional(rawObject, "privacy", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsPatchRequestJsonXa9bea8ae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsTeamsPatchRequestJsonXa9bea8ae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("notification_setting", value.notificationSettingState, json::encodeToJsonElement)
        putState("parent_team_id", value.parentTeamIdState, json::encodeToJsonElement)
        putState("permission", value.permissionState, json::encodeToJsonElement)
        putState("privacy", value.privacyState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsTeamsPatchRequestJsonXa9bea8ae(block: InlineOrgsTeamsPatchRequestJsonXa9bea8ae.Builder.() -> Unit): InlineOrgsTeamsPatchRequestJsonXa9bea8ae = InlineOrgsTeamsPatchRequestJsonXa9bea8ae.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsTeamsPatchRequestJsonXa9bea8ae property '" + name + "' is not nullable")
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
