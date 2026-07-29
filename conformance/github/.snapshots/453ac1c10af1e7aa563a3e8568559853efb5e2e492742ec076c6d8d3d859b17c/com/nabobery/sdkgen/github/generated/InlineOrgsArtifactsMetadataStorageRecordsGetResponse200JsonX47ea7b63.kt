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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1{subject_digest}~1metadata~1storage-records/get/respons
 * es/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1{subject_digest}~1metadata~1storage-records/get/respons
 * es/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63.Serializer::class)
public class InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63(
  storageRecords: List<InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052>? = null,
  /**
   * The number of storage records for this digest and organization
   */
  public val totalCount: Int? = null,
) {
  public val storageRecords:
      List<InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052>? =
      storageRecords?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var storageRecordsValue:
        List<InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052>? = null

    public var storageRecords:
        List<InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052>?
      get() = storageRecordsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        storageRecordsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The number of storage records for this digest and organization
     */
    public var totalCount: Int? = null

    public fun build(): InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63 = InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63(
      storageRecords = storageRecords,
      totalCount = totalCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63 must be a JSON object")
      return InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63(
        storageRecords = rawObject["storage_records"]?.let { json.decodeFromJsonElement<List<InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052>>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.storageRecords?.let { put("storage_records", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63(block: InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63.Builder.() -> Unit): InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63 = InlineOrgsArtifactsMetadataStorageRecordsGetResponse200JsonX47ea7b63.build(block)
