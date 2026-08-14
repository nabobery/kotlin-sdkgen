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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_product_feature
 */
@Serializable(with = DeletedProductFeature.Serializer::class)
public class DeletedProductFeature(
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
  public val objectValue: InlineDeletedProductFeatureObjectValueX7a6b85f6,
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

    private var objectValueValue: InlineDeletedProductFeatureObjectValueX7a6b85f6? = null

    public var objectValue: InlineDeletedProductFeatureObjectValueX7a6b85f6
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): DeletedProductFeature {
      check(deletedValue != null) { "deleted is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return DeletedProductFeature(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeletedProductFeature = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeletedProductFeature> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeletedProductFeature {
      val jsonDecoder = decoder.requireJsonDecoder("DeletedProductFeature")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeletedProductFeature must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineDeletedProductFeatureObjectValueX7a6b85f6>(rawObject, "object")
      return DeletedProductFeature(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeletedProductFeature) {
      val jsonEncoder = encoder.requireJsonEncoder("DeletedProductFeature")
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

public fun deletedProductFeature(block: DeletedProductFeature.Builder.() -> Unit): DeletedProductFeature = DeletedProductFeature.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeletedProductFeature is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
