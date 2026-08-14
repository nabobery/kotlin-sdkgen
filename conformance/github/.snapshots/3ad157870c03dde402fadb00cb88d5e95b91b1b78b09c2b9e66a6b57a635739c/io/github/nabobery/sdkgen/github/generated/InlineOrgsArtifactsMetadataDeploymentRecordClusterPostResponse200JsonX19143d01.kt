package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * sponses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * sponses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01.Serializer::class)
public class InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01(
  /**
   * The number of deployment records created
   */
  public val totalCount: Int,
  deploymentRecords: List<ArtifactDeploymentRecord>? = null,
) {
  public val deploymentRecords: List<ArtifactDeploymentRecord>? =
      deploymentRecords?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var deploymentRecordsValue: List<ArtifactDeploymentRecord>? = null

    public var deploymentRecords: List<ArtifactDeploymentRecord>?
      get() = deploymentRecordsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        deploymentRecordsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01 {
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01(
        totalCount = totalCount,
        deploymentRecords = deploymentRecords,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01 must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01(
        totalCount = totalCount,
        deploymentRecords = rawObject["deployment_records"]?.let { json.decodeFromJsonElement<List<ArtifactDeploymentRecord>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        value.deploymentRecords?.let { put("deployment_records", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01(block: InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01.Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01 = InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordClusterPostResponse200JsonX19143d01 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
