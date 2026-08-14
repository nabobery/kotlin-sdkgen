package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_radar.value_list_item
 */
@Serializable(with = DeletedRadarValueListItem.Serializer::class)
public class DeletedRadarValueListItem(
  /**
   * Always true for a deleted object
   */
  public val deleted: Boolean,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineDeletedRadarValueListItemObjectValueXf57fcf1e,
) {
  public class Builder {
    private var deletedValue: Boolean? = null

    public var deleted: Boolean
      get() = requireNotNull(deletedValue) { "deleted is required" }
      set(`value`) {
        deletedValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineDeletedRadarValueListItemObjectValueXf57fcf1e? = null

    public var objectValue: InlineDeletedRadarValueListItemObjectValueXf57fcf1e
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): DeletedRadarValueListItem {
      check(deletedValue != null) { "deleted is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return DeletedRadarValueListItem(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeletedRadarValueListItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeletedRadarValueListItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeletedRadarValueListItem {
      val jsonDecoder = decoder.requireJsonDecoder("DeletedRadarValueListItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeletedRadarValueListItem must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineDeletedRadarValueListItemObjectValueXf57fcf1e>(rawObject, "object")
      return DeletedRadarValueListItem(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeletedRadarValueListItem) {
      val jsonEncoder = encoder.requireJsonEncoder("DeletedRadarValueListItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deletedRadarValueListItem(block: DeletedRadarValueListItem.Builder.() -> Unit): DeletedRadarValueListItem = DeletedRadarValueListItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeletedRadarValueListItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
