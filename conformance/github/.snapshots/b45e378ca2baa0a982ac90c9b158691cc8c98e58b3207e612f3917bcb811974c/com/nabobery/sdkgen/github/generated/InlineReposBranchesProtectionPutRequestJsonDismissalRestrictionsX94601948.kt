package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object
 * to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this
 * parameter for personal repositories.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema/properties/required_pull_request_reviews/properties/dismissal_restrictions
 */
@Serializable(with = InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948.Serializer::class)
public class InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948(
  apps: List<String>? = null,
  teams: List<String>? = null,
  users: List<String>? = null,
) {
  /**
   * The list of app `slug`s with dismissal access
   */
  public val apps: List<String>? = apps?.let { collection0 -> collection0.toList() }

  /**
   * The list of team `slug`s with dismissal access
   */
  public val teams: List<String>? = teams?.let { collection0 -> collection0.toList() }

  /**
   * The list of user `login`s with dismissal access
   */
  public val users: List<String>? = users?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var appsValue: List<String>? = null

    /**
     * The list of app `slug`s with dismissal access
     */
    public var apps: List<String>?
      get() = appsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var teamsValue: List<String>? = null

    /**
     * The list of team `slug`s with dismissal access
     */
    public var teams: List<String>?
      get() = teamsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        teamsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var usersValue: List<String>? = null

    /**
     * The list of user `login`s with dismissal access
     */
    public var users: List<String>?
      get() = usersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        usersValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948 = InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948(
      apps = apps,
      teams = teams,
      users = users,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948 must be a JSON object")
      return InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948(
        apps = rawObject["apps"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        teams = rawObject["teams"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        users = rawObject["users"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.apps?.let { put("apps", json.encodeToJsonElement(it)) }
        value.teams?.let { put("teams", json.encodeToJsonElement(it)) }
        value.users?.let { put("users", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948(block: InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948.Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948 = InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948.build(block)
