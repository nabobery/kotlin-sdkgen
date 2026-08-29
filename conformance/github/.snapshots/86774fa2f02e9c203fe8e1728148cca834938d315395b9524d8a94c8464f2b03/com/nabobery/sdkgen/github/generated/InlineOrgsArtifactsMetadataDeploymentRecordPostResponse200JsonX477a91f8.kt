package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record/post/responses/200/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record/post/responses/200/content/
 * application~1json/schema
 */
@Serializable(with = InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8.Serializer::class)
public class InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8(
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

    public fun build(): InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8 {
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8(
        totalCount = totalCount,
        deploymentRecords = deploymentRecords,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8 must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8(
        totalCount = totalCount,
        deploymentRecords = rawObject["deployment_records"]?.let { json.decodeFromJsonElement<List<ArtifactDeploymentRecord>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        value.deploymentRecords?.let { put("deployment_records", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8(block: InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8.Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8 = InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordPostResponse200JsonX477a91f8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
