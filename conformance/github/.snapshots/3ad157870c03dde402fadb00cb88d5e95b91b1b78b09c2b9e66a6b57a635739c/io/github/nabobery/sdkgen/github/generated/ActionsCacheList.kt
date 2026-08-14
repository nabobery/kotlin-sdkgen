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
 * Repository actions caches
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-list
 */
@Serializable(with = ActionsCacheList.Serializer::class)
public class ActionsCacheList(
  actionsCaches: List<InlineActionsCacheListActionsCachesItemX4e909129>,
  /**
   * Total number of caches
   */
  public val totalCount: Int,
) {
  /**
   * Array of caches
   */
  public val actionsCaches: List<InlineActionsCacheListActionsCachesItemX4e909129> =
      actionsCaches.toList()

  public class Builder {
    private var actionsCachesValue: List<InlineActionsCacheListActionsCachesItemX4e909129>? = null

    public var actionsCaches: List<InlineActionsCacheListActionsCachesItemX4e909129>
      get() = requireNotNull(actionsCachesValue) { "actionsCaches is required" }.toList()
      set(`value`) {
        actionsCachesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ActionsCacheList {
      check(actionsCachesValue != null) { "actionsCaches is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ActionsCacheList(
        actionsCaches = actionsCaches,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheList = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsCacheList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheList {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheList must be a JSON object")
      val actionsCaches = json.decodeRequired<List<InlineActionsCacheListActionsCachesItemX4e909129>>(rawObject, "actions_caches")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ActionsCacheList(
        actionsCaches = actionsCaches,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheList) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actions_caches", json.encodeToJsonElement(value.actionsCaches))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheList(block: ActionsCacheList.Builder.() -> Unit): ActionsCacheList = ActionsCacheList.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsCacheList is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
