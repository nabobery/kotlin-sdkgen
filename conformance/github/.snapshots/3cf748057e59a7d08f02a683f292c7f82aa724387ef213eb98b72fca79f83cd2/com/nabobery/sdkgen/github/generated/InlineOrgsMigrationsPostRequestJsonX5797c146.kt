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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1migrations/post/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1migrations/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsMigrationsPostRequestJsonX5797c146.Serializer::class)
public class InlineOrgsMigrationsPostRequestJsonX5797c146(
  repositories: List<String>,
  /**
   * Exclude related items from being returned in the response in order to improve performance of the request.
   */
  public val exclude: List<InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445>? = null,
  /**
   * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
   */
  public val excludeAttachments: Boolean? = null,
  /**
   * Indicates whether the repository git data should be excluded from the migration.
   */
  public val excludeGitData: Boolean? = null,
  /**
   * Indicates whether metadata should be excluded and only git source should be included for the migration.
   */
  public val excludeMetadata: Boolean? = null,
  /**
   * Indicates whether projects owned by the organization or users should be excluded. from the migration.
   */
  public val excludeOwnerProjects: Boolean? = null,
  /**
   * Indicates whether releases should be excluded from the migration (to reduce migration archive file size).
   */
  public val excludeReleases: Boolean? = null,
  /**
   * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
   */
  public val lockRepositories: Boolean? = null,
  /**
   * Indicates whether this should only include organization metadata (repositories array should be empty and will
   * ignore other flags).
   */
  public val orgMetadataOnly: Boolean? = null,
) {
  /**
   * A list of arrays indicating which repositories should be migrated.
   */
  public val repositories: List<String> = repositories.toList()

  public class Builder {
    private var repositoriesValue: List<String>? = null

    public var repositories: List<String>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }
      set(`value`) {
        repositoriesValue = value
      }

    /**
     * Exclude related items from being returned in the response in order to improve performance of the request.
     */
    public var exclude: List<InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445>? = null

    /**
     * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
     */
    public var excludeAttachments: Boolean? = null

    /**
     * Indicates whether the repository git data should be excluded from the migration.
     */
    public var excludeGitData: Boolean? = null

    /**
     * Indicates whether metadata should be excluded and only git source should be included for the migration.
     */
    public var excludeMetadata: Boolean? = null

    /**
     * Indicates whether projects owned by the organization or users should be excluded. from the migration.
     */
    public var excludeOwnerProjects: Boolean? = null

    /**
     * Indicates whether releases should be excluded from the migration (to reduce migration archive file size).
     */
    public var excludeReleases: Boolean? = null

    /**
     * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
     */
    public var lockRepositories: Boolean? = null

    /**
     * Indicates whether this should only include organization metadata (repositories array should be empty and will
     * ignore other flags).
     */
    public var orgMetadataOnly: Boolean? = null

    public fun build(): InlineOrgsMigrationsPostRequestJsonX5797c146 {
      check(repositoriesValue != null) { "repositories is required" }
      return InlineOrgsMigrationsPostRequestJsonX5797c146(
        repositories = repositories,
        exclude = exclude,
        excludeAttachments = excludeAttachments,
        excludeGitData = excludeGitData,
        excludeMetadata = excludeMetadata,
        excludeOwnerProjects = excludeOwnerProjects,
        excludeReleases = excludeReleases,
        lockRepositories = lockRepositories,
        orgMetadataOnly = orgMetadataOnly,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsMigrationsPostRequestJsonX5797c146 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsMigrationsPostRequestJsonX5797c146> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsMigrationsPostRequestJsonX5797c146 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsMigrationsPostRequestJsonX5797c146")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsMigrationsPostRequestJsonX5797c146 must be a JSON object")
      val repositories = json.decodeRequired<List<String>>(rawObject, "repositories")
      return InlineOrgsMigrationsPostRequestJsonX5797c146(
        repositories = repositories,
        exclude = rawObject["exclude"]?.let { json.decodeFromJsonElement<List<InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445>>(it) },
        excludeAttachments = rawObject["exclude_attachments"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludeGitData = rawObject["exclude_git_data"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludeMetadata = rawObject["exclude_metadata"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludeOwnerProjects = rawObject["exclude_owner_projects"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludeReleases = rawObject["exclude_releases"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        lockRepositories = rawObject["lock_repositories"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        orgMetadataOnly = rawObject["org_metadata_only"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsMigrationsPostRequestJsonX5797c146) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsMigrationsPostRequestJsonX5797c146")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        value.exclude?.let { put("exclude", json.encodeToJsonElement(it)) }
        value.excludeAttachments?.let { put("exclude_attachments", json.encodeToJsonElement(it)) }
        value.excludeGitData?.let { put("exclude_git_data", json.encodeToJsonElement(it)) }
        value.excludeMetadata?.let { put("exclude_metadata", json.encodeToJsonElement(it)) }
        value.excludeOwnerProjects?.let { put("exclude_owner_projects", json.encodeToJsonElement(it)) }
        value.excludeReleases?.let { put("exclude_releases", json.encodeToJsonElement(it)) }
        value.lockRepositories?.let { put("lock_repositories", json.encodeToJsonElement(it)) }
        value.orgMetadataOnly?.let { put("org_metadata_only", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsMigrationsPostRequestJsonX5797c146(block: InlineOrgsMigrationsPostRequestJsonX5797c146.Builder.() -> Unit): InlineOrgsMigrationsPostRequestJsonX5797c146 = InlineOrgsMigrationsPostRequestJsonX5797c146.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsMigrationsPostRequestJsonX5797c146 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
