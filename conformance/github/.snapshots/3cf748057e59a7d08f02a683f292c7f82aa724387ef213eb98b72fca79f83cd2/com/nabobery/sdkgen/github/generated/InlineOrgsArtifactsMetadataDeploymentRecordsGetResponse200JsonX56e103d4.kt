package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1{subject_digest}~1metadata~1deployment-records/get/resp
 * onses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1{subject_digest}~1metadata~1deployment-records/get/resp
 * onses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4.Serializer::class)
public class InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4(
  public val deploymentRecords: List<ArtifactDeploymentRecord>? = null,
  /**
   * The number of deployment records for this digest and organization
   */
  public val totalCount: Int? = null,
) {
  public class Builder {
    public var deploymentRecords: List<ArtifactDeploymentRecord>? = null

    /**
     * The number of deployment records for this digest and organization
     */
    public var totalCount: Int? = null

    public fun build(): InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4 = InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4(
      deploymentRecords = deploymentRecords,
      totalCount = totalCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4 must be a JSON object")
      return InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4(
        deploymentRecords = rawObject["deployment_records"]?.let { json.decodeFromJsonElement<List<ArtifactDeploymentRecord>>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.deploymentRecords?.let { put("deployment_records", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4(block: InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4.Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4 = InlineOrgsArtifactsMetadataDeploymentRecordsGetResponse200JsonX56e103d4.build(block)
