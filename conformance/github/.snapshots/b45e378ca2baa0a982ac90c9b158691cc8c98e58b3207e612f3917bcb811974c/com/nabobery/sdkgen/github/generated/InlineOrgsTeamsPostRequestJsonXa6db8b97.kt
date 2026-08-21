package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsTeamsPostRequestJsonXa6db8b97.Serializer::class)
public class InlineOrgsTeamsPostRequestJsonXa6db8b97(
  /**
   * The name of the team.
   */
  public val name: String,
  /**
   * The description of the team.
   */
  public val description: String? = null,
  maintainers: List<String>? = null,
  /**
   * The notification setting the team has chosen. The options are:
   * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
   * * `notifications_disabled` - no one receives notifications.
   * Default: `notifications_enabled`
   */
  public val notificationSetting:
      InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed? = null,
  /**
   * The ID of a team to set as the parent team.
   */
  public val parentTeamId: Int? = null,
  /**
   * **Closing down notice**. The permission that new repositories will be added to the team with when none is
   * specified.
   */
  public val permission: InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d? = null,
  /**
   * The level of privacy this team should have. The options are:
   * **For a non-nested team:**
   * * `secret` - only visible to organization owners and members of this team.
   * * `closed` - visible to all members of this organization.
   * Default: `secret`
   * **For a parent or child team:**
   * * `closed` - visible to all members of this organization.
   * Default for child team: `closed`
   */
  public val privacy: InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4? = null,
  repoNames: List<String>? = null,
) {
  /**
   * List GitHub usernames for organization members who will become team maintainers.
   */
  public val maintainers: List<String>? = maintainers?.let { collection0 -> collection0.toList() }

  /**
   * The full name (e.g., "organization-name/repository-name") of repositories to add the team to.
   */
  public val repoNames: List<String>? = repoNames?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * The description of the team.
     */
    public var description: String? = null

    private var maintainersValue: List<String>? = null

    /**
     * List GitHub usernames for organization members who will become team maintainers.
     */
    public var maintainers: List<String>?
      get() = maintainersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        maintainersValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The notification setting the team has chosen. The options are:
     * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
     * * `notifications_disabled` - no one receives notifications.
     * Default: `notifications_enabled`
     */
    public var notificationSetting: InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed? =
        null

    /**
     * The ID of a team to set as the parent team.
     */
    public var parentTeamId: Int? = null

    /**
     * **Closing down notice**. The permission that new repositories will be added to the team with when none is
     * specified.
     */
    public var permission: InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d? = null

    /**
     * The level of privacy this team should have. The options are:
     * **For a non-nested team:**
     * * `secret` - only visible to organization owners and members of this team.
     * * `closed` - visible to all members of this organization.
     * Default: `secret`
     * **For a parent or child team:**
     * * `closed` - visible to all members of this organization.
     * Default for child team: `closed`
     */
    public var privacy: InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4? = null

    private var repoNamesValue: List<String>? = null

    /**
     * The full name (e.g., "organization-name/repository-name") of repositories to add the team to.
     */
    public var repoNames: List<String>?
      get() = repoNamesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repoNamesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsTeamsPostRequestJsonXa6db8b97 {
      check(nameValue != null) { "name is required" }
      return InlineOrgsTeamsPostRequestJsonXa6db8b97(
        name = name,
        description = description,
        maintainers = maintainers,
        notificationSetting = notificationSetting,
        parentTeamId = parentTeamId,
        permission = permission,
        privacy = privacy,
        repoNames = repoNames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsTeamsPostRequestJsonXa6db8b97 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsTeamsPostRequestJsonXa6db8b97> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsPostRequestJsonXa6db8b97 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsTeamsPostRequestJsonXa6db8b97")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsTeamsPostRequestJsonXa6db8b97 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsTeamsPostRequestJsonXa6db8b97(
        name = name,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        maintainers = rawObject["maintainers"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        notificationSetting = rawObject["notification_setting"]?.let { json.decodeFromJsonElement<InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed>(it) },
        parentTeamId = rawObject["parent_team_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d>(it) },
        privacy = rawObject["privacy"]?.let { json.decodeFromJsonElement<InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4>(it) },
        repoNames = rawObject["repo_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsPostRequestJsonXa6db8b97) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsTeamsPostRequestJsonXa6db8b97")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.description?.let { put("description", it) }
        value.maintainers?.let { put("maintainers", json.encodeToJsonElement(it)) }
        value.notificationSetting?.let { put("notification_setting", json.encodeToJsonElement(it)) }
        value.parentTeamId?.let { put("parent_team_id", json.encodeToJsonElement(it)) }
        value.permission?.let { put("permission", json.encodeToJsonElement(it)) }
        value.privacy?.let { put("privacy", json.encodeToJsonElement(it)) }
        value.repoNames?.let { put("repo_names", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsTeamsPostRequestJsonXa6db8b97(block: InlineOrgsTeamsPostRequestJsonXa6db8b97.Builder.() -> Unit): InlineOrgsTeamsPostRequestJsonXa6db8b97 = InlineOrgsTeamsPostRequestJsonXa6db8b97.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsTeamsPostRequestJsonXa6db8b97 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
