package io.github.nabobery.sdkgen.github.generated

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
 * Authentication token for a GitHub App installed on a user or org.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/installation-token
 */
@Serializable(with = InstallationToken.Serializer::class)
public class InstallationToken(
  public val expiresAt: String,
  public val token: String,
  public val hasMultipleSingleFiles: Boolean? = null,
  public val permissions: AppPermissions? = null,
  repositories: List<Repository>? = null,
  public val repositorySelection: InlineInstallationTokenRepositorySelectionX74063bc7? = null,
  public val singleFile: String? = null,
  singleFilePaths: List<String>? = null,
) {
  public val repositories: List<Repository>? =
      repositories?.let { collection0 -> collection0.toList() }

  public val singleFilePaths: List<String>? =
      singleFilePaths?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expiresAtValue: String? = null

    public var expiresAt: String
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    public var hasMultipleSingleFiles: Boolean? = null

    public var permissions: AppPermissions? = null

    private var repositoriesValue: List<Repository>? = null

    public var repositories: List<Repository>?
      get() = repositoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repositoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var repositorySelection: InlineInstallationTokenRepositorySelectionX74063bc7? = null

    public var singleFile: String? = null

    private var singleFilePathsValue: List<String>? = null

    public var singleFilePaths: List<String>?
      get() = singleFilePathsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        singleFilePathsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InstallationToken {
      check(expiresAtValue != null) { "expiresAt is required" }
      check(tokenValue != null) { "token is required" }
      return InstallationToken(
        expiresAt = expiresAt,
        token = token,
        hasMultipleSingleFiles = hasMultipleSingleFiles,
        permissions = permissions,
        repositories = repositories,
        repositorySelection = repositorySelection,
        singleFile = singleFile,
        singleFilePaths = singleFilePaths,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InstallationToken = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InstallationToken> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InstallationToken {
      val jsonDecoder = decoder.requireJsonDecoder("InstallationToken")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InstallationToken must be a JSON object")
      val expiresAt = json.decodeRequired<String>(rawObject, "expires_at")
      val token = json.decodeRequired<String>(rawObject, "token")
      return InstallationToken(
        expiresAt = expiresAt,
        token = token,
        hasMultipleSingleFiles = rawObject["has_multiple_single_files"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<AppPermissions>(it) },
        repositories = rawObject["repositories"]?.let { json.decodeFromJsonElement<List<Repository>>(it) },
        repositorySelection = rawObject["repository_selection"]?.let { json.decodeFromJsonElement<InlineInstallationTokenRepositorySelectionX74063bc7>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<String>(it) },
        singleFilePaths = rawObject["single_file_paths"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InstallationToken) {
      val jsonEncoder = encoder.requireJsonEncoder("InstallationToken")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("expires_at", value.expiresAt)
        put("token", value.token)
        value.hasMultipleSingleFiles?.let { put("has_multiple_single_files", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.repositories?.let { put("repositories", json.encodeToJsonElement(it)) }
        value.repositorySelection?.let { put("repository_selection", json.encodeToJsonElement(it)) }
        value.singleFile?.let { put("single_file", it) }
        value.singleFilePaths?.let { put("single_file_paths", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun installationToken(block: InstallationToken.Builder.() -> Unit): InstallationToken = InstallationToken.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InstallationToken is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
