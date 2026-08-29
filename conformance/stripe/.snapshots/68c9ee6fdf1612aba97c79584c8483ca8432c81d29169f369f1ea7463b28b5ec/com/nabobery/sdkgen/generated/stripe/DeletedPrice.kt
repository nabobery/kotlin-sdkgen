package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class DeletedPriceView(
  public val deleted: Boolean,
  public val id: String,
  @SerialName("object")
  public val objectValue: InlineDeletedPriceObjectValueXf790add3,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_price
 */
@Serializable(with = DeletedPrice.Serializer::class)
public class DeletedPrice(
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
  public val objectValue: InlineDeletedPriceObjectValueXf790add3,
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

    private var objectValueValue: InlineDeletedPriceObjectValueXf790add3? = null

    public var objectValue: InlineDeletedPriceObjectValueXf790add3
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): DeletedPrice {
      check(deletedValue != null) { "deleted is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return DeletedPrice(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeletedPrice = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeletedPrice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeletedPrice {
      val jsonDecoder = decoder.requireJsonDecoder("DeletedPrice")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeletedPrice must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineDeletedPriceObjectValueXf790add3>(rawObject, "object")
      return DeletedPrice(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeletedPrice) {
      val jsonEncoder = encoder.requireJsonEncoder("DeletedPrice")
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

public fun deletedPrice(block: DeletedPrice.Builder.() -> Unit): DeletedPrice = DeletedPrice.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeletedPrice is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
