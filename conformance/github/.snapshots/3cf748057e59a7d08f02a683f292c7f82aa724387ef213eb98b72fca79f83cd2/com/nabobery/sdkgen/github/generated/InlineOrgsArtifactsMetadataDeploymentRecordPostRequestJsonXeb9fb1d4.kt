package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record/post/requestBody/content/ap
 * plication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record/post/requestBody/content/ap
 * plication~1json/schema
 */
@Serializable(with = InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4.Serializer::class)
public class InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4(
  /**
   * The unique identifier for the deployment represented by the new record. To accommodate differing
   * containers and namespaces within a cluster, the following format is recommended:
   * {namespaceName}-{deploymentName}-{containerName}.
   *
   */
  public val deploymentName: String,
  /**
   * The hex encoded digest of the artifact.
   */
  public val digest: String,
  /**
   * The stage of the deployment.
   */
  public val logicalEnvironment: String,
  /**
   * The name of the artifact.
   */
  public val name: String,
  /**
   * The status of the artifact. Can be either deployed or decommissioned.
   */
  public val status: InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c,
  /**
   * The deployment cluster.
   */
  public val cluster: String? = null,
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
   * The physical region of the deployment.
   */
  public val physicalEnvironment: String? = null,
  /**
   * If true, the endpoint will return the created or updated record in the response body.
   *
   */
  public val returnRecords: Boolean? = null,
  /**
   * A list of runtime risks associated with the deployment.
   */
  public val runtimeRisks:
      List<InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742>? = null,
  /**
   * The tags associated with the deployment.
   */
  public val tags: Map<String, String>? = null,
  /**
   * The artifact version.
   */
  public val version: String? = null,
) {
  public class Builder {
    private var deploymentNameValue: String? = null

    public var deploymentName: String
      get() = requireNotNull(deploymentNameValue) { "deploymentName is required" }
      set(`value`) {
        deploymentNameValue = value
      }

    private var digestValue: String? = null

    public var digest: String
      get() = requireNotNull(digestValue) { "digest is required" }
      set(`value`) {
        digestValue = value
      }

    private var logicalEnvironmentValue: String? = null

    public var logicalEnvironment: String
      get() = requireNotNull(logicalEnvironmentValue) { "logicalEnvironment is required" }
      set(`value`) {
        logicalEnvironmentValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var statusValue:
        InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c? = null

    public var status: InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * The deployment cluster.
     */
    public var cluster: String? = null

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
     * The physical region of the deployment.
     */
    public var physicalEnvironment: String? = null

    /**
     * If true, the endpoint will return the created or updated record in the response body.
     *
     */
    public var returnRecords: Boolean? = null

    /**
     * A list of runtime risks associated with the deployment.
     */
    public var runtimeRisks:
        List<InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742>? = null

    /**
     * The tags associated with the deployment.
     */
    public var tags: Map<String, String>? = null

    /**
     * The artifact version.
     */
    public var version: String? = null

    public fun build(): InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4 {
      check(deploymentNameValue != null) { "deploymentName is required" }
      check(digestValue != null) { "digest is required" }
      check(logicalEnvironmentValue != null) { "logicalEnvironment is required" }
      check(nameValue != null) { "name is required" }
      check(statusValue != null) { "status is required" }
      return InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4(
        deploymentName = deploymentName,
        digest = digest,
        logicalEnvironment = logicalEnvironment,
        name = name,
        status = status,
        cluster = cluster,
        githubRepository = githubRepository,
        physicalEnvironment = physicalEnvironment,
        returnRecords = returnRecords,
        runtimeRisks = runtimeRisks,
        tags = tags,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4 must be a JSON object")
      val deploymentName = json.decodeRequired<String>(rawObject, "deployment_name")
      val digest = json.decodeRequired<String>(rawObject, "digest")
      val logicalEnvironment = json.decodeRequired<String>(rawObject, "logical_environment")
      val name = json.decodeRequired<String>(rawObject, "name")
      val status = json.decodeRequired<InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c>(rawObject, "status")
      return InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4(
        deploymentName = deploymentName,
        digest = digest,
        logicalEnvironment = logicalEnvironment,
        name = name,
        status = status,
        cluster = rawObject["cluster"]?.let { json.decodeFromJsonElement<String>(it) },
        githubRepository = rawObject["github_repository"]?.let { json.decodeFromJsonElement<String>(it) },
        physicalEnvironment = rawObject["physical_environment"]?.let { json.decodeFromJsonElement<String>(it) },
        returnRecords = rawObject["return_records"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        runtimeRisks = rawObject["runtime_risks"]?.let { json.decodeFromJsonElement<List<InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742>>(it) },
        tags = rawObject["tags"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        version = rawObject["version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deployment_name", value.deploymentName)
        put("digest", value.digest)
        put("logical_environment", value.logicalEnvironment)
        put("name", value.name)
        put("status", json.encodeToJsonElement(value.status))
        value.cluster?.let { put("cluster", it) }
        value.githubRepository?.let { put("github_repository", it) }
        value.physicalEnvironment?.let { put("physical_environment", it) }
        value.returnRecords?.let { put("return_records", json.encodeToJsonElement(it)) }
        value.runtimeRisks?.let { put("runtime_risks", json.encodeToJsonElement(it)) }
        value.tags?.let { put("tags", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4(block: InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4.Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4 = InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonXeb9fb1d4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
