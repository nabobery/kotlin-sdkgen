package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.yaml#/components/schemas/actions-cache-list/properties/actions_caches/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-list/properties/actions_caches/items
 */
@Serializable(with = InlineActionsCacheListActionsCachesItemX4e909129.Serializer::class)
public class InlineActionsCacheListActionsCachesItemX4e909129(
  public val createdAt: String? = null,
  public val id: Int? = null,
  public val key: String? = null,
  public val lastAccessedAt: String? = null,
  public val ref: String? = null,
  public val sizeInBytes: Int? = null,
  public val version: String? = null,
) {
  public class Builder {
    public var createdAt: String? = null

    public var id: Int? = null

    public var key: String? = null

    public var lastAccessedAt: String? = null

    public var ref: String? = null

    public var sizeInBytes: Int? = null

    public var version: String? = null

    public fun build(): InlineActionsCacheListActionsCachesItemX4e909129 = InlineActionsCacheListActionsCachesItemX4e909129(
      createdAt = createdAt,
      id = id,
      key = key,
      lastAccessedAt = lastAccessedAt,
      ref = ref,
      sizeInBytes = sizeInBytes,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineActionsCacheListActionsCachesItemX4e909129 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineActionsCacheListActionsCachesItemX4e909129> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineActionsCacheListActionsCachesItemX4e909129 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineActionsCacheListActionsCachesItemX4e909129")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineActionsCacheListActionsCachesItemX4e909129 must be a JSON object")
      return InlineActionsCacheListActionsCachesItemX4e909129(
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        key = rawObject["key"]?.let { json.decodeFromJsonElement<String>(it) },
        lastAccessedAt = rawObject["last_accessed_at"]?.let { json.decodeFromJsonElement<String>(it) },
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
        sizeInBytes = rawObject["size_in_bytes"]?.let { json.decodeFromJsonElement<Int>(it) },
        version = rawObject["version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineActionsCacheListActionsCachesItemX4e909129) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineActionsCacheListActionsCachesItemX4e909129")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.createdAt?.let { put("created_at", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.key?.let { put("key", it) }
        value.lastAccessedAt?.let { put("last_accessed_at", it) }
        value.ref?.let { put("ref", it) }
        value.sizeInBytes?.let { put("size_in_bytes", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineActionsCacheListActionsCachesItemX4e909129(block: InlineActionsCacheListActionsCachesItemX4e909129.Builder.() -> Unit): InlineActionsCacheListActionsCachesItemX4e909129 = InlineActionsCacheListActionsCachesItemX4e909129.build(block)
