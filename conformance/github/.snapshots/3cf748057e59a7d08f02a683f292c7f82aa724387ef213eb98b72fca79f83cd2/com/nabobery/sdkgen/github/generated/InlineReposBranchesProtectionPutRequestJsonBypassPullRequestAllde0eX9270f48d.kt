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
 * Allow specific users, teams, or apps to bypass pull request requirements.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema/properties/required_pull_request_reviews/properties/bypass_pull_request_allowances
 */
@Serializable(with = InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d.Serializer::class)
public class InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d(
  /**
   * The list of app `slug`s allowed to bypass pull request requirements.
   */
  public val apps: List<String>? = null,
  /**
   * The list of team `slug`s allowed to bypass pull request requirements.
   */
  public val teams: List<String>? = null,
  /**
   * The list of user `login`s allowed to bypass pull request requirements.
   */
  public val users: List<String>? = null,
) {
  public class Builder {
    /**
     * The list of app `slug`s allowed to bypass pull request requirements.
     */
    public var apps: List<String>? = null

    /**
     * The list of team `slug`s allowed to bypass pull request requirements.
     */
    public var teams: List<String>? = null

    /**
     * The list of user `login`s allowed to bypass pull request requirements.
     */
    public var users: List<String>? = null

    public fun build(): InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d = InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d(
      apps = apps,
      teams = teams,
      users = users,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d must be a JSON object")
      return InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d(
        apps = rawObject["apps"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        teams = rawObject["teams"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        users = rawObject["users"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d")
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

public fun inlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d(block: InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d.Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d = InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d.build(block)
