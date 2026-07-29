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
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}/patch/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}/patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineTeamsPatchRequestJsonX92c4709d.Serializer::class)
public class InlineTeamsPatchRequestJsonX92c4709d internal constructor(
  /**
   * The name of the team.
   */
  public val name: String,
  private val descriptionState: FieldState<String>,
  private val notificationSettingState:
      FieldState<InlineTeamsPatchRequestJsonNotificationSettingX310e4435>,
  private val parentTeamIdState: FieldState<Int?>,
  private val permissionState: FieldState<InlineTeamsPatchRequestJsonPermissionXc1fe8131>,
  private val privacyState: FieldState<InlineTeamsPatchRequestJsonPrivacyXaad85019>,
) {
  /**
   * The description of the team.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The notification setting the team has chosen. Editing teams without specifying this parameter leaves
   * `notification_setting` intact. The options are:
   * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
   * * `notifications_disabled` - no one receives notifications.
   */
  public val notificationSetting: InlineTeamsPatchRequestJsonNotificationSettingX310e4435?
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
  public val permission: InlineTeamsPatchRequestJsonPermissionXc1fe8131?
    get() = permissionState.valueOrNull()

  /**
   * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy`
   * intact. The options are:
   * **For a non-nested team:**
   * * `secret` - only visible to organization owners and members of this team.
   * * `closed` - visible to all members of this organization.
   * **For a parent or child team:**
   * * `closed` - visible to all members of this organization.
   */
  public val privacy: InlineTeamsPatchRequestJsonPrivacyXaad85019?
    get() = privacyState.valueOrNull()

  public constructor(name: String) : this(name = name,
  descriptionState = FieldState.Absent,
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
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

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

    private var notificationSettingState:
        FieldState<InlineTeamsPatchRequestJsonNotificationSettingX310e4435> = FieldState.Absent

    /**
     * The notification setting the team has chosen. Editing teams without specifying this parameter leaves
     * `notification_setting` intact. The options are:
     * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
     * * `notifications_disabled` - no one receives notifications.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var notificationSetting: InlineTeamsPatchRequestJsonNotificationSettingX310e4435?
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

    private var permissionState: FieldState<InlineTeamsPatchRequestJsonPermissionXc1fe8131> =
        FieldState.Absent

    /**
     * **Closing down notice**. The permission that new repositories will be added to the team with when none is
     * specified.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permission: InlineTeamsPatchRequestJsonPermissionXc1fe8131?
      get() = permissionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permission is not nullable; call unsetPermission() to omit it" }
        permissionState = FieldState.Value(present)
      }

    private var privacyState: FieldState<InlineTeamsPatchRequestJsonPrivacyXaad85019> =
        FieldState.Absent

    /**
     * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy`
     * intact. The options are:
     * **For a non-nested team:**
     * * `secret` - only visible to organization owners and members of this team.
     * * `closed` - visible to all members of this organization.
     * **For a parent or child team:**
     * * `closed` - visible to all members of this organization.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var privacy: InlineTeamsPatchRequestJsonPrivacyXaad85019?
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

    public fun build(): InlineTeamsPatchRequestJsonX92c4709d {
      check(nameValue != null) { "name is required" }
      return InlineTeamsPatchRequestJsonX92c4709d(
        name = name,
        descriptionState = descriptionState,
        notificationSettingState = notificationSettingState,
        parentTeamIdState = parentTeamIdState,
        permissionState = permissionState,
        privacyState = privacyState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTeamsPatchRequestJsonX92c4709d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineTeamsPatchRequestJsonX92c4709d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTeamsPatchRequestJsonX92c4709d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTeamsPatchRequestJsonX92c4709d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTeamsPatchRequestJsonX92c4709d must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineTeamsPatchRequestJsonX92c4709d(
        name = name,
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        notificationSettingState = json.decodeOptional(rawObject, "notification_setting", nullable = false),
        parentTeamIdState = json.decodeOptional(rawObject, "parent_team_id", nullable = true),
        permissionState = json.decodeOptional(rawObject, "permission", nullable = false),
        privacyState = json.decodeOptional(rawObject, "privacy", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTeamsPatchRequestJsonX92c4709d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTeamsPatchRequestJsonX92c4709d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("notification_setting", value.notificationSettingState, json::encodeToJsonElement)
        putState("parent_team_id", value.parentTeamIdState, json::encodeToJsonElement)
        putState("permission", value.permissionState, json::encodeToJsonElement)
        putState("privacy", value.privacyState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTeamsPatchRequestJsonX92c4709d(block: InlineTeamsPatchRequestJsonX92c4709d.Builder.() -> Unit): InlineTeamsPatchRequestJsonX92c4709d = InlineTeamsPatchRequestJsonX92c4709d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTeamsPatchRequestJsonX92c4709d is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineTeamsPatchRequestJsonX92c4709d property '" + name + "' is not nullable")
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
