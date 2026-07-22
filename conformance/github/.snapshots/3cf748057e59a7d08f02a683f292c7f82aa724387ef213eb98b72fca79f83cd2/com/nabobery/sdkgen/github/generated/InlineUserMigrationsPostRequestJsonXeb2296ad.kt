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
 * sdkgen://source/openapi.yaml#/paths/~1user~1migrations/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1migrations/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserMigrationsPostRequestJsonXeb2296ad.Serializer::class)
public class InlineUserMigrationsPostRequestJsonXeb2296ad(
  repositories: List<String>,
  /**
   * Exclude attributes from the API response to improve performance
   */
  public val exclude: List<InlineUserMigrationsPostRequestJsonExcludeItemX571d7366>? = null,
  /**
   * Do not include attachments in the migration
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
   * Indicates whether projects owned by the organization or users should be excluded.
   */
  public val excludeOwnerProjects: Boolean? = null,
  /**
   * Do not include releases in the migration
   */
  public val excludeReleases: Boolean? = null,
  /**
   * Lock the repositories being migrated at the start of the migration
   */
  public val lockRepositories: Boolean? = null,
  /**
   * Indicates whether this should only include organization metadata (repositories array should be empty and will
   * ignore other flags).
   */
  public val orgMetadataOnly: Boolean? = null,
) {
  public val repositories: List<String> = repositories.toList()

  public class Builder {
    private var repositoriesValue: List<String>? = null

    public var repositories: List<String>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }
      set(`value`) {
        repositoriesValue = value
      }

    /**
     * Exclude attributes from the API response to improve performance
     */
    public var exclude: List<InlineUserMigrationsPostRequestJsonExcludeItemX571d7366>? = null

    /**
     * Do not include attachments in the migration
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
     * Indicates whether projects owned by the organization or users should be excluded.
     */
    public var excludeOwnerProjects: Boolean? = null

    /**
     * Do not include releases in the migration
     */
    public var excludeReleases: Boolean? = null

    /**
     * Lock the repositories being migrated at the start of the migration
     */
    public var lockRepositories: Boolean? = null

    /**
     * Indicates whether this should only include organization metadata (repositories array should be empty and will
     * ignore other flags).
     */
    public var orgMetadataOnly: Boolean? = null

    public fun build(): InlineUserMigrationsPostRequestJsonXeb2296ad {
      check(repositoriesValue != null) { "repositories is required" }
      return InlineUserMigrationsPostRequestJsonXeb2296ad(
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
    public fun build(block: Builder.() -> Unit): InlineUserMigrationsPostRequestJsonXeb2296ad = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserMigrationsPostRequestJsonXeb2296ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserMigrationsPostRequestJsonXeb2296ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserMigrationsPostRequestJsonXeb2296ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserMigrationsPostRequestJsonXeb2296ad must be a JSON object")
      val repositories = json.decodeRequired<List<String>>(rawObject, "repositories")
      return InlineUserMigrationsPostRequestJsonXeb2296ad(
        repositories = repositories,
        exclude = rawObject["exclude"]?.let { json.decodeFromJsonElement<List<InlineUserMigrationsPostRequestJsonExcludeItemX571d7366>>(it) },
        excludeAttachments = rawObject["exclude_attachments"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludeGitData = rawObject["exclude_git_data"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludeMetadata = rawObject["exclude_metadata"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludeOwnerProjects = rawObject["exclude_owner_projects"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludeReleases = rawObject["exclude_releases"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        lockRepositories = rawObject["lock_repositories"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        orgMetadataOnly = rawObject["org_metadata_only"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserMigrationsPostRequestJsonXeb2296ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserMigrationsPostRequestJsonXeb2296ad")
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

public fun inlineUserMigrationsPostRequestJsonXeb2296ad(block: InlineUserMigrationsPostRequestJsonXeb2296ad.Builder.() -> Unit): InlineUserMigrationsPostRequestJsonXeb2296ad = InlineUserMigrationsPostRequestJsonXeb2296ad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserMigrationsPostRequestJsonXeb2296ad is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
