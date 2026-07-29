package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Artifact Metadata Deployment Record
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/artifact-deployment-record
 */
@Serializable(with = ArtifactDeploymentRecord.Serializer::class)
public class ArtifactDeploymentRecord(
  /**
   * The ID of the provenance attestation associated with the deployment record.
   */
  public val attestationId: Int? = null,
  public val cluster: String? = null,
  public val createdAt: String? = null,
  public val deploymentName: String? = null,
  public val digest: String? = null,
  public val id: Int? = null,
  public val logicalEnvironment: String? = null,
  public val physicalEnvironment: String? = null,
  runtimeRisks: List<InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a>? = null,
  tags: Map<String, String>? = null,
  public val updatedAt: String? = null,
) {
  /**
   * A list of runtime risks associated with the deployment.
   */
  public val runtimeRisks: List<InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a>? =
      runtimeRisks?.let { collection0 -> collection0.toList() }

  public val tags: Map<String, String>? = tags?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * The ID of the provenance attestation associated with the deployment record.
     */
    public var attestationId: Int? = null

    public var cluster: String? = null

    public var createdAt: String? = null

    public var deploymentName: String? = null

    public var digest: String? = null

    public var id: Int? = null

    public var logicalEnvironment: String? = null

    public var physicalEnvironment: String? = null

    private var runtimeRisksValue: List<InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a>? =
        null

    /**
     * A list of runtime risks associated with the deployment.
     */
    public var runtimeRisks: List<InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a>?
      get() = runtimeRisksValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        runtimeRisksValue = value?.let { collection0 -> collection0.toList() }
      }

    private var tagsValue: Map<String, String>? = null

    public var tags: Map<String, String>?
      get() = tagsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        tagsValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var updatedAt: String? = null

    public fun build(): ArtifactDeploymentRecord = ArtifactDeploymentRecord(
      attestationId = attestationId,
      cluster = cluster,
      createdAt = createdAt,
      deploymentName = deploymentName,
      digest = digest,
      id = id,
      logicalEnvironment = logicalEnvironment,
      physicalEnvironment = physicalEnvironment,
      runtimeRisks = runtimeRisks,
      tags = tags,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ArtifactDeploymentRecord = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ArtifactDeploymentRecord> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ArtifactDeploymentRecord {
      val jsonDecoder = decoder.requireJsonDecoder("ArtifactDeploymentRecord")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ArtifactDeploymentRecord must be a JSON object")
      return ArtifactDeploymentRecord(
        attestationId = rawObject["attestation_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        cluster = rawObject["cluster"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        deploymentName = rawObject["deployment_name"]?.let { json.decodeFromJsonElement<String>(it) },
        digest = rawObject["digest"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        logicalEnvironment = rawObject["logical_environment"]?.let { json.decodeFromJsonElement<String>(it) },
        physicalEnvironment = rawObject["physical_environment"]?.let { json.decodeFromJsonElement<String>(it) },
        runtimeRisks = rawObject["runtime_risks"]?.let { json.decodeFromJsonElement<List<InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a>>(it) },
        tags = rawObject["tags"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ArtifactDeploymentRecord) {
      val jsonEncoder = encoder.requireJsonEncoder("ArtifactDeploymentRecord")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.attestationId?.let { put("attestation_id", json.encodeToJsonElement(it)) }
        value.cluster?.let { put("cluster", it) }
        value.createdAt?.let { put("created_at", it) }
        value.deploymentName?.let { put("deployment_name", it) }
        value.digest?.let { put("digest", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.logicalEnvironment?.let { put("logical_environment", it) }
        value.physicalEnvironment?.let { put("physical_environment", it) }
        value.runtimeRisks?.let { put("runtime_risks", json.encodeToJsonElement(it)) }
        value.tags?.let { put("tags", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun artifactDeploymentRecord(block: ArtifactDeploymentRecord.Builder.() -> Unit): ArtifactDeploymentRecord = ArtifactDeploymentRecord.build(block)
