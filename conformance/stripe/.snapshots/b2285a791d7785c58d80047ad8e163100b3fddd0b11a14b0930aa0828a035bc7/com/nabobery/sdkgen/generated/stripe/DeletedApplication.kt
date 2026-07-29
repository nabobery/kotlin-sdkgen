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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class DeletedApplicationView(
  public val deleted: Boolean,
  public val id: String,
  public val name: String? = null,
  @SerialName("object")
  public val objectValue: InlineDeletedApplicationObjectValueXa6bda42e,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_application
 */
@Serializable(with = DeletedApplication.Serializer::class)
public class DeletedApplication(
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
  public val objectValue: InlineDeletedApplicationObjectValueXa6bda42e,
  /**
   * The name of the application.
   */
  public val name: String? = null,
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

    private var objectValueValue: InlineDeletedApplicationObjectValueXa6bda42e? = null

    public var objectValue: InlineDeletedApplicationObjectValueXa6bda42e
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * The name of the application.
     */
    public var name: String? = null

    public fun build(): DeletedApplication {
      check(deletedValue != null) { "deleted is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return DeletedApplication(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeletedApplication = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DeletedApplication> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeletedApplication {
      val jsonDecoder = decoder.requireJsonDecoder("DeletedApplication")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeletedApplication must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineDeletedApplicationObjectValueXa6bda42e>(rawObject, "object")
      return DeletedApplication(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeletedApplication) {
      val jsonEncoder = encoder.requireJsonEncoder("DeletedApplication")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deletedApplication(block: DeletedApplication.Builder.() -> Unit): DeletedApplication = DeletedApplication.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeletedApplication is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
