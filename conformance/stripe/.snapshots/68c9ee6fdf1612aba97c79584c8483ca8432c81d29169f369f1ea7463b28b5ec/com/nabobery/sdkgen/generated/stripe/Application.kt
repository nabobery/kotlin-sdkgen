package com.nabobery.sdkgen.generated.stripe

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
public data class ApplicationView(
  public val id: String,
  public val name: String? = null,
  @SerialName("object")
  public val objectValue: InlineApplicationObjectValueX7b0f0fcd,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application
 */
@Serializable(with = Application.Serializer::class)
public class Application(
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineApplicationObjectValueX7b0f0fcd,
  /**
   * The name of the application.
   */
  public val name: String? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineApplicationObjectValueX7b0f0fcd? = null

    public var objectValue: InlineApplicationObjectValueX7b0f0fcd
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * The name of the application.
     */
    public var name: String? = null

    public fun build(): Application {
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return Application(
        id = id,
        objectValue = objectValue,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Application = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Application> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Application {
      val jsonDecoder = decoder.requireJsonDecoder("Application")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Application must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineApplicationObjectValueX7b0f0fcd>(rawObject, "object")
      return Application(
        id = id,
        objectValue = objectValue,
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Application) {
      val jsonEncoder = encoder.requireJsonEncoder("Application")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun application(block: Application.Builder.() -> Unit): Application = Application.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Application is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
