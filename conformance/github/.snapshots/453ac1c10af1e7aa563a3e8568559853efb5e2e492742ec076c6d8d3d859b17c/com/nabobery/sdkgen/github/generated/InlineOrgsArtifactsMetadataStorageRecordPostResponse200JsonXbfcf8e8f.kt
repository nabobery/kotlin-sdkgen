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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1storage-record/post/responses/200/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1storage-record/post/responses/200/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f.Serializer::class)
public class InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f(
  public val totalCount: Int,
  storageRecords: List<InlineOrgsArtifactsMetadat08ffPostResponse200JsonStorageRecordsItemX7ccb10cd>? = null,
) {
  public val storageRecords:
      List<InlineOrgsArtifactsMetadat08ffPostResponse200JsonStorageRecordsItemX7ccb10cd>? =
      storageRecords?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var storageRecordsValue:
        List<InlineOrgsArtifactsMetadat08ffPostResponse200JsonStorageRecordsItemX7ccb10cd>? = null

    public var storageRecords:
        List<InlineOrgsArtifactsMetadat08ffPostResponse200JsonStorageRecordsItemX7ccb10cd>?
      get() = storageRecordsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        storageRecordsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f {
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f(
        totalCount = totalCount,
        storageRecords = storageRecords,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f(
        totalCount = totalCount,
        storageRecords = rawObject["storage_records"]?.let { json.decodeFromJsonElement<List<InlineOrgsArtifactsMetadat08ffPostResponse200JsonStorageRecordsItemX7ccb10cd>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        value.storageRecords?.let { put("storage_records", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f(block: InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f.Builder.() -> Unit): InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f = InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsArtifactsMetadataStorageRecordPostResponse200JsonXbfcf8e8f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
