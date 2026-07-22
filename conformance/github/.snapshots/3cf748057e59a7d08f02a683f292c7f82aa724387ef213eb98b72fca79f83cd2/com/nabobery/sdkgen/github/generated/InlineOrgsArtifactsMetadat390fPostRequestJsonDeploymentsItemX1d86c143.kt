package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * questBody/content/application~1json/schema/properties/deployments/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * questBody/content/application~1json/schema/properties/deployments/items
 */
@Serializable(with = InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143.Serializer::class)
public class InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143(
  /**
   * The unique identifier for the deployment represented by the new record. To accommodate differing
   * containers and namespaces within a record set, the following format is recommended:
   * {namespaceName}-{deploymentName}-{containerName}.
   * The deployment_name must be unique across all entries in the deployments array.
   *
   */
  public val deploymentName: String,
  /**
   * The hex encoded digest of the artifact.
   */
  public val digest: String,
  /**
   * The name of the artifact.
   */
  public val name: String,
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
   * A list of runtime risks associated with the deployment.
   */
  public val runtimeRisks:
      List<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4>? = null,
  /**
   * The deployment status of the artifact.
   */
  public val status:
      InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b? = null,
  /**
   * Key-value pairs to tag the deployment record.
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

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

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
     * A list of runtime risks associated with the deployment.
     */
    public var runtimeRisks:
        List<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4>? = null

    /**
     * The deployment status of the artifact.
     */
    public var status: InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b?
        = null

    /**
     * Key-value pairs to tag the deployment record.
     */
    public var tags: Map<String, String>? = null

    /**
     * The artifact version.
     */
    public var version: String? = null

    public fun build(): InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143 {
      check(deploymentNameValue != null) { "deploymentName is required" }
      check(digestValue != null) { "digest is required" }
      check(nameValue != null) { "name is required" }
      return InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143(
        deploymentName = deploymentName,
        digest = digest,
        name = name,
        githubRepository = githubRepository,
        runtimeRisks = runtimeRisks,
        status = status,
        tags = tags,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143 must be a JSON object")
      val deploymentName = json.decodeRequired<String>(rawObject, "deployment_name")
      val digest = json.decodeRequired<String>(rawObject, "digest")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143(
        deploymentName = deploymentName,
        digest = digest,
        name = name,
        githubRepository = rawObject["github_repository"]?.let { json.decodeFromJsonElement<String>(it) },
        runtimeRisks = rawObject["runtime_risks"]?.let { json.decodeFromJsonElement<List<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4>>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b>(it) },
        tags = rawObject["tags"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        version = rawObject["version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deployment_name", value.deploymentName)
        put("digest", value.digest)
        put("name", value.name)
        value.githubRepository?.let { put("github_repository", it) }
        value.runtimeRisks?.let { put("runtime_risks", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.tags?.let { put("tags", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143(block: InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143.Builder.() -> Unit): InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143 = InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
