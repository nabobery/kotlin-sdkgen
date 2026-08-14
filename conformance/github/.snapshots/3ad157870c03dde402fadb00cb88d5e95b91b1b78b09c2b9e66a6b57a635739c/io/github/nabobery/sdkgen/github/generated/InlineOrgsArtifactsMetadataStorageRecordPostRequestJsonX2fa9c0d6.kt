package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1storage-record/post/requestBody/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1storage-record/post/requestBody/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6.Serializer::class)
public class InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6(
  /**
   * The digest of the artifact (algorithm:hex-encoded-digest).
   */
  public val digest: String,
  /**
   * The name of the artifact.
   */
  public val name: String,
  /**
   * The base URL of the artifact registry.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val registryUrl: String,
  /**
   * The URL where the artifact is stored.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val artifactUrl: String? = null,
  /**
   * The name of the GitHub repository associated with the artifact. This should be used
   * when there are no provenance attestations available for the artifact. The repository
   * must belong to the organization specified in the path parameter.
   *
   * If a provenance attestation is available for the artifact, the API will use
   * the repository information from the attestation instead of this parameter.
   */
  public val githubRepository: String? = null,
  /**
   * The path of the artifact.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val path: String? = null,
  /**
   * The repository name within the registry.
   */
  public val repository: String? = null,
  /**
   * If true, the endpoint will return the created record in the response body.
   *
   */
  public val returnRecords: Boolean? = null,
  /**
   * The status of the artifact (e.g., active, inactive).
   */
  public val status: InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75? = null,
  /**
   * The artifact version.
   */
  public val version: String? = null,
) {
  public class Builder {
    private var digestValue: String? = null

    public var digest: String
      get() = requireNotNull(digestValue) { "digest is required" }
      set(`value`) {
        digestValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var registryUrlValue: String? = null

    public var registryUrl: String
      get() = requireNotNull(registryUrlValue) { "registryUrl is required" }
      set(`value`) {
        registryUrlValue = value
      }

    /**
     * The URL where the artifact is stored.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var artifactUrl: String? = null

    /**
     * The name of the GitHub repository associated with the artifact. This should be used
     * when there are no provenance attestations available for the artifact. The repository
     * must belong to the organization specified in the path parameter.
     *
     * If a provenance attestation is available for the artifact, the API will use
     * the repository information from the attestation instead of this parameter.
     */
    public var githubRepository: String? = null

    /**
     * The path of the artifact.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var path: String? = null

    /**
     * The repository name within the registry.
     */
    public var repository: String? = null

    /**
     * If true, the endpoint will return the created record in the response body.
     *
     */
    public var returnRecords: Boolean? = null

    /**
     * The status of the artifact (e.g., active, inactive).
     */
    public var status: InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75? =
        null

    /**
     * The artifact version.
     */
    public var version: String? = null

    public fun build(): InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6 {
      check(digestValue != null) { "digest is required" }
      check(nameValue != null) { "name is required" }
      check(registryUrlValue != null) { "registryUrl is required" }
      return InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6(
        digest = digest,
        name = name,
        registryUrl = registryUrl,
        artifactUrl = artifactUrl,
        githubRepository = githubRepository,
        path = path,
        repository = repository,
        returnRecords = returnRecords,
        status = status,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6 must be a JSON object")
      val digest = json.decodeRequired<String>(rawObject, "digest")
      val name = json.decodeRequired<String>(rawObject, "name")
      val registryUrl = json.decodeRequired<String>(rawObject, "registry_url")
      return InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6(
        digest = digest,
        name = name,
        registryUrl = registryUrl,
        artifactUrl = rawObject["artifact_url"]?.let { json.decodeFromJsonElement<String>(it) },
        githubRepository = rawObject["github_repository"]?.let { json.decodeFromJsonElement<String>(it) },
        path = rawObject["path"]?.let { json.decodeFromJsonElement<String>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<String>(it) },
        returnRecords = rawObject["return_records"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75>(it) },
        version = rawObject["version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("digest", value.digest)
        put("name", value.name)
        put("registry_url", value.registryUrl)
        value.artifactUrl?.let { put("artifact_url", it) }
        value.githubRepository?.let { put("github_repository", it) }
        value.path?.let { put("path", it) }
        value.repository?.let { put("repository", it) }
        value.returnRecords?.let { put("return_records", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6(block: InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6.Builder.() -> Unit): InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6 = InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonX2fa9c0d6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
