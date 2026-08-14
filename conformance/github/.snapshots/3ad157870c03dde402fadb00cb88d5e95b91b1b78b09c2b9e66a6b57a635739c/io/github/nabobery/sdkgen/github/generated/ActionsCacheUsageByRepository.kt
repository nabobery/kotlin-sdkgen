package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * GitHub Actions Cache Usage by repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-usage-by-repository
 */
@Serializable(with = ActionsCacheUsageByRepository.Serializer::class)
public class ActionsCacheUsageByRepository(
  /**
   * The number of active caches in the repository.
   */
  public val activeCachesCount: Int,
  /**
   * The sum of the size in bytes of all the active cache items in the repository.
   */
  public val activeCachesSizeInBytes: Int,
  /**
   * The repository owner and name for the cache usage being shown.
   */
  public val fullName: String,
) {
  public class Builder {
    private var activeCachesCountValue: Int? = null

    public var activeCachesCount: Int
      get() = requireNotNull(activeCachesCountValue) { "activeCachesCount is required" }
      set(`value`) {
        activeCachesCountValue = value
      }

    private var activeCachesSizeInBytesValue: Int? = null

    public var activeCachesSizeInBytes: Int
      get() = requireNotNull(activeCachesSizeInBytesValue) { "activeCachesSizeInBytes is required" }
      set(`value`) {
        activeCachesSizeInBytesValue = value
      }

    private var fullNameValue: String? = null

    public var fullName: String
      get() = requireNotNull(fullNameValue) { "fullName is required" }
      set(`value`) {
        fullNameValue = value
      }

    public fun build(): ActionsCacheUsageByRepository {
      check(activeCachesCountValue != null) { "activeCachesCount is required" }
      check(activeCachesSizeInBytesValue != null) { "activeCachesSizeInBytes is required" }
      check(fullNameValue != null) { "fullName is required" }
      return ActionsCacheUsageByRepository(
        activeCachesCount = activeCachesCount,
        activeCachesSizeInBytes = activeCachesSizeInBytes,
        fullName = fullName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheUsageByRepository = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsCacheUsageByRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheUsageByRepository {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheUsageByRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheUsageByRepository must be a JSON object")
      val activeCachesCount = json.decodeRequired<Int>(rawObject, "active_caches_count")
      val activeCachesSizeInBytes = json.decodeRequired<Int>(rawObject, "active_caches_size_in_bytes")
      val fullName = json.decodeRequired<String>(rawObject, "full_name")
      return ActionsCacheUsageByRepository(
        activeCachesCount = activeCachesCount,
        activeCachesSizeInBytes = activeCachesSizeInBytes,
        fullName = fullName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheUsageByRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheUsageByRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active_caches_count", json.encodeToJsonElement(value.activeCachesCount))
        put("active_caches_size_in_bytes", json.encodeToJsonElement(value.activeCachesSizeInBytes))
        put("full_name", value.fullName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheUsageByRepository(block: ActionsCacheUsageByRepository.Builder.() -> Unit): ActionsCacheUsageByRepository = ActionsCacheUsageByRepository.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsCacheUsageByRepository is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
